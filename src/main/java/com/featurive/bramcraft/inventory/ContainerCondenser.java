package com.featurive.bramcraft.inventory;

import com.featurive.bramcraft.tileentity.TileEntityCondenser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerCondenser extends ModContainer {
    public TileEntityCondenser te;

    public ContainerCondenser(InventoryPlayer playerInventory, TileEntityCondenser te) {
        this.addSlotToContainer(new SlotCondenserOutput(te, 0, 14, 18)); // output slot
        this.addSlotToContainer(new SlotCondenserSelection(te, 1, 14, 45)); // selection slot

        //row                                      // slot, x, y
        this.addSlotToContainer(new SlotCondenser(te, 2, 38, 18));
        this.addSlotToContainer(new SlotCondenser(te, 3, 56, 18));
        this.addSlotToContainer(new SlotCondenser(te, 4, 74, 18));
        this.addSlotToContainer(new SlotCondenser(te, 5, 92, 18));
        this.addSlotToContainer(new SlotCondenser(te, 6, 110, 18));
        this.addSlotToContainer(new SlotCondenser(te, 7, 128, 18));
        this.addSlotToContainer(new SlotCondenser(te, 8, 146, 18));

        // row 2
        this.addSlotToContainer(new SlotCondenser(te, 9, 38, 36));
        this.addSlotToContainer(new SlotCondenser(te, 10, 56, 36));
        this.addSlotToContainer(new SlotCondenser(te, 11, 74, 36));
        this.addSlotToContainer(new SlotCondenser(te, 12, 92, 36));
        this.addSlotToContainer(new SlotCondenser(te, 13, 110, 36));
        this.addSlotToContainer(new SlotCondenser(te, 14, 128, 36));
        this.addSlotToContainer(new SlotCondenser(te, 15, 146, 36));

        // row 3
        this.addSlotToContainer(new SlotCondenser(te, 16, 38, 54));
        this.addSlotToContainer(new SlotCondenser(te, 17, 56, 54));
        this.addSlotToContainer(new SlotCondenser(te, 18, 74, 54));
        this.addSlotToContainer(new SlotCondenser(te, 19, 92, 54));
        this.addSlotToContainer(new SlotCondenser(te, 20, 110, 54));
        this.addSlotToContainer(new SlotCondenser(te, 21, 128, 54));
        this.addSlotToContainer(new SlotCondenser(te, 22, 146, 54));

        // row 4
        this.addSlotToContainer(new SlotCondenser(te, 23, 38, 72));
        this.addSlotToContainer(new SlotCondenser(te, 24, 56, 72));
        this.addSlotToContainer(new SlotCondenser(te, 25, 74, 72));
        this.addSlotToContainer(new SlotCondenser(te, 26, 92, 72));
        this.addSlotToContainer(new SlotCondenser(te, 27, 110, 72));
        this.addSlotToContainer(new SlotCondenser(te, 28, 128, 72));
        this.addSlotToContainer(new SlotCondenser(te, 29, 146, 72));

        // row 5
        this.addSlotToContainer(new SlotCondenser(te, 30, 38, 90));
        this.addSlotToContainer(new SlotCondenser(te, 31, 56, 90));
        this.addSlotToContainer(new SlotCondenser(te, 32, 74, 90));
        this.addSlotToContainer(new SlotCondenser(te, 33, 92, 90));
        this.addSlotToContainer(new SlotCondenser(te, 34, 110, 90));
        this.addSlotToContainer(new SlotCondenser(te, 35, 128, 90));
        this.addSlotToContainer(new SlotCondenser(te, 36, 146, 90));
        // row 6
        this.addSlotToContainer(new SlotCondenser(te, 37, 38, 108));
        this.addSlotToContainer(new SlotCondenser(te, 38, 56, 108));
        this.addSlotToContainer(new SlotCondenser(te, 39, 74, 108));
        this.addSlotToContainer(new SlotCondenser(te, 40, 92, 108));
        this.addSlotToContainer(new SlotCondenser(te, 41, 110, 108));
        this.addSlotToContainer(new SlotCondenser(te, 42, 128, 108));
        this.addSlotToContainer(new SlotCondenser(te, 43, 146, 108));

        this.addPlayerSlots(playerInventory, 8, 140);
        this.te = te;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return te.isUseableByPlayer(player);
    }

//    @Override
//    public void detectAndSendChanges(){
//        super.detectAndSendChanges();
//        if(lastTimer != te.getTimer()){
//            for(ICrafting crafter : (List<ICrafting>)crafters){
//                crafter.sendProgressBarUpdate(this, 0, te.getTimer());
//            }
//            lastTimer = te.getTimer();
//        }
//    }

//    @SideOnly(Side.SERVER)
//    @Override
//    public void updateProgressBar(int id, int value){
//        super.updateProgressBar(id, value);
//        if(id == 0){
//            te.setTimer(value);
//        }
//    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotClicked) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotClicked);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // change from here
            if (slotClicked < 43){
                if (!mergeItemStack(itemstack1, 6, 42, true)){
                    return null;
                }
            } else {
                if (itemstack1.stackSize == 1){
                    for(int i = 0; i < 42; i++){
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
}
