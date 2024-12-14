package com.curiter.item;

import com.curiter.CuriterMod;
import com.curiter.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GARUINKA = registerItems("garuinka",new Item(new FabricItemSettings()));
    public static final Item DISC_EMPTY = registerItems("disc_empty",new Item(new FabricItemSettings()));


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
    }
    public static void addItemsToItemGroupNATURAL(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(GARUINKA);
    }
    public static void addItemsToItemGroupOPERATOR(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ModBlocks.CURITER_BLOCK);
    }
}
