package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModBlock;
import com.featurive.bramcraft.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockDutchFlag extends ModBlock {
    public BlockDutchFlag() {
        this.setBlockName(Names.Block.dutch_flag);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        for (int i = 1; i < 10; i++) {
            if (world.isAirBlock(x, y+i, z)) {
                world.setBlock(x, y + i, z, BlockList.dutch_flag);
            }
        }
        return true;
    }
}
