package com.superfurnace;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        BlockRegistry.register();
    }

    public void init(FMLInitializationEvent event) {
        RecipeRegistry.register();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
