package com.featurive.bramcraft.gui;

import com.featurive.bramcraft.inventory.ContainerCondenser;
import com.featurive.bramcraft.inventory.ContainerMine;
import com.featurive.bramcraft.tileentity.TileEntityCondenser;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    public enum GuiIDs{
        CONDENSER, MINE
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(GuiIDs.values()[ID]){
            case MINE:
                return new ContainerMine(player.inventory, (TileEntityMine) world.getTileEntity(x, y, z));
            case CONDENSER:
                return new ContainerCondenser(player.inventory, (TileEntityCondenser) world.getTileEntity(x, y, z));
        }
        throw new IllegalArgumentException("No GUI with ID " + ID);
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(GuiIDs.values()[ID]){
            case MINE:
                return new GuiMine(player.inventory, (TileEntityMine) world.getTileEntity(x, y, z));
            case CONDENSER:
                return new GuiCondenser(player.inventory, (TileEntityCondenser) world.getTileEntity(x, y, z));
        }
        throw new IllegalArgumentException("No GUI with ID " + ID);
    }
}
