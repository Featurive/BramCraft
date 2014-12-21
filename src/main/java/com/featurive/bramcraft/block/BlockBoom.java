package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModBlockOpaque;
import com.featurive.bramcraft.reference.Names;

public class BlockBoom extends ModBlockOpaque {
    public BlockBoom(){
        setUnlocalizedName(Names.Block.boom);
        setBlockBounds(0.0F, 0.3125F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}
