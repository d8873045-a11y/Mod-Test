package com.superfurnace;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SuperFurnaceMod.MODID, name = SuperFurnaceMod.NAME, version = SuperFurnaceMod.VERSION)
public class SuperFurnaceMod {
    public static final String MODID = "superfurnace";
    public static final String NAME = "Super Furnace Mod";
    public static final String VERSION = "1.0.0";

    private static Logger logger;

    @SidedProxy(clientSide = "com.superfurnace.proxy.ClientProxy", serverSide = "com.superfurnace.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
