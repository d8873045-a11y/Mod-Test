package com.superfurnace;

import com.superfurnace.blocks.BlockSuperFurnace;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeRegistry {
    public static void register() {
        GameRegistry.addShapedRecipe(new ItemStack(BlockSuperFurnace.BLOCK),
                "CCC",
                "CDC",
                "CCC",
                'C', Blocks.COBBLESTONE,
                'D', new ItemStack(net.minecraft.init.Items.DIAMOND));
    }
}
