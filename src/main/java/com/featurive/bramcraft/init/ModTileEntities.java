package com.featurive.bramcraft.init;

import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import com.featurive.bramcraft.utility.ModRegistry;

public class ModTileEntities {
    public static void init(){
        ModRegistry.registerTileEntity(TileEntityMine.class, Names.TileEntities.mine);
    }
}
