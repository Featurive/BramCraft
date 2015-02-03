package com.featurive.bramcraft.inventory;

import com.featurive.bramcraft.tileentity.TileEntityMine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerMine extends ModContainer {
    private TileEntityMine te;
    public ContainerMine(InventoryPlayer playerInventory, TileEntityMine te){
            this.addSlotToContainer(new Slot(te, 0, 50, 50));
            this.addSlotToContainer(new Slot(te, 1, 50, 14));
            this.addSlotToContainer(new Slot(te, 2, 50, 32));
            this.addSlotToContainer(new Slot(te, 3, 32, 32));
            this.addSlotToContainer(new Slot(te, 4, 68, 32));
            this.addSlotToContainer(new Slot(te, 5, 68, 68));

        this.addPlayerSlots(playerInventory, 8, 84);
        this.te = te;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return te.isUseableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_) {
        return null;
    }
}
