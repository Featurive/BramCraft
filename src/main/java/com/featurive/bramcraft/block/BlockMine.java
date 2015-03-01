package com.featurive.bramcraft.block;

import com.featurive.bramcraft.BramCraft;
import com.featurive.bramcraft.gui.GuiHandler;
import com.featurive.bramcraft.block.blocks.ModTileEntity;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMine extends ModTileEntity {
    public BlockMine() {
        this.setBlockName(Names.Block.mine);
        this.isOpaqueCube();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata){
        return new TileEntityMine();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if(!world.isRemote){
            ItemStack equippedItem = player.getCurrentEquippedItem();
            if(player.isSneaking()){
                player.openGui(BramCraft.instance, GuiHandler.GuiIDs.MINE.ordinal(), world, x, y, z);
            }
        } else {
            TileEntityMine te = (TileEntityMine) world.getTileEntity(x, y, z);
            if (te.getCamouflage(side) != null){
                ItemStack camo = te.getCamouflage(side);
                te.setCamouflage(null, side);
                EntityItem itemEntity = new EntityItem(world, x, y, z, camo);
                world.spawnEntityInWorld(itemEntity);
            } else {
                ItemStack equippedItem = player.getCurrentEquippedItem();
                if(equippedItem != null){
                    ItemStack camoStack = equippedItem.splitStack(1);
                    te.setCamouflage(camoStack, side);
                }
            }
        }

        //if(player.getCurrentEquippedItem().getItem() == ItemList.utility_wrench)
        //{
        //    if(!world.isRemote)
        //    {
        //        player.openGui(BramCraft.instance, GuiHandler.GuiIDs.MINE.ordinal(), world, x, y, z);
        //    }
        //}
        //else
        //{
        //    if(player.getCurrentEquippedItem() != null)
        //    {
        //        if(!world.isRemote)
        //        {
        //            TileEntityMine te = (TileEntityMine) world.getTileEntity(x, y, z);
//
        //            if (te.getCamouflage(side) != null)
        //            {
        //                ItemStack camoStack = te.getCamouflage(side);
        //                te.setCamouflage(null, side);
        //                EntityItem entityItem = new EntityItem(world, x, y + 1, z, camoStack);
        //                world.spawnEntityInWorld(entityItem);
        //            }
        //            else
        //            {
        //                ItemStack item = player.getCurrentEquippedItem();
//
        //                if (item != null && item.getItem() instanceof ItemBlock && item.getItem() != Item.getItemFromBlock(BlockList.mine))
        //                {
        //                    ItemStack camo = item.splitStack(1);
        //                    te.setCamouflage(camo, side);
        //                }
        //            }
        //        }
        //    }
//
        //}
        return true;
    }

    @Override
        @SideOnly(Side.CLIENT)
        public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
            TileEntityMine te = (TileEntityMine) world.getTileEntity(x, y, z);
            ItemStack stack = te.getCamouflage(side);
            if(stack != null && stack.getItem() instanceof ItemBlock){
                Block block = ((ItemBlock)stack.getItem()).field_150939_a;
                return block.getIcon(side, stack.getItemDamage());
            }else{
                return super.getIcon(world, x, y, z, side);
            }
    }


}