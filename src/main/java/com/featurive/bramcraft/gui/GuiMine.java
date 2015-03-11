package com.featurive.bramcraft.gui;

import com.featurive.bramcraft.inventory.ContainerMine;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiMine extends ModGui {
    private final TileEntityMine te;

    public GuiMine(InventoryPlayer playerInventory, TileEntityMine te) {
        super(new ContainerMine(playerInventory, te), Names.Block.mine, playerInventory);
        this.te = te;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);                                                               //0xAARRGGBB
        this.fontRendererObj.drawString(I18n.format("gui.bramcraft.mine.timer", te.getTimer(), te.getTimerInSeconds()), 10, 5, 0xFF000000);
    }
}
