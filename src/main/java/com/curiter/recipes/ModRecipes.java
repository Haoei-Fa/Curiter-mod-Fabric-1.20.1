package com.curiter.recipes;

import com.curiter.recipes.dough.PotionToDough;
import com.curiter.recipes.dough.YeastToFermentedDough;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialRecipeSerializer;

public class ModRecipes {
    public static final RecipeSerializer<PotionToDough> POTION_TO_DOUGH = RecipeSerializer.register("potion_dough",new SpecialRecipeSerializer<>(PotionToDough::new));
    public static final RecipeSerializer<YeastToFermentedDough> YEAST_TO_FERMENTED_DOUGH = RecipeSerializer.register("yeast_fermented_dough",new SpecialRecipeSerializer<>(YeastToFermentedDough::new));


    public static void registerModRecipes(){}
}
