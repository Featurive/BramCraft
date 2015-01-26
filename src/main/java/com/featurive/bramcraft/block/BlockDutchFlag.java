package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModBlock;
import com.featurive.bramcraft.reference.Names;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDutchFlag extends ModBlock {
    public BlockDutchFlag() {
        this.setBlockName(Names.Block.dutch_flag);
        this.setTickRandomly(true);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        world.playSoundEffect(x, y, z, "mob.enderdragon.wings", 1.5F, random.nextFloat() + 0.5f);
    }
}
