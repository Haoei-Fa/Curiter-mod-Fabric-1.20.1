package com.curiter.datagen;

import com.curiter.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CURITER_BLOCK);
        addDrop(ModBlocks.GARUINKA_EXTRACTORS);
        addDrop(ModBlocks.MILL);
        addDrop(ModBlocks.PETRI_DISH);

        addDrop(ModBlocks.GARUINKA_MINERAL, oreDrops(Blocks.STONE, Blocks.COBBLESTONE.asItem()));
        addDrop(ModBlocks.DEEPSLATE_GARUINKA_MINERAL, oreDrops(Blocks.DEEPSLATE, Blocks.COBBLED_DEEPSLATE.asItem()));
        addDrop(ModBlocks.NETHER_GARUINKA_MINERAL, oreDrops(Blocks.NETHERRACK, Blocks.NETHERRACK.asItem()));
        addDrop(ModBlocks.END_GARUINKA_MINERAL, oreDrops(Blocks.END_STONE, Blocks.END_STONE.asItem()));
    }
}
