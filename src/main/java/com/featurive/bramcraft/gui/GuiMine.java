package com.featurive.bramcraft.gui;

import com.featurive.bramcraft.inventory.ContainerMine;
import com.featurive.bramcraft.network.NetworkHandler;
import com.featurive.bramcraft.network.messagebase.MessageHandleGui;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiMine extends ModGui {
    private final TileEntityMine te;

    public GuiMine(InventoryPlayer playerInventory, TileEntityMine te) {
        super(new ContainerMine(playerInventory, te), Names.Block.mine, playerInventory);
        this.te = te;
    }

    @Override
    public void initGui() {
        super.initGui();
        GuiButton button = new GuiButton(0, guiLeft + 10, guiTop + 30, 40, 20, I18n.format("gui.bramcraft.mine.button.reset"));
        this.buttonList.add(button);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if(button.id == 0) NetworkHandler.sendToServer(new MessageHandleGui(te, 0));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);                                                               //0xAARRGGBB
        this.fontRendererObj.drawString(I18n.format("gui.bramcraft.mine.timer", te.getTimer()), 10, 20, 0xFF000000);
    }
}
