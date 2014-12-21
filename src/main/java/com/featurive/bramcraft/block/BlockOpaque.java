package com.featurive.bramcraft.block;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockOpaque extends ModBlock {
    @Override
    public boolean isFullBlock() {
        return false;
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean isVisuallyOpaque() {
        return false;
    }

    @Override
    public boolean isTranslucent() {
        return true;
    }

    @Override
    public boolean canProvidePower() {
        return false;
    }

    @Override
    public Block setLightLevel(float value) {
        return super.setLightLevel(4F);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess access, BlockPos pos) {
        this.setBlockBounds(0.0F, 0.3125F, 0.0F, 1.0F, 0.5F, 1.0F);
    }

    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0F, 0.3125F, 0.0F, 1.0F, 0.5F, 1.0F);
    }

    @Override
    public boolean isSolidFullCube() {
        return false;
    }
}
