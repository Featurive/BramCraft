package com.featurive.bramcraft.utility;

import com.featurive.bramcraft.reference.References;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

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

    public static void registerModel(Item item, String name, int meta){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, meta, new ModelResourceLocation(References.MOD_ID + ":" + name, "inventory"));
    }

    public static void registerModel(Block block, String name, int meta){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, meta, new ModelResourceLocation(References.MOD_ID + ":" + name, "inventory"));
    }
}
