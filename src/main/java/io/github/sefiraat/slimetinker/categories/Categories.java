package io.github.sefiraat.slimetinker.categories;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;

@UtilityClass
public final class Categories {

    public static final MultiCategory MAIN = new MultiCategory(SlimeTinker.inst().getKeys().getCategoryMain(), new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MAIN),
            ThemeUtils.MAIN + "SlimeTinker(匠魂)"
    ));
    public static final SubCategory WORKSTATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryWorkstations(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MAIN),
            ThemeUtils.MAIN + "制作方块"
    ));
    public static final SubCategory MATERIALS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryMaterials(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MATERIALS),
            ThemeUtils.MAIN + "材料"
    ));
    public static final SubCategory ALLOYS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryAlloys(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_ALLOYS),
            ThemeUtils.MAIN + "合金金属"
    ));
    public static final SubCategory PROPERTIES = new SubCategory(SlimeTinker.inst().getKeys().getCategoryProperties(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_PROPERTIES),
            ThemeUtils.MAIN + "合金模块"
    ));
    public static final SubCategory CASTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryCasts(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_CASTS),
            ThemeUtils.MAIN + "铸造模块"
    ));
    public static final SubCategory PARTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryParts(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_PARTS),
            ThemeUtils.MAIN + "其他物品"
    ));
    public static final SubCategory TOOLS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryTools(), MAIN, new CustomItem(
            Material.DIAMOND_SWORD,
            ThemeUtils.MAIN + "工具"
    ));
    public static final SubCategory MODIFICATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryModifications(), MAIN, new CustomItem(
            Material.REDSTONE,
            ThemeUtils.MAIN + "移动设备"
    ));
    public static final DummyCategory DUMMY = new DummyCategory(SlimeTinker.inst().getKeys().getCategoryDummy(), new CustomItem(
            Material.BARRIER,
            ThemeUtils.MAIN + "匠魂"
    ));

    public static void set(SlimeTinker p) {
        MAIN.register(p);
        WORKSTATIONS.register(p);
        MATERIALS.register(p);
        ALLOYS.register(p);
        PROPERTIES.register(p);
        CASTS.register(p);
        PARTS.register(p);
        TOOLS.register(p);
        MODIFICATIONS.register(p);
    }

}
