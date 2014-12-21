package com.featurive.bramcraft.block;


import com.featurive.bramcraft.block.blocks.ModBlockOpaque;
import com.featurive.bramcraft.reference.Names;

public class BlockDeveloper extends ModBlockOpaque {
    public BlockDeveloper(){
        setUnlocalizedName(Names.Block.developer);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
    }
}
