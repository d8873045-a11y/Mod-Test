package com.superfurnace.blocks;

import com.superfurnace.SuperFurnaceMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockSuperFurnace extends Block {
    public static final BlockSuperFurnace BLOCK = new BlockSuperFurnace();
    public static ItemBlock itemBlock;

    public BlockSuperFurnace() {
        super(Material.ROCK);
        this.setRegistryName(SuperFurnaceMod.MODID, "super_furnace");
        this.setUnlocalizedName("super_furnace");
        this.setHardness(3.5f);
        this.setResistance(17.5f);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(net.minecraft.block.SoundType.STONE);

        itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(this.getRegistryName());
        itemBlock.setUnlocalizedName(this.getUnlocalizedName());
    }
}
