package com.featurive.bramcraft.utility;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

public class ModRegistry {
    public static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    public static void register(ItemTool item, String name) {
        GameRegistry.registerItem(item, name);
    }

    public static void register(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }
}
