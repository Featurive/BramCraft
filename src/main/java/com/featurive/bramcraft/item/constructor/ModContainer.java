package com.featurive.bramcraft.item.constructor;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.Achievements;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

import static net.minecraft.util.EnumChatFormatting.GRAY;
import static net.minecraft.util.EnumChatFormatting.GREEN;

public class ModContainer extends ModItem{
    private String containerName;
    private int rowCount;
    private int type;

    public ModContainer(String containerName, int rowCount, int type){
        this.containerName = containerName;
        this.rowCount = rowCount;
        this.type = type;

        this.setCreativeTab(CreativeTab.bramcraft);
        this.setMaxStackSize(maxStackSize);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        //int posX = new Double(player.posX).intValue();
        //int posY = new Double(player.posY).intValue();
        //int posZ = new Double(player.posZ).intValue();

        switch(type) {
            case 1:
                openEnderchest(player);
                break;
            case 2:
                openChest(player);
                break;
            case 3:
                openWorkbench();
                break;
            default:
                openChest(player);
                break;
        }
        return itemstack;
    }

    private void openEnderchest(EntityPlayer player){
        InventoryEnderChest enderchest = player.getInventoryEnderChest();
        player.displayGUIChest(enderchest);
        player.addStat(Achievements.openMobileEnderChest, 1);
    }

    private void openChest(EntityPlayer player){
        InventoryBasic chest = new InventoryBasic(containerName, true, rowCount);
        player.displayGUIChest(chest);
        player.addStat(Achievements.openBag, 1);
    }

    private void openWorkbench(){

    }

    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean flag) {
        String msg = "Right click to open your ";
        list.add(GRAY + msg + GREEN + containerName + GRAY + "!");
    }
}

