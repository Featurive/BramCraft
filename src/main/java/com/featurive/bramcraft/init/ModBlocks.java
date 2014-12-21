package com.featurive.bramcraft.init;

import com.featurive.bramcraft.block.BlockList;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.reference.References;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModBlocks
{
    public static void registerBlocks()
    {
        // registerBlock(blockname, unlocalizedname);
        registerBlock(BlockList.crystal_ore, Names.Block.crystal_ore);
        registerBlock(BlockList.boom, Names.Block.boom);
        registerBlock(BlockList.dark_block, Names.Block.dark_block);
        registerBlock(BlockList.dark_ore, Names.Block.dark_ore);
        registerBlock(BlockList.dark_rock, Names.Block.dark_rock);
        registerBlock(BlockList.developer, Names.Block.developer);
    }

    public static void registerBlock(Block block, String name)
    {
        GameRegistry.registerBlock(block, name);
    }
}