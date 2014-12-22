package com.featurive.bramcraft.init;

import com.featurive.bramcraft.world.WorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGen {
    public static void init(){
        GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);
    }
}
