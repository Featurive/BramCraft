package com.featurive.bramcraft.proxy;

import com.featurive.bramcraft.client.handler.KeyInputHandler;
import com.featurive.bramcraft.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(){
        registerKeybinds();
    }

    private void registerKeybinds(){
        FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        for(KeyBindings key : KeyBindings.values()){
            ClientRegistry.registerKeyBinding(key.getKeybind());
        }
    }

    @Override
    public void init(){

    }

    @Override
    public void postInit(){

    }

}
