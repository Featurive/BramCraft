package com.featurive.bramcraft.client.gui;

import com.featurive.bramcraft.handler.ConfigurationHandler;
import com.featurive.bramcraft.reference.Categories;
import com.featurive.bramcraft.reference.References;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Categories.BRAMCRAFT)).getChildElements(),
                References.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
