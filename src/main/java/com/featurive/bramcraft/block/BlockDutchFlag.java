package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModBlock;
import com.featurive.bramcraft.reference.Names;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDutchFlag extends ModBlock {
    public BlockDutchFlag() {
        this.setUnlocalizedName(Names.Block.dutch_flag);
        this.setTickRandomly(true);
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
        double x = new Integer(pos.getX()).doubleValue();
        double y = new Integer(pos.getY()).doubleValue();
        double z = new Integer(pos.getZ()).doubleValue();
        
        world.playSoundEffect(x, y, z, "mob.enderdragon.wings", 1.5F, random.nextFloat() + 0.5f);
    }
}
