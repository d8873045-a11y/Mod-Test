package com.superfurnace.proxy;

import com.superfurnace.CommonProxy;
import com.superfurnace.blocks.BlockSuperFurnace;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        registerModels();
    }

    private void registerModels() {
        ModelLoader.setCustomModelResourceLocation(BlockSuperFurnace.itemBlock, 0,
                new ModelResourceLocation(BlockSuperFurnace.BLOCK.getRegistryName(), "inventory"));
    }
}
