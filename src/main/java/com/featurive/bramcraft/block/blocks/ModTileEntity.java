package com.featurive.bramcraft.block.blocks;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import java.util.List;

public abstract class ModTileEntity extends BlockContainer {
    List<String> list;
    public ModTileEntity(Material material){
        super(material);
        this.setCreativeTab(CreativeTab.bramcraft);
        this.setHardness(1.5F);
    }

    public ModTileEntity(){
        this(Material.rock);
        this.setHardness(1.5F);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
