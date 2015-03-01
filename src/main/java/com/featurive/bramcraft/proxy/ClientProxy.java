package com.featurive.bramcraft.proxy;

import com.featurive.bramcraft.client.handler.KeyInputHandler;
import com.featurive.bramcraft.client.settings.KeyBindings;
import com.featurive.bramcraft.model.render.RenderCompressionChamber;
import com.featurive.bramcraft.model.render.RenderCondenser;
import com.featurive.bramcraft.tileentity.TileEntityCompressionChamber;
import com.featurive.bramcraft.tileentity.TileEntityCondenser;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;

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

    private void registerRenders(){
        TileEntitySpecialRenderer compression_chamber = new RenderCompressionChamber();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCompressionChamber.class, compression_chamber);

        TileEntitySpecialRenderer condenser = new RenderCondenser();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCondenser.class, condenser);
    }

    @Override
    public void init(){
        registerRenders();
    }

    @Override
    public void postInit(){

    }

    @Override
    public EntityPlayer getClientPlayer() {
        return Minecraft.getMinecraft().thePlayer;
    }

}
