package com.featurive.bramcraft;

import com.featurive.bramcraft.gui.GuiMine;
import com.featurive.bramcraft.inventory.ContainerMine;
import com.featurive.bramcraft.tileentity.TileEntityMine;
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
                return new ContainerMine(player.inventory, (TileEntityMine) world.getTileEntity(x, y, z));
        }
        throw new IllegalArgumentException("No GUI with ID " + ID);
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(GuiIDs.values()[ID]){
            case MINE:
                return new GuiMine(player.inventory, (TileEntityMine) world.getTileEntity(x, y, z));
        }
        throw new IllegalArgumentException("No GUI with ID " + ID);
    }
}
