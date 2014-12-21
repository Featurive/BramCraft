package com.featurive.bramcraft.item;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.References;
import net.minecraft.client.renderer.texture.IIconCreator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ModBow extends ItemBow {
    public ModBow() {
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