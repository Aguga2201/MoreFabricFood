package net.aguga.morefabricfood.item;

import net.aguga.morefabricfood.MoreFabricFood;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static final ItemGroup MORE_FABRIC_FOOD = FabricItemGroupBuilder.build(new Identifier(MoreFabricFood.MOD_ID, "morefabricfood"),
            () -> new ItemStack(ModItems.STRAWBERRY));
}
