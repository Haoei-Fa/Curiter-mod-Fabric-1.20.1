package com.curiter.datagen;

import com.curiter.block.ModBlocks;
import com.curiter.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangZhCnProvider extends FabricLanguageProvider {

    public ModLangZhCnProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //物品名称
        translationBuilder.add(ModItems.GARUINKA, "瓶装格林卡");
        translationBuilder.add(ModItems.GARUINKA_COLLECTORS, "格林卡收集水晶");
        translationBuilder.add(ModItems.GARUINKA_STORAGE_BOTTLE, "格林卡储存瓶");
        translationBuilder.add(ModItems.GARUINKA_DETECTORS, "格林卡检测器");
        translationBuilder.add(ModItems.DISC_EMPTY, "空白唱片");
        translationBuilder.add(ModItems.COGS, "齿轮");
        translationBuilder.add(ModItems.FRIED_EGG, "煎蛋");
        translationBuilder.add(ModItems.FLOUR, "面粉");
        translationBuilder.add(ModItems.DOUGH, "面团");
        translationBuilder.add(ModItems.FERMENTED_DOUGH, "发酵面团");
        translationBuilder.add(ModItems.YEAST, "酵母菌");
        translationBuilder.add(ModItems.ALCOHOL, "酒精");
        translationBuilder.add(ModItems.PURPLE_EGG, "§514特供紫色煎蛋.jpg");
        translationBuilder.add(ModItems.FRENCH_STICK, "法棍");
        translationBuilder.add(ModItems.RESIN, "树脂");
        translationBuilder.add(ModItems.PETRI_DISH_ITEM, "培养皿");
        translationBuilder.add(ModItems.RESIN_SCYTHE, "树脂镰刀");
        translationBuilder.add(ModItems.COPPER_NUGGET, "铜粒");
        translationBuilder.add(ModItems.MANTOU, "馒头");

        //方块名称
        translationBuilder.add(ModBlocks.CURITER_BLOCK, "翆璃塔方块");
        translationBuilder.add(ModBlocks.GARUINKA_MINERAL, "格林卡富集矿");
        translationBuilder.add(ModBlocks.DEEPSLATE_GARUINKA_MINERAL, "深层格林卡富集矿");
        translationBuilder.add(ModBlocks.NETHER_GARUINKA_MINERAL, "下界格林卡富集矿");
        translationBuilder.add(ModBlocks.END_GARUINKA_MINERAL, "末地格林卡富集矿");
        translationBuilder.add(ModBlocks.GARUINKA_EXTRACTORS, "格林卡萃取器");
        translationBuilder.add(ModBlocks.MILL, "磨粉机");

        //唱片名称
        translationBuilder.add(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.BLACK_BLOOD_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.EVANESCENT_STAR_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.CRASHED_STAR_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.DIMENSION_CABINET_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.THE_CURITER_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.GLITCH_ART_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.THE_SUKATUO_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC, "§b翆璃塔音乐唱片");
        translationBuilder.add(ModItems.NEW_THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC, "§b翆璃塔音乐唱片");

        //音乐名称
        translationBuilder.add("sounds.curiter.the_paradox_of_theorem_seven", "七号定理悖论");
        translationBuilder.add("sounds.curiter.candy_star_paradise", "糖星乐园");
        translationBuilder.add("sounds.curiter.black_blood", "黑血");
        translationBuilder.add("sounds.curiter.ancient_castle_under_the_blood_moon", "血月下的古城堡");
        translationBuilder.add("sounds.curiter.evanescent_star", "逝星");
        translationBuilder.add("sounds.curiter.crashed_star", "坠星");
        translationBuilder.add("sounds.curiter.sleeping_atlantis", "沉睡的亚特兰蒂斯");
        translationBuilder.add("sounds.curiter.dimension_cabinet", "维度柜子");
        translationBuilder.add("sounds.curiter.the_curiter", "诞生于虚空坑洞的翆璃塔");
        translationBuilder.add("sounds.curiter.gravitational_equilibrium", "引力平衡");
        translationBuilder.add("sounds.curiter.blood_falsehood", "血色虚妄");
        translationBuilder.add("sounds.curiter.god_ghosts_and_dao_symbol", "天鬼神道符");
        translationBuilder.add("sounds.curiter.glitch_art", "错误艺术");
        translationBuilder.add("sounds.curiter.the_sukatuo", "碎时塔");
        translationBuilder.add("sounds.curiter.the_clock_tower_travel", "钟塔旅行");
        translationBuilder.add("sounds.curiter.new_the_clock_tower_travel", "钟塔旅行(新)");

        //唱片副名称
        translationBuilder.add("item.curiter.the_paradox_of_theorem_seven_music_disc.desc", "七号定理悖论-翆璃塔");
        translationBuilder.add("item.curiter.candy_star_paradise_music_disc.desc", "糖星乐园-翆璃塔");
        translationBuilder.add("item.curiter.black_blood_music_disc.desc", "黑血-翆璃塔");
        translationBuilder.add("item.curiter.ancient_castle_under_the_blood_moon_music_disc.desc", "血月下的古城堡-翆璃塔");
        translationBuilder.add("item.curiter.evanescent_star_music_disc.desc", "逝星-翆璃塔");
        translationBuilder.add("item.curiter.crashed_star_music_disc.desc", "坠星-翆璃塔");
        translationBuilder.add("item.curiter.sleeping_atlantis_music_disc.desc", "沉睡的亚特兰蒂斯-翆璃塔");
        translationBuilder.add("item.curiter.dimension_cabinet_music_disc.desc", "维度柜子-翆璃塔");
        translationBuilder.add("item.curiter.the_curiter_music_disc.desc", "诞生于虚空坑洞的翆璃塔-翆璃塔");
        translationBuilder.add("item.curiter.gravitational_equilibrium_music_disc.desc", "引力平衡-翆璃塔");
        translationBuilder.add("item.curiter.blood_falsehood_music_disc.desc", "血色虚妄-翆璃塔");
        translationBuilder.add("item.curiter.god_ghosts_and_dao_symbol_music_disc.desc", "天鬼神道符-翆璃塔");
        translationBuilder.add("item.curiter.glitch_art_music_disc.desc", "错误艺术-翆璃塔");
        translationBuilder.add("item.curiter.the_sukatuo_music_disc.desc", "碎时塔-翆璃塔");
        translationBuilder.add("item.curiter.the_clock_tower_travel_music_disc.desc", "钟塔旅行-翆璃塔");
        translationBuilder.add("item.curiter.new_the_clock_tower_travel_music_disc.desc", "钟塔旅行(新)-翆璃塔");

        //创造模式物品栏名称
        translationBuilder.add("itemGroup.curiter_group", "翆璃塔模组物品");
        translationBuilder.add("itemGroup.curiter_food", "翆璃塔模组食物");
        translationBuilder.add("itemGroup.curiter_music_disc", "翆璃塔音乐唱片");

        //画作及其作者名称
        translationBuilder.add("painting.curiter.fafa.title", "fafa像素画");
        translationBuilder.add("painting.curiter.fafa.author", "鹤初舞");
        translationBuilder.add("painting.curiter.hechuwu.title", "橘猫像素画");
        translationBuilder.add("painting.curiter.hechuwu.author", "鹤初舞");
        translationBuilder.add("painting.curiter.green_milk_candy.title", "青奶糖");
        translationBuilder.add("painting.curiter.green_milk_candy.author", "鹤初舞");
        translationBuilder.add("painting.curiter.ancient_castle_under_the_blood_moon_painting.title", "《血月下的古城堡》(曲绘)");
        translationBuilder.add("painting.curiter.ancient_castle_under_the_blood_moon_painting.author", "朽指");
        translationBuilder.add("painting.curiter.hechuwu1.title", "橘猫叼花.jpg");
        translationBuilder.add("painting.curiter.hechuwu1.author", "鹤初舞");
        translationBuilder.add("painting.curiter.sleeping_atlantis_painting.title", "《沉睡的亚特兰蒂斯》(曲绘)");
        translationBuilder.add("painting.curiter.sleeping_atlantis_painting.author", "朽指");
        translationBuilder.add("painting.curiter.curiter.title", "翆璃塔(消逝虚无的历史)");
        translationBuilder.add("painting.curiter.curiter.author", "翆璃塔");
        translationBuilder.add("painting.curiter.curiter_new.title", "翆璃塔(突破焰心的新生)");
        translationBuilder.add("painting.curiter.curiter_new.author", "彩笔小狼彩笔");
        translationBuilder.add("painting.curiter.sundae.title", "圣代战争");
        translationBuilder.add("painting.curiter.sundae.author", "蝶喋LPTIR");
        translationBuilder.add("painting.curiter.candy_star_paradise_painting.title", "《糖星乐园》(曲绘)");
        translationBuilder.add("painting.curiter.candy_star_paradise_painting.author", "鹤初舞");

        //功能方块GUI文字
        translationBuilder.add("garuinka_extractors_gui_name", "格林卡萃取器");
        translationBuilder.add("mill_gui_name", "磨粉机");
        translationBuilder.add("petri_dish_gui_name", "培养皿");

    }
}
