package com.curiter.block.entity;

import com.curiter.CuriterMod;
import com.curiter.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<GaruinkaExtractorsBlockEntity> GARUINKA_EXTRACTORS_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CuriterMod.MOD_ID, "garuinka_extractors_block_entity"),
                    FabricBlockEntityTypeBuilder.create(GaruinkaExtractorsBlockEntity::new,
                            ModBlocks.GARUINKA_EXTRACTORS).build());
    public static final BlockEntityType<MillBlockEntity> MILL_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CuriterMod.MOD_ID, "mill_block_entity"),
                    FabricBlockEntityTypeBuilder.create(MillBlockEntity::new,
                            ModBlocks.MILL).build());
    public static final BlockEntityType<PetriDishBlockEntity> PETRI_DISH_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CuriterMod.MOD_ID, "petri_dish_block_entity"),
                    FabricBlockEntityTypeBuilder.create(PetriDishBlockEntity::new,
                            ModBlocks.PETRI_DISH).build());

    public static void registerBlockEntities() {
    }
}
