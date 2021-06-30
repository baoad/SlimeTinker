package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.TinkersSmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Materials {

    // region Vanilla + Core SF
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_COPPER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COPPER",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铜粒",
                    "纯铜制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_TIN =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_TIN",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "锡粒",
                    "纯锡制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_ZINC =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ZINC",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "锌粒",
                    "纯锌制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_ALUMINUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ALUMINUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铝粒",
                    "纯铝制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAGNESIUM =
            ThemeUtils.themedItemStack(
                    "NUGGETCAST_MAGNESIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "镁粒",
                    "纯镁制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_LEAD =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_LEAD",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铅粒",
                    "纯铅制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_SILVER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SILVER",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "银粒",
                    "纯银制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_COAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COAL",
                    Material.POLISHED_BLACKSTONE_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "煤粒",
                    "液化纯煤制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_STEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_STEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "钢粒",
                    "纯钢制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_DAMASCUS_STEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_DAMASCUS_STEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "大马士革钢粒",
                    "大马士革钢制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_DURALIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_DURALIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬铝合金粒",
                    "硬铝合金制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_BRONZE =
           ThemeUtils.themedItemStack(
                   "NUGGET_CAST_BRONZE",
                   Material.ACACIA_BUTTON,
                   ThemeUtils.ThemeItemType.CRAFTING,
                   "青铜粒",
                   "青铜制造而成"
           );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRONZE =
          ThemeUtils.themedItemStack(
                  "NUGGET_CAST_ALU_BRONZE",
                  Material.GOLD_NUGGET,
                  ThemeUtils.ThemeItemType.CRAFTING,
                  "铝青铜粒",
                  "铝青铜制造而成"
          );

    public static final SlimefunItemStack NUGGET_CAST_HARD_METAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_HARD_METAL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬化金属粒",
                    "硬化金属制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_COR_BRONZE =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COR_BRONZE",
                    Material.GOLD_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "科林斯青铜粒",
                    "科林斯青铜制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_SOLDER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SOLDER",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焊料粒",
                    "焊料制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_BILLON =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_BILLON",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "银铜粒",
                    "银铜制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_BRASS =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_BRASS",
                    Material.GOLD_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黄铜粒",
                    "黄铜制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRASS =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ALU_BRASS",
                    Material.GOLD_INGOT,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铝黄铜粒",
                    "铝黄铜制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_NICKEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_NICKEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "镍粒",
                    "纯镍制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_COBALT =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COBALT",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "钴粒",
                    "纯钴制造而成"
            );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REINFORCED",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "强化合金粒",
                    "强化合金制造而成"
            );
    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_COPPER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COPPER",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铜块",
                    "纯铜制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_TIN =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_TIN",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "锡块",
                    "纯锡制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_ZINC =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ZINC",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "锌块",
                    "纯锌制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALUMINUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALUMINUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铝块",
                    "纯铝制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_MAGNESIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGNESIUM",
                    Material.PINK_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "镁块",
                    "纯镁制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_LEAD =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_LEAD",
                    Material.PURPLE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铅块",
                    "纯铅制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_SILVER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SILVER",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "银块",
                    "纯银制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_STEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_STEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "钢块",
                    "纯钢制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_DAMASCUS_STEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_DAMASCUS_STEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "大马士革钢块",
                    "大马士革钢制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_DURALIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_DURALIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬铝块",
                    "硬铝制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "青铜块",
                    "青铜制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALU_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铝青铜块",
                    "铝青铜制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_HARD_METAL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_HARD_METAL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬化金属块",
                    "硬化金属制造而成"
            );
    public static final SlimefunItemStack BLOCK_CAST_COR_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COR_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "科林斯青铜块",
                    "科林斯青铜制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_SOLDER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SOLDER",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焊料块",
                    "焊料制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_BILLON =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BILLON",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "银铜块",
                    "银铜制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_BRASS =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BRASS",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黄铜块",
                    "黄铜制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRASS =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALU_BRASS",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "铝黄铜块",
                    "铝黄铜制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_NICKEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_NICKEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "镍块",
                    "纯镍制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_COBALT =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COBALT",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "钴块",
                    "纯钴制造而成"
            );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REINFORCED",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "强化合金块",
                    "强化合金制造而成"
            );
    // endregion
    // region Crafts
    public static final SlimefunItemStack MOD_PLATE =
            ThemeUtils.themedItemStack(
                    "MOD_PLATE",
                    Material.OBSIDIAN,
                    ThemeUtils.ThemeItemType.MOD,
                    "加强插板",
                    ThemeUtils.PASSIVE + "可以修改工具属性",
                    ThemeUtils.PASSIVE + "有几率忽略刀具耐久损坏"
            );

    public static final SlimefunItemStack GROUT =
            ThemeUtils.themedItemStack(
                    "GROUT",
                    Material.GRAVEL,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "泥浆",
                    ThemeUtils.PASSIVE + "用于烧砖"
            );


    public static final SlimefunItemStack SEARED_BRICK =
            ThemeUtils.themedItemStack(
                    "SEARED_BRICK",
                    Material.BRICK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "红砖",
                    ThemeUtils.PASSIVE + "冶炼厂的多方块结构"
            );

    public static final SlimefunItemStack SMELTERY_CONTROLLER =
            ThemeUtils.themedItemStack(
                    "SMELTERY_CONTROLLER",
                    Material.CHISELED_POLISHED_BLACKSTONE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "冶炼厂控制器",
                    ThemeUtils.PASSIVE + "冶炼厂的多方块结构"
            );

    public static final SlimefunItemStack SEARED_TANK =
            ThemeUtils.themedItemStack(
                    "SEARED_TANK",
                    Material.RED_NETHER_BRICK_WALL,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "砖箱",
                    ThemeUtils.PASSIVE + "冶炼厂的多方块结构"
            );

    public static final SlimefunItemStack SPOUT =
            ThemeUtils.themedItemStack(
                    "SPOUT",
                    Material.POLISHED_BLACKSTONE_BRICK_WALL,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "喷口",
                    ThemeUtils.PASSIVE + "冶炼厂的多方块结构"
            );

    public static final SlimefunItemStack SEARED_BRICK_BLOCK =
            ThemeUtils.themedItemStack(
                    "SEARED_BRICK_BLOCK",
                    Material.POLISHED_BLACKSTONE_BRICKS,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "烧砖",
                    ThemeUtils.PASSIVE + "冶炼厂的多方块结构"
            );
    // endregion
    // endregion

    // region Infinity Expac
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_INFINITY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_INFINITY",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "无尽粒",
                    "一块由无限个物品制成的粒!"
            );
    public static final SlimefunItemStack NUGGET_CAST_MAGSTEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGSTEEL",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "磁钢粒",
                    "磁钢制造而成"
            );
    public static final SlimefunItemStack NUGGET_CAST_TITANIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_TITANIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "钛粒",
                    "纯钛制造而成"
            );
    public static final SlimefunItemStack NUGGET_CAST_MYTHRIL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MYTHRIL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "秘银粒",
                    "秘银制造而成"
            );
    public static final SlimefunItemStack NUGGET_CAST_ADAMANTITE =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ADAMANTITE",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "金刚石粒",
                    "钻石制造而成"
            );
    public static final SlimefunItemStack NUGGET_CAST_MAGNONIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGNONIUM",
                    Material.CRIMSON_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "镁粒",
                    "纯镁制造而成"
            );
    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_VOID =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_VOID",
                    Material.NETHERITE_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "虚空块",
                    "它在... 虚空?"
            );
    public static final SlimefunItemStack BLOCK_CAST_INFINITY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_INFINITY",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "无尽块",
                    "里面充满了无尽个物品"
            );
    public static final SlimefunItemStack BLOCK_CAST_MAGSTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGSTEEL",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "磁钢块",
                    "磁钢制造而成"
            );
    public static final SlimefunItemStack BLOCK_CAST_TITANIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_TITANIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "钛块",
                    "纯钛制造而成"
            );
    public static final SlimefunItemStack BLOCK_CAST_MYTHRIL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MYTHRIL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "秘银块",
                    "秘银制造而成"
            );
    public static final SlimefunItemStack BLOCK_CAST_ADAMANTITE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ADAMANTITE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "金钢石块",
                    "金刚石制造而成"
            );
    public static final SlimefunItemStack BLOCK_CAST_MAGNONIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGNONIUM",
                    Material.PURPLE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "镁块",
                    "纯镁制造而成"
            );
    // endregion
    // endregion

    protected static final ItemStack[] RECIPE_GROUT = new ItemStack[] {
            new ItemStack(Material.CLAY), new ItemStack(Material.SAND),  new ItemStack(Material.SAND),
            new ItemStack(Material.SAND), new ItemStack(Material.SAND), new ItemStack(Material.GRAVEL),
            new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL),  new ItemStack(Material.GRAVEL)
    };

    protected static final ItemStack[] RECIPE_SEARED_BRICK = new ItemStack[] {
            Materials.GROUT, null, null,
            null, null, null,
            null, null, null
    };

    protected static final ItemStack[] RECIPE_SEARED_BRICK_BLOCK = new ItemStack[] {
            Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
            Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
            null, null, null
    };

    protected static final ItemStack[] RECIPE_SMELTERY_CONTROLLER = new ItemStack[] {
            Materials.SEARED_BRICK,   Materials.SEARED_BRICK,   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   null,                     Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   Materials.SEARED_BRICK,   Materials.SEARED_BRICK
    };

    protected static final ItemStack[] RECIPE_SMELTERY_SPOUT = new ItemStack[] {
            Materials.SEARED_BRICK,   null,   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   null,   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   null,   Materials.SEARED_BRICK
    };

    protected static final ItemStack[] RECIPE_SMELTERY_TANK = new ItemStack[] {
            Materials.SEARED_BRICK,   new ItemStack(Material.GLASS),   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   new ItemStack(Material.GLASS),   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   new ItemStack(Material.GLASS),   Materials.SEARED_BRICK
    };

    protected static final ItemStack[] RECIPE_REINFORCED_PLATE = new ItemStack[] {
            Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,  Materials.BLOCK_CAST_REINFORCED,
            Materials.BLOCK_CAST_REINFORCED, new ItemStack(Material.OBSIDIAN), Materials.BLOCK_CAST_REINFORCED,
            Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,  Materials.BLOCK_CAST_REINFORCED
    };



    public static void set(SlimeTinker p) {

        // Vanilla + Core SF + Tinker's General
        new UnplaceableBlock(Categories.MATERIALS, GROUT, Workbench.TYPE, RECIPE_GROUT).register(p);
        new UnplaceableBlock(Categories.MATERIALS, SEARED_BRICK, RecipeType.SMELTERY, RECIPE_SEARED_BRICK).register(p);
        new TinkersSmeltery(Categories.MATERIALS, SMELTERY_CONTROLLER, Workbench.TYPE, RECIPE_SMELTERY_CONTROLLER).register(p);
        new SlimefunItem(Categories.MATERIALS, SEARED_TANK, Workbench.TYPE, RECIPE_SMELTERY_TANK).register(p);
        new SlimefunItem(Categories.MATERIALS, SPOUT, Workbench.TYPE, RECIPE_SMELTERY_SPOUT).register(p);
        new SlimefunItem(Categories.MATERIALS, SEARED_BRICK_BLOCK, Workbench.TYPE, RECIPE_SEARED_BRICK_BLOCK).register(p);

        new UnplaceableBlock(Categories.MATERIALS, MOD_PLATE, Workbench.TYPE, RECIPE_REINFORCED_PLATE).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COPPER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_COPPER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_LEAD, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_LEAD, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_SILVER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_SILVER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ALUMINUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ALUMINUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MAGNESIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MAGNESIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ZINC, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ZINC, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_TIN, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_TIN, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_DURALIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_DURALIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ALU_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ALU_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_HARD_METAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_HARD_METAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COR_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_COR_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_SOLDER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_SOLDER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_BILLON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_BILLON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ALU_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ALU_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_NICKEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_NICKEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COBALT, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_COBALT, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_REINFORCED, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_REINFORCED, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);

        // Infinity Expac
        if (SupportedPluginsManager.INFINITY_EXPANSION) {
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_VOID, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_INFINITY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_INFINITY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MAGSTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MAGSTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_TITANIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_TITANIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MYTHRIL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MYTHRIL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ADAMANTITE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ADAMANTITE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MAGNONIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MAGNONIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        }


    }


}
