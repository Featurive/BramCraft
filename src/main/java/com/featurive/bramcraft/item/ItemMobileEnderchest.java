package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModInventoryItem;
import com.featurive.bramcraft.reference.Names;
import com.featurive.bramcraft.reference.Type;

public class ItemMobileEnderchest extends ModInventoryItem {
    public ItemMobileEnderchest() {
        super("Mobile Enderchest", 27, Type.enderchest);
        this.setUnlocalizedName(Names.Item.mobile_enderchest);
    }
}
