package com.featurive.bramcraft.utility;

import com.featurive.bramcraft.BramCraft;
import com.featurive.bramcraft.item.ModItem;
import com.featurive.bramcraft.reference.References;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRegistry {
    // TODO: Fix model registering
    public static void register(Item item, String name, int meta) {
        GameRegistry.registerItem(item, name, References.MOD_ID);
        //registerModel(item, meta, name);
    }

    public static void register(ItemTool item, String name, int meta) {
        GameRegistry.registerItem(item, name, References.MOD_ID);
        //registerModel(item, meta, name);
    }

    public static void register(Block block, String name, int meta) {
        GameRegistry.registerBlock(block, name);
        //registerModel(block, meta, name);
    }
    public static void registerModel(Item item, int metadata, String itemRegistryName){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MOD_ID + ":" + itemRegistryName, "inventory"));
    }
    public static void registerModel(Block block, int metadata, String itemRegistryName){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(References.MOD_ID + ":" + itemRegistryName, "inventory"));
    }
}
