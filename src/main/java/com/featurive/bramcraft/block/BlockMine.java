package com.featurive.bramcraft.block;

import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMine extends com.featurive.bramcraft.block.blocks.ModTileEntity {
    public BlockMine() {
        this.setBlockName(Names.Block.mine);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityMine();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if(!world.isRemote){
            TileEntityMine te = (TileEntityMine) world.getTileEntity(x, y, z);
            te.setCamouflage(player.getCurrentEquippedItem());
        }
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
        TileEntityMine te = (TileEntityMine) world.getTileEntity(x, y, z);
        ItemStack stack = te.getCamouflage();
        if(stack != null && stack.getItem() instanceof ItemBlock){
            Block block = ((ItemBlock)stack.getItem()).field_150939_a;
            return block.getIcon(side, stack.getItemDamage());
        }else{
            return super.getIcon(world, x, y, z, side);
        }
    }
}