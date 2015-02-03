package com.featurive.bramcraft.client.gui;

import com.featurive.bramcraft.handler.ConfigHandler;
import com.featurive.bramcraft.reference.Categories;
import com.featurive.bramcraft.reference.References;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigHandler.config.getCategory(Categories.BRAMCRAFT)).getChildElements(),
                References.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
