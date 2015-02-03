package com.featurive.bramcraft.gui;

import com.featurive.bramcraft.inventory.ContainerMine;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiMine extends ModGui {
    public GuiMine(InventoryPlayer playerInventory, TileEntityMine te) {
        super(new ContainerMine(playerInventory, te));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        ResourceLocation texture = new ResourceLocation("bramcraft:textures/gui/mine.png");
        this.mc.renderEngine.bindTexture(texture);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
