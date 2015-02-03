package com.featurive.bramcraft.client.settings;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public enum KeyBindings {
    EXPLODE ("key.bramcraft.explode", Keyboard.KEY_R);

    private final KeyBinding keybinding;

    private KeyBindings(String keyName, int defaultKeyCode){
        keybinding = new KeyBinding(keyName, defaultKeyCode, "keys.categories.bramcraft");
    }

    public KeyBinding getKeybind(){
        return keybinding;
    }

    public boolean isPressed(){
        return keybinding.isPressed();
    }
}
