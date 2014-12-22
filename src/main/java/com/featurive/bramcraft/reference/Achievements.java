package com.featurive.bramcraft.reference;

import com.featurive.bramcraft.block.BlockList;
import com.featurive.bramcraft.item.ItemList;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;

public class Achievements {
    public static Achievement mineCrystalOre = (Achievement) new Achievement("mineCrystalOre",
            // Name
            "mineCrystalOre",
            // Coords
            0, 0,
            // Icon
            new ItemStack(BlockList.crystal_ore),
            // Dependency
            null).initIndependentStat().registerStat();
    public static Achievement smeltDarkIron = (Achievement) new Achievement("smeltDarkIron",
            // Name
            "smeltDarkIron",
            // Coords
            2, 0,
            // Icon
            new ItemStack(ItemList.dark_iron),
            // Dependency
            Achievements.mineCrystalOre).registerStat();
    public static Achievement buildCrystalPickaxe = (Achievement) new Achievement("buildCrystalPickaxe",
            // Name
            "buildCrystalPickaxe",
            // Coords
            1, 2,
            // Icon
            new ItemStack(ItemList.crystal_pickaxe),
            // Dependency
            mineCrystalOre).registerStat();
    public static Achievement buildInfusedIron = (Achievement) new Achievement("buildInfusedIron",
            // Name
            "buildInfusedIron",
            // Coords
            -2, 1,
            // Icon
            new ItemStack(ItemList.infused_iron),
            // Dependency
            mineCrystalOre).registerStat();
    public static Achievement openMobileEnderChest = (Achievement) new Achievement("openMobileEnderChest",
            // Name
            "openMobileEnderChest",
            // Coords
            1, -2,
            // Icon
            new ItemStack(ItemList.mobile_enderchest),
            // Dependency
            null).initIndependentStat().registerStat();
    public static Achievement buildFace = (Achievement) new Achievement("buildFace",
            // Name
            "buildFace",
            // Coords
            -2, -3,
            // Icon
            new ItemStack(ItemList.face),
            // Dependency
            mineCrystalOre).registerStat();
}
