package com.featurive.bramcraft.item.constructor;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.Achievements;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ModInventory extends ModItem{
    private int rowCount;
    private String containerName;

    public ModInventory(String inventoryName, int rows){
        containerName = inventoryName;
        rowCount = rows;
        this.setCreativeTab(CreativeTab.bc_tab);
        this.setMaxStackSize(1);
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        player.addStat(Achievements.openMobileEnderChest, 1);
        InventoryEnderChest inventoryenderchest = player.getInventoryEnderChest();
        InventoryBasic inventory = new InventoryBasic(containerName, false, rowCount);
        player.displayGUIChest(inventory);
        return itemstack;
    }

    @Override
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean flag) {
        super.addInformation(itemstack, player, list, flag);
        list.add(EnumChatFormatting.GRAY + "Right click to open your " + EnumChatFormatting.GREEN + "Enderchest" + EnumChatFormatting.GRAY + "!");
    }
}
