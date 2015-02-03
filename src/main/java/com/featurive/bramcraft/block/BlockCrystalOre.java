package com.featurive.bramcraft.block;

import com.featurive.bramcraft.block.blocks.BlockList;
import com.featurive.bramcraft.block.blocks.ModBlock;
import com.featurive.bramcraft.item.constructor.ItemList;
import com.featurive.bramcraft.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCrystalOre extends ModBlock {
    public BlockCrystalOre(){
        this.setBlockName(Names.Block.crystal_ore);
    }

    public Item getItemDropped(int p_149650_1_, Random rand, int p_149650_3_){
        return ItemList.crystal_gem;
    }

    public int quantityDropped(Random rand){
        return this == BlockList.crystal_ore ? 1 + rand.nextInt(2) : 1;
    }
}
