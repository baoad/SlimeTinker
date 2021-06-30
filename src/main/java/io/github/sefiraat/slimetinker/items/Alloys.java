package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryAlloy;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Alloys {

    protected static final ItemStack[] RECIPE_ALLOY_STEEL = new ItemStack[] {
            new ItemStack(Material.IRON_INGOT, 2),   new ItemStack(Material.COAL, 8), null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_DAM_STEEL = new ItemStack[] {
            SlimefunItems.STEEL_INGOT,   new ItemStack(Material.IRON_INGOT, 2), new ItemStack(Material.COAL, 8),
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_DURALIUM = new ItemStack[] {
            new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2),   SlimefunItems.COPPER_INGOT, null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_BRONZE = new ItemStack[] {
            new SlimefunItemStack(SlimefunItems.COPPER_INGOT,2),   SlimefunItems.TIN_INGOT, null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_ALU_BRONZE = new ItemStack[] {
            new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2),   SlimefunItems.BRONZE_INGOT, null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_HARD_METAL = new ItemStack[] {
            SlimefunItems.ALUMINUM_BRASS_INGOT,   SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT,
            new ItemStack(Material.COAL, 32),         null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_COR_BRONZE = new ItemStack[] {
            SlimefunItems.BRONZE_INGOT,   new ItemStack(Material.GOLD_INGOT), SlimefunItems.SILVER_INGOT,
            SlimefunItems.COPPER_INGOT,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_SOLDER = new ItemStack[] {
            new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2),   SlimefunItems.TIN_INGOT, null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_BILLON = new ItemStack[] {
            new SlimefunItemStack(SlimefunItems.SILVER_INGOT,2),   SlimefunItems.COPPER_INGOT, null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_BRASS = new ItemStack[] {
            new SlimefunItemStack(SlimefunItems.COPPER_INGOT,2), SlimefunItems.ZINC_INGOT, null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_ALU_BRASS = new ItemStack[] {
            SlimefunItems.BRASS_INGOT,   new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_NICKEL = new ItemStack[] {
            new ItemStack(Material.IRON_INGOT, 2),   SlimefunItems.COPPER_INGOT, null,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_COBALT = new ItemStack[] {
            new ItemStack(Material.IRON_INGOT, 1),   SlimefunItems.NICKEL_INGOT, SlimefunItems.COPPER_INGOT,
            null,                                           null,               null,
            null,                                           null,               null
    };

    protected static final ItemStack[] RECIPE_ALLOY_REINFORCED = new ItemStack[] {
            SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT,
            SlimefunItems.SOLDER_INGOT,         SlimefunItems.BILLON_INGOT,         new ItemStack(Material.GOLD_INGOT),
            null,                                           null,               null
    };

    public static final SlimefunItemStack ALLOY_STEEL =
            ThemeUtils.themedItemStack(
                    "ALLOY_STEEL",
                    SkullTextures.ALLOY_SILVER,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:钢",
                    ThemeUtils.PASSIVE + "铁,煤合制合金"
            );

    public static final SlimefunItemStack ALLOY_DAM_STEEL =
            ThemeUtils.themedItemStack(
                    "ALLOY_DAM_STEEL",
                    SkullTextures.ALLOY_SILVER,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:大马士革钢铁",
                    ThemeUtils.PASSIVE + "钢,铁,煤合制合金"
            );

    public static final SlimefunItemStack ALLOY_DURALIUM =
            ThemeUtils.themedItemStack(
                    "ALLOY_DURALIUM",
                    SkullTextures.ALLOY_SILVER,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:硬铝",
                    ThemeUtils.PASSIVE + "铝,铜合制合金"
            );

    public static final SlimefunItemStack ALLOY_BRONZE =
            ThemeUtils.themedItemStack(
                    "ALLOY_BRONZE",
                    SkullTextures.ALLOY_BROWN,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:青铜",
                    ThemeUtils.PASSIVE + "铜,锡合制合金"
            );

    public static final SlimefunItemStack ALLOY_ALU_BRONZE =
            ThemeUtils.themedItemStack(
                    "ALLOY_ALU_BRONZE",
                    SkullTextures.ALLOY_TAN,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:铝青铜",
                    ThemeUtils.PASSIVE + "铝,青铜合制合金."
            );

    public static final SlimefunItemStack ALLOY_HARD =
            ThemeUtils.themedItemStack(
                    "ALLOY_HARD",
                    SkullTextures.ALLOY_SILVER,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:硬化金属",
                    ThemeUtils.PASSIVE + "铝黄铜,硬铝,大马士革钢,煤炭合制合金",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack ALLOY_COR_BRONZE =
            ThemeUtils.themedItemStack(
                    "ALLOY_COR_BRONZE",
                    SkullTextures.ALLOY_BROWN,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:科林斯青铜",
                    ThemeUtils.PASSIVE + "青铜,金,银,铜合制合金",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack ALLOY_SOLDER =
            ThemeUtils.themedItemStack(
                    "ALLOY_SOLDER",
                    SkullTextures.ALLOY_SILVER,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:焊料",
                    ThemeUtils.PASSIVE + "铅,锡合金"
            );

    public static final SlimefunItemStack ALLOY_BILLON =
            ThemeUtils.themedItemStack(
                    "ALLOY_BILLON",
                    SkullTextures.ALLOY_BLUE_PALE,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:银铜合金",
                    ThemeUtils.PASSIVE + "银,铜合制合金"
            );

    public static final SlimefunItemStack ALLOY_BRASS =
            ThemeUtils.themedItemStack(
                    "ALLOY_BRASS",
                    SkullTextures.ALLOY_RED,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:黄铜",
                    ThemeUtils.PASSIVE + "铜 ,锌合制合金"
            );

    public static final SlimefunItemStack ALLOY_ALU_BRASS =
            ThemeUtils.themedItemStack(
                    "ALLOY_ALU_BRASS",
                    SkullTextures.ALLOY_RED,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:铝黄铜",
                    ThemeUtils.PASSIVE + "黄铜,铝合制合金."
            );

    public static final SlimefunItemStack ALLOY_NICKEL =
            ThemeUtils.themedItemStack(
                    "ALLOY_NICKEL",
                    SkullTextures.ALLOY_SILVER,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:镍",
                    ThemeUtils.PASSIVE + "铁,铜合制合金"
            );

    public static final SlimefunItemStack ALLOY_COBALT =
            ThemeUtils.themedItemStack(
                    "ALLOY_COBALT",
                    SkullTextures.ALLOY_PURPLE,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:钴",
                    ThemeUtils.PASSIVE + "镍,铁,铜合制合金"
            );

    public static final SlimefunItemStack ALLOY_REINFORCED =
            ThemeUtils.themedItemStack(
                    "ALLOY_REINFORCED",
                    SkullTextures.ALLOY_PINK,
                    ThemeUtils.ThemeItemType.MOLTEN_METAL,
                    "合金:增强金属",
                    ThemeUtils.PASSIVE + "各种合金熔炼而成"
            );

    public static void set(SlimeTinker p) {
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_STEEL, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_STEEL).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_DAM_STEEL, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_DAM_STEEL).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_DURALIUM, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_DURALIUM).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_BRONZE, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_BRONZE).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_ALU_BRONZE, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_ALU_BRONZE).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_HARD, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_HARD_METAL).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_COR_BRONZE, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_COR_BRONZE).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_SOLDER, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_SOLDER).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_BILLON, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_BILLON).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_BRASS, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_BRASS).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_ALU_BRASS, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_ALU_BRASS).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_NICKEL, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_NICKEL).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_COBALT, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_COBALT).register(p);
        new UnplaceableBlock(Categories.ALLOYS, ALLOY_REINFORCED, DummySmelteryAlloy.TYPE, RECIPE_ALLOY_REINFORCED).register(p);

    }

}
