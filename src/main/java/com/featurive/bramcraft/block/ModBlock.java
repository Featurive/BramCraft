package com.featurive.bramcraft.block;

import com.featurive.bramcraft.creativetab.CreativeTab;
import com.featurive.bramcraft.reference.Messages;
import com.featurive.bramcraft.reference.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
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
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!player.isSneaking()) {
            if (world.isRemote) {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Shift+Right-Click " + EnumChatFormatting.GRAY + "to show " + EnumChatFormatting.AQUA + "BlockBounds"));
            }
        } else {
            if (world.isRemote) {
                player.addChatMessage(new ChatComponentText(EnumChatFormatting.GRAY + "Block: " + EnumChatFormatting.AQUA + world.getBlockState(pos).getBlock().getLocalizedName()));
                player.addChatMessage(new ChatComponentText(Messages.minBlockBoundsX + Double.toString(getBlockBoundsMinX()) + " " + Messages.maxBlockBoundsX + Double.toString(getBlockBoundsMaxX())));
                player.addChatMessage(new ChatComponentText(Messages.minBlockBoundsY + Double.toString(getBlockBoundsMinY()) + " " + Messages.maxBlockBoundsY + Double.toString(getBlockBoundsMaxY())));
                player.addChatMessage(new ChatComponentText(Messages.minBlockBoundsZ + Double.toString(getBlockBoundsMinZ()) + " " + Messages.maxBlockBoundsZ + Double.toString(getBlockBoundsMaxZ())));
            }
        }
        return super.onBlockActivated(world, pos, state, player, facing, hitX, hitY, hitZ);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
