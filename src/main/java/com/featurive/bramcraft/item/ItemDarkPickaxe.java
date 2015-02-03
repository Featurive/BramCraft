package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModPickaxe;
import com.featurive.bramcraft.item.constructor.ModTools;
import com.featurive.bramcraft.reference.Names;

public class ItemDarkPickaxe extends ModPickaxe {

    public ItemDarkPickaxe(ToolMaterial material) {
        super(ModTools.DARK_IRON);
        this.setUnlocalizedName(Names.Item.dark_pickaxe);
    }
}
