package com.featurive.bramcraft.network.messagebase;

import com.featurive.bramcraft.network.MessageBase;
import com.featurive.bramcraft.tileentity.TileEntityBase;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class MessageHandleGui extends MessageBase<MessageHandleGui>{
    private int x, y, z, id;

    public MessageHandleGui(){

    }

    public MessageHandleGui(TileEntityBase te, int id){
        x = te.xCoord;
        y = te.yCoord;
        z = te.zCoord;
        this.id = id;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
        id = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeInt(id);
    }

    @Override
    public void handleClientSide(MessageHandleGui message, EntityPlayer player) {

    }

    @Override
    public void handleServerSide(MessageHandleGui message, EntityPlayer player) {
        TileEntity te = player.worldObj.getTileEntity(message.x, message.y, message.z);
        if(te instanceof TileEntityBase){
            ((TileEntityBase)te).onGuiButtonPress(id);
        }
    }
}
