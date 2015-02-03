package com.featurive.bramcraft.init;

import com.featurive.bramcraft.block.blocks.BlockList;
import com.featurive.bramcraft.item.constructor.ItemList;
import com.featurive.bramcraft.utility.Log;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
    public static void init()
    {
        // GameRegistry.addRecipe(new ItemStack(), "", "", "", '', new ItemStack());

        // Core items/block
        GameRegistry.addRecipe(new ItemStack(BlockList.dark_block), "xxx", "xxx", "xxx", 'x', ItemList.dark_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.dark_ingot, 9), BlockList.dark_block);
        GameRegistry.addRecipe(new ItemStack(ItemList.crossbow), " xi", "xy ", "i y", 'x', Items.string, 'y', Items.stick, 'i', Items.feather);
        GameRegistry.addRecipe(new ItemStack(ItemList.face), "xxx", "uiu", "xxx", 'x', Blocks.wool, 'u', Items.stick, 'i', Items.painting);
        GameRegistry.addRecipe(new ItemStack(ItemList.frame), "xyx", "ziz", "ele", 'x', Items.stick, 'y', ItemList.dark_pickaxe, 'z', ItemList.dark_ingot, 'i', Blocks.iron_bars, 'e', Blocks.glass_pane, 'l', Blocks.redstone_block);
        GameRegistry.addRecipe(new ItemStack(ItemList.infused_iron, 8), "xxx", "xyx", "xxx", 'x', Blocks.redstone_block, 'y', Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(ItemList.jetpack), "xyx", "ziz", "ele", 'x', Items.feather, 'y', Blocks.piston, 'z', ItemList.frame, 'i', BlockList.dark_block, 'e', new ItemStack(Blocks.anvil, 1, 0), 'l', Blocks.redstone_block);
        GameRegistry.addRecipe(new ItemStack(ItemList.mobile_enderchest), "xzx", "iui", "xzx", 'x', ItemList.infused_ender, 'i', Blocks.ender_chest, 'u', Items.ender_pearl, 'z', Blocks.wool);
        GameRegistry.addRecipe(new ItemStack(ItemList.thruster), "xxx", "uiu", "xxx", 'x', Blocks.stone_slab, 'u', Items.redstone, 'i', ItemList.dark_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.infused_diamond, 2), Items.diamond, Blocks.redstone_block);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.infused_ender), Items.ender_pearl, Items.redstone);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.poison_apple), Items.apple, Items.spider_eye);
        GameRegistry.addShapedRecipe(new ItemStack(BlockList.ferrum_block), "xxx", "xxx", "xxx", 'x', ItemList.ferrum_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.ferrum_ingot, 9), BlockList.ferrum_block);
        GameRegistry.addRecipe(new ItemStack(ItemList.bag), "xxx", " y ", "zsz", 'x', Blocks.gold_block, 'y', BlockList.enderpearl_block, 's', Items.blaze_rod, 'z', Blocks.chest);
        GameRegistry.addRecipe(new ItemStack(BlockList.enderpearl_block), "xxx", "xxx", "xxx", 'x', Items.ender_pearl);

        // Tools
        GameRegistry.addRecipe(new ItemStack(ItemList.crystal_pickaxe), "xxx", " y ", " y ", 'x', ItemList.crystal_gem, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_axe), "xx", "xy", " y", 'x', ItemList.dark_ingot, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_pickaxe), "xxx", " y ", " y ", 'x', ItemList.dark_ingot, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_shovel), "x", "y", "y", 'x', ItemList.dark_ingot, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_sword), "x", "x", "y", 'x', ItemList.dark_ingot, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.op_pickaxe), "xxx", " y ", " y ", 'x', ItemList.infused_iron, 'y', Items.stick);

        // Smelting
        GameRegistry.addSmelting(BlockList.dark_ore, new ItemStack(ItemList.dark_ingot), 0.7f);
        GameRegistry.addSmelting(ItemList.swine_meat, new ItemStack(ItemList.bacon), 1f);
        GameRegistry.addSmelting(BlockList.ferrum_ore, new ItemStack(ItemList.ferrum_ingot), 0.7f);
        Log.info("Registered recipes");
    }
}
