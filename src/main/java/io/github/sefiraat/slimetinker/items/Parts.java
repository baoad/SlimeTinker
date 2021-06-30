package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.templates.PartTemplate;
import io.github.sefiraat.slimetinker.items.templates.RepairkitTemplate;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.DummyWorkbench;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

@UtilityClass
public final class Parts {

    public static final String DESC_ERROR = "Error";

    protected static ItemStack[] getDummyCastRecipe(ItemStack cast) {
        return new ItemStack[]{
                null, null, null,
                null, cast, null,
                null, null, null
        };
    }

    protected static ItemStack[] getDummyBindingRecipe(ItemStack binder) {
        return new ItemStack[]{
                binder, null,   binder,
                null,   binder, null,
                binder, null,   binder
        };
    }

    protected static final ItemStack[] RECIPE_BINDER_STRING = new ItemStack[] {
            new ItemStack(Material.STRING), null,                           new ItemStack(Material.STRING),
            null,                           new ItemStack(Material.STRING), null,
            new ItemStack(Material.STRING), null,                           new ItemStack(Material.STRING)
    };

    protected static final ItemStack[] RECIPE_BINDER_VINE = new ItemStack[] {
            new ItemStack(Material.VINE), null,                           new ItemStack(Material.VINE),
            null,                           new ItemStack(Material.VINE), null,
            new ItemStack(Material.VINE), null,                           new ItemStack(Material.VINE)
    };

    protected static final ItemStack[] RECIPE_BINDER_ROOT_RED = new ItemStack[] {
            new ItemStack(Material.CRIMSON_ROOTS),  null,                                   new ItemStack(Material.CRIMSON_ROOTS),
            null,                                   new ItemStack(Material.CRIMSON_ROOTS),  null,
            new ItemStack(Material.CRIMSON_ROOTS),  null,                                   new ItemStack(Material.CRIMSON_ROOTS)
    };

    protected static final ItemStack[] RECIPE_BINDER_ROOT_GREEN = new ItemStack[] {
            new ItemStack(Material.WARPED_ROOTS),   null,                                   new ItemStack(Material.WARPED_ROOTS),
            null,                                   new ItemStack(Material.WARPED_ROOTS),   null,
            new ItemStack(Material.WARPED_ROOTS),   null,                                   new ItemStack(Material.WARPED_ROOTS)
    };

    protected static final ItemStack[] RECIPE_BINDER_VINE_RED = new ItemStack[] {
            new ItemStack(Material.WEEPING_VINES),  null,                                   new ItemStack(Material.WEEPING_VINES),
            null,                                   new ItemStack(Material.WEEPING_VINES),  null,
            new ItemStack(Material.WEEPING_VINES),  null,                                   new ItemStack(Material.WEEPING_VINES)
    };

    protected static final ItemStack[] RECIPE_BINDER_VINE_GREEN = new ItemStack[] {
            new ItemStack(Material.TWISTING_VINES), null,                                   new ItemStack(Material.TWISTING_VINES),
            null,                                   new ItemStack(Material.TWISTING_VINES), null,
            new ItemStack(Material.TWISTING_VINES), null,                                   new ItemStack(Material.TWISTING_VINES)
    };

