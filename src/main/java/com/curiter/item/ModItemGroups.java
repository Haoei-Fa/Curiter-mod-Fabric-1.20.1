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
                entries.add(ModItems.GARUINKA);
                entries.add(ModBlocks.CURITER_BLOCK);
            }).build());

    public static final ItemGroup CURITER_MUSIC_DISC = Registry.register(Registries.ITEM_GROUP,new Identifier(CuriterMod.MOD_ID,"curiter_music_disc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.curiter_music_disc"))
                    .icon(() -> new ItemStack(ModItems.DISC_EMPTY)).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.DISC_EMPTY);
                    }).build());

    public static void registerModItemGroups(){
    }
}
