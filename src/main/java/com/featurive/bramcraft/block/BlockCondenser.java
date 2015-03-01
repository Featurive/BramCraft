package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModTileEntity;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityCondenser;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockCondenser extends ModTileEntity {
    private IIcon top;
    private IIcon side;
    private IIcon front;

    public BlockCondenser() {
        this.setBlockName(Names.Block.condenser);
    }

    //@Override
    //public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
    //    switch(side){
    //        case 0:
    //            return this.top;
    //        case 1:
    //            return this.top;
    //        case 2:
    //            return this.side;
    //        case 3:
    //            return this.side;
    //        case 4:
    //            return this.side;
    //        case 5:
    //            return this.front;
    //        default:
    //            return this.side;
    //    }
    //}
    //
    //@Override
    //public void registerBlockIcons(IIconRegister iconRegister) {
    //    this.top = iconRegister.registerIcon("bramcraft:condenser_top");
    //    this.side = iconRegister.registerIcon("bramcraft:condenser_side");
    //    this.front = iconRegister.registerIcon("bramcraft:condenser_front");
    //}

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityCondenser();
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
