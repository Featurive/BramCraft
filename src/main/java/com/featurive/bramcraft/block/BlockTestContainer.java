package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.ModBlockContainer;
import com.featurive.bramcraft.reference.Names;

public class BlockTestContainer extends ModBlockContainer {
    public BlockTestContainer(String inventoryName, boolean hasCustomName, int slotCount) {
        super(inventoryName, hasCustomName, slotCount);
        this.setUnlocalizedName(Names.Block.test_container);
    }
}
