package com.curiter.util;

import com.curiter.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    public static final Identifier VILLAGE_SNOWY_HOUSE_ID =
            new Identifier("minecraft","chests/village/village_snowy_house");
    public static final Identifier VILLAGE_SAVANNA_HOUSE_ID =
            new Identifier("minecraft","chests/village/village_savanna_house");
    public static final Identifier VILLAGE_TAIGA_HOUSE_ID =
            new Identifier("minecraft","chests/village/village_taiga_house");
    public static final Identifier VILLAGE_PLAINS_HOUSE_ID =
            new Identifier("minecraft","chests/village/village_plains_house");
    public static final Identifier VILLAGE_DESERT_HOUSE_ID =
            new Identifier("minecraft","chests/village/village_desert_house");
    public static final Identifier SHIPWRECK_TREASURE_ID =
            new Identifier("minecraft","chests/shipwreck_treasure");
    public static final Identifier CREEPER_ID =
            new Identifier("minecraft","entities/creeper");

    public static void modifierLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (VILLAGE_SNOWY_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.YEAST))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_SAVANNA_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.YEAST))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TAIGA_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.YEAST))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_PLAINS_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(ModItems.YEAST))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_DESERT_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(ModItems.YEAST))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.SLEEPING_ATLANTIS_MUSIC_DISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            if (CREEPER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(ModItems.GLITCH_ART_MUSIC_DISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}