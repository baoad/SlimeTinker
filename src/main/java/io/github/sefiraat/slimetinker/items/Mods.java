package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.DummyModificationStation;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Mods {

    public static final SlimefunItemStack MOD_REDSTONE_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_REDSTONE_DUMMY",
                    Material.REDSTONE,
                    ThemeUtils.ThemeItemType.MOD,
                    "物品修改:红石",
                    ThemeUtils.PASSIVE + "当应用于工具时",
                    ThemeUtils.PASSIVE + "将获得与等级相匹配的速度",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack MOD_LAPIS_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_LAPIS_DUMMY",
                    Material.LAPIS_LAZULI,
                    ThemeUtils.ThemeItemType.MOD,
                    "物品修改:青金石",
                    ThemeUtils.PASSIVE + "当应用于工具时",
                    ThemeUtils.PASSIVE + "持有者会从",
                    ThemeUtils.PASSIVE + "盾牌格挡/击杀中",
                    ThemeUtils.PASSIVE + "10%掉落奖励物品"
            );

    public static final SlimefunItemStack MOD_QUARTZ_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_QUARTZ_DUMMY",
                    Material.QUARTZ,
                    ThemeUtils.ThemeItemType.MOD,
                    "物品修改:石英",
                    ThemeUtils.PASSIVE + "当应用于工具时",
                    ThemeUtils.PASSIVE + "持有者会攻击别人",
                    ThemeUtils.PASSIVE + "会多加额外伤害",
                    ThemeUtils.PASSIVE + "锋利以及其他增加",
                    ThemeUtils.PASSIVE + "20%几率发生"
            );

    public static final SlimefunItemStack MOD_DIAMOND_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_DIAMOND_DUMMY",
                    Material.DIAMOND,
                    ThemeUtils.ThemeItemType.MOD,
                    "物品修改:钻石",
                    ThemeUtils.PASSIVE + "当应用于工具时",
                    ThemeUtils.PASSIVE + "持有者被伤害时",
                    ThemeUtils.PASSIVE + "10%几率伤害反弹给攻击者"
            );

    public static final SlimefunItemStack MOD_EMERALD_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_EMERALD_DUMMY",
                    Material.EMERALD,
                    ThemeUtils.ThemeItemType.MOD,
                    "物品修改:绿宝石",
                    ThemeUtils.PASSIVE + "当应用于工具时",
                    ThemeUtils.PASSIVE + "你每次行动会额外增加经验",
                    ThemeUtils.PASSIVE + "使用工具/武器",
                    ThemeUtils.PASSIVE + "10%增加"
            );


    public static final SlimefunItemStack MOD_PLATE_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_PLATE_DUMMY",
                    Material.OBSIDIAN,
                    ThemeUtils.ThemeItemType.MOD,
                    "物品修改:加强板",
                    ThemeUtils.PASSIVE + "当应用于工具时",
                    ThemeUtils.PASSIVE + "将不会掉落耐久度",
                    ThemeUtils.PASSIVE + "每次10% 10级将不会掉落耐久"
            );


    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_REDSTONE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_LAPIS_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_QUARTZ_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_DIAMOND_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_EMERALD_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_PLATE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);

        // Real recipes when modifiers are NOT plain itemstacks

    }
}
