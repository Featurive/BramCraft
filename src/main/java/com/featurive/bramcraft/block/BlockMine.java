package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModTileEntity;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMine extends ModTileEntity {
    public BlockMine() {
        this.setBlockName(Names.Block.mine);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityMine();
    }
}
