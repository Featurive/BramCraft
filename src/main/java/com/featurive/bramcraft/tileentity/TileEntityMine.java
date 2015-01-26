package com.featurive.bramcraft.tileentity;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

public class TileEntityMine extends TileEntityBase {
    private int seconds = 5;
    private int timer = seconds * 20;
    private ItemStack texture;

    @Override
    public void updateEntity() {
        if(timer > 0) timer--;
        if(timer == 0 && !worldObj.isRemote){
            List<Entity> entityPlayer = worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(xCoord - 2, yCoord, zCoord - 2, xCoord + 2 , yCoord + 2, zCoord + 2));
            List<Entity> entityItem = worldObj.getEntitiesWithinAABB(EntityItem.class, AxisAlignedBB.getBoundingBox(xCoord - 2, yCoord, zCoord - 2, xCoord + 2 , yCoord + 2, zCoord + 2));
            if(entityPlayer.size() > 0 || entityItem.size() > 0){
                if(Minecraft.getMinecraft().playerController.isNotCreative()){
                    worldObj.setBlockToAir(xCoord, yCoord, zCoord);
                    worldObj.createExplosion(null, xCoord + 0.5, yCoord + 0.5, zCoord + 0.5, 6.0f, false);
                }
            }
        }
    }

    public void setCamouflage(ItemStack itemstack){
        texture = itemstack;
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    public ItemStack getCamouflage(){
        return texture;
    }

    @Override
    public void writeToPacket(ByteBuf buf){
        ByteBufUtils.writeItemStack(buf, texture);
    }

    @Override
    public void readFromPacket(ByteBuf buf){
        texture = ByteBufUtils.readItemStack(buf);
        worldObj.markBlockRangeForRenderUpdate(xCoord, yCoord, zCoord, xCoord, yCoord, zCoord);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        timer = tag.getInteger("timer");

        if(tag.hasKey("texture")){
            texture = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("texture"));
        }else{
            texture = null;
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setInteger("timer", timer);

        if(texture != null){
            NBTTagCompound t = new NBTTagCompound();
            texture.writeToNBT(t);
            tag.setTag("texture", t);
        }
    }
}