package com.featurive.bramcraft.model.render;

import com.featurive.bramcraft.model.ModelCompressionChamber;
import com.featurive.bramcraft.reference.References;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderCompressionChamber extends TileEntitySpecialRenderer {

    ResourceLocation texture = new ResourceLocation(References.MOD_ID.toLowerCase() + ":" + "textures/models/compression_chamber.png");

    private ModelCompressionChamber model;

    public RenderCompressionChamber(){
        this.model = new ModelCompressionChamber();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
            GL11.glRotatef(180, 0F, 0F, 1F);

            this.bindTexture(texture);

            GL11.glPushMatrix();
            this.model.renderModel(0.0625f);
            GL11.glPopMatrix();
        GL11.glPopMatrix();

    }
}
