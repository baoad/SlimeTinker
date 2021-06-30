package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.ModificationStation;
import io.github.sefiraat.slimetinker.items.workstations.repairbench.RepairBench;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryMulti;
import io.github.sefiraat.slimetinker.items.workstations.swappingstation.SwappingStation;
import io.github.sefiraat.slimetinker.items.workstations.table.Table;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Workstations {

    // Tinkers Smeltery
    public static final SlimefunItemStack TINKERS_SMELTERY_CORE =
            ThemeUtils.themedItemStack(
                    "TINKERS_SMELTERY_CORE",
                    Material.CHISELED_POLISHED_BLACKSTONE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "匠魂冶炼厂",
                    "将金属熔化成液体",
                    "让金属可以合金化",
                    "可打造成各种形式",
                    "需要岩浆作为燃料"
            );

    // Workbench
    public static final SlimefunItemStack TINKERS_WORKBENCH =
            ThemeUtils.themedItemStack(
                    "TINKERS_WORKBENCH",
                    Material.FLETCHING_TABLE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "匠魂工作台",
                    "用于制作各种物品",
                    "和匠魂工具的部件"

            );

    // Table
    public static final SlimefunItemStack TINKERS_TABLE =
            ThemeUtils.themedItemStack(
                    "TINKERS_TABLE",
                    Material.SMITHING_TABLE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "匠魂合成台",
                    "将零件组合成工具"
            );

    // Repair
    public static final SlimefunItemStack TINKERS_REPAIR_BENCH =
            ThemeUtils.themedItemStack(
                    "TINKERS_REPAIR_BENCH",
                    Material.CARTOGRAPHY_TABLE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "匠魂维修工作台",
                    "维修工具和武器"
            );

    // Swapping
    public static final SlimefunItemStack TINKERS_SWAPPING_STATION =
            ThemeUtils.themedItemStack(
                    "TINKERS_SWAPPING_STATION",
                    Material.SCAFFOLDING,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "匠魂交换台",
                    "将工具的一部分与新部件互换"
            );

    // Modification
    public static final SlimefunItemStack TINKERS_MOD_STATION =
            ThemeUtils.themedItemStack(
                    "TINKERS_MOD_STATION",
                    Material.GRINDSTONE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "匠魂修改台",
                    "对工具和武器进行修改"
            );

    protected static final ItemStack[] RECIPE_TINKERS_SMELTERY_MULTI = new ItemStack[] {
            Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,
            Materials.SEARED_TANK,          Materials.SMELTERY_CONTROLLER,  Materials.SPOUT,
            Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK
    };
    protected static final ItemStack[] RECIPE_TINKERS_WORKBENCH = new ItemStack[] {
            new ItemStack(Material.IRON_BLOCK),   new ItemStack(Material.IRON_BLOCK),       new ItemStack(Material.IRON_BLOCK),
            new ItemStack(Material.OAK_PLANKS),   new ItemStack(Material.CRAFTING_TABLE),   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   new ItemStack(Material.DISPENSER),        new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_TABLE = new ItemStack[] {
            Materials.BLOCK_CAST_STEEL,   Materials.BLOCK_CAST_STEEL,   Materials.BLOCK_CAST_STEEL,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_REPAIR_BENCH = new ItemStack[] {
            Materials.BLOCK_CAST_ALUMINUM,   Materials.BLOCK_CAST_ALUMINUM,   Materials.BLOCK_CAST_ALUMINUM,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_SWAPPING_STATION = new ItemStack[] {
            Materials.BLOCK_CAST_COR_BRONZE,   Materials.BLOCK_CAST_COR_BRONZE,   Materials.BLOCK_CAST_COR_BRONZE,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_MOD_STATION = new ItemStack[] {
            Materials.BLOCK_CAST_REINFORCED,   Materials.BLOCK_CAST_REINFORCED,   Materials.BLOCK_CAST_REINFORCED,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_TABLE,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };


    public static void set(SlimeTinker p) {

        new Workbench(Categories.WORKSTATIONS, TINKERS_WORKBENCH, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_TINKERS_WORKBENCH).register(p);
        new UnplaceableBlock(Categories.WORKSTATIONS, TINKERS_SMELTERY_CORE, DummySmelteryMulti.TYPE, RECIPE_TINKERS_SMELTERY_MULTI).register(p);
        new Table(Categories.WORKSTATIONS, TINKERS_TABLE, Workbench.TYPE, RECIPE_TINKERS_TABLE).register(p);
        new RepairBench(Categories.WORKSTATIONS, TINKERS_REPAIR_BENCH, Workbench.TYPE, RECIPE_TINKERS_REPAIR_BENCH).register(p);
        new SwappingStation(Categories.WORKSTATIONS, TINKERS_SWAPPING_STATION, Workbench.TYPE, RECIPE_TINKERS_SWAPPING_STATION).register(p);
        new ModificationStation(Categories.WORKSTATIONS, TINKERS_MOD_STATION, Workbench.TYPE, RECIPE_TINKERS_MOD_STATION).register(p);

    }


}
