package com.featurive.bramcraft.init;

import com.featurive.bramcraft.block.blocks.BlockList;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.reference.References;
import com.featurive.bramcraft.utility.Log;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModBlocks{
    public static void init(){
        GameRegistry.registerBlock(BlockList.crystal_ore, Names.Block.crystal_ore);
        GameRegistry.registerBlock(BlockList.dark_block, Names.Block.dark_block);
        GameRegistry.registerBlock(BlockList.dark_ore, Names.Block.dark_ore);
        GameRegistry.registerBlock(BlockList.dark_rock, Names.Block.dark_rock);
        GameRegistry.registerBlock(BlockList.dutch_flag, Names.Block.dutch_flag);
        GameRegistry.registerBlock(BlockList.ferrum_block, Names.Block.ferrum_block);
        GameRegistry.registerBlock(BlockList.ferrum_ore, Names.Block.ferrum_ore);
        GameRegistry.registerBlock(BlockList.enderpearl_block, Names.Block.enderpearl_block);
        GameRegistry.registerBlock(BlockList.mine, Names.Block.mine);
        GameRegistry.registerBlock(BlockList.condenser, Names.Block.condenser);
        GameRegistry.registerBlock(BlockList.compression_chamber, Names.Block.compression_chamber);
        Log.info("Registered blocks");
    }
}   