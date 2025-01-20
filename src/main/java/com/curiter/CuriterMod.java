package com.curiter;

import com.curiter.block.ModBlocks;
import com.curiter.block.entity.ModBlockEntities;
import com.curiter.item.ModItemGroups;
import com.curiter.item.ModItems;
import com.curiter.painting.ModPaintings;
import com.curiter.sounds.ModSounds;
import com.curiter.util.ModLootTableModifiers;
import com.curiter.util.ModTrades;
import com.curiter.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuriterMod implements ModInitializer {
	public static final String MOD_ID = "curiter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModWorldGeneration.generateModWorldGen();
		ModBlockEntities.registerBlockEntities();
		ModPaintings.resisterPaintings();
		ModLootTableModifiers.modifierLootTables();
		ModTrades.registerTrades();
	}
}