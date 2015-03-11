package com.featurive.bramcraft.tileentity;

import com.featurive.bramcraft.block.blocks.BlockList;
import com.featurive.bramcraft.handler.ConfigHandler;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

public class TileEntityMine extends TileEntityBase implements ISidedInventory {
    private int seconds = 10;
    private int timer = seconds * 20;
    public ItemStack[] camoStack = new ItemStack[6];

    public TileEntityMine() {

    }

    @Override
    public void updateEntity() {
        if(timer > 0) timer--;
        if(timer == 0 && !worldObj.isRemote){
            List<Entity> entityPlayer = worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(xCoord - 2, yCoord, zCoord - 2, xCoord + 2 , yCoord + 2, zCoord + 2));
            List<Entity> entityItem = worldObj.getEntitiesWithinAABB(EntityItem.class, AxisAlignedBB.getBoundingBox(xCoord - 2, yCoord, zCoord - 2, xCoord + 2 , yCoord + 2, zCoord + 2));
            if(entityPlayer.size() > 0 || entityItem.size() > 0){
                if(Minecraft.getMinecraft().playerController.isNotCreative()){
                    worldObj.setBlockToAir(xCoord, yCoord, zCoord);
                    worldObj.createExplosion(null, xCoord + 0.5, yCoord + 0.5, zCoord + 0.5, 6.0f, ConfigHandler.destroyBlocks);
                }
            }
        }
    }

    public void setTimer(int value){
        this.timer = value;
    }

    public int getTimer(){
        return this.timer;
    }

    public int getTimerInSeconds(){
        return this.timer / 20;
    }

    public void setCamouflage(ItemStack stack, int side){
        this.setInventorySlotContents(side, stack);
        //itemStack[side] = stack;
        //worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    public ItemStack getCamouflage(int side){
        return getStackInSlot(side);
        //return itemStack[side];
    }

    @Override
    public void writeToPacket(ByteBuf buf){
        for(ItemStack stack : camoStack){
            ByteBufUtils.writeItemStack(buf, stack);
        }

    }

    @Override
    public void readFromPacket(ByteBuf buf){
        for(int i = 0; i < camoStack.length; i++) {
            camoStack[i] = ByteBufUtils.readItemStack(buf);
        }
        worldObj.markBlockRangeForRenderUpdate(xCoord, yCoord, zCoord, xCoord, yCoord, zCoord);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        timer = tag.getInteger("timer");

        camoStack = new ItemStack[6];

        NBTTagList camoTagList = tag.getTagList("itemStack", 10);

        for(int i = 0; i < camoTagList.tagCount(); i++){
            NBTTagCompound t = camoTagList.getCompoundTagAt(i);
            int index = t.getByte("index");
            if(index >= 0 && index < camoStack.length){
                camoStack[index] = ItemStack.loadItemStackFromNBT(t);
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setInteger("timer", timer);

        NBTTagList camoTagList = new NBTTagList();

        for(int i = 0; i < camoStack.length; i++){
            ItemStack stack = camoStack[i];

            if(stack != null){
                NBTTagCompound t = new NBTTagCompound();
                stack.writeToNBT(t);
                t.setByte("index", (byte) i);
                camoTagList.appendTag(t);
            }
        }
        tag.setTag("itemStack", camoTagList);
    }

    @Override
    public int getSizeInventory()
    {
        return camoStack.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot)
    {
        return camoStack[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int decreaseAmount){
        if (camoStack[slot] != null)
        {
            ItemStack itemstack;

            if (camoStack[slot].stackSize <= decreaseAmount)
            {
                itemstack = camoStack[slot];
                setInventorySlotContents(slot, null);
                markDirty();
                return itemstack;
            }
            else
            {
                itemstack = camoStack[slot].splitStack(decreaseAmount);

                if (camoStack[slot].stackSize == 0)
                {
                    camoStack[slot] = null;
                }

                markDirty();
                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot){
        if (camoStack[slot] != null)
        {
            ItemStack itemstack = camoStack[slot];
            camoStack[slot] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack){
        camoStack[slot] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        markDirty();
    }

    @Override
    public String getInventoryName(){
        return BlockList.mine.getUnlocalizedName() + ".name";
    }

    @Override
    public boolean hasCustomInventoryName(){
        return false;
    }

    @Override
    public int getInventoryStackLimit(){
        return 1;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player){
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory() {}

    @Override
    public void closeInventory() {}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        return stack != null && stack.getItem() instanceof ItemBlock && stack.getItem() != Item.getItemFromBlock(BlockList.mine);
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int side) {
        return new int[]{side};
    }

    @Override
    public boolean canInsertItem(int slot, ItemStack stack, int side) {
        return isItemValidForSlot(slot, stack);
    }

    @Override
    public boolean canExtractItem(int slot, ItemStack stack, int side) {
        return true;
    }
}