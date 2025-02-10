package com.curiter.datagen;

import com.curiter.CuriterMod;
import com.curiter.block.ModBlocks;
import com.curiter.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {

    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //食物烧制配方
        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING,
                200, ModItems.FRIED_EGG, Items.EGG, 0.35f);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING,
                100, ModItems.FRIED_EGG, Items.EGG, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING,
                600, ModItems.FRIED_EGG, Items.EGG, 0.35f);

        offerFoodCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING,
                200, ModItems.PURPLE_EGG, ModItems.FRIED_EGG, 0.35f);
        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING,
                100, ModItems.PURPLE_EGG, ModItems.FRIED_EGG, 0.35f);
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING,
                600, ModItems.PURPLE_EGG, ModItems.FRIED_EGG, 0.35f);

        //9合1配方
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET,
                RecipeCategory.MISC, Items.COPPER_INGOT);

        //唱片嬗变配方(无序合成)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CRASHED_STAR_MUSIC_DISC, 1)
                .input(ModItems.EVANESCENT_STAR_MUSIC_DISC)
                .input(Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "music_disc_crashed_star_time"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EVANESCENT_STAR_MUSIC_DISC, 1)
                .input(ModItems.CRASHED_STAR_MUSIC_DISC)
                .input(Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "music_disc_evanescent_star_time"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC, 1)
                .input(ModItems.NEW_THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC)
                .input(Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "music_disc_the_clock_tower_travel_time"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEW_THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC, 1)
                .input(ModItems.THE_CLOCK_TOWER_TRAVEL_MUSIC_DISC)
                .input(Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "music_disc_new_the_clock_tower_travel_time"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_CURITER_MUSIC_DISC, 1)
                .input(ModItems.THE_SUKATUO_MUSIC_DISC)
                .input(Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "music_disc_the_curiter_time"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_SUKATUO_MUSIC_DISC, 1)
                .input(ModItems.THE_CURITER_MUSIC_DISC)
                .input(Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "music_disc_the_sukatuo_time"));

        //无序配方
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_CURITER_MUSIC_DISC, 1)
                .input(ModItems.GARUINKA)
                .input(ModItems.DISC_EMPTY)
                .criterion(hasItem(ModItems.DISC_EMPTY), conditionsFromItem(ModItems.DISC_EMPTY))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "music_disc_the_curiter"));

        //有序配方
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', ModItems.COPPER_NUGGET)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "cogs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARUINKA_COLLECTORS, 1)
                .pattern("###")
                .pattern("#A#")
                .pattern("###")
                .input('#', Items.GLASS)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "garuinka_collectors"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARUINKA_DETECTORS, 1)
                .pattern("#AC")
                .pattern("ABA")
                .pattern("ADA")
                .input('#', ModItems.RESIN)
                .input('A', Items.GOLD_INGOT)
                .input('B', Items.GLASS_PANE)
                .input('C', Items.AMETHYST_SHARD)
                .input('D', ModItems.COGS)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "garuinka_detectors"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GARUINKA_EXTRACTORS, 1)
                .pattern("CCC")
                .pattern("#B#")
                .pattern("ADA")
                .input('#', ModItems.COGS)
                .input('A', Items.COPPER_BLOCK)
                .input('B', ModItems.GARUINKA_STORAGE_BOTTLE)
                .input('C', Items.GLASS)
                .input('D', Items.REDSTONE_BLOCK)
                .criterion(hasItem(ModItems.GARUINKA_STORAGE_BOTTLE), conditionsFromItem(ModItems.GARUINKA_STORAGE_BOTTLE))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "garuinka_extractors"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARUINKA_STORAGE_BOTTLE, 1)
                .pattern(" # ")
                .pattern("ABA")
                .input('#', Items.GLASS)
                .input('A', Items.GLASS_PANE)
                .input('B', ModItems.RESIN)
                .criterion(hasItem(ModItems.RESIN), conditionsFromItem(ModItems.RESIN))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "garuinka_storage_bottle"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RESIN_SCYTHE, 1)
                .pattern("###")
                .pattern(" A ")
                .pattern("A  ")
                .input('#', Items.IRON_INGOT)
                .input('A', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "resin_scythe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PETRI_DISH_ITEM, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("AAA")
                .input('#', Items.GLASS_PANE)
                .input('A', ModItems.RESIN)
                .criterion(hasItem(ModItems.RESIN), conditionsFromItem(ModItems.RESIN))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "petri_dish_item"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MILL, 1)
                .pattern("ABA")
                .pattern("ACA")
                .pattern("A#A")
                .input('#', Items.REDSTONE_BLOCK)
                .input('A', Items.COPPER_BLOCK)
                .input('B', Items.IRON_INGOT)
                .input('C', ModItems.COGS)
                .criterion(hasItem(ModItems.COGS), conditionsFromItem(ModItems.COGS))
                .offerTo(exporter, new Identifier(CuriterMod.MOD_ID, "mill"));

    }
}
