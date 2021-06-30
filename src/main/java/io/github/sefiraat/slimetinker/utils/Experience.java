package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.items.Tools;
import io.github.sefiraat.slimetinker.modifiers.Modifications;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public final class Experience {

    public static final double EXP_LEVEL_BASE = 100;
    public static final double EXP_GROWTH = 1.3;

    public static void setupExpNewTool(PersistentDataContainer c) {
        c.set(SlimeTinker.inst().getKeys().getToolExpCurrent(), PersistentDataType.INTEGER, 0);
        c.set(SlimeTinker.inst().getKeys().getToolExpRequired(), PersistentDataType.DOUBLE, EXP_LEVEL_BASE);
        c.set(SlimeTinker.inst().getKeys().getToolLevel(), PersistentDataType.INTEGER, 0);
        c.set(SlimeTinker.inst().getKeys().getToolModSlots(), PersistentDataType.INTEGER, 0);
    }

    public static void addToolExp(ItemStack itemStack, int amount, Player player, boolean tool) {

        ItemMeta im = itemStack.getItemMeta();
        assert im != null;
        PersistentDataContainer c = im.getPersistentDataContainer();

        // First, any properties/mods changing the values POST being granted (I modify exp values in events and this is for redirecting or other post-giving actions)
        String matPropertyHead = ItemUtils.getToolHeadMaterial(c);
        String matPropertyBinding = ItemUtils.getToolBindingMaterial(c);
        String matPropertyRod = ItemUtils.getToolRodMaterial(c);

        if (copperChecks(matPropertyRod, player, amount)) {
            return;
        }

        // Add the EXP given
        int currentExp = c.get(SlimeTinker.inst().getKeys().getToolExpCurrent(), PersistentDataType.INTEGER);
        double expRequired = c.get(SlimeTinker.inst().getKeys().getToolExpRequired(), PersistentDataType.DOUBLE);
        int level = c.get(SlimeTinker.inst().getKeys().getToolLevel(), PersistentDataType.INTEGER);
        int modSlots = c.get(SlimeTinker.inst().getKeys().getToolModSlots(), PersistentDataType.INTEGER);
        int newExp = 0;

        // Emerald mod

        Map<String, Integer> modLevels = Modifications.getAllModLevels(itemStack);

        if (modLevels.containsKey(Material.EMERALD.toString())) { // EMERALD
            level = modLevels.get(Material.EMERALD.toString());
            if (tool) {
                amount = amount + level;
            } else {
                amount = (int) Math.ceil(amount * (level * 0.1));
            }
        }

        // Check if it's due to level up
        if ((currentExp + amount) >= expRequired) {

            level++;
            modSlots++;
            expRequired = (expRequired * EXP_GROWTH);
            promoteMaterial(itemStack, level, player);
            player.sendMessage(ThemeUtils.SUCCESS + "你的工具升级了");

            silverChecks(matPropertyHead, im, itemStack, player);

        } else {
            newExp = currentExp + amount;
        }

        c.set(SlimeTinker.inst().getKeys().getToolExpCurrent(), PersistentDataType.INTEGER, newExp);
        c.set(SlimeTinker.inst().getKeys().getToolExpRequired(), PersistentDataType.DOUBLE, expRequired);
        c.set(SlimeTinker.inst().getKeys().getToolLevel(), PersistentDataType.INTEGER, level);
        c.set(SlimeTinker.inst().getKeys().getToolModSlots(), PersistentDataType.INTEGER, modSlots);

        itemStack.setItemMeta(im);

        ItemUtils.rebuildToolLore(itemStack);

    }

    public static int getToolExp(PersistentDataContainer c) {
        return c.get(SlimeTinker.inst().getKeys().getToolExpCurrent(), PersistentDataType.INTEGER);
    }

    public static int getToolRequiredExp(PersistentDataContainer c) {
        return c.get(SlimeTinker.inst().getKeys().getToolExpRequired(), PersistentDataType.DOUBLE).intValue();
    }

    public static int getToolLevel(PersistentDataContainer c) {
        return c.get(SlimeTinker.inst().getKeys().getToolLevel(), PersistentDataType.INTEGER);
    }

    public static int getToolModifierSlots(PersistentDataContainer c) {
        return c.get(SlimeTinker.inst().getKeys().getToolModSlots(), PersistentDataType.INTEGER);
    }

    public static void setToolModifierSlots(PersistentDataContainer c, int amount) {
        c.set(SlimeTinker.inst().getKeys().getToolModSlots(), PersistentDataType.INTEGER, amount);
    }

    public static String getLoreExp(PersistentDataContainer c) {
        return ThemeUtils.ITEM_TOOL + "Level: " +
                ChatColor.WHITE + Experience.getToolLevel(c) +
                ThemeUtils.PASSIVE + " (" + Experience.getToolExp(c) + " / " + Experience.getToolRequiredExp(c) + ")";
    }

    public static String getLoreModSlots(PersistentDataContainer c) {
        return ThemeUtils.ITEM_TOOL + "Modifier Slots: " +
                ChatColor.WHITE + Experience.getToolModifierSlots(c);
    }

    private static void promoteMaterial(ItemStack itemStack, int level, Player player) {
        // Already at max promotion
        if (level > (Tools.LEVEL_NETHERITE + 1)) {
            return;
        }
        String toolType = itemStack.getItemMeta().getPersistentDataContainer().get(SlimeTinker.inst().getKeys().getToolInfoToolType(), PersistentDataType.STRING);
        if (Tools.getToolGrowthMap().get(toolType).containsKey(level)) {
            itemStack.setType(Tools.getToolGrowthMap().get(toolType).get(level));
            player.sendMessage(ThemeUtils.SUCCESS + "Your tool has been promoted!");
        }

    }

    private static boolean copperChecks(String matPropertyRod, Player player, int amount) {
        if (matPropertyRod.equals(IDStrings.COPPER)) { // Conductive
            player.giveExp(amount);
            return true;
        }
        if (matPropertyRod.equals(IDStrings.SINGCOPPER)) { // Conductive II
            player.giveExp((int) Math.ceil(amount * 1.5));
            return true;
        }
        return false;
    }

    private static void silverChecks(String matPropertyHead, ItemMeta im, ItemStack itemStack, Player player) {
        int number = 1;
        if (matPropertyHead.equals(IDStrings.SINGSILVER)) { // ENCHANTING II
            number = 3;
        }
        int count = 0;
        if (matPropertyHead.equals(IDStrings.SILVER) || matPropertyHead.equals(IDStrings.SINGSILVER)) { // Enchanting + Enchanting II
            for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, number); i++) {
                Enchantment randEnchant = Enchantment.values()[(int) (Math.random()*Enchantment.values().length)];
                if (im.hasEnchant(randEnchant)) {
                    im.addEnchant(randEnchant, itemStack.getEnchantmentLevel(randEnchant) + 1, true);
                } else {
                    im.addEnchant(randEnchant, 1, true);
                }
                count++;
            }
            player.sendMessage(ThemeUtils.SUCCESS + "It also gained [" + count + "] random enchantment(s)! Hope it's good :>");
        }
    }





}
