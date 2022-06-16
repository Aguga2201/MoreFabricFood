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
    //Strawberrys
    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD).food(ModFoodComponents.STRAWBERRY)));

    public static final Item STRAWBERRY_JAM = registerItem("strawberry_jam",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD)));

    public static final Item STRAWBERRY_JAM_BREAD = registerItem("strawberry_jam_bread",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD).food(ModFoodComponents.STRAWBERRY_JAM_BREAD)));

    //Raspberrys
    public static final Item RASPBERRY = registerItem("raspberry",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD).food(ModFoodComponents.RASPBERRY)));

    public static final Item RASPBERRY_JAM = registerItem("raspberry_jam",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD)));

    public static final Item RASPBERRY_JAM_BREAD = registerItem("raspberry_jam_bread",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD).food(ModFoodComponents.RASPBERRY_JAM_BREAD)));

    //Cherrys
    public static final Item CHERRY = registerItem("cherry",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD).food(ModFoodComponents.CHERRY)));

    public static final Item CHERRY_JAM = registerItem("cherry_jam",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD)));

    public static final Item CHERRY_JAM_BREAD = registerItem("cherry_jam_bread",
            new Item(new FabricItemSettings().group(ModItemGroup.MORE_FABRIC_FOOD).food(ModFoodComponents.CHERRY_JAM_BREAD)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(MoreFabricFood.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MoreFabricFood.LOGGER.info("Regestering Mod Items for " + MoreFabricFood.NAME + ".");

    }
}
