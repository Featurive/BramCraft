package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModSword;
import com.featurive.bramcraft.item.constructor.ModTools;
import com.featurive.bramcraft.reference.Names;

public class ItemDarkSword extends ModSword {

    public ItemDarkSword(ToolMaterial material) {
        super(ModTools.DARK_IRON);
        this.setUnlocalizedName(Names.Item.dark_sword);
    }
}
