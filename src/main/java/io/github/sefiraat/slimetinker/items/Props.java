package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryProp;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Props {

    // region Dummy parts
    // Used to display the 'head' item in Property explanation recipes only
    public static final SlimefunItemStack PROP_HEAD =
            ThemeUtils.themedItemStack(
                    "PROP_HEAD",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.PART,
                    "零件:工具头",
                    ThemeUtils.PASSIVE + "任何“头部”物品（剑刃、斧头等）"
            );
    // Used to display the 'binding' item in Property explanation recipes only
    public static final SlimefunItemStack PROP_BINDING =
            ThemeUtils.themedItemStack(
                    "PROP_BINDING",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.PART,
                    "零件:装订",
                    ThemeUtils.PASSIVE + "任何'装订'物品"
            );
    // Used to display the 'rod' item in Property explanation recipes only
    public static final SlimefunItemStack PROP_ROD =
            ThemeUtils.themedItemStack(
                    "PROP_ROD",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeUtils.ThemeItemType.PART,
                    "零件:工具杆",
                    ThemeUtils.PASSIVE + "任何'工具杆'物品"
            );
    // Used to display the 'rod' item in Property explanation recipes only
    public static final SlimefunItemStack PROP_HEADROD =
            ThemeUtils.themedItemStack(
                    "PROP_HEADROD",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PART,
                    "零件:头和杆",
                    ThemeUtils.PASSIVE + "任何'头'与'工具杆'物品"
            );

    protected static ItemStack[] propRecipe(SlimefunItemStack part, ItemStack stack) {
        return new ItemStack[]{
                null, null, null,
                part, null, stack,
                null, null, null
        };
    }

    // endregion

    //region itemstacks
    public static final SlimefunItemStack PROP_ABRA =
            ThemeUtils.themedItemStack(
                    "PROP_ABRA",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块: '传送'",
                    ThemeUtils.PASSIVE + "攻击怪物有几率将它",
                    ThemeUtils.PASSIVE + "随机传送"
            );

    public static final SlimefunItemStack PROP_ADAMANT =
            ThemeUtils.themedItemStack(
                    "PROP_ADAMANT",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:坚固",
                    ThemeUtils.PASSIVE + "免疫所有爆炸",
                    ThemeUtils.ITEM_TYPEDESC + "添加者: " + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_ALLTHATGLITTERS =
            ThemeUtils.themedItemStack(
                    "PROP_ALLTHATGLITTERS",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:荧光",
                    ThemeUtils.PASSIVE + "让你全身发光..."
            );

    public static final SlimefunItemStack PROP_ALLTHATGLITTERS2 =
            ThemeUtils.themedItemStack(
                    "PROP_ALLTHATGLITTERS2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:荧光 II",
                    ThemeUtils.PASSIVE + "让你像彩虹一样美",
                    ThemeUtils.ITEM_TYPEDESC + "添加者: " + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_ATTRACTION =
            ThemeUtils.themedItemStack(
                    "PROP_ATTRACTION",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:引力",
                    ThemeUtils.PASSIVE + "水滴效果在你5格内呈现",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack PROP_BRAINSNOTBRAWN =
            ThemeUtils.themedItemStack(
                    "PROP_BRAINSNOTBRAWN",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:肢达头简",
                    ThemeUtils.PASSIVE + "工具经验增益加倍",
                    ThemeUtils.PASSIVE + "伤害减半"
            );

    public static final SlimefunItemStack PROP_BRAINSNOTBRAWN2 =
            ThemeUtils.themedItemStack(
                    "PROP_BRAINSNOTBRAWN2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:肢达头简 II",
                    ThemeUtils.PASSIVE + "工具经验+200%, 伤害减少 50%",
                    ThemeUtils.ITEM_TYPEDESC + "添加者: " + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_BREAKPOINT =
            ThemeUtils.themedItemStack(
                    "PROP_BREAKPOINT",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:牢不可破",
                    ThemeUtils.PASSIVE + "+200%伤害",
                    ThemeUtils.PASSIVE + "+200%工具经验3x3挖掘范围",
                    ThemeUtils.ITEM_TYPEDESC + "添加者: " + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_BRITTLE =
            ThemeUtils.themedItemStack(
                    "PROP_BRITTLE",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:易碎",
                    ThemeUtils.PASSIVE + "耐久损失下呗"
            );

    public static final SlimefunItemStack PROP_BULKY =
            ThemeUtils.themedItemStack(
                    "PROP_BULKY",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:挖掘",
                    ThemeUtils.PASSIVE + "挖掘3x3方块"
            );

    public static final SlimefunItemStack PROP_CAN =
            ThemeUtils.themedItemStack(
                    "PROP_CAN",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:饱和",
                    ThemeUtils.PASSIVE + "你的饥饿感消失了"
            );

    public static final SlimefunItemStack PROP_CAN2 =
            ThemeUtils.themedItemStack(
                    "PROP_CAN2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:饱和 II",
                    ThemeUtils.PASSIVE + "饿了?不可能",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_CHARGEDA =
            ThemeUtils.themedItemStack(
                    "PROP_CHARGEDA",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:充电(A)",
                    ThemeUtils.PASSIVE + "自动充电"
            );

    public static final SlimefunItemStack PROP_CHARGEDB =
            ThemeUtils.themedItemStack(
                    "PROP_CHARGEDB",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:充电(B)",
                    ThemeUtils.PASSIVE + "自动充电"
            );

    public static final SlimefunItemStack PROP_CLEANCUT =
            ThemeUtils.themedItemStack(
                    "PROP_CLEANCUT",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:清洁切割",
                    ThemeUtils.PASSIVE + "伤害 +100%. 速度 2",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_CONCEPTUALDEFENCE =
            ThemeUtils.themedItemStack(
                    "PROP_CONCEPTUALDEFENCE",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:概念防御",
                    ThemeUtils.PASSIVE + "所有伤害减半（四舍五入）",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_CONDUCTIVE =
            ThemeUtils.themedItemStack(
                    "PROP_CONDUCTIVE",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:转换",
                    ThemeUtils.PASSIVE + "所有工具经验转换为玩家经验",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack PROP_CONDUCTIVE2 =
            ThemeUtils.themedItemStack(
                    "PROP_CONDUCTIVE2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:转换 II",
                    ThemeUtils.PASSIVE + "所有工具经验50%转换为玩家经验",
                    ThemeUtils.PASSIVE + "",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_CONDUCTOR =
            ThemeUtils.themedItemStack(
                    "PROP_CONDUCTOR",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:导线",
                    ThemeUtils.PASSIVE + "玩家所有经验转换为工具“",
                    ThemeUtils.PASSIVE + "10 : 1比例",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_DECAY =
            ThemeUtils.themedItemStack(
                    "PROP_DECAY",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:衰变",
                    ThemeUtils.PASSIVE + "晚上自动修理装备",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack PROP_DOOM =
            ThemeUtils.themedItemStack(
                    "PROP_DOOM",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:厄运",
                    ThemeUtils.PASSIVE + "我有种不好的感觉..."
            );

    public static final SlimefunItemStack PROP_DURABLE =
            ThemeUtils.themedItemStack(
                    "PROP_DURABLE",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:耐用",
                    ThemeUtils.PASSIVE + "忽略耐久度",
                    ThemeUtils.PASSIVE + "但伤害-50% 不增加经验"
            );

    public static final SlimefunItemStack PROP_DURABLE_CO =
            ThemeUtils.themedItemStack(
                    "PROP_DURABLE_CO",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:耐用 II",
                    ThemeUtils.PASSIVE + "忽略耐久度",
                    ThemeUtils.PASSIVE + "但伤害-50% 不增加经验",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_EARTHSHAKER =
            ThemeUtils.themedItemStack(
                    "PROP_EARTHSHAKER",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:摇晃",
                    ThemeUtils.PASSIVE + "击退怪物并打晕他",
                    ThemeUtils.PASSIVE + "",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_EASYFIX =
            ThemeUtils.themedItemStack(
                    "PROP_EASYFIX",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:简易修复",
                    ThemeUtils.PASSIVE + "只需1个部件即可完全修复"
            );

    public static final SlimefunItemStack PROP_ELVENSPEED =
            ThemeUtils.themedItemStack(
                    "PROP_ELVENSPEED",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:精灵速度",
                    ThemeUtils.PASSIVE + "急迫2，速度1。耐久性损失+50%",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_ENCHANTING =
            ThemeUtils.themedItemStack(
                    "PROP_ENCHANTING",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:附魔",
                    ThemeUtils.PASSIVE + "工具经验增益减半",
                    ThemeUtils.PASSIVE + "给工具水机增加附魔属性",
                    ThemeUtils.PASSIVE + "可能不匹配此物"
            );

    public static final SlimefunItemStack PROP_ENCHANTING2 =
            ThemeUtils.themedItemStack(
                    "PROP_ENCHANTING2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:附魔 II",
                    ThemeUtils.PASSIVE + "工具收益减半",
                    ThemeUtils.PASSIVE + "升级时工具会随机添加1-3个附魔",
                    ThemeUtils.PASSIVE + "这些附魔可能没用",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_FAST =
            ThemeUtils.themedItemStack(
                    "PROP_FAST",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:快速",
                    ThemeUtils.PASSIVE + "移动速度提高，加速.",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack PROP_FEARTHEVOID =
            ThemeUtils.themedItemStack(
                    "PROP_FEARTHEVOID",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:虚空",
                    ThemeUtils.PASSIVE + "伤害+150% 最后是250%.",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_FLAMABLE =
            ThemeUtils.themedItemStack(
                    "PROP_FLAMABLE",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:易燃",
                    ThemeUtils.PASSIVE + "(工具等级x5)%的几率",
                    ThemeUtils.PASSIVE + "点燃你的敌人"
            );

    public static final SlimefunItemStack PROP_FLAMABLE_CO =
            ThemeUtils.themedItemStack(
                    "PROP_FLAMABLE_CO",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:易燃 IE",
                    ThemeUtils.PASSIVE + "(工具等级x5)%的几率",
                    ThemeUtils.PASSIVE + "点燃你的敌人",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_FLAMABLE2 =
            ThemeUtils.themedItemStack(
                    "PROP_FLAMABLE2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:易燃 II",
                    ThemeUtils.PASSIVE + "(工具等级x10)%的几率",
                    ThemeUtils.PASSIVE + "点燃你的敌人",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_FLAMINGHOT =
            ThemeUtils.themedItemStack(
                    "PROP_FLAMINGHOT",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:火烈鸟",
                    ThemeUtils.PASSIVE + "尽可能地闻东西"
            );

    public static final SlimefunItemStack PROP_FLAMINGHOT_CO =
            ThemeUtils.themedItemStack(
                    "PROP_FLAMINGHOT_CO",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:火烈鸟 IE",
                    ThemeUtils.PASSIVE + "尽可能地闻东西",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_FORTUNATE =
            ThemeUtils.themedItemStack(
                    "PROP_FORTUNATE",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:幸运",
                    ThemeUtils.PASSIVE + "200%几率出额外物品",
                    ThemeUtils.PASSIVE + "使用物品修改:青金石",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_FUSED =
            ThemeUtils.themedItemStack(
                    "PROP_FUSED",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:熔合",
                    ThemeUtils.PASSIVE + "与持有者融合",
                    ThemeUtils.PASSIVE + "不可能摘下来"
            );

    public static final SlimefunItemStack PROP_GOLDENVEIL =
            ThemeUtils.themedItemStack(
                    "PROP_GOLDENVEIL",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:隐形面纱",
                    ThemeUtils.PASSIVE + "使玩家隐形。如果用在武器上",
                    ThemeUtils.PASSIVE + "-100%伤害"
            );

    public static final SlimefunItemStack PROP_GOLDENVEIL2 =
            ThemeUtils.themedItemStack(
                    "PROP_GOLDENVEIL2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:隐形面纱 II",
                    ThemeUtils.PASSIVE + "使玩家隐形。如果用在武器上",
                    ThemeUtils.PASSIVE + "+150%伤害",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_GRACEFUL =
            ThemeUtils.themedItemStack(
                    "PROP_GRACEFUL",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:海豚",
                    ThemeUtils.PASSIVE + "海豚力量，启动!"
            );

    public static final SlimefunItemStack PROP_GRACEFUL2 =
            ThemeUtils.themedItemStack(
                    "PROP_GRACEFUL2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:海豚 II",
                    ThemeUtils.PASSIVE + "激活更多的海豚力量!",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_GRINDER =
            ThemeUtils.themedItemStack(
                    "PROP_GRINDER",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:研磨机",
                    ThemeUtils.PASSIVE + "打破方块进行研磨",
                    ThemeUtils.PASSIVE + "",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_GROWTH =
            ThemeUtils.themedItemStack(
                    "PROP_GROWTH",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:增长",
                    ThemeUtils.PASSIVE + "白天修理工具",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack PROP_HEAVY =
            ThemeUtils.themedItemStack(
                    "PROP_HEAVY",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:笨重",
                    ThemeUtils.PASSIVE + "挖掘3x3方块"
            );

    public static final SlimefunItemStack PROP_HIDDEN =
            ThemeUtils.themedItemStack(
                    "PROP_HIDDEN",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:隐藏",
                    ThemeUtils.PASSIVE + "隐形，瞬间断裂"
            );

    public static final SlimefunItemStack PROP_INFINITE =
            ThemeUtils.themedItemStack(
                    "PROP_INFINITE",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:无尽",
                    ThemeUtils.PASSIVE + "使工具无限耐久",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_INGHEIGHTS =
            ThemeUtils.themedItemStack(
                    "PROP_INGHEIGHTS",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:重",
                    ThemeUtils.PASSIVE + "这个工具出毛病了"
            );

    public static final SlimefunItemStack PROP_LEECH =
            ThemeUtils.themedItemStack(
                    "PROP_LEECH",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:水蛭",
                    ThemeUtils.PASSIVE + "额外的生命，但消耗你的能量."
            );

    public static final SlimefunItemStack PROP_LEECH2 =
            ThemeUtils.themedItemStack(
                    "PROP_LEECH2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:水蛭 II",
                    ThemeUtils.PASSIVE + "增加6点生命",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_MAGNANIMOUS =
            ThemeUtils.themedItemStack(
                    "PROP_MAGNANIMOUS",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:海量",
                    ThemeUtils.PASSIVE + "",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_MAGNETESIUM =
            ThemeUtils.themedItemStack(
                    "PROP_MAGNETESIUM",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:吸取",
                    ThemeUtils.PASSIVE + "从5个方块范围内",
                    ThemeUtils.PASSIVE + "随机抽取物品"
            );

    public static final SlimefunItemStack PROP_MAGNETESIUM2 =
            ThemeUtils.themedItemStack(
                    "PROP_MAGNETESIUM2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:吸取 II",
                    ThemeUtils.PASSIVE + "从10个方块范围内",
                    ThemeUtils.PASSIVE + "随机抽取物品",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_MALLEABLE =
            ThemeUtils.themedItemStack(
                    "PROP_MALLEABLE",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:延展",
                    ThemeUtils.PASSIVE + "伤害减免50% 增加幸运"
            );

    public static final SlimefunItemStack PROP_MALLEABLE2 =
            ThemeUtils.themedItemStack(
                    "PROP_MALLEABLE2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:延展 II",
                    ThemeUtils.PASSIVE + "伤害减免50% 增加幸运",
                    ThemeUtils.PASSIVE + "与速度",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_MERCHANTSVEIL =
            ThemeUtils.themedItemStack(
                    "PROP_MERCHANTSVEIL",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:面纱",
                    ThemeUtils.PASSIVE + "无可视性 没有任何缺点",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_MYSTIC =
            ThemeUtils.themedItemStack(
                    "PROP_MYSTIC",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:秘银",
                    ThemeUtils.PASSIVE + "玩家经验+100%（采矿）+50%（怪物）",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_NIGHTSTALKER =
            ThemeUtils.themedItemStack(
                    "PROP_NIGHTSTALKER",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:暗夜",
                    ThemeUtils.PASSIVE + "提供夜视"
            );

    public static final SlimefunItemStack PROP_OXYGENATED =
            ThemeUtils.themedItemStack(
                    "PROP_OXYGENATED",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:含氧",
                    ThemeUtils.PASSIVE + "水下呼吸."
            );

    public static final SlimefunItemStack PROP_POISONOUS =
            ThemeUtils.themedItemStack(
                    "PROP_POISONOUS",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:剧毒",
                    ThemeUtils.PASSIVE + "命中时有25%几率中毒"
            );

    public static final SlimefunItemStack PROP_POISONOUS2 =
            ThemeUtils.themedItemStack(
                    "PROP_POISONOUS2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:剧毒 II",
                    ThemeUtils.PASSIVE + "中毒的频率更高，时间更长",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_REALLYSTAINLESS =
            ThemeUtils.themedItemStack(
                    "PROP_REALLYSTAINLESS",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:不锈钢",
                    ThemeUtils.PASSIVE + "就像不锈钢，但是..",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_RECYCLABLE =
            ThemeUtils.themedItemStack(
                    "PROP_RECYCLABLE",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:可回收",
                    ThemeUtils.PASSIVE + "命中时有几率恢复耐久性"
            );

    public static final SlimefunItemStack PROP_RECYCLABLE2 =
            ThemeUtils.themedItemStack(
                    "PROP_RECYCLABLE2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:可回收 II",
                    ThemeUtils.PASSIVE + "命中时有几率恢复耐久性",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_REFRESHING =
            ThemeUtils.themedItemStack(
                    "PROP_REFRESHING",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:清爽",
                    ThemeUtils.PASSIVE + "慢慢愈合的持有人"
            );

    public static final SlimefunItemStack PROP_REINFORCED =
            ThemeUtils.themedItemStack(
                    "PROP_REINFORCED",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:增强",
                    ThemeUtils.PASSIVE + "工具上的任何板模都翻倍"
            );

    public static final SlimefunItemStack PROP_REINFORCED_CO =
            ThemeUtils.themedItemStack(
                    "PROP_REINFORCED_CO",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:加固",
                    ThemeUtils.PASSIVE + "工具上的任何板模都翻倍",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_RESISTANT =
            ThemeUtils.themedItemStack(
                    "PROP_RESISTANT",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:抵抗",
                    ThemeUtils.PASSIVE + "耐火"
            );

    public static final SlimefunItemStack PROP_SECRETSREVEALED =
            ThemeUtils.themedItemStack(
                    "PROP_SECRETSREVEALED",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:解密",
                    ThemeUtils.PASSIVE + "显示所有附近的生物（或不是！）",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_SHARP1 =
            ThemeUtils.themedItemStack(
                    "PROP_SHARP1",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:锐利 1",
                    ThemeUtils.PASSIVE + "增加伤害，可叠加伤害",
                    ThemeUtils.PASSIVE + "给生物"
            );

    public static final SlimefunItemStack PROP_SHARP12 =
            ThemeUtils.themedItemStack(
                    "PROP_SHARP12",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:锐利 II",
                    ThemeUtils.PASSIVE + "增加伤害，叠加伤害给生物",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_SHARP2 =
            ThemeUtils.themedItemStack(
                    "PROP_SHARP2",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:Sharp 2",
                    ThemeUtils.PASSIVE + "增加伤害，可叠加伤害",
                    ThemeUtils.PASSIVE + "给生物"
            );

    public static final SlimefunItemStack PROP_SOFT =
            ThemeUtils.themedItemStack(
                    "PROP_SOFT",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:柔软",
                    ThemeUtils.PASSIVE + "耐久性损失+100%，工具经验+50%"
            );

    public static final SlimefunItemStack PROP_SOFT2 =
            ThemeUtils.themedItemStack(
                    "PROP_SOFT2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:柔软 II",
                    ThemeUtils.PASSIVE + "耐久性损失+100%，工具经验+100%",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_SOFTTOUCH =
            ThemeUtils.themedItemStack(
                    "PROP_SOFTTOUCH",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:轻触",
                    ThemeUtils.PASSIVE + "你感觉轻松了"
            );

    public static final SlimefunItemStack PROP_SOFTTOUCH2 =
            ThemeUtils.themedItemStack(
                    "PROP_SOFTTOUCH2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:轻触 II",
                    ThemeUtils.PASSIVE + "无坠落伤害",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_SPRINGS =
            ThemeUtils.themedItemStack(
                    "PROP_SPRINGS",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:弹簧",
                    ThemeUtils.PASSIVE + "让你跳得更高"
            );

    public static final SlimefunItemStack PROP_STABILITY =
            ThemeUtils.themedItemStack(
                    "PROP_STABILITY",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:稳定",
                    ThemeUtils.PASSIVE + "没有什么"
            );

    public static final SlimefunItemStack PROP_STABILITY2 =
            ThemeUtils.themedItemStack(
                    "PROP_STABILITY2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:稳定 IE",
                    ThemeUtils.PASSIVE + "是的，什么也不做",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_STAINLESS =
            ThemeUtils.themedItemStack(
                    "PROP_STAINLESS",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:不锈钢",
                    ThemeUtils.PASSIVE + "工具/武器排斥血液"
            );

    public static final SlimefunItemStack PROP_STIFF =
            ThemeUtils.themedItemStack(
                    "PROP_STIFF",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:僵硬",
                    ThemeUtils.PASSIVE + "损伤+50%，但让你不幸"
            );

    public static final SlimefunItemStack PROP_STINGOFGONDOLIN =
            ThemeUtils.themedItemStack(
                    "PROP_STINGOFGONDOLIN",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:刺痛",
                    ThemeUtils.PASSIVE + "所有附近的，敌对的，动物都被击退.",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_STUDIOUS =
            ThemeUtils.themedItemStack(
                    "PROP_STUDIOUS",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:学习",
                    ThemeUtils.PASSIVE + "T工具和玩家经验+50%，但伤害减半",
                    ThemeUtils.PASSIVE + "但会让你缓慢"
            );

    public static final SlimefunItemStack PROP_SUPERLIGHTWEIGHT =
            ThemeUtils.themedItemStack(
                    "PROP_SUPERLIGHTWEIGHT",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:超轻量",
                    ThemeUtils.PASSIVE + "空气比你还轻"
            );

    public static final SlimefunItemStack PROP_SUPERLIGHTWEIGHT2 =
            ThemeUtils.themedItemStack(
                    "PROP_SUPERLIGHTWEIGHT2",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:超轻量 II",
                    ThemeUtils.PASSIVE + "空气比你还轻",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_TRICKS =
            ThemeUtils.themedItemStack(
                    "PROP_TRICKS",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:诡计",
                    ThemeUtils.PASSIVE + "在附近的东西上耍把戏",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_TUFFSTUFF =
            ThemeUtils.themedItemStack(
                    "PROP_TUFFSTUFF",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:凝灰岩",
                    ThemeUtils.PASSIVE + "有几率打晕"

            );

    public static final SlimefunItemStack PROP_VAMPIRISM =
            ThemeUtils.themedItemStack(
                    "PROP_VAMPIRISM",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:吸血",
                    ThemeUtils.PASSIVE + "有几率因受伤而愈合",
                    ThemeUtils.PASSIVE + ""
            );

    public static final SlimefunItemStack PROP_VOIDMINER =
            ThemeUtils.themedItemStack(
                    "PROP_VOIDMINER",
                    SkullTextures.PROPERTIES_INFINITY,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:空洞矿工",
                    ThemeUtils.PASSIVE + "在采矿/挖掘时随机生成矿石",
                    ThemeUtils.ITEM_TYPEDESC + "提交者:" + ThemeUtils.ADD_INFINITY + "无尽科技"
            );

    public static final SlimefunItemStack PROP_WEAK =
            ThemeUtils.themedItemStack(
                    "PROP_WEAK",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:虚弱",
                    ThemeUtils.PASSIVE + "你感到虚弱"
            );

    public static final SlimefunItemStack PROP_WORKS =
            ThemeUtils.themedItemStack(
                    "PROP_WORKS",
                    SkullTextures.PROPERTIES_CORE,
                    ThemeUtils.ThemeItemType.PROP,
                    "合金模块:虚无",
                    ThemeUtils.PASSIVE + "没有特别的影响"
            );

    // endregion

    public static void set(SlimeTinker p) {
        // Core SF + Vanilla
        new UnplaceableBlock(Categories.PROPERTIES, PROP_ABRA, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.ALUMINUM_BRASS_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_ALLTHATGLITTERS, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, new ItemStack(Material.GOLD_INGOT))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_ATTRACTION, DummySmelteryProp.TYPE, propRecipe(PROP_BINDING, new ItemStack(Material.TWISTING_VINES))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_BRAINSNOTBRAWN, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.COPPER_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_BRITTLE, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.ALUMINUM_BRONZE_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_BULKY, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.REINFORCED_ALLOY_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_CAN, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.TIN_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_CHARGEDA, DummySmelteryProp.TYPE, propRecipe(PROP_HEADROD, SlimefunItems.NICKEL_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_CHARGEDB, DummySmelteryProp.TYPE, propRecipe(PROP_HEADROD, SlimefunItems.COBALT_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_CONDUCTIVE, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.COPPER_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_DECAY, DummySmelteryProp.TYPE, propRecipe(PROP_BINDING, new ItemStack(Material.CRIMSON_ROOTS))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_DOOM, DummySmelteryProp.TYPE, propRecipe(PROP_BINDING, new ItemStack(Material.WEEPING_VINES))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_DURABLE, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.DURALUMIN_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_EASYFIX, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.DURALUMIN_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_ENCHANTING, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.SILVER_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_FAST, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.BILLON_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_FLAMABLE, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.MAGNESIUM_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_FLAMINGHOT, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.CORINTHIAN_BRONZE_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_FUSED, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.SOLDER_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_GOLDENVEIL, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, new ItemStack(Material.GOLD_INGOT))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_GRACEFUL, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.ZINC_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_GROWTH, DummySmelteryProp.TYPE, propRecipe(PROP_BINDING, new ItemStack(Material.VINE))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_HEAVY, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.HARDENED_METAL_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_HIDDEN, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.SOLDER_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_INGHEIGHTS, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.BRONZE_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_LEECH, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.LEAD_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_MAGNETESIUM, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.MAGNESIUM_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_MALLEABLE, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.TIN_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_NIGHTSTALKER, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.DAMASCUS_STEEL_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_OXYGENATED, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.BRASS_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_POISONOUS, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.LEAD_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_RECYCLABLE, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.ALUMINUM_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_REFRESHING, DummySmelteryProp.TYPE, propRecipe(PROP_BINDING, new ItemStack(Material.WARPED_ROOTS))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_REINFORCED, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.REINFORCED_ALLOY_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_RESISTANT, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.BRONZE_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_SHARP1, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, new ItemStack(Material.IRON_INGOT))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_SHARP2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.ALUMINUM_BRONZE_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_SOFT, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.ALUMINUM_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_SOFTTOUCH, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.SILVER_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_SPRINGS, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.BILLON_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_STABILITY, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, new ItemStack(Material.IRON_INGOT))).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_STAINLESS, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.STEEL_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_STIFF, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.BRASS_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_STUDIOUS, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.ALUMINUM_BRASS_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_SUPERLIGHTWEIGHT, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItems.ZINC_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_TUFFSTUFF, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.HARDENED_METAL_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_VAMPIRISM, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItems.DAMASCUS_STEEL_INGOT)).register(p);
        new UnplaceableBlock(Categories.PROPERTIES, PROP_WORKS, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, new ItemStack(Material.STRING))).register(p);

        // Infinity
        if (SupportedPluginsManager.INFINITY_EXPANSION) {
            new UnplaceableBlock(Categories.PROPERTIES, PROP_ALLTHATGLITTERS2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGGOLD).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_ADAMANT, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.ADAMANTITE).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_BRAINSNOTBRAWN2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGCOPPER).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_BREAKPOINT, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGINFINITY).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_CAN2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGTIN).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_CLEANCUT, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.METAL).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_CONCEPTUALDEFENCE, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID("INFINITE_INGOT").getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_CONDUCTIVE2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGCOPPER).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_CONDUCTOR, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.METAL).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_DURABLE_CO, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.TITANIUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_EARTHSHAKER, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.EARTH).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_ELVENSPEED, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.MYTHRIL).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_ENCHANTING2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGSILVER).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_FEARTHEVOID, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID("VOID_INGOT").getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_FLAMABLE2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGMAGNESIUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_FLAMABLE_CO, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.MAGNONIUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_FLAMINGHOT_CO, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.MAGNONIUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_GOLDENVEIL2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGGOLD).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_GRACEFUL2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGZINC).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_GRINDER, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.EARTH).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_INFINITE, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID("INFINITE_INGOT").getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_LEECH2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGLEAD).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_MAGNANIMOUS, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.MAGNONIUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_MAGNETESIUM2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGMAGNESIUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_MALLEABLE2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGTIN).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_MERCHANTSVEIL, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.FORTUNE).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_MYSTIC, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.ADAMANTITE).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_POISONOUS2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGLEAD).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_REALLYSTAINLESS, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.MAGSTEEL).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_RECYCLABLE2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGALUMINUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_REINFORCED_CO, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.TITANIUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_SECRETSREVEALED, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.MAGIC).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_SHARP12, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGIRON).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_SOFT2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGALUMINUM).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_SOFTTOUCH2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGSILVER).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_STABILITY2, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.SINGIRON).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_STINGOFGONDOLIN, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.MYTHRIL).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_SUPERLIGHTWEIGHT2, DummySmelteryProp.TYPE, propRecipe(PROP_ROD, SlimefunItem.getByID(IDStrings.SINGZINC).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_TRICKS, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID(IDStrings.MAGIC).getItem())).register(p);
            new UnplaceableBlock(Categories.PROPERTIES, PROP_VOIDMINER, DummySmelteryProp.TYPE, propRecipe(PROP_HEAD, SlimefunItem.getByID("VOID_INGOT").getItem())).register(p);
        }

    }

}

