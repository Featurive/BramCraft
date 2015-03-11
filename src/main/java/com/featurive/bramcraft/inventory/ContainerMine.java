package com.featurive.bramcraft.inventory;

import com.featurive.bramcraft.tileentity.TileEntityMine;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ContainerMine extends ModContainer {
    private TileEntityMine te;
    private int lastTimer;

    public ContainerMine(InventoryPlayer playerInventory, TileEntityMine te){
        this.addSlotToContainer(new SlotMine(te, 0, 80, 53));
        this.addSlotToContainer(new SlotMine(te, 1, 80, 17));
        this.addSlotToContainer(new SlotMine(te, 2, 80, 35));
        this.addSlotToContainer(new SlotMine(te, 3, 98, 53));
        this.addSlotToContainer(new SlotMine(te, 4, 98, 35));
        this.addSlotToContainer(new SlotMine(te, 5, 62, 35));

        this.addPlayerSlots(playerInventory, 8, 84);
        this.te = te;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return te.isUseableByPlayer(player);
    }

    @Override
    public void detectAndSendChanges(){
        super.detectAndSendChanges();
        if(lastTimer != te.getTimer()){
            for(ICrafting crafter : (List<ICrafting>)crafters){
                crafter.sendProgressBarUpdate(this, 0, te.getTimer());
            }
            lastTimer = te.getTimer();
        }
    }

    @SideOnly(Side.SERVER)
    @Override
    public void updateProgressBar(int id, int value){
        super.updateProgressBar(id, value);
        if(id == 0){
            te.setTimer(value);
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotClicked) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotClicked);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // change from here
            if (slotClicked < 6){
                if (!mergeItemStack(itemstack1, 6, 42, true)){
                    return null;
                }
            } else {
                if (itemstack1.stackSize == 1){
                    for(int i = 0; i < 6; i++){
                        Slot shiftedInSlot = ((Slot)inventorySlots.get(i));
                        if(!shiftedInSlot.getHasStack() && shiftedInSlot.isItemValid(itemstack1)) mergeItemStack(itemstack1, i, i + 1, false);
                    }
                }

            }
            // till here

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }

    // TODO: fix items not outputting
}
