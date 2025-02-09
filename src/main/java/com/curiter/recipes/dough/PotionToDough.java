package com.curiter.recipes.dough;

import com.curiter.item.ModItems;
import com.curiter.recipes.ModRecipes;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.Objects;

public class PotionToDough extends SpecialCraftingRecipe {
    private int WaterPotionSlot;
    private int output;

    public PotionToDough(Identifier id, CraftingRecipeCategory category) {
        super(id, category);
    }

    @Override
    public boolean matches(RecipeInputInventory inventory, World world) {
        boolean hasFlour = false;
        boolean hasWaterPotion =false;
        int count = 0;
        output = 0;
        for (int i = 0;i < inventory.size();i++){
            ItemStack stack = inventory.getStack(i);
            if (!stack.isEmpty()){
                if (stack.isOf(ModItems.FLOUR)){
                    hasFlour = true;
                    count++;
                    output++;
                }
                else if (Objects.equals(stack.getNbt(), Items.POTION.getDefaultStack().getNbt())) {
                    hasWaterPotion = true;
                    count++;
                    WaterPotionSlot = i;
                }
            }
        }

        return hasFlour && hasWaterPotion && count >= 2;
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager registryManager) {
        return new ItemStack(ModItems.DOUGH, output);
    }

    @Override
    public boolean fits(int width, int height) {
        return width * height >=2;
    }

    @Override
    public DefaultedList<ItemStack> getRemainder(RecipeInputInventory inventory) {
        DefaultedList<ItemStack> list = DefaultedList.ofSize(9,ItemStack.EMPTY);
        list.set(WaterPotionSlot,new ItemStack(Items.GLASS_BOTTLE));
        return list;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.POTION_TO_DOUGH;
    }
}
