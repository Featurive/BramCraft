package com.featurive.bramcraft.client.handler;

import com.featurive.bramcraft.client.settings.KeyBindings;
import com.featurive.bramcraft.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class KeyInputHandler {
    private KeyBindings getPressedKey(){
        for(KeyBindings key : KeyBindings.values()){
            if(key.isPressed()) return key;
        }
        return null;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        KeyBindings key = getPressedKey();
        if(key != null){
            switch(key){
                case EXPLODE:
                    LogHelper.info("BOOMSIES!");
                    EntityPlayer player = Minecraft.getMinecraft().thePlayer;
                    player.worldObj.createExplosion(player, player.posX, player.posY - 10, player.posZ, 3.0F, true);
                    break;
                default:

            }
        }
    }
}
