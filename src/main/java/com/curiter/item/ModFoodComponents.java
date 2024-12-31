package com.curiter.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build();
    public static final FoodComponent PURPLE_EGG = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).alwaysEdible().build();
}
