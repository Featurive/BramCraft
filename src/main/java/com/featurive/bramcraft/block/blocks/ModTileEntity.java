package com.featurive.bramcraft.block.blocks;

import com.featurive.bramcraft.creativetab.CreativeTab;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class ModTileEntity extends BlockContainer {
    public ModTileEntity(Material material){
        super(material);
        this.setCreativeTab(CreativeTab.bc_tab);
        this.setHardness(1.5F);
    }

    public ModTileEntity(){
        this(Material.rock);
        this.setHardness(1.5F);
    }
}
