package com.featurive.bramcraft;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    public enum GuiIDs{
        MINE
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(GuiIDs.values()[ID]){
            case MINE:
                return null;
        }
        throw new IllegalArgumentException("No GUI with ID " + ID);
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(GuiIDs.values()[ID]){
            case MINE:
                return null;
        }
        throw new IllegalArgumentException("No GUI with ID " + ID);
    }
}
