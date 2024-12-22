package com.curiter.block;

import com.curiter.CuriterMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CURITER_BLOCK = registerBlocks("curiter_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block GARUINKA_MINERAL = registerBlocks("garuinka_mineral",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).luminance(4)));
    public static final Block DEEPSLATE_GARUINKA_MINERAL = registerBlocks("deepslate_garuinka_mineral",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).luminance(4)));
    public static final Block NETHER_GARUINKA_MINERAL = registerBlocks("nether_garuinka_mineral",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).luminance(4)));
    public static final Block END_GARUINKA_MINERAL = registerBlocks("end_garuinka_mineral",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).luminance(4)));



    private static Block registerBlocks(String name,Block block){
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(CuriterMod.MOD_ID,name),
                block);
    }
    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(CuriterMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){}
}
