package com.featurive.bramcraft.gui;

import com.featurive.bramcraft.inventory.ContainerMine;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiMine extends ModGui {
    public GuiMine(InventoryPlayer playerInventory, TileEntityMine te) {
        super(new ContainerMine(playerInventory, te));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
    }
}
