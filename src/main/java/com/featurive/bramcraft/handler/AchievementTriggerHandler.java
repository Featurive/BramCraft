package com.featurive.bramcraft.handler;

import com.featurive.bramcraft.item.ItemList;
import com.featurive.bramcraft.reference.Achievements;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementTriggerHandler {
    @SubscribeEvent
    public void smeltEvent(PlayerEvent.ItemSmeltedEvent e){
        if(e.smelting.getItem().equals(ItemList.dark_ingot)){
            e.player.addStat(Achievements.smeltDarkIron, 1);
        }
    }

    @SubscribeEvent
    public void craftEvent(PlayerEvent.ItemCraftedEvent e){
        if(e.crafting.getItem().equals(ItemList.crystal_pickaxe)){
            e.player.addStat(Achievements.buildCrystalPickaxe, 1);
        }else if(e.crafting.getItem().equals(ItemList.infused_iron)){
            e.player.addStat(Achievements.buildInfusedIron, 1);
        }else if(e.crafting.getItem().equals(ItemList.face)){
            e.player.addStat(Achievements.buildFace, 1);
        }
    }
}
