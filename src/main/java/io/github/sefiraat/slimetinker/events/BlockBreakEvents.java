package io.github.sefiraat.slimetinker.events;

import io.github.sefiraat.slimetinker.listeners.BlockMap;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public final class BlockBreakEvents {

    public static void headCorbronze(BlockBreakEventFriend friend) {
        Collection<ItemStack> newDrops = new ArrayList<>(friend.getAddDrops());

        Iterator<Recipe> recipeIterator = Bukkit.recipeIterator();
        while (recipeIterator.hasNext()) {
            Recipe recipe = recipeIterator.next();
            if (!(recipe instanceof FurnaceRecipe)) continue;
            FurnaceRecipe furnaceRecipe = (FurnaceRecipe) recipe;
            for (ItemStack i : friend.getDrops()) {
                if (furnaceRecipe.getInputChoice().test(i)) {
                    ItemStack ni = recipe.getResult().clone();
                    ni.setAmount(i.getAmount());
                    newDrops.add(ni);
                    friend.getRemoveDrops().add(i);
                    Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(130, 100, 30), 2);
                    friend.getBlock().getWorld().spawnParticle(Particle.REDSTONE, friend.getBlock().getLocation(), 10, 0.2, 0.2, 0.2, 0.5, dustOptions);
                    break;
                }
            }
            if (friend.getAddDrops().isEmpty()) continue;
            for (ItemStack i : friend.getAddDrops()) {
                if (i.isSimilar(((FurnaceRecipe) recipe).getInput())) {
                    ItemStack ni = recipe.getResult().clone();
                    ni.setAmount(i.getAmount());
                    newDrops.add(ni);
                    friend.getRemoveDrops().add(i);
                    break;
                }
            }
        }
        friend.setAddDrops(newDrops);
    }

    public static void headCopper(BlockBreakEventFriend friend) {
        friend.setToolExpMod(friend.getToolExpMod() + 1);
    }

    public static void rodAluBrass(BlockBreakEventFriend friend) {
        friend.setToolExpMod(friend.getToolExpMod() + 0.5);
        friend.setPlayerExpMod(friend.getPlayerExpMod() + 0.5);
    }

    public static void rodAluminum(BlockBreakEventFriend friend) {
        friend.setToolExpMod(friend.getToolExpMod() + 0.5);
    }

    public static void headDuralium(BlockBreakEventFriend friend) {
        friend.setToolExpMod(0);
        friend.setDuraliumCheck(true);
    }

    public static void headSingCopper(BlockBreakEventFriend friend) {
        friend.setToolExpMod(friend.getToolExpMod() + 2);
    }

    public static void headSingInfinity(BlockBreakEventFriend friend) {
        friend.setToolExpMod(friend.getToolExpMod() + 2);
    }

    public static void rodMetal(BlockBreakEventFriend friend) {
        friend.setMetalCheck(true);
    }

    public static void headFortune(BlockBreakEventFriend friend) {
        Collection<ItemStack> c = new ArrayList<>(friend.getAddDrops());

        for (ItemStack i : friend.getDrops()) {
            if (i.getAmount() > 1) {
                ItemStack i2 = i.clone();
                i2.setAmount(i.getAmount() * 2);
                c.add(i2);
                friend.getRemoveDrops().add(i);
            }
        }
        friend.setAddDrops(c);
        Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(130, 30, 120), 2);
        friend.getBlock().getWorld().spawnParticle(Particle.REDSTONE, friend.getBlock().getLocation(), 10, 0.2, 0.2, 0.2, 0.5, dustOptions);
    }

    public static void rodEarth(BlockBreakEventFriend friend) {
        Collection<ItemStack> c = new ArrayList<>(friend.getAddDrops());
        for (ItemStack i : friend.getDrops()) {
            Material m = null;
            int amount = 1;
            switch (i.getType()) {
                case COBBLESTONE:
                case ANDESITE:
                case GRANITE:
                case DIORITE:
                    m = Material.GRAVEL;
                    break;
                case BONE_BLOCK:
                    m = Material.BONE_MEAL;
                    amount = 9;
                    break;
                case SANDSTONE:
                    m = Material.SAND;
                    amount = 4;
                    break;
                case RED_SANDSTONE:
                    m = Material.RED_SAND;
                    amount = 4;
                    break;
                case PRISMARINE_BRICKS:
                    m = Material.PRISMARINE;
                    amount = 2;
                    break;
                case PRISMARINE:
                    m = Material.PRISMARINE_SHARD;
                    amount = 4;
                    break;
                case NETHER_WART_BLOCK:
                    m = Material.NETHER_WART;
                    amount = 9;
                    break;
                case QUARTZ_BLOCK:
                    m = Material.QUARTZ;
                    amount = 4;
                    break;
                default:
                    break;
            }
            if (m != null) {
                c.add(new ItemStack(m, amount));
                friend.getRemoveDrops().add(i);
            }
            Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(30, 130, 40), 2);
            friend.getBlock().getWorld().spawnParticle(Particle.REDSTONE, friend.getBlock().getLocation(), 10, 0.2, 0.2, 0.2, 0.5, dustOptions);
        }
        friend.setAddDrops(c);
    }

    public static void headMagnonium(BlockBreakEventFriend friend) {
        if (ThreadLocalRandom.current().nextInt(1,6) == 1) {
            friend.getPlayer().dropItem(true);
        }
    }

    public static void headAdamantite(BlockBreakEventFriend friend) {
        friend.setPlayerExpMod(friend.getPlayerExpMod() + 1);
    }

    public static void rodSingAluminum(BlockBreakEventFriend friend) {
        friend.setToolExpMod(friend.getToolExpMod() + 1);
    }

    public static void headVoid(BlockBreakEventFriend friend) {
        ItemMeta im = friend.getHeldItem().getItemMeta();
        assert im != null;
        PersistentDataContainer c = im.getPersistentDataContainer();
        String toolType = ItemUtils.getToolTypeName(c);
        Map<Material, String> m = BlockMap.getMaterialMap();
        Block b = friend.getBlock();
        if (m.containsKey(b.getType()) && m.get(b.getType()).equals(toolType)) {
            int rnd = ThreadLocalRandom.current().nextInt(1, 11);
            if (rnd == 1) {
                ItemStack i;
                int rnd2 = ThreadLocalRandom.current().nextInt(1, 1001);
                if (rnd2 > 975) {
                    i = new ItemStack(Material.ANCIENT_DEBRIS);
                } else if (rnd2 > 900) {
                    i = new ItemStack(Material.DIAMOND);
                } else if (rnd2 > 800) {
                    i = new ItemStack(Material.LAPIS_LAZULI);
                } else if (rnd2 > 700) {
                    i = new ItemStack(Material.REDSTONE);
                } else if (rnd2 > 550) {
                    i = new ItemStack(Material.GOLD_ORE);
                } else if (rnd2 > 400) {
                    i = new ItemStack(Material.IRON_ORE);
                } else {
                    i = new ItemStack(Material.COAL);
                }
                friend.getAddDrops().add(i);
                Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(60, 60, 60), 2);
                friend.getBlock().getWorld().spawnParticle(Particle.REDSTONE, friend.getBlock().getLocation(), 10, 0.2, 0.2, 0.2, 0.5, dustOptions);
            }
        }
    }
}
