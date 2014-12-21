package com.featurive.bramcraft.creativetab;

import com.featurive.bramcraft.item.ItemList;
import com.featurive.bramcraft.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
    public final static CreativeTabs bc_tab = new CreativeTabs(References.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ItemList.face;
        }
    };
}
