package com.featurive.bramcraft.item;

import com.featurive.bramcraft.reference.References;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ModFood extends ItemFood
{
    public ModFood(int heal, boolean b){
        super(heal, b);
        this.setMaxStackSize(1);
        this.isDamageable();
        this.setMaxDamage(32);
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

    @Override
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 8;
    }
}