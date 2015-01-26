package com.featurive.bramcraft.network;

import com.featurive.bramcraft.network.messagebase.MessageExplode;
import com.featurive.bramcraft.reference.References;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class NetworkHandler {
    private static SimpleNetworkWrapper instance;

    public static void init(){
        instance = NetworkRegistry.INSTANCE.newSimpleChannel(References.MOD_ID);

        instance.registerMessage(MessageExplode.class, MessageExplode.class, 0, Side.SERVER);
    }
    public static void sendToServer(IMessage message){
        instance.sendToServer(message);
    }
}
