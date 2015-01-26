package com.featurive.bramcraft.utility;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;

public class ModRegistry {
    public static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    public static void register(Block block, String name){
        GameRegistry.registerBlock(block, name);
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String name){
        GameRegistry.registerTileEntity(tileEntityClass, name);
    }
}
