package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Dies {

    public static final String DIE_DESC = "用来制作铸件的模具";

    protected static final ItemStack[] RECIPE_DIE_SHOVEL_HEAD = new ItemStack[] {
            null,    new ItemStack(Material.COBBLESTONE),    null,
            null,    null,                                   null,
            null,    null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_PICKAXE_HEAD = new ItemStack[] {
            new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),
            null,                                   null,                                   null,
            null,                                   null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_AXE_HEAD = new ItemStack[] {
            new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),    null,
            new ItemStack(Material.COBBLESTONE),    null,                                   null,
            null,                                   null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_HOE_HEAD = new ItemStack[] {
            new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),    null,
            null,                                   null,                                   null,
            null,                                   null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_SWORD_BLADE = new ItemStack[] {
            null,    new ItemStack(Material.COBBLESTONE),    null,
            null,    new ItemStack(Material.COBBLESTONE),    null,
            null,    null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_TOOL_ROD = new ItemStack[] {
            null,    null,                          null,
            null,    new ItemStack(Material.STICK), null,
            null,    null,                          null
    };

    protected static final ItemStack[] RECIPE_DIE_REPAIR_KIT = new ItemStack[] {
            null,    null,                              null,
            null,    new ItemStack(Material.OBSIDIAN),  null,
            null,    null,                              null
    };

    public static final SlimefunItemStack DIE_SHOVEL_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_SHOVEL_HEAD",
                    SkullTextures.PART_SHOVEL_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "模具:石铲头",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_PICKAXE_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_PICKAXE_HEAD",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "模具:石镐头",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_AXE_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_AXE_HEAD",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "模具:石斧头",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_HOE_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_HOE_HEAD",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "模具:石锄头",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_SWORD_BLADE =
            ThemeUtils.themedItemStack(
                    "DIE_SWORD_BLADE",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.CAST,
                    "模具:石刀刃",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_TOOL_ROD =
            ThemeUtils.themedItemStack(
                    "DIE_TOOL_ROD",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeUtils.ThemeItemType.CAST,
                    "模具:工具杆",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_REPAIR_KIT =
            ThemeUtils.themedItemStack(
                    "DIE_REPAIR_KIT",
                    Material.MINECART,
                    ThemeUtils.ThemeItemType.CAST,
                    "模具:修理包",
                    ThemeUtils.PASSIVE + DIE_DESC
            );


    public static void set(SlimeTinker p) {
        new UnplaceableBlock(Categories.CASTS, DIE_SHOVEL_HEAD, Workbench.TYPE, RECIPE_DIE_SHOVEL_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_PICKAXE_HEAD, Workbench.TYPE, RECIPE_DIE_PICKAXE_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_AXE_HEAD, Workbench.TYPE, RECIPE_DIE_AXE_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_HOE_HEAD, Workbench.TYPE, RECIPE_DIE_HOE_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_SWORD_BLADE, Workbench.TYPE, RECIPE_DIE_SWORD_BLADE).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_TOOL_ROD , Workbench.TYPE, RECIPE_DIE_TOOL_ROD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_REPAIR_KIT , Workbench.TYPE, RECIPE_DIE_REPAIR_KIT).register(p);
    }
}
