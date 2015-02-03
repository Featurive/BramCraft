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

public class ModInventoryItem extends ModItem{
    private String containername;
    private int slots;
    private int type;

    public ModInventoryItem(String containername, int slots, int type){
        this.containername = containername;
        this.slots = slots;
        this.type = type;
        this.setCreativeTab(CreativeTab.bramcraft);
        this.setMaxStackSize(maxStackSize);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
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
        InventoryBasic chest = new InventoryBasic(containername, true, slots);
        player.displayGUIChest(chest);
        //player.addStat(null, 1);
    }
    private void openWorkbench(){
    }
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean flag) {
        String msg = "Right click to open your ";
        list.add(GRAY + msg + GREEN + containername + GRAY + "!");
    }
}
