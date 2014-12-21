package com.featurive.bramcraft.init;

import com.featurive.bramcraft.block.BlockList;
import com.featurive.bramcraft.item.ItemList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void registerRecipes()
    {
        // GameRegistry.addRecipe(new ItemStack(), "", "", "", '', new ItemStack());

        // Core items/block
        GameRegistry.addRecipe(new ItemStack(BlockList.dark_block), "xxx", "xxx", "xxx", 'x', ItemList.dark_iron);
        GameRegistry.addRecipe(new ItemStack(ItemList.crossbow), " xi", "xy ", "i y", 'x', Items.string, 'y', Items.stick, 'i', Items.feather);
        GameRegistry.addRecipe(new ItemStack(ItemList.face), "xxx", "uiu", "xxx", 'x', Blocks.wool, 'u', Items.stick, 'i', Items.painting);
        GameRegistry.addRecipe(new ItemStack(ItemList.frame), "xyx", "ziz", "ele", 'x', Items.stick, 'y', ItemList.dark_pickaxe, 'z', ItemList.dark_iron, 'i', Blocks.iron_bars, 'e', Blocks.glass_pane, 'l', Blocks.redstone_block);
        GameRegistry.addRecipe(new ItemStack(ItemList.infused_iron, 8), "xxx", "xyx", "xxx", 'x', Blocks.redstone_block, 'y', Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(ItemList.jetpack), "xyx", "ziz", "ele", 'x', Items.feather, 'y', Blocks.piston, 'z', ItemList.frame, 'i', BlockList.dark_block, 'e', new ItemStack(Blocks.anvil, 1, 0), 'l', Blocks.redstone_block);
        GameRegistry.addRecipe(new ItemStack(ItemList.mobile_enderchest), "xzx", "iui", "xzx", 'x', ItemList.infused_ender, 'i', Blocks.ender_chest, 'u', Items.ender_pearl, 'z', Blocks.wool);
        //GameRegistry.addRecipe(new ItemStack(ItemList.mobilifier), "x", "y", "i", 'x', Blocks.wool, 'y', ItemList.infused_ender, 'i', Blocks.hopper);
        //GameRegistry.addRecipe(new ItemStack(ItemList.shaker), "x x", "xbx", "iii", 'x', Blocks.cobblestone, 'b', Items.bucket, 'i', Blocks.stone);
        GameRegistry.addRecipe(new ItemStack(ItemList.thruster), "xxx", "uiu", "xxx", 'x', Blocks.stone_slab, 'u', Items.redstone, 'i', ItemList.dark_iron);
        //GameRegistry.addRecipe(new ItemStack(ItemList.transmutation), "xzx", "xyx", "xzx", 'x', Items.gold_ingot, 'z', Items.brewing_stand, 'y', Blocks.redstone_block);
        //GameRegistry.addRecipe(new ItemStack(ItemList.key), "xyx", " y ", "zuz", 'x', Items.iron_ingot, 'y', ItemList.crystal_gem, 'u', Items.leather);
        //GameRegistry.addShapelessRecipe(new ItemStack(ItemList.cheese), ItemList.shaker, Items.milk_bucket);
        //GameRegistry.addShapelessRecipe(new ItemStack(ItemList.chocolatebar), ItemList.shaker, new ItemStack(Items.dye, 1, 3), Items.milk_bucket, Items.sugar);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.infused_diamond, 2), Items.diamond, Blocks.redstone_block);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.infused_ender), Items.ender_pearl, Items.redstone);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemList.poison_apple), Items.apple, Items.spider_eye);

        // Tools
        GameRegistry.addRecipe(new ItemStack(ItemList.crystal_pickaxe), "xxx", " y ", " y ", 'x', ItemList.crystal_gem, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_axe), "xx", "xy", " y", 'x', ItemList.dark_iron, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_pickaxe), "xxx", " y ", " y ", 'x', ItemList.dark_iron, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_shovel), "x", "y", "y", 'x', ItemList.dark_iron, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.dark_sword), "x", "x", "y", 'x', ItemList.dark_iron, 'y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ItemList.op_pickaxe), "xxx", " y ", " y ", 'x', ItemList.infused_iron, 'y', Items.stick);

        // Smelting
        GameRegistry.addSmelting(BlockList.dark_ore, new ItemStack(ItemList.dark_iron), 0.7f);
        GameRegistry.addSmelting(ItemList.swine_meat, new ItemStack(ItemList.bacon), 1f);
    }
}
