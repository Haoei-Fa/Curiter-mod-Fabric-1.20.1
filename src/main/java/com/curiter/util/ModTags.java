package com.curiter.util;

import com.curiter.CuriterMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> FLOWERS_LIST = createTag("flowers_list");
        public static final TagKey<Block> GRASS_LIST = createTag("grass_list");
        public static final TagKey<Block> SAPLINGS_LIST = createTag("saplings_list");
        public static final TagKey<Block> LEAVES_LIST = createTag("leaves_list");
        public static final TagKey<Block> MUSHROOMS_LIST = createTag("mushrooms_list");
        public static final TagKey<Block> DIRT_LIST = createTag("dirt_list");
        public static final TagKey<Block> OTHER_PLANTS_LIST = createTag("other_plants_list");
        public static final TagKey<Block> SCULK_BLOCKS_LIST = createTag("sculk_blocks_list");
        public static final TagKey<Block> NETHER_RACKS_LIST = createTag("nether_racks_list");

        public static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK,new Identifier(CuriterMod.MOD_ID,name));
        }
    }
    public static class Items{
        public static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM,new Identifier(CuriterMod.MOD_ID,name));
        }
    }
}
