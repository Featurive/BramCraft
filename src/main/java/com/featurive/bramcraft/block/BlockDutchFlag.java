package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModBlock;
import com.featurive.bramcraft.reference.Names;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockDutchFlag extends ModBlock {
    public BlockDutchFlag() {
        setUnlocalizedName(Names.Block.dutch_flag);
    }


    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
        world.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), state);
        return true;
    }
}
