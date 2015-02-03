package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModShovel;
import com.featurive.bramcraft.item.constructor.ModTools;
import com.featurive.bramcraft.reference.Names;

public class ItemDarkShovel extends ModShovel {

    public ItemDarkShovel(ToolMaterial material) {
        super(ModTools.DARK_IRON);
        this.setUnlocalizedName(Names.Item.dark_shovel);
    }
}
