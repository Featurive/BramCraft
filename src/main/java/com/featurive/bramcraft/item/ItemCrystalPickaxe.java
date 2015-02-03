package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModPickaxe;
import com.featurive.bramcraft.item.constructor.ModTools;
import com.featurive.bramcraft.reference.Names;

public class ItemCrystalPickaxe extends ModPickaxe{
    public ItemCrystalPickaxe(ToolMaterial material) {
        super(ModTools.CRYSTAL);
        this.setUnlocalizedName(Names.Item.crystal_pickaxe);
    }
}
