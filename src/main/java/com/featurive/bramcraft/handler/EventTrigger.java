package com.featurive.bramcraft.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;

public class EventTrigger {
    @SubscribeEvent
    public void smeltEvent(PlayerEvent.ItemSmeltedEvent e){

    }

    @SubscribeEvent
    public void getSmeltedItem(PlayerEvent.ItemSmeltedEvent e){

    }

    @SubscribeEvent
    public void craftEvent(PlayerEvent.ItemCraftedEvent e){

    }

    @SubscribeEvent
    public void getCraftedItem(PlayerEvent.ItemCraftedEvent e){
        if(!e.player.worldObj.isRemote){
            e.player.addChatMessage(new ChatComponentText("CRAFTED : " + e.crafting.getDisplayName()));
        }
    }
}
