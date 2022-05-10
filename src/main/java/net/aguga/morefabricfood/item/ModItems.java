package net.aguga.morefabricfood.item;

import net.aguga.morefabricfood.MoreFabricFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.sql.Struct;

public class ModItems
{
    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD).food(ModFoodComponents.STRAWBERRY)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(MoreFabricFood.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MoreFabricFood.LOGGER.info("Regestering Mod Items for " + MoreFabricFood.NAME + ".");

    }
}
