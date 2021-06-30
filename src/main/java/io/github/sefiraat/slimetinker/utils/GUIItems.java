package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.items.componentmaterials.CMManager;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public final class GUIItems {

    private GUIItems() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItem menuBackground() {
        return new CustomItem(
                Material.BLACK_STAINED_GLASS_PANE,
                " ",
                " "
        );
    }

    public static CustomItem menuBackgroundInput() {
        return new CustomItem(
                Material.LIGHT_BLUE_STAINED_GLASS_PANE,
                ChatColor.BLUE + "输入",
                " "
        );
    }

    public static CustomItem menuBackgroundOutput() {
        return new CustomItem(
                Material.ORANGE_STAINED_GLASS_PANE,
                ChatColor.RED + "输出",
                " "
        );
    }

    public static CustomItem menuBackgroundCast() {
        return new CustomItem(
                Material.LIME_STAINED_GLASS_PANE,
                ChatColor.GREEN + "铸造模块/模具",
                " "
        );
    }

    public static CustomItem menuPreview() {
        return new CustomItem(
                Material.LIME_STAINED_GLASS_PANE,
                ChatColor.GREEN + "预览",
                " "
        );
    }

    public static CustomItem menuBackgroundPreview() {
        return new CustomItem(
                Material.LIME_STAINED_GLASS_PANE,
                ChatColor.GREEN + "预览",
                " "
        );
    }

    public static CustomItem menuMarkerRod() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "杆子输入",
                " "
        );
    }

    public static CustomItem menuMarkerBinder() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "装订物输入",
                " "
        );
    }

    public static CustomItem menuMarkerHead() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "工具头/刀片输入",
                " "
        );
    }

    public static CustomItem menuLavaInfo(int fillPerc, int fillAmt, int fillMax) {
        ItemStack skull;
        if (fillPerc >= 95) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_5);
        } else if (fillPerc >= 75) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_4);
        } else if (fillPerc >= 50) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_3);
        } else if (fillPerc >= 25) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_2);
        } else if (fillPerc > 0) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_1);
        } else {
            skull = SkullItem.fromBase64(SkullTextures.TANK_EMPTY);
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "岩浆罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "岩浆: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        return new CustomItem(
                skull,
                meta
        );
    }

    public static CustomItem menuMetalInfo(int fillPerc, int fillAmt, int fillMax, @Nullable Map<String, Integer> map) {
        ItemStack skull;
        if (fillPerc >= 95) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_5);
        } else if (fillPerc >= 75) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_4);
        } else if (fillPerc >= 50) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_3);
        } else if (fillPerc >= 25) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_2);
        } else if (fillPerc > 0) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_1);
        } else {
            skull = SkullItem.fromBase64(SkullTextures.TANK_EMPTY);
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "金属罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "金属: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        meta.add("");
        if (map != null) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String name =
                        ChatColor.of(CMManager.getById(e.getKey()).getColorHex()) +
                        ThemeUtils.toTitleCase(e.getKey());
                String amount = e.getValue().toString();
                meta.add(ThemeUtils.CLICK_INFO + name + ": " + ChatColor.WHITE + amount + "单位");
            }
        }
        meta.add("");
        meta.add(ThemeUtils.PASSIVE + "金属从里面流出" + ChatColor.BOLD + "最先流出" + ThemeUtils.PASSIVE + "第一");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "点击循环金属");
        return new CustomItem(
                skull,
                meta
        );
    }

    public static CustomItem menuPurge() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUTTON_PURGE),
                ThemeUtils.GUI_HEAD + "清理金属",
                "",
                ThemeUtils.PASSIVE + "从池中清除不需要的金属",
                "",
                ThemeUtils.CLICK_INFO + "左键: " + ChatColor.WHITE + "去除最上面的金属",
                ThemeUtils.CLICK_INFO + "右键: " + ChatColor.WHITE + "去除所有金属"
        );
    }

    public static CustomItem menuAlloy() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUTTON_ALLOY),
                ThemeUtils.GUI_HEAD + "合金金属",
                "",
                ThemeUtils.PASSIVE + "将池中的金属流入",
                ThemeUtils.PASSIVE + "制造合金"
        );
    }

    public static CustomItem menuPour() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUCKET_ORANGE),
                ThemeUtils.GUI_HEAD + "倒入金属",
                "",
                ThemeUtils.PASSIVE + "将第一种金属倒入",
                ThemeUtils.PASSIVE + "铸造，冷却后，输出",
                ThemeUtils.PASSIVE + "最终物品"
        );
    }

    public static CustomItem menuCraftWorkbench() {
        return new CustomItem(
                Material.FLETCHING_TABLE,
                ThemeUtils.GUI_HEAD + "制造",
                "",
                ThemeUtils.PASSIVE + "去制造此物品"
        );
    }

    public static CustomItem menuCraftTable() {
        return new CustomItem(
                Material.SMITHING_TABLE,
                ThemeUtils.GUI_HEAD + "工具",
                "",
                ThemeUtils.PASSIVE + "从三个给定的",
                ThemeUtils.PASSIVE + "零件（工具杆、钉装物和工具头/叶刀片）"
        );
    }

    public static CustomItem menuCraftRepair() {
        return new CustomItem(
                Material.CARTOGRAPHY_TABLE,
                ThemeUtils.GUI_HEAD + "修理",
                "",
                ThemeUtils.PASSIVE + "修理第一个槽中的物品",
                ThemeUtils.PASSIVE + "使用第二部分中的修理包"
        );
    }

    public static CustomItem menuCraftMod() {
        return new CustomItem(
                Material.GRINDSTONE,
                ThemeUtils.GUI_HEAD + "物品修改",
                "",
                ThemeUtils.PASSIVE + "将修改应用于工具"
        );
    }

    public static CustomItem menuCraftSwap() {
        return new CustomItem(
                Material.SCAFFOLDING,
                ThemeUtils.GUI_HEAD + "零件交换",
                "",
                ThemeUtils.PASSIVE + "交换工具零件"
        );
    }

}
