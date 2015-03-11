package com.featurive.bramcraft.tileentity;

import com.featurive.bramcraft.block.blocks.BlockList;
import com.featurive.bramcraft.reference.CondenserHelper;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class TileEntityCondenser extends TileEntityBase implements IInventory {
    public ItemStack[] itemStack = new ItemStack[44];

    public TileEntityCondenser() {

    }

    @Override
    public void updateEntity() {

    }

    public ItemStack getSelection(){
        return getStackInSlot(1);
    }

    public int getValueforSelection(){
        return CondenserHelper.Values.getValue(getSelection().getUnlocalizedName());
    }

    public ItemStack getOutput(){
        return getStackInSlot(0);
    }

    public void setOutput(){
        if(getOutput() != null){
            this.setInventorySlotContents(0, new ItemStack(getSelection().getItem(), getOutput().stackSize + 1));
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        NBTTagList camoTagList = new NBTTagList();

        for(int i = 0; i < itemStack.length; i++){
            ItemStack stack = itemStack[i];
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
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);

        itemStack = new ItemStack[44];

        NBTTagList camoTagList = tag.getTagList("itemStack", 10);

        for(int i = 0; i < camoTagList.tagCount(); i++){
            NBTTagCompound t = camoTagList.getCompoundTagAt(i);
            int index = t.getByte("index");
            if(index >= 0 && index < itemStack.length){
                itemStack[index] = ItemStack.loadItemStackFromNBT(t);
            }
        }
    }

    @Override
    public int getSizeInventory() {
        return itemStack.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return itemStack[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int decreaseAmount){
        if (itemStack[slot] != null){
            ItemStack itemstack;

            if (itemStack[slot].stackSize <= decreaseAmount){
                itemstack = itemStack[slot];
                setInventorySlotContents(slot, null);
                markDirty();
                return itemstack;
            }else{
                itemstack = itemStack[slot].splitStack(decreaseAmount);

                if (itemStack[slot].stackSize == 0)
                {
                    itemStack[slot] = null;
                }

                markDirty();
                return itemstack;
            }
        }else{
            return null;
        }
    }

    @Override
    public void writeToPacket(ByteBuf buf) {
        for(ItemStack stack : itemStack){
            ByteBufUtils.writeItemStack(buf, stack);
        }
    }

    @Override
    public void readFromPacket(ByteBuf buf) {
        for(int i = 0; i < itemStack.length; i++) {
            itemStack[i] = ByteBufUtils.readItemStack(buf);
        }
        worldObj.markBlockRangeForRenderUpdate(xCoord, yCoord, zCoord, xCoord, yCoord, zCoord);
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot){
        if (itemStack[slot] != null)
        {
            ItemStack itemstack = itemStack[slot];
            itemStack[slot] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack){
        itemStack[slot] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        markDirty();
    }

    @Override
    public String getInventoryName() {
        return BlockList.condenser.getUnlocalizedName() + ".name";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player){
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory(){}

    @Override
    public void closeInventory(){}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return true;
    }
}
