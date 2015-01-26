package com.featurive.bramcraft.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityMine extends TileEntity{
    private int time = 100;

    @Override
    public void updateContainingBlockInfo() {
        time--;
        double x = new Integer(pos.getX()).doubleValue();
        double y = new Integer(pos.getY()).doubleValue();
        double z = new Integer(pos.getZ()).doubleValue();
        if(time == 0 && !worldObj.isRemote){
            worldObj.createExplosion(null, x, y, z, 4.0F, true);
        }
    }
}
