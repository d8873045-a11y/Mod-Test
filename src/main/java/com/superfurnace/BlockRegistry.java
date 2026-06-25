package com.superfurnace;

import com.superfurnace.blocks.BlockSuperFurnace;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventbus.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SuperFurnaceMod.MODID)
public class BlockRegistry {
    public static void register() {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(BlockSuperFurnace.BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(BlockSuperFurnace.itemBlock);
    }
}
