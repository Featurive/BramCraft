package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModTileEntity;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityCompressionChamber;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCompressionChamber extends ModTileEntity {
    public BlockCompressionChamber() {
        this.setBlockName(Names.Block.compression_chamber);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityCompressionChamber();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }


}
