package com.curiter.datagen;

import com.curiter.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //花
        getOrCreateTagBuilder(ModTags.Blocks.FLOWERS_LIST)
                .forceAddTag(BlockTags.SMALL_FLOWERS)
                .forceAddTag(BlockTags.TALL_FLOWERS)
                .add(Blocks.PINK_PETALS)
                .add(Blocks.SPORE_BLOSSOM)
                .add(Blocks.CHORUS_FLOWER);
        //草类方块
        getOrCreateTagBuilder(ModTags.Blocks.GRASS_LIST)
                .add(Blocks.TALL_GRASS)
                .add(Blocks.GRASS)
                .add(Blocks.LARGE_FERN)
                .add(Blocks.FERN)
                .add(Blocks.NETHER_SPROUTS)
                .add(Blocks.CRIMSON_ROOTS)
                .add(Blocks.SEAGRASS)
                .add(Blocks.TALL_SEAGRASS);
        //树苗方块
        getOrCreateTagBuilder(ModTags.Blocks.SAPLINGS_LIST)
                .forceAddTag(BlockTags.SAPLINGS);
        //树叶方块
        getOrCreateTagBuilder(ModTags.Blocks.LEAVES_LIST)
                .forceAddTag(BlockTags.LEAVES);
        //蘑菇类方块
        getOrCreateTagBuilder(ModTags.Blocks.MUSHROOMS_LIST)
                .add(Blocks.RED_MUSHROOM)
                .add(Blocks.RED_MUSHROOM_BLOCK)
                .add(Blocks.BROWN_MUSHROOM)
                .add(Blocks.BROWN_MUSHROOM_BLOCK)
                .add(Blocks.MUSHROOM_STEM)
                .add(Blocks.CRIMSON_FUNGUS)
                .add(Blocks.WARPED_FUNGUS)
                .add(Blocks.WARPED_WART_BLOCK)
                .add(Blocks.NETHER_WART_BLOCK);
        //泥土变种
        getOrCreateTagBuilder(ModTags.Blocks.DIRT_LIST)
                .add(Blocks.GRASS_BLOCK)
                .add(Blocks.MYCELIUM)
                .add(Blocks.PODZOL)
                .add(Blocks.ROOTED_DIRT);
        //其他植物
        getOrCreateTagBuilder(ModTags.Blocks.OTHER_PLANTS_LIST)
                .add(Blocks.VINE)
                .add(Blocks.BAMBOO_SAPLING)
                .add(Blocks.SEA_PICKLE)
                .add(Blocks.SMALL_DRIPLEAF)
                .add(Blocks.BIG_DRIPLEAF)
                .add(Blocks.BIG_DRIPLEAF_STEM)
                .add(Blocks.HANGING_ROOTS)
                .add(Blocks.WARPED_ROOTS)
                .add(Blocks.GLOW_LICHEN)
                .add(Blocks.MOSS_CARPET)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.KELP)
                .add(Blocks.KELP_PLANT)
                .add(Blocks.TWISTING_VINES)
                .add(Blocks.TWISTING_VINES_PLANT)
                .add(Blocks.CACTUS)
                .add(Blocks.SUGAR_CANE)
                .add(Blocks.LILY_PAD);
        //幽匿方块
        getOrCreateTagBuilder(ModTags.Blocks.SCULK_BLOCKS_LIST)
                .add(Blocks.SCULK)
                .add(Blocks.SCULK_VEIN)
                .add(Blocks.SCULK_SHRIEKER)
                .add(Blocks.SCULK_CATALYST)
                .add(Blocks.SCULK_SENSOR);
        //下界岩变种
        getOrCreateTagBuilder(ModTags.Blocks.NETHER_RACKS_LIST)
                .add(Blocks.CRIMSON_NYLIUM)
                .add(Blocks.WARPED_NYLIUM);
    }
}
