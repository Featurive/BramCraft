package com.featurive.bramcraft.init;

import com.featurive.bramcraft.item.constructor.ItemList;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.reference.References;
import com.featurive.bramcraft.utility.Log;
import com.featurive.bramcraft.utility.ModRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModItems{
    public static void init(){
        ModRegistry.register(ItemList.bacon, Names.Item.bacon);
        ModRegistry.register(ItemList.crossbow, Names.Item.crossbow);
        ModRegistry.register(ItemList.crystal_gem, Names.Item.crystal_gem);
        ModRegistry.register(ItemList.crystal_pickaxe, Names.Item.crystal_pickaxe);
        ModRegistry.register(ItemList.dark_axe, Names.Item.dark_axe);
        ModRegistry.register(ItemList.dark_ingot, Names.Item.dark_ingot);
        ModRegistry.register(ItemList.dark_pickaxe, Names.Item.dark_pickaxe);
        ModRegistry.register(ItemList.dark_shovel, Names.Item.dark_shovel);
        ModRegistry.register(ItemList.dark_sword, Names.Item.dark_sword);
        ModRegistry.register(ItemList.face, Names.Item.face);
        ModRegistry.register(ItemList.frame, Names.Item.frame);
        ModRegistry.register(ItemList.infused_diamond, Names.Item.infused_diamond);
        ModRegistry.register(ItemList.infused_ender, Names.Item.infused_ender);
        ModRegistry.register(ItemList.infused_iron, Names.Item.infused_iron);
        ModRegistry.register(ItemList.jetpack, Names.Item.jetpack);
        ModRegistry.register(ItemList.mobile_enderchest, Names.Item.mobile_enderchest);
        ModRegistry.register(ItemList.op_pickaxe, Names.Item.op_pickaxe);
        ModRegistry.register(ItemList.poison_apple, Names.Item.poison_apple);
        ModRegistry.register(ItemList.swine_meat, Names.Item.swine_meat);
        ModRegistry.register(ItemList.thruster, Names.Item.thruster);
        ModRegistry.register(ItemList.ferrum_ingot, Names.Item.ferrum_ingot);
        ModRegistry.register(ItemList.utility_wrench, Names.Item.utility_wrench);

        Log.info("Registered items");
    }
}
