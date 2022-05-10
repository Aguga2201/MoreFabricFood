package net.aguga.morefabricfood.block;

import net.aguga.morefabricfood.MoreFabricFood;
import net.aguga.morefabricfood.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    /*
    public static final Block BLOCKIGNORE = registerBlock("blockignore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().slipperiness(1)), ModItemGroup.MORE_FABRIC_FOOD);
     */

    private static Block registerBlock(String name, Block block, ItemGroup group)
    {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoreFabricFood.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group)
    {
        return Registry.register(Registry.ITEM, new Identifier(MoreFabricFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks()
    {
        MoreFabricFood.LOGGER.info("Regestering Mod Blocks for " + MoreFabricFood.NAME + ".");

    }
}
