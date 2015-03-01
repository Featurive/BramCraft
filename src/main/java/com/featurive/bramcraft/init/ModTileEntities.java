package com.featurive.bramcraft.init;

import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.tileentity.TileEntityCompressionChamber;
import com.featurive.bramcraft.tileentity.TileEntityCondenser;
import com.featurive.bramcraft.tileentity.TileEntityMine;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
    public static void init(){
        GameRegistry.registerTileEntity(TileEntityMine.class, Names.TileEntities.mine);
        GameRegistry.registerTileEntity(TileEntityCondenser.class, Names.TileEntities.condenser);
        GameRegistry.registerTileEntity(TileEntityCompressionChamber.class, Names.TileEntities.compression_chamber);
    }
}
