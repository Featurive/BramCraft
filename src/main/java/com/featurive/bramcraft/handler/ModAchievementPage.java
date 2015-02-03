package com.featurive.bramcraft.handler;

import com.featurive.bramcraft.reference.Achievements;
import com.featurive.bramcraft.reference.References;
import net.minecraftforge.common.AchievementPage;

public class ModAchievementPage {
    public static void init(){
        AchievementPage pageBramCraft = new AchievementPage(References.MOD_NAME,
                Achievements.mineCrystalOre,
                Achievements.smeltDarkIron,
                Achievements.buildCrystalPickaxe,
                Achievements.buildInfusedIron,
                Achievements.openMobileEnderChest,
                Achievements.buildFace);
        AchievementPage.registerAchievementPage(pageBramCraft);
    }
}
