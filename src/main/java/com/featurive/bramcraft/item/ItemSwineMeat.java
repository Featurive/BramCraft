package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModFood;
import com.featurive.bramcraft.reference.Names;

public class ItemSwineMeat extends ModFood {
    public ItemSwineMeat(int heal, boolean ismeat) {
        super(6, true);
        this.setUnlocalizedName(Names.Item.swine_meat);
    }
}
