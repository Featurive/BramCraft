package com.featurive.bramcraft.item.constructor;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools {
    public final static ToolMaterial CRYSTAL = EnumHelper.addToolMaterial("CRYSTAL", 3, 1000, 4F, 5F, 10);
    public final static ToolMaterial DARK_IRON = EnumHelper.addToolMaterial("DARK", 3, 1500, 8F, 6F, 12);
    public final static ToolMaterial OP = EnumHelper.addToolMaterial("OP", 3, 2000, 30F, 30F, 22);
}
