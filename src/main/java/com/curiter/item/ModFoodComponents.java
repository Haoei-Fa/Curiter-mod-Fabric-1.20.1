package com.curiter.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    //常规食品
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build();
    public static final FoodComponent MANTOU = new FoodComponent.Builder().hunger(4).saturationModifier(1.0F).build();

    //特殊食品
    public static final FoodComponent PURPLE_EGG = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).alwaysEdible().build();
}
