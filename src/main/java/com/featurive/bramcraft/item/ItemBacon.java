package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModFood;
import com.featurive.bramcraft.reference.Names;

public class ItemBacon extends ModFood {
    public ItemBacon(int heal, boolean ismeat) {
        super(8, false);
        this.setUnlocalizedName(Names.Item.dark_axe);
    }
}
