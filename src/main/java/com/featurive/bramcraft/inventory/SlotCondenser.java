package com.featurive.bramcraft.inventory;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotCondenser extends Slot {
    public SlotCondenser(IInventory inventory, int inventoryIndex, int x, int y) {
        super(inventory, inventoryIndex, x, y);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return stack != new ItemStack(Blocks.bedrock);
    }
}
