package com.featurive.bramcraft.network;

import com.featurive.bramcraft.BramCraft;
import com.featurive.bramcraft.reference.References;
import com.featurive.bramcraft.tileentity.TileEntityBase;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import net.minecraft.tileentity.TileEntity;

@ChannelHandler.Sharable
public class DescriptionHandler extends SimpleChannelInboundHandler<FMLProxyPacket>{
    public static final String channel = References.MOD_ID + "Description";

    static {
        NetworkRegistry.INSTANCE.newChannel(channel, new DescriptionHandler());
    }

    public static void init(){
        //nothing here
        //just to load class
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FMLProxyPacket msg) throws Exception {
        ByteBuf buf = msg.payload();
        int x = buf.readInt();
        int y = buf.readInt();
        int z = buf.readInt();
        TileEntity te = BramCraft.proxy.getClientPlayer().worldObj.getTileEntity(x, y, z);
        if(te instanceof TileEntityBase){
            ((TileEntityBase)te).readFromPacket(buf);
        }
    }
}
