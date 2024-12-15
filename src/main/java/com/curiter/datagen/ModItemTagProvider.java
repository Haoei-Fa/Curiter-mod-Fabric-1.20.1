package com.curiter.datagen;

import com.curiter.item.ModItems;
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
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOOND_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.BLACK_BLOOD_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.CRASHED_STAR_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.DIMENSION_CABINET_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.EVANESCENT_STAR_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.GLITCH_ART_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.THE_CURITER_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.THE_SUKATUO_MUSIC_DISC);

    }
}
