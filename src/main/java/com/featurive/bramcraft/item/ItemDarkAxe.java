package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModAxe;
import com.featurive.bramcraft.item.constructor.ModTools;
import com.featurive.bramcraft.reference.Names;

public class ItemDarkAxe extends ModAxe {
    public ItemDarkAxe(ToolMaterial material) {
        super(ModTools.DARK_IRON);
        this.setUnlocalizedName(Names.Item.dark_axe);
    }
}
