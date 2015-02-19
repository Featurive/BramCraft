package com.featurive.bramcraft.item.constructor;

import com.featurive.bramcraft.item.*;

public class ItemList extends ModItem {
    public static ModFood bacon = new ItemBacon(7, true);
    public static ModBow crossbow = new ItemCrossbow();
    public static ModItem crystal_gem = new ItemCrystalGem();
    public static ModPickaxe crystal_pickaxe = new ItemCrystalPickaxe(ModTools.CRYSTAL);
    public static ModAxe dark_axe = new ItemDarkAxe(ModTools.DARK_IRON);
    public static ModItem dark_ingot = new ItemDarkIngot();
    public static ModPickaxe dark_pickaxe = new ItemDarkPickaxe(ModTools.DARK_IRON);
    public static ModShovel dark_shovel = new ItemDarkShovel(ModTools.DARK_IRON);
    public static ModSword dark_sword = new ItemDarkSword(ModTools.DARK_IRON);
    public static ModItem face = new ItemFace();
    public static ModItem frame = new ItemFrame();
    public static ModItem infused_diamond = new ItemInfusedDiamond();
    public static ModItem infused_ender = new ItemInfusedEnder();
    public static ModItem infused_iron = new ItemInfusedIron();
    public static ModItem jetpack = new ItemJetpack();
    public static ModPickaxe op_pickaxe = new ItemOpPickaxe(ModTools.OP);
    public static ModFood poison_apple = new ItemPoisonApple(4, false);
    public static ModFood swine_meat = new ItemSwineMeat(6, true);
    public static ModItem thruster = new ItemThruster();
    public static ModItem ferrum_ingot = new ItemFerrumIngot();
    public static ModInventoryItem mobile_enderchest = new ItemMobileEnderchest();
}
