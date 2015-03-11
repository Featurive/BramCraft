package com.featurive.bramcraft.gui;

import com.featurive.bramcraft.inventory.ContainerCondenser;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityCondenser;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiCondenser extends ModGui{
    private final TileEntityCondenser te;
    private final InventoryPlayer inventory;
    private int xSize = 175;
    private int ySize = 221;

    public GuiCondenser(InventoryPlayer playerInventory, TileEntityCondenser te) {
        super(new ContainerCondenser(playerInventory, te), Names.Block.condenser, playerInventory);
        this.te = te;
        this.inventory = playerInventory;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = inventory.hasCustomInventoryName() ? inventory.getInventoryName() : I18n.format(inventory.getInventoryName());
        fontRendererObj.drawString(s, this.xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(I18n.format("container.inventory"), 8, 221 - 96 + 2, 4210752);
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialtick, int mouseX, int mouseY) {
        super.drawGuiContainerBackgroundLayer(partialtick, mouseX, mouseY);
        mc.getTextureManager().bindTexture(guiTexture);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
    }
}