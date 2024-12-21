package com.curiter.item;

import com.curiter.CuriterMod;
import com.curiter.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CURITER_GROUP = Registry.register(Registries.ITEM_GROUP,new Identifier(CuriterMod.MOD_ID,"curiter_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.curiter_group"))
            .icon(() -> new ItemStack(ModBlocks.CURITER_BLOCK)).
            entries((displayContext, entries) -> {
                entries.add(ModItems.DISC_EMPTY);
                entries.add(ModItems.GARUINKA_STORAGE_BOTTLE);
                entries.add(ModItems.GARUINKA);
                entries.add(ModItems.GARUINKA_COLLECTORS);
                entries.add(ModItems.GARUINKA_DETECTORS);
                entries.add(ModBlocks.CURITER_BLOCK);
                entries.add(ModBlocks.GARUINKA_MINERAL);
                entries.add(ModBlocks.DEEPSLATE_GARUINKA_MINERAL);
                entries.add(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC);
                entries.add(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOOND_MUSIC_DISC);
                entries.add(ModItems.BLACK_BLOOD_MUSIC_DISC);
                entries.add(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC);
                entries.add(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC);
                entries.add(ModItems.DIMENSION_CABINET_MUSIC_DISC);
                entries.add(ModItems.CRASHED_STAR_MUSIC_DISC);
                entries.add(ModItems.EVANESCENT_STAR_MUSIC_DISC);
                entries.add(ModItems.GLITCH_ART_MUSIC_DISC);
                entries.add(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC);
                entries.add(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC);
                entries.add(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC);
                entries.add(ModItems.THE_CURITER_MUSIC_DISC);
                entries.add(ModItems.THE_SUKATUO_MUSIC_DISC);
            }).build());

    public static final ItemGroup CURITER_MUSIC_DISC = Registry.register(Registries.ITEM_GROUP,new Identifier(CuriterMod.MOD_ID,"curiter_music_disc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.curiter_music_disc"))
                    .icon(() -> new ItemStack(ModItems.DISC_EMPTY)).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.DISC_EMPTY);
                        entries.add(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC);
                        entries.add(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOOND_MUSIC_DISC);
                        entries.add(ModItems.BLACK_BLOOD_MUSIC_DISC);
                        entries.add(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC);
                        entries.add(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC);
                        entries.add(ModItems.DIMENSION_CABINET_MUSIC_DISC);
                        entries.add(ModItems.CRASHED_STAR_MUSIC_DISC);
                        entries.add(ModItems.EVANESCENT_STAR_MUSIC_DISC);
                        entries.add(ModItems.GLITCH_ART_MUSIC_DISC);
                        entries.add(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC);
                        entries.add(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC);
                        entries.add(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC);
                        entries.add(ModItems.THE_CURITER_MUSIC_DISC);
                        entries.add(ModItems.THE_SUKATUO_MUSIC_DISC);
                    }).build());

    public static void registerModItemGroups(){
    }
}
