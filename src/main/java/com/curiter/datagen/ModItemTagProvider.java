package com.curiter.datagen;

import com.curiter.item.ModItems;
import com.curiter.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.CURITER_MUSIC_DISC)
                .add(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC)
                .add(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON_MUSIC_DISC)
                .add(ModItems.BLACK_BLOOD_MUSIC_DISC)
                .add(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC)
                .add(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC)
                .add(ModItems.CRASHED_STAR_MUSIC_DISC)
                .add(ModItems.DIMENSION_CABINET_MUSIC_DISC)
                .add(ModItems.EVANESCENT_STAR_MUSIC_DISC)
                .add(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC)
                .add(ModItems.GLITCH_ART_MUSIC_DISC)
                .add(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC)
                .add(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC)
                .add(ModItems.THE_CURITER_MUSIC_DISC)
                .add(ModItems.THE_SUKATUO_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC)
                .add(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOON_MUSIC_DISC)
                .add(ModItems.BLACK_BLOOD_MUSIC_DISC)
                .add(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC)
                .add(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC)
                .add(ModItems.CRASHED_STAR_MUSIC_DISC)
                .add(ModItems.DIMENSION_CABINET_MUSIC_DISC)
                .add(ModItems.EVANESCENT_STAR_MUSIC_DISC)
                .add(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC)
                .add(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC)
                .add(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC);


        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).addTag(ModTags.Items.CURITER_MUSIC_DISC);
    }
}
