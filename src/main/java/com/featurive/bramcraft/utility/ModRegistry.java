package com.featurive.bramcraft.utility;

import com.featurive.bramcraft.reference.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

public class ModRegistry {
    public static void register(Item item, String name) {
        GameRegistry.registerItem(item, name, References.MOD_ID);
    }

    public static void register(ItemTool item, String name) {
        GameRegistry.registerItem(item, name, References.MOD_ID);
    }

    public static void register(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }
}