    public static final SlimefunItemStack PART_SHOVEL_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_SHOVEL_HEAD_DUMMY",
                    SkullTextures.PART_SHOVEL_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:铲头",
                    ThemeUtils.PASSIVE + "用于制造铲子"
            );

    public static final SlimefunItemStack PART_PICKAXE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_PICKAXE_HEAD_DUMMY",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:镐头",
                    ThemeUtils.PASSIVE + "用于制造镐子"
            );

    public static final SlimefunItemStack PART_AXE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_AXE_HEAD_DUMMY",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:斧头",
                    ThemeUtils.PASSIVE + "用于制造斧头"
            );

    public static final SlimefunItemStack PART_HOE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_HOE_HEAD_DUMMY",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:锄头",
                    ThemeUtils.PASSIVE + "用于制造锄头"
            );

    public static final SlimefunItemStack PART_SWORD_BLADE_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_SWORD_BLADE_DUMMY",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:剑刃",
                    ThemeUtils.PASSIVE + "用于制造剑"
            );

    public static final SlimefunItemStack PART_TOOL_ROD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_TOOL_ROD_DUMMY",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:工具杆",
                    ThemeUtils.PASSIVE + "用于制造工具"
            );

    public static final SlimefunItemStack PART_BINDING_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_DUMMY",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:物品绑定",
                    ThemeUtils.PASSIVE + "将物品绑定"
            );

    public static final SlimefunItemStack PART_REPAIR_KIT_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_REPAIR_KIT_DUMMY",
                    Material.CHEST_MINECART,
                    ThemeUtils.ThemeItemType.CAST,
                    "零件:修理包",
                    ThemeUtils.PASSIVE + "在修理台上修理损坏物品"
            );

    public static final SlimefunItemStack PART_AXE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_AXE_HEAD",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_HOE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_HOE_HEAD",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_PICKAXE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_PICKAXE_HEAD",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_SHOVEL_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_SHOVEL_HEAD",
                    SkullTextures.PART_SHOVEL_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_SWORD_BLADE =
            ThemeUtils.themedItemStack(
                    "PART_SWORD_BLADE",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_TOOL_ROD =
            ThemeUtils.themedItemStack(
                    "PART_TOOL_ROD",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_REPAIR_KIT =
            ThemeUtils.themedItemStack(
                    "PART_REPAIR_KIT",
                    Material.CHEST_MINECART,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_BINDING_STRING =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_STRING",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.PART,
                    "线装订物",
                    ThemeUtils.PASSIVE + "一种用线制造成的捆扎物"
            );

    public static final SlimefunItemStack PART_BINDING_VINE =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_VINE",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.PART,
                    "藤蔓装订物",
                    ThemeUtils.PASSIVE + "一种用藤蔓制造成的捆扎物"
            );

    public static final SlimefunItemStack PART_BINDING_ROOT_RED =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_ROOT_RED",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.PART,
                    "绯红菌索装订物",
                    ThemeUtils.PASSIVE + "一种用绯红菌索制造成的捆扎物"
            );

    public static final SlimefunItemStack PART_BINDING_ROOT_GREEN =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_ROOT_GREEN",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.PART,
                    "诡异菌索装订物",
                    ThemeUtils.PASSIVE + "一种用诡异菌索制造成的捆扎物"
            );

    public static final SlimefunItemStack PART_BINDING_VINE_RED =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_VINE_RED",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.PART,
                    "垂泪藤装订物",
                    ThemeUtils.PASSIVE + "一种用垂泪藤制造成的捆扎物"
            );

    public static final SlimefunItemStack PART_BINDING_VINE_GREEN =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_VINE_GREEN",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.PART,
                    "缠怨藤装订物",
                    ThemeUtils.PASSIVE + "一种用缠怨藤制造成的捆扎物"
            );

    public static final SlimefunItemStack PART_BINDING_GENERAL_DISPLAY =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_GENERAL_DISPLAY",
                    Material.STRING,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "装订材料",
                    ThemeUtils.PASSIVE + "此材料是一种适合做装订的材料",
                    ThemeUtils.PASSIVE + "",
                    ThemeUtils.PASSIVE + ""
            );


    // Statics for Recipes
    public static final PartTemplate SHOVEL_HEAD = new PartTemplate(Categories.DUMMY, PART_SHOVEL_HEAD, DummySmeltery.TYPE, new ItemStack[9],"Shovel Head");
    public static final PartTemplate PICKAXE_HEAD = new PartTemplate(Categories.DUMMY, PART_PICKAXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Pickaxe Head");
    public static final PartTemplate AXE_HEAD = new PartTemplate(Categories.DUMMY, PART_AXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Axe Head");
    public static final PartTemplate HOE_HEAD = new PartTemplate(Categories.DUMMY, PART_HOE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Hoe Head");
    public static final PartTemplate SWORD_BLADE = new PartTemplate(Categories.DUMMY, PART_SWORD_BLADE, DummySmeltery.TYPE, new ItemStack[9], "Sword Blade");
    public static final PartTemplate TOOL_ROD = new PartTemplate(Categories.DUMMY, PART_TOOL_ROD, DummySmeltery.TYPE, new ItemStack[9], "Tool Rod");
    public static final RepairkitTemplate REPAIR_KIT = new RepairkitTemplate(Categories.DUMMY, PART_REPAIR_KIT, DummySmeltery.TYPE, new ItemStack[9], "Repair Kit");

    // Binders cant store class/mat - need a list to check against
    @Getter
    protected static final Map<String, String> binderMap = new HashMap<>();

    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(Categories.PARTS, PART_SHOVEL_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_SHOVELHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_PICKAXE_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_PICKAXEHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_AXE_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_AXEHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_HOE_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_HOEHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_SWORD_BLADE_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_SWORDBLADE)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_TOOL_ROD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_TOOLROD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_BINDING_DUMMY, DummyWorkbench.TYPE, getDummyBindingRecipe(PART_BINDING_GENERAL_DISPLAY)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_REPAIR_KIT_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_REPAIRKIT)).register(p);

        // Real ones, not in recipe book due to the variations
        SHOVEL_HEAD.register(p);
        PICKAXE_HEAD.register(p);
        AXE_HEAD.register(p);
        HOE_HEAD.register(p);
        SWORD_BLADE.register(p);
        TOOL_ROD.register(p);
        REPAIR_KIT.register(p);

        // Bindings
        PartTemplate binderString = new PartTemplate(Categories.DUMMY, PART_BINDING_STRING, Workbench.TYPE, RECIPE_BINDER_STRING, "String Binder");
        binderString.register(p);
        PartTemplate binderVine = new PartTemplate(Categories.DUMMY, PART_BINDING_VINE, Workbench.TYPE, RECIPE_BINDER_VINE, "Vine Binder");
        binderVine.register(p);
        PartTemplate binderRootRed = new PartTemplate(Categories.DUMMY, PART_BINDING_ROOT_RED, Workbench.TYPE, RECIPE_BINDER_ROOT_RED, "Crimson Root Binder");
        binderRootRed.register(p);
        PartTemplate binderRootGreen = new PartTemplate(Categories.DUMMY, PART_BINDING_ROOT_GREEN, Workbench.TYPE, RECIPE_BINDER_ROOT_GREEN, "Warped Root Binder");
        binderRootGreen.register(p);
        PartTemplate binderVineRed = new PartTemplate(Categories.DUMMY, PART_BINDING_VINE_RED, Workbench.TYPE, RECIPE_BINDER_VINE_RED, "Weeping Vine Binder");
        binderVineRed.register(p);
        PartTemplate binderVineGreen = new PartTemplate(Categories.DUMMY, PART_BINDING_VINE_GREEN, Workbench.TYPE, RECIPE_BINDER_VINE_GREEN, "Twisted Vine Binder");
        binderVineGreen.register(p);

        binderMap.put(binderString.getId(), IDStrings.STRING);
        binderMap.put(binderVine.getId(), IDStrings.VINE);
        binderMap.put(binderRootRed.getId(), IDStrings.CRIMSONROOTS);
        binderMap.put(binderRootGreen.getId(), IDStrings.WARPEDROOTS);
        binderMap.put(binderVineRed.getId(), IDStrings.WEEPINGVINES);
        binderMap.put(binderVineGreen.getId(), IDStrings.TWISTEDVINES);

    }

}
