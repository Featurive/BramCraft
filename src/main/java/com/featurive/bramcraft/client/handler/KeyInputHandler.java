package com.featurive.bramcraft.client.handler;

import com.featurive.bramcraft.client.settings.KeyBindings;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

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

                default:
            }
        }
    }
}
