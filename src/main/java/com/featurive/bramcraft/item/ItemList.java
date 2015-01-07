package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.*;
import com.featurive.bramcraft.reference.Names;

public class ItemList extends ModItem {
    public static ModItem bacon =                   (ModItem)       new ModItem().setUnlocalizedName(Names.Item.bacon);
    public static ModItem crossbow =                (ModItem)       new ModItem().setUnlocalizedName(Names.Item.crossbow);
    public static ModItem crystal_gem =             (ModItem)       new ModItem().setUnlocalizedName(Names.Item.crystal_gem);
    public static ModPickaxe crystal_pickaxe =      (ModPickaxe)    new ModPickaxe(ToolMaterial.EMERALD).setUnlocalizedName(Names.Item.crystal_pickaxe);
    public static ModAxe dark_axe =                 (ModAxe)        new ModAxe(ToolMaterial.EMERALD).setUnlocalizedName(Names.Item.dark_axe);
    public static ModItem dark_ingot =              (ModItem)       new ModItem().setUnlocalizedName(Names.Item.dark_iron);
    public static ModPickaxe dark_pickaxe =         (ModPickaxe)    new ModPickaxe(ToolMaterial.EMERALD).setUnlocalizedName(Names.Item.dark_pickaxe);
    public static ModShovel dark_shovel =           (ModShovel)     new ModShovel(ToolMaterial.EMERALD).setUnlocalizedName(Names.Item.dark_shovel);
    public static ModSword dark_sword =             (ModSword)      new ModSword(ToolMaterial.EMERALD).setUnlocalizedName(Names.Item.dark_sword);
    public static ModItem face =                    (ModItem)       new ModItem().setUnlocalizedName(Names.Item.face);
    public static ModItem frame =                   (ModItem)       new ModItem().setUnlocalizedName(Names.Item.frame);
    public static ModItem infused_diamond =         (ModItem)       new ModItem().setUnlocalizedName(Names.Item.infused_diamond);
    public static ModItem infused_ender =           (ModItem)       new ModItem().setUnlocalizedName(Names.Item.infused_ender);
    public static ModItem infused_iron =            (ModItem)       new ModItem().setUnlocalizedName(Names.Item.infused_iron);
    public static ModItem jetpack =                 (ModItem)       new ModItem().setUnlocalizedName(Names.Item.jetpack);
    public static ModInventory mobile_enderchest =  (ModInventory)  new ModInventory("Portable Bag", 3).setUnlocalizedName(Names.Item.mobile_enderchest);
    public static ModItem network_checker =         (ModItem)       new ModItem().setUnlocalizedName(Names.Item.network_checker);
    public static ModPickaxe op_pickaxe =           (ModPickaxe)    new ModPickaxe(ToolMaterial.EMERALD).setUnlocalizedName(Names.Item.op_pickaxe);
    public static ModItem pink_apple =              (ModItem)       new ModItem().setUnlocalizedName(Names.Item.pink_apple);
    public static ModItem poison_apple =            (ModItem)       new ModItem().setUnlocalizedName(Names.Item.poison_apple);
    public static ModItem swine_meat =              (ModItem)       new ModItem().setUnlocalizedName(Names.Item.swine_meat);
    public static ModItem thruster =                (ModItem)       new ModItem().setUnlocalizedName(Names.Item.thruster);
    public static ModItem ferrum_ingot =            (ModItem)       new ModItem().setUnlocalizedName(Names.Item.ferrum_ingot);
}
