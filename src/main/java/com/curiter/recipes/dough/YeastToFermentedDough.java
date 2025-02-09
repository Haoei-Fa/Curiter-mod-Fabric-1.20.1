package com.curiter.recipes.dough;

import com.curiter.item.ModItems;
import com.curiter.recipes.ModRecipes;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class YeastToFermentedDough extends SpecialCraftingRecipe {
    private int output;

    public YeastToFermentedDough(Identifier id, CraftingRecipeCategory category) {
        super(id, category);
    }

    @Override
    public boolean matches(RecipeInputInventory inventory, World world) {
        boolean hasYeast = false;
        boolean hasDough =false;
        int count = 0;
        output = 0;
        for (int i = 0;i < inventory.size();i++){
            ItemStack stack = inventory.getStack(i);
            if (!stack.isEmpty()){
                if (stack.isOf(ModItems.YEAST)){
                    hasYeast = true;
                    count++;
                }
                else if (stack.isOf(ModItems.DOUGH)) {
                    hasDough = true;
                    count++;
                    output++;
                }
            }
        }

        return hasYeast && hasDough && count >= 2;
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager registryManager) {
        return new ItemStack(ModItems.FERMENTED_DOUGH, 2 * output);
    }

    @Override
    public boolean fits(int width, int height) {
        return width * height >=2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.YEAST_TO_FERMENTED_DOUGH;
    }
}
