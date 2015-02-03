package com.featurive.bramcraft.item;

import com.featurive.bramcraft.item.constructor.ModPickaxe;
import com.featurive.bramcraft.item.constructor.ModTools;
import com.featurive.bramcraft.reference.Names;

public class ItemOpPickaxe extends ModPickaxe {
    public ItemOpPickaxe(ToolMaterial material) {
        super(ModTools.OP);
        this.setUnlocalizedName(Names.Item.op_pickaxe);
    }
}
