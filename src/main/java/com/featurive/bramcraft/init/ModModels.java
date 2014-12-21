package com.featurive.bramcraft.init;

import com.featurive.bramcraft.block.BlockList;
import com.featurive.bramcraft.item.ItemList;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.utility.ModRegistry;

public class ModModels
{
    public static void registerModels()
    {
        // Blocks
        ModRegistry.registerModel(BlockList.crystal_ore, 0, Names.Block.crystal_ore);
        ModRegistry.registerModel(BlockList.boom, 0, Names.Block.boom);
        ModRegistry.registerModel(BlockList.dark_rock, 0, Names.Block.dark_rock);
        ModRegistry.registerModel(BlockList.dark_block, 0, Names.Block.dark_block);
        ModRegistry.registerModel(BlockList.dark_ore, 0, Names.Block.dark_ore);

        // Items
        ModRegistry.registerModel(ItemList.bacon, 0, Names.Item.bacon);
        // TODO: ModRegistry.registerModel(ItemList.cheese, 0, Names.Item.cheese);
        // TODO: ModRegistry.registerModel(ItemList.chocolatebar, 0, Names.Item.chocolatebar);
        ModRegistry.registerModel(ItemList.crossbow, 0, Names.Item.crossbow);
        ModRegistry.registerModel(ItemList.crystal_gem, 0, Names.Item.crystal_gem);
        ModRegistry.registerModel(ItemList.crystal_pickaxe, 0, Names.Item.crystal_pickaxe);
        // TODO: ModRegistry.registerModel(ItemList.damage, 0, Names.Item.damage);
        ModRegistry.registerModel(ItemList.dark_axe, 0, Names.Item.dark_axe);
        ModRegistry.registerModel(ItemList.dark_iron, 0, Names.Item.dark_iron);
        ModRegistry.registerModel(ItemList.dark_pickaxe, 0, Names.Item.dark_pickaxe);
        ModRegistry.registerModel(ItemList.dark_shovel, 0, Names.Item.dark_shovel);
        ModRegistry.registerModel(ItemList.dark_sword, 0, Names.Item.dark_sword);
        ModRegistry.registerModel(ItemList.face, 0, Names.Item.face);
        ModRegistry.registerModel(ItemList.frame, 0, Names.Item.frame);
        ModRegistry.registerModel(ItemList.infused_diamond, 0, Names.Item.infused_diamond);
        ModRegistry.registerModel(ItemList.infused_ender, 0, Names.Item.infused_ender);
        ModRegistry.registerModel(ItemList.infused_iron, 0, Names.Item.infused_iron);
        ModRegistry.registerModel(ItemList.jetpack, 0, Names.Item.jetpack);
        // TODO: ModRegistry.registerModel(ItemList.key, 0, Names.Item.key);
        ModRegistry.registerModel(ItemList.mobile_enderchest, 0, Names.Item.mobile_enderchest);
        // TODO: ModRegistry.registerModel(ItemList.mobilifier, 0, Names.Item.mobilifier);
        ModRegistry.registerModel(ItemList.network_checker, 0, Names.Item.network_checker);
        ModRegistry.registerModel(ItemList.op_pickaxe, 0, Names.Item.op_pickaxe);
        ModRegistry.registerModel(ItemList.poison_apple, 0, Names.Item.poison_apple);
        // TODO: ModRegistry.registerModel(ItemList.shaker, 0, Names.Item.shaker);
        ModRegistry.registerModel(ItemList.swine_meat, 0, Names.Item.swine_meat);
        ModRegistry.registerModel(ItemList.thruster, 0, Names.Item.thruster);
        // TODO: ModRegistry.registerModel(ItemList.transmutation, 0, Names.Item.transmutation);
    }
}
