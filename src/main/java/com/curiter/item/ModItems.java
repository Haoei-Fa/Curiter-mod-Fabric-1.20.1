package com.curiter.item;

import com.curiter.CuriterMod;
import com.curiter.block.ModBlocks;
import com.curiter.item.custom.*;
import com.curiter.sounds.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GARUINKA_STORAGE_BOTTLE = registerItems("garuinka_storage_bottle",new Item(new FabricItemSettings().maxCount(16)));
    public static final Item GARUINKA = registerItems("garuinka",new GARUINKA(new FabricItemSettings().recipeRemainder(GARUINKA_STORAGE_BOTTLE).maxCount(16)));
    public static final Item GARUINKA_COLLECTORS = registerItems("garuinka_collectors",new GARUINKA_COLLECTORS(new FabricItemSettings().maxDamage(10000)));
    public static final Item GARUINKA_DETECTORS = registerItems("garuinka_detectors",new GARUINKA_DETECTORS(new FabricItemSettings().maxDamage(64)));

    public static final Item DISC_EMPTY = registerItems("disc_empty",new Item(new FabricItemSettings().maxCount(16)));
    public static final Item COGS = registerItems("cogs",new Item(new FabricItemSettings().maxCount(64)));
    public static final Item COPPER_NUGGET = registerItems("copper_nugget",new Item(new FabricItemSettings().maxCount(64)));
    public static final Item RESIN = registerItems("resin",new Item(new FabricItemSettings().maxCount(64)));
    public static final Item FLOUR = registerItems("flour",new Item(new FabricItemSettings().maxCount(64)));
    public static final Item DOUGH = registerItems("dough",new Item(new FabricItemSettings().maxCount(64)));
    public static final Item FERMENTED_DOUGH = registerItems("fermented_dough",new Item(new FabricItemSettings().maxCount(64)));
    public static final Item YEAST = registerItems("yeast",new Item(new FabricItemSettings().maxCount(64)));
    public static final Item ALCOHOL = registerItems("alcohol",new Item(new FabricItemSettings().maxCount(64)));

    public static final Item PETRI_DISH_ITEM = registerItems("petri_dish_item",new BlockItem(ModBlocks.PETRI_DISH,new Item.Settings().maxCount(64)));

    public static final Item FRIED_EGG = registerItems("fried_egg",new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG).maxCount(64)));
    public static final Item PURPLE_EGG = registerItems("purple_egg",new PURPLE_EGG(new FabricItemSettings().food(ModFoodComponents.PURPLE_EGG).maxCount(64)));
    public static final Item FRENCH_STICK = registerItems("french_stick",new FRENCH_STICK(new FabricItemSettings().maxDamage(100)));

    public static final Item RESIN_SCYTHE = registerItems("resin_scythe",new RESIN_SCYTHE(ModToolMaterial.IRONS,3,1F,new FabricItemSettings()));

    public static final Item THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC = registerItems("the_paradox_of_theorem_seven_music_disc",
            new MusicDiscItem(7, ModSounds.THE_PARADOX_OF_THEOREM_SEVEN,new FabricItemSettings().maxCount(1),160));
    public static final Item CANDY_STAR_PARADISE_MUSIC_DISC = registerItems("candy_star_paradise_music_disc",
            new MusicDiscItem(5, ModSounds.CANDY_STAR_PARADISE,new FabricItemSettings().maxCount(1),235));
    public static final Item BLACK_BLOOD_MUSIC_DISC = registerItems("black_blood_music_disc",
            new MusicDiscItem(2, ModSounds.BLACK_BLOOD,new FabricItemSettings().maxCount(1),265));
    public static final Item ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON_MUSIC_DISC = registerItems("ancient_castle_under_the_blood_moon_music_disc",
            new MusicDiscItem(3, ModSounds.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON,new FabricItemSettings().maxCount(1),295));
    public static final Item EVANESCENT_STAR_MUSIC_DISC = registerItems("evanescent_star_music_disc",
            new MusicDiscItem(9, ModSounds.EVANESCENT_STAR,new FabricItemSettings().maxCount(1),165));
    public static final Item CRASHED_STAR_MUSIC_DISC = registerItems("crashed_star_music_disc",
            new MusicDiscItem(10, ModSounds.CRASHED_STAR,new FabricItemSettings().maxCount(1),210));
    public static final Item SLEEPING_ATLANTIS_MUSIC_DISC = registerItems("sleeping_atlantis_music_disc",
            new MusicDiscItem(8, ModSounds.SLEEPING_ATLANTIS,new FabricItemSettings().maxCount(1),210));
    public static final Item DIMENSION_CABINET_MUSIC_DISC = registerItems("dimension_cabinet_music_disc",
            new MusicDiscItem(4, ModSounds.DIMENSION_CABINET,new FabricItemSettings().maxCount(1),185));
    public static final Item THE_CURITER_MUSIC_DISC = registerItems("the_curiter_music_disc",
            new MusicDiscItem(14, ModSounds.THE_CURITER,new FabricItemSettings().maxCount(1),200));
    public static final Item GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC = registerItems("gravitational_equilibrium_music_disc",
            new MusicDiscItem(11, ModSounds.GRAVITATIONAL_EQUILIBRIUM,new FabricItemSettings().maxCount(1),185));
    public static final Item BLOOD_FALSEHOOD_MUSIC_DISC = registerItems("blood_falsehood_music_disc",
            new MusicDiscItem(15, ModSounds.BLOOD_FALSEHOOD,new FabricItemSettings().maxCount(1),250));
    public static final Item GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC = registerItems("god_ghosts_and_dao_symbol_music_disc",
            new MusicDiscItem(13, ModSounds.GOD_GHOSTS_AND_DAO_SYMBOL,new FabricItemSettings().maxCount(1),210));
    public static final Item GLITCH_ART_MUSIC_DISC = registerItems("glitch_art_music_disc",
            new MusicDiscItem(6, ModSounds.GLITCH_ART,new FabricItemSettings().maxCount(1),210));
    public static final Item THE_SUKATUO_MUSIC_DISC = registerItems("the_sukatuo_music_disc",
            new MusicDiscItem(1, ModSounds.THE_SUKATUO,new FabricItemSettings().maxCount(1),195));
    public static final Item THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC = registerItems("the_clock_tower_travel_music_disc",
            new MusicDiscItem(12, ModSounds.THE_CLOCK_TOWER_TRAVEL,new FabricItemSettings().maxCount(1),185));
    public static final Item NEW_THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC = registerItems("new_the_clock_tower_travel_music_disc",
            new MusicDiscItem(12, ModSounds.NEW_THE_CLOCK_TOWER_TRAVEL,new FabricItemSettings().maxCount(1),185));


    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(CuriterMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroupINGREDIENTS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToItemGroupNATURAL);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(ModItems::addItemsToItemGroupOPERATOR);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToItemGroupFUNCTIONAL);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToItemGroupTOOLS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrink);
    }
    public static void addItemsToItemGroupINGREDIENTS(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(GARUINKA);
        fabricItemGroupEntries.add(DISC_EMPTY);
        fabricItemGroupEntries.add(GARUINKA_STORAGE_BOTTLE);
        fabricItemGroupEntries.add(COGS);
        fabricItemGroupEntries.add(COPPER_NUGGET);
        fabricItemGroupEntries.add(RESIN);
    }
    public static void addItemsToItemGroupNATURAL(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ModBlocks.GARUINKA_MINERAL);
        fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_GARUINKA_MINERAL);
        fabricItemGroupEntries.add(ModBlocks.NETHER_GARUINKA_MINERAL);
        fabricItemGroupEntries.add(ModBlocks.END_GARUINKA_MINERAL);
    }
    public static void addItemsToItemGroupOPERATOR(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ModBlocks.CURITER_BLOCK);
    }
    public static void addItemsToItemGroupFUNCTIONAL(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ModBlocks.GARUINKA_EXTRACTORS);
    }
    public static void addItemsToItemGroupTOOLS(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(GARUINKA);
        fabricItemGroupEntries.add(GARUINKA_COLLECTORS);
        fabricItemGroupEntries.add(GARUINKA_DETECTORS);
        fabricItemGroupEntries.add(RESIN_SCYTHE);
    }
    public static void addItemsToFoodAndDrink(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(FRIED_EGG);
        fabricItemGroupEntries.add(PURPLE_EGG);
        fabricItemGroupEntries.add(FRENCH_STICK);
    }
}
