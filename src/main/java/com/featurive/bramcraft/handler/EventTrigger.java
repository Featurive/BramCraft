package com.featurive.bramcraft.handler;

import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

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
        if(e.player.worldObj.isRemote){
            e.player.addChatMessage(new ChatComponentText("CRAFTED : " + e.crafting.getDisplayName()));
        }
    }
}
