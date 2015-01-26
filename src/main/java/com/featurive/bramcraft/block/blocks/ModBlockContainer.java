package com.featurive.bramcraft.block.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ModBlockContainer extends ModBlock {
    private String name;
    private boolean customname;
    private int slots;

    public ModBlockContainer(String inventoryName, boolean hasCustomName, int slotCount){
        super(Material.iron);
        name = inventoryName;
        customname = hasCustomName;
        slots = slotCount;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
        InventoryBasic chest = new InventoryBasic(name, customname, slots);
        player.displayGUIChest(chest);

        return true;
    }
}
