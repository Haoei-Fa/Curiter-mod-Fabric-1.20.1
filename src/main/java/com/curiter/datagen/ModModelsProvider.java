package com.curiter.datagen;

import com.curiter.block.ModBlocks;
import com.curiter.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURITER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARUINKA_MINERAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_GARUINKA_MINERAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_GARUINKA_MINERAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARUINKA_EXTRACTORS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DISC_EMPTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.COGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARUINKA, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARUINKA_COLLECTORS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARUINKA_STORAGE_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARUINKA_DETECTORS, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_PARADOX_OF_THEOREM_SEVEN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_CASTLE_UNDER_THE_BLOOD_MOOND_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_BLOOD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOOD_FALSEHOOD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANDY_STAR_PARADISE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRASHED_STAR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIMENSION_CABINET_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVANESCENT_STAR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLITCH_ART_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOD_GHOSTS_AND_DAO_SYMBOL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAVITATIONAL_EQUILIBRIUM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_CURITER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_SUKATUO_MUSIC_DISC, Models.GENERATED);
    }
}
