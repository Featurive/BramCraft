package com.featurive.bramcraft.item;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.References;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ModAxe extends ItemAxe {
    public ModAxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTab.bc_tab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}