package com.featurive.bramcraft.block.blocks;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block {
    public ModBlock(Material material){
        super(material);
        this.setCreativeTab(CreativeTab.bc_tab);
        this.setHardness(1.5F);
    }

    public ModBlock(){
        this(Material.rock);
        this.setHardness(1.5F);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
