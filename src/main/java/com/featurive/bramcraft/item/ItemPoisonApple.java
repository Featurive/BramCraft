package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModFood;
import com.featurive.bramcraft.reference.Names;

public class ItemPoisonApple extends ModFood {
    public ItemPoisonApple(int heal, boolean ismeat) {
        super(3, false);
        this.setUnlocalizedName(Names.Item.poison_apple);
    }
}
