package com.featurive.bramcraft;

import com.featurive.bramcraft.gui.GuiHandler;
import com.featurive.bramcraft.handler.AchievementHandler;
import com.featurive.bramcraft.handler.ConfigHandler;
import com.featurive.bramcraft.handler.ModAchievementPage;
import com.featurive.bramcraft.init.*;
import com.featurive.bramcraft.network.DescriptionHandler;
import com.featurive.bramcraft.network.NetworkHandler;
import com.featurive.bramcraft.proxy.CommonProxy;
import com.featurive.bramcraft.reference.References;
import com.featurive.bramcraft.utility.Log;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

import static cpw.mods.fml.common.Mod.EventHandler;
import static cpw.mods.fml.common.Mod.Instance;

@Mod(modid = References.MOD_ID, version = References.VERSION, name = References.MOD_NAME)
public final class BramCraft{
    @Instance(References.MOD_ID)
    public static BramCraft instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit();

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        ModItems.init();
        ModBlocks.init();
        ModWorldGen.init();
        ModTileEntities.init();
        NetworkHandler.init();
        DescriptionHandler.init();

        Log.info("Pre Initialization complete");
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();

        // TODO: FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        // TODO: FMLCommonHandler.instance().bus().register(new EventTrigger());

        FMLCommonHandler.instance().bus().register(new AchievementHandler());
        ModAchievementPage.init();
        ModRecipes.init();

        Log.info("Initialization complete");
    }
}
