package com.featurive.bramcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCondenser extends ModelBase{
    //fields
    ModelRenderer main;
    ModelRenderer top;
    ModelRenderer right;
    ModelRenderer left;
    ModelRenderer bottom;

    public ModelCondenser(){
        textureWidth = 128;
        textureHeight = 32;

        main = new ModelRenderer(this, 66, 0);
        main.addBox(0F, 0F, 0F, 16, 16, 15);
        main.setRotationPoint(-8F, 8F, -8F);
        main.setTextureSize(128, 32);
        main.mirror = true;
        setRotation(main, 0F, 0F, 0F);
        top = new ModelRenderer(this, 32, 0);
        top.addBox(0F, 0F, 0F, 16, 3, 1);
        top.setRotationPoint(-8F, 21F, 7F);
        top.setTextureSize(128, 32);
        top.mirror = true;
        setRotation(top, 0F, 0F, 0F);
        right = new ModelRenderer(this, 54, 16);
        right.addBox(0F, 0F, 0F, 5, 2, 1);
        right.setRotationPoint(-8F, 19F, 7F);
        right.setTextureSize(128, 32);
        right.mirror = true;
        setRotation(right, 0F, 0F, 0F);
        left = new ModelRenderer(this, 32, 16);
        left.addBox(0F, 0F, 0F, 5, 2, 1);
        left.setRotationPoint(3F, 19F, 7F);
        left.setTextureSize(128, 32);
        left.mirror = true;
        setRotation(left, 0F, 0F, 0F);
        bottom = new ModelRenderer(this, 32, 4);
        bottom.addBox(0F, 0F, 0F, 16, 11, 1);
        bottom.setRotationPoint(-8F, 8F, 7F);
        bottom.setTextureSize(128, 32);
        bottom.mirror = true;
        setRotation(bottom, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        main.render(f5);
        top.render(f5);
        right.render(f5);
        left.render(f5);
        bottom.render(f5);
    }

    public void renderModel(float f5){
        main.render(f5);
        top.render(f5);
        right.render(f5);
        left.render(f5);
        bottom.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z){
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity){
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
