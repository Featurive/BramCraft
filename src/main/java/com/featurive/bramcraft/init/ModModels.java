package com.featurive.bramcraft.init;

import com.featurive.bramcraft.block.BlockList;
import com.featurive.bramcraft.item.ItemList;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.reference.References;
import com.featurive.bramcraft.utility.LogHelper;
import com.featurive.bramcraft.utility.ModRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModModels {
    public static void init(){
        ModRegistry.registerModel(BlockList.crystal_ore, Names.Block.crystal_ore, 0);
        ModRegistry.registerModel(BlockList.dark_block, Names.Block.dark_block, 0);
        ModRegistry.registerModel(BlockList.dark_ore, Names.Block.dark_ore, 0);
        ModRegistry.registerModel(BlockList.dark_rock, Names.Block.dark_rock, 0);
        ModRegistry.registerModel(BlockList.dutch_flag, Names.Block.dutch_flag, 0);
        ModRegistry.registerModel(BlockList.ferrum_block, Names.Block.ferrum_block, 0);
        ModRegistry.registerModel(BlockList.ferrum_ore, Names.Block.ferrum_ore, 0);
        ModRegistry.registerModel(BlockList.enderpearl_block, Names.Block.enderpearl_block, 0);
        ModRegistry.registerModel(BlockList.test_container, Names.Block.test_container, 0);
        ModRegistry.registerModel(BlockList.mine, Names.Block.mine, 0);

        ModRegistry.registerModel(ItemList.bacon, Names.Item.bacon, 0);
        ModRegistry.registerModel(ItemList.crossbow, Names.Item.crossbow, 0);
        ModRegistry.registerModel(ItemList.crystal_gem, Names.Item.crystal_gem, 0);
        ModRegistry.registerModel(ItemList.crystal_pickaxe, Names.Item.crystal_pickaxe, 0);
        ModRegistry.registerModel(ItemList.dark_axe, Names.Item.dark_axe, 0);
        ModRegistry.registerModel(ItemList.dark_ingot, Names.Item.dark_ingot, 0);
        ModRegistry.registerModel(ItemList.dark_pickaxe, Names.Item.dark_pickaxe, 0);
        ModRegistry.registerModel(ItemList.dark_shovel, Names.Item.dark_shovel, 0);
        ModRegistry.registerModel(ItemList.dark_sword, Names.Item.dark_sword, 0);
        ModRegistry.registerModel(ItemList.face, Names.Item.face, 0);
        ModRegistry.registerModel(ItemList.frame, Names.Item.frame, 0);
        ModRegistry.registerModel(ItemList.infused_diamond, Names.Item.infused_diamond, 0);
        ModRegistry.registerModel(ItemList.infused_ender, Names.Item.infused_ender, 0);
        ModRegistry.registerModel(ItemList.infused_iron, Names.Item.infused_iron, 0);
        ModRegistry.registerModel(ItemList.jetpack, Names.Item.jetpack, 0);
        ModRegistry.registerModel(ItemList.mobile_enderchest, Names.Item.mobile_enderchest, 0);
        ModRegistry.registerModel(ItemList.bag, Names.Item.bag, 0);
        ModRegistry.registerModel(ItemList.op_pickaxe, Names.Item.op_pickaxe, 0);
        ModRegistry.registerModel(ItemList.poison_apple, Names.Item.poison_apple, 0);
        ModRegistry.registerModel(ItemList.swine_meat, Names.Item.swine_meat, 0);
        ModRegistry.registerModel(ItemList.thruster, Names.Item.thruster, 0);
        ModRegistry.registerModel(ItemList.ferrum_ingot, Names.Item.ferrum_ingot, 0);
        LogHelper.info("Registered models");
    }
}