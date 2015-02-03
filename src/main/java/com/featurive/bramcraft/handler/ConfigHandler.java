package com.featurive.bramcraft.handler;

import com.featurive.bramcraft.reference.References;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration config;
    public static boolean destroyBlocks = false;

    public static void init(File configFile)
    {
        // Create the config object from the given config file
        if (config == null)
        {
            config = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        destroyBlocks = config.getBoolean("destroyBlocks", "tileentities.mine", false, "If set to true, the mine will destroy blocks.");

        if (config.hasChanged())
        {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(References.MOD_ID))
        {
            loadConfiguration();
        }
    }
}