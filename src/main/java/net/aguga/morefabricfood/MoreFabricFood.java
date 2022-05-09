package net.aguga.morefabricfood;

import net.aguga.morefabricfood.block.ModBlocks;
import net.aguga.morefabricfood.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFabricFood implements ModInitializer
{
    public static final String MOD_ID = "morefabricfood";
    public static final String NAME = "MoreFabricFood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize()
    {
        LOGGER.info(NAME + " succesfully loaded!");

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
