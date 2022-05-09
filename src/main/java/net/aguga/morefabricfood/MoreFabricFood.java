package net.aguga.morefabricfood;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFabricFood implements ModInitializer
{
    public static final Logger LOGGER = LoggerFactory.getLogger("morefabricfood");

    @Override
    public void onInitialize()
    {
        LOGGER.info("Hello Fabric world!");
    }
}
