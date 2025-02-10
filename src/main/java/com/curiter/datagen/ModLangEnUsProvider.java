package com.curiter.datagen;

import com.curiter.block.ModBlocks;
import com.curiter.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangEnUsProvider extends FabricLanguageProvider {

    public ModLangEnUsProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //物品名称
        translationBuilder.add(ModItems.GARUINKA, "Bottled Garuinka");
        translationBuilder.add(ModItems.GARUINKA_COLLECTORS, "Garuinka collection crystal");
        translationBuilder.add(ModItems.GARUINKA_STORAGE_BOTTLE, "Garuinka storage bottle");
        translationBuilder.add(ModItems.GARUINKA_DETECTORS, "Garuinka detector");
        translationBuilder.add(ModItems.DISC_EMPTY, "Empty disc");
        translationBuilder.add(ModItems.COGS, "Cogs");
        translationBuilder.add(ModItems.FRIED_EGG, "Fried egg");
        translationBuilder.add(ModItems.FLOUR, "Flour");
        translationBuilder.add(ModItems.DOUGH, "Dough");
        translationBuilder.add(ModItems.FERMENTED_DOUGH, "Fermented dough");
        translationBuilder.add(ModItems.YEAST, "Yeast");
        translationBuilder.add(ModItems.ALCOHOL, "Alcohol");
        translationBuilder.add(ModItems.PURPLE_EGG, "§5Purple egg?");
        translationBuilder.add(ModItems.FRENCH_STICK, "French stick");
        translationBuilder.add(ModItems.RESIN, "resin");
        translationBuilder.add(ModItems.PETRI_DISH_ITEM, "Petri dish");
        translationBuilder.add(ModItems.RESIN_SCYTHE, "Resin scythe");
        translationBuilder.add(ModItems.COPPER_NUGGET, "Copper nugget");
        translationBuilder.add(ModItems.MANTOU, "Mantou");

        //方块名称
        translationBuilder.add(ModBlocks.CURITER_BLOCK, "Curiter block");
        translationBuilder.add(ModBlocks.GARUINKA_MINERAL, "Garuinka mineral");
        translationBuilder.add(ModBlocks.DEEPSLATE_GARUINKA_MINERAL, "Deepslate garuinka mineral");
        translationBuilder.add(ModBlocks.NETHER_GARUINKA_MINERAL, "Nether garuinka mineral");
        translationBuilder.add(ModBlocks.END_GARUINKA_MINERAL, "End garuinka mineral");
        translationBuilder.add(ModBlocks.GARUINKA_EXTRACTORS, "garuinka extractor");
        translationBuilder.add(ModBlocks.MILL, "Mill");

        //唱片名称
        translationBuilder.add(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.BLACK_BLOOD_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.EVANESCENT_STAR_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.CRASHED_STAR_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.DIMENSION_CABINET_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.THE_CURITER_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.GLITCH_ART_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.THE_SUKATUO_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC, "§bCuriter music disc");
        translationBuilder.add(ModItems.NEW_THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC, "§bCuriter music disc");

        //音乐名称
        translationBuilder.add("sounds.curiter.the_paradox_of_theorem_seven", "The Paradox Of Theorem 7");
        translationBuilder.add("sounds.curiter.candy_star_paradise", "Candy Star Paradise");
        translationBuilder.add("sounds.curiter.black_blood", "Black Blood");
        translationBuilder.add("sounds.curiter.ancient_castle_under_the_blood_moon", "Ancient Castle Under The Blood Moon");
        translationBuilder.add("sounds.curiter.evanescent_star", "Evanescent Star");
        translationBuilder.add("sounds.curiter.crashed_star", "Crashed Star");
        translationBuilder.add("sounds.curiter.sleeping_atlantis", "Sleeping Atlantis");
        translationBuilder.add("sounds.curiter.dimension_cabinet", "Dimension Cabinet");
        translationBuilder.add("sounds.curiter.the_curiter", "The Curiter");
        translationBuilder.add("sounds.curiter.gravitational_equilibrium", "Gravitational Equilibrium");
        translationBuilder.add("sounds.curiter.blood_falsehood", "Blood Falsehood");
        translationBuilder.add("sounds.curiter.god_ghosts_and_dao_symbol", "God Ghosts And DAO Symbol");
        translationBuilder.add("sounds.curiter.glitch_art", "Glitch Art");
        translationBuilder.add("sounds.curiter.the_sukatuo", "The Sukatuo");
        translationBuilder.add("sounds.curiter.the_clock_tower_travel", "The Clock Tower Travel");
        translationBuilder.add("sounds.curiter.new_the_clock_tower_travel", "The Clock Tower Travel(New)");

        //唱片副名称
        translationBuilder.add("item.curiter.the_paradox_of_theorem_seven_music_disc.desc", "The Paradox Of Theorem 7-Curiter");
        translationBuilder.add("item.curiter.candy_star_paradise_music_disc.desc", "Candy Star Paradise-Curiter");
        translationBuilder.add("item.curiter.black_blood_music_disc.desc", "Black Blood-Curiter");
        translationBuilder.add("item.curiter.ancient_castle_under_the_blood_moon_music_disc.desc", "Ancient Castle Under The Blood Moon-Curiter");
        translationBuilder.add("item.curiter.evanescent_star_music_disc.desc", "Evanescent Star-Curiter");
        translationBuilder.add("item.curiter.crashed_star_music_disc.desc", "Crashed Star-Curiter");
        translationBuilder.add("item.curiter.sleeping_atlantis_music_disc.desc", "Sleeping Atlantis-Curiter");
        translationBuilder.add("item.curiter.dimension_cabinet_music_disc.desc", "Dimension Cabinet-Curiter");
        translationBuilder.add("item.curiter.the_curiter_music_disc.desc", "The Curiter-Curiter");
        translationBuilder.add("item.curiter.gravitational_equilibrium_music_disc.desc", "Gravitational Equilibrium-Curiter");
        translationBuilder.add("item.curiter.blood_falsehood_music_disc.desc", "Blood Falsehood-Curiter");
        translationBuilder.add("item.curiter.god_ghosts_and_dao_symbol_music_disc.desc", "God Ghosts And DAO Symbol-Curiter");
        translationBuilder.add("item.curiter.glitch_art_music_disc.desc", "Glitch Art-Curiter");
        translationBuilder.add("item.curiter.the_sukatuo_music_disc.desc", "The Sukatuo-Curiter");
        translationBuilder.add("item.curiter.the_clock_tower_travel_music_disc.desc", "The Clock Tower Travel-Curiter");
        translationBuilder.add("item.curiter.new_the_clock_tower_travel_music_disc.desc", "The Clock Tower Travel(New)-Curiter");

        //创造模式物品栏名称
        translationBuilder.add("itemGroup.curiter_group", "Curiter Mod Items");
        translationBuilder.add("itemGroup.curiter_food", "Curiter Mod Foods");
        translationBuilder.add("itemGroup.curiter_music_disc", "Curiter Music Disc");

        //画作及其作者名称
        translationBuilder.add("painting.curiter.fafa.title", "fafa");
        translationBuilder.add("painting.curiter.fafa.author", "鹤初舞");
        translationBuilder.add("painting.curiter.hechuwu.title", "Orange cat");
        translationBuilder.add("painting.curiter.hechuwu.author", "鹤初舞");
        translationBuilder.add("painting.curiter.green_milk_candy.title", "Green milk candy");
        translationBuilder.add("painting.curiter.green_milk_candy.author", "鹤初舞");
        translationBuilder.add("painting.curiter.ancient_castle_under_the_blood_moon_painting.title", "Ancient Castle Under The Blood Moon");
        translationBuilder.add("painting.curiter.ancient_castle_under_the_blood_moon_painting.author", "朽指");
        translationBuilder.add("painting.curiter.hechuwu1.title", "Orange cat bites flowers.jpg");
        translationBuilder.add("painting.curiter.hechuwu1.author", "鹤初舞");
        translationBuilder.add("painting.curiter.sleeping_atlantis_painting.title", "Sleeping Atlantis");
        translationBuilder.add("painting.curiter.sleeping_atlantis_painting.author", "朽指");
        translationBuilder.add("painting.curiter.curiter.title", "Curiter");
        translationBuilder.add("painting.curiter.curiter.author", "Curiter");
        translationBuilder.add("painting.curiter.curiter_new.title", "New Curiter");
        translationBuilder.add("painting.curiter.curiter_new.author", "彩笔小狼彩笔");
        translationBuilder.add("painting.curiter.sundae.title", "War of Sundae");
        translationBuilder.add("painting.curiter.sundae.author", "LPTIR");
        translationBuilder.add("painting.curiter.candy_star_paradise_painting.title", "Candy Star Paradise");
        translationBuilder.add("painting.curiter.candy_star_paradise_painting.author", "鹤初舞");

        //功能方块GUI文字
        translationBuilder.add("garuinka_extractors_gui_name", "Garuinka extractors");
        translationBuilder.add("mill_gui_name", "Mill");
        translationBuilder.add("petri_dish_gui_name", "Petri dish");

    }
}
