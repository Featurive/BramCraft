package com.featurive.bramcraft.init;

import com.featurive.bramcraft.item.ItemList;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.reference.References;
import com.featurive.bramcraft.utility.LogHelper;
import com.featurive.bramcraft.utility.ModRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModItems
{
    public static void registerItems()
    {
        ModRegistry.register(ItemList.bacon, Names.Item.bacon, 0);
        ModRegistry.register(ItemList.crossbow, Names.Item.crossbow, 0);
        ModRegistry.register(ItemList.crystal_gem, Names.Item.crystal_gem, 0);
        ModRegistry.register(ItemList.crystal_pickaxe, Names.Item.crystal_pickaxe, 0);
        ModRegistry.register(ItemList.dark_axe, Names.Item.dark_axe, 0);
        ModRegistry.register(ItemList.dark_iron, Names.Item.dark_iron, 0);
        ModRegistry.register(ItemList.dark_pickaxe, Names.Item.dark_pickaxe, 0);
        ModRegistry.register(ItemList.dark_shovel, Names.Item.dark_shovel, 0);
        ModRegistry.register(ItemList.dark_sword, Names.Item.dark_sword, 0);
        ModRegistry.register(ItemList.face, Names.Item.face, 0);
        ModRegistry.register(ItemList.frame, Names.Item.frame, 0);
        ModRegistry.register(ItemList.infused_diamond, Names.Item.infused_diamond, 0);
        ModRegistry.register(ItemList.infused_ender, Names.Item.infused_ender, 0);
        ModRegistry.register(ItemList.infused_iron, Names.Item.infused_iron, 0);
        ModRegistry.register(ItemList.jetpack, Names.Item.jetpack, 0);
        ModRegistry.register(ItemList.mobile_enderchest, Names.Item.mobile_enderchest, 0);
        ModRegistry.register(ItemList.network_checker, Names.Item.network_checker, 0);
        ModRegistry.register(ItemList.op_pickaxe, Names.Item.op_pickaxe, 0);
        ModRegistry.register(ItemList.poison_apple, Names.Item.poison_apple, 0);
        ModRegistry.register(ItemList.swine_meat, Names.Item.swine_meat, 0);
        ModRegistry.register(ItemList.thruster, Names.Item.thruster, 0);

        LogHelper.info("Registered items");
    }
}
