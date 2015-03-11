package com.featurive.bramcraft.block;

import com.featurive.bramcraft.BramCraft;
import com.featurive.bramcraft.block.blocks.ModTileEntity;
import com.featurive.bramcraft.gui.GuiHandler;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityCondenser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCondenser extends ModTileEntity {
    public BlockCondenser() {
        this.setBlockName(Names.Block.condenser);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int p_149915_2_) {
        return new TileEntityCondenser();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if(!world.isRemote){
            player.openGui(BramCraft.instance, GuiHandler.GuiIDs.CONDENSER.ordinal(), world, x, y, z);
        }
        return true;
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
}
