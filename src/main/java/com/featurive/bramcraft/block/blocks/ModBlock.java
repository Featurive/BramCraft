package com.featurive.bramcraft.block.blocks;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.Messages;
import com.featurive.bramcraft.reference.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ModBlock extends Block {
    public ModBlock(Material material) {
        super(material);
        this.setCreativeTab(CreativeTab.bc_tab);
        this.setHardness(1.5F);
    }

    public ModBlock() {
        this(Material.rock);
        this.setCreativeTab(CreativeTab.bc_tab);
        this.setHardness(1.5F);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!player.isSneaking()) {
            if (world.isRemote) {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Shift+Right-Click " + EnumChatFormatting.GRAY + "to show " + EnumChatFormatting.AQUA + "BlockBounds"));
            }
        } else {
            if (world.isRemote) {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GRAY + "Block: " + EnumChatFormatting.AQUA + world.getBlock(x, y, z).getLocalizedName()));
                player.addChatMessage(new ChatComponentText(Messages.minBlockBoundsX + Double.toString(getBlockBoundsMinX()) + " " + Messages.maxBlockBoundsX + Double.toString(getBlockBoundsMaxX())));
                player.addChatMessage(new ChatComponentText(Messages.minBlockBoundsY + Double.toString(getBlockBoundsMinY()) + " " + Messages.maxBlockBoundsY + Double.toString(getBlockBoundsMaxY())));
                player.addChatMessage(new ChatComponentText(Messages.minBlockBoundsZ + Double.toString(getBlockBoundsMinZ()) + " " + Messages.maxBlockBoundsZ + Double.toString(getBlockBoundsMaxZ())));
            }
        }
        return false;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
