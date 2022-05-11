package net.aguga.morefabricfood.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents
{
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent RASPBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();

    public static final FoodComponent STRAWBERRY_JAM_BREAD = new FoodComponent.Builder().hunger(8).saturationModifier(0.2f).build();
    public static final FoodComponent RASPBERRY_JAM_BREAD = new FoodComponent.Builder().hunger(8).saturationModifier(0.2f).build();
}
