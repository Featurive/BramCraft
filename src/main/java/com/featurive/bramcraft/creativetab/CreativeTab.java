package com.featurive.bramcraft.creativetab;

import com.featurive.bramcraft.item.constructor.ItemList;
import com.featurive.bramcraft.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
    public final static CreativeTabs bramcraft = new CreativeTabs(References.MOD_ID.toLowerCase()) {
        public Item getTabIconItem() {
            return ItemList.face;
        }
    };
}
