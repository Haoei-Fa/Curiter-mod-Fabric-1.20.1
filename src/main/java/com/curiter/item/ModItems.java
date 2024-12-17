package com.curiter.item;

import com.curiter.CuriterMod;
import com.curiter.block.ModBlocks;
import com.curiter.sounds.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GARUINKA = registerItems("garuinka",new Item(new FabricItemSettings()));
    public static final Item GARUINKA_STORAGE_BOTTLE = registerItems("garuinka_storage_bottle",new Item(new FabricItemSettings()));
    public static final Item DISC_EMPTY = registerItems("disc_empty",new Item(new FabricItemSettings()));

    public static final Item THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC = registerItems("the_paradox_of_theorem_seven_music_disc",
            new MusicDiscItem(7, ModSounds.THE_PARADOX_OF_THEOREM_SEVEN,new FabricItemSettings().maxCount(1),160));
    public static final Item CANDY_STAR_PARADISE_MUSIC_DISC = registerItems("candy_star_paradise_music_disc",
            new MusicDiscItem(5, ModSounds.CANDY_STAR_PARADISE,new FabricItemSettings().maxCount(1),235));
    public static final Item BLACK_BLOOD_MUSIC_DISC = registerItems("black_blood_music_disc",
            new MusicDiscItem(2, ModSounds.BLACK_BLOOD,new FabricItemSettings().maxCount(1),265));
    public static final Item ANCIENT_CASTLE_UNDER_THE_BLOOD_MOOND_MUSIC_DISC = registerItems("ancient_castle_under_the_blood_moon_music_disc",
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

    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(CuriterMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroupINGREDIENTS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToItemGroupNATURAL);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(ModItems::addItemsToItemGroupOPERATOR);
    }
    public static void addItemsToItemGroupINGREDIENTS(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(GARUINKA);
        fabricItemGroupEntries.add(DISC_EMPTY);
        fabricItemGroupEntries.add(GARUINKA_STORAGE_BOTTLE);
    }
    public static void addItemsToItemGroupNATURAL(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(GARUINKA);
    }
    public static void addItemsToItemGroupOPERATOR(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ModBlocks.CURITER_BLOCK);
    }
}
