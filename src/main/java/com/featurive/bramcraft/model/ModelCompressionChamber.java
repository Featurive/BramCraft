package com.featurive.bramcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCompressionChamber extends ModelBase{
        //fields
        ModelRenderer frontLeftLeg;
        ModelRenderer frontRightLeg;
        ModelRenderer rearRightLeg;
        ModelRenderer rearLeftLeg;
        ModelRenderer leftBeam;
        ModelRenderer rightBeam;
        ModelRenderer frontBeam;
        ModelRenderer rearBeam;
        ModelRenderer frontLeftCorner;
        ModelRenderer frontRightCorner;
        ModelRenderer rearLeftCorner;
        ModelRenderer rearRightCorner;
        ModelRenderer piston;
        ModelRenderer plate;

        public ModelCompressionChamber(){
            textureWidth = 128;
            textureHeight = 32;

            frontLeftLeg = new ModelRenderer(this, 0, 11);
            frontLeftLeg.addBox(0F, 0F, 0F, 4, 2, 4);
            frontLeftLeg.setRotationPoint(-8F, 22F, -8F);
            frontLeftLeg.setTextureSize(128, 32);
            frontLeftLeg.mirror = true;
            setRotation(frontLeftLeg, 0F, 0F, 0F);
            frontRightLeg = new ModelRenderer(this, 16, 11);
            frontRightLeg.addBox(0F, 0F, 0F, 4, 2, 4);
            frontRightLeg.setRotationPoint(4F, 22F, -8F);
            frontRightLeg.setTextureSize(128, 32);
            frontRightLeg.mirror = true;
            setRotation(frontRightLeg, 0F, 0F, 0F);
            rearRightLeg = new ModelRenderer(this, 16, 17);
            rearRightLeg.addBox(0F, 0F, 0F, 4, 2, 4);
            rearRightLeg.setRotationPoint(4F, 22F, 4F);
            rearRightLeg.setTextureSize(128, 32);
            rearRightLeg.mirror = true;
            setRotation(rearRightLeg, 0F, 0F, 0F);
            rearLeftLeg = new ModelRenderer(this, 0, 17);
            rearLeftLeg.addBox(0F, 0F, 0F, 4, 2, 4);
            rearLeftLeg.setRotationPoint(-8F, 22F, 4F);
            rearLeftLeg.setTextureSize(128, 32);
            rearLeftLeg.mirror = true;
            setRotation(rearLeftLeg, 0F, 0F, 0F);
            leftBeam = new ModelRenderer(this, 40, 7);
            leftBeam.addBox(0F, 0F, 0F, 4, 3, 8);
            leftBeam.setRotationPoint(-8F, 19F, -4F);
            leftBeam.setTextureSize(128, 32);
            leftBeam.mirror = true;
            setRotation(leftBeam, 0F, 0F, 0F);
            rightBeam = new ModelRenderer(this, 64, 7);
            rightBeam.addBox(0F, 0F, 0F, 4, 3, 8);
            rightBeam.setRotationPoint(4F, 19F, -4F);
            rightBeam.setTextureSize(128, 32);
            rightBeam.mirror = true;
            setRotation(rightBeam, 0F, 0F, 0F);
            frontBeam = new ModelRenderer(this, 88, 7);
            frontBeam.addBox(0F, 1F, 0F, 16, 3, 4);
            frontBeam.setRotationPoint(-8F, 18F, -8F);
            frontBeam.setTextureSize(128, 32);
            frontBeam.mirror = true;
            setRotation(frontBeam, 0F, 0F, 0F);
            rearBeam = new ModelRenderer(this, 88, 0);
            rearBeam.addBox(0F, 0F, 0F, 16, 3, 4);
            rearBeam.setRotationPoint(-8F, 19F, 4F);
            rearBeam.setTextureSize(128, 32);
            rearBeam.mirror = true;
            setRotation(rearBeam, 0F, 0F, 0F);
            frontLeftCorner = new ModelRenderer(this, 64, 18);
            frontLeftCorner.addBox(0F, 0F, 0F, 3, 11, 3);
            frontLeftCorner.setRotationPoint(-8F, 8F, -8F);
            frontLeftCorner.setTextureSize(128, 32);
            frontLeftCorner.mirror = true;
            setRotation(frontLeftCorner, 0F, 0F, 0F);
            frontRightCorner = new ModelRenderer(this, 76, 18);
            frontRightCorner.addBox(0F, 0F, 0F, 3, 11, 3);
            frontRightCorner.setRotationPoint(5F, 8F, -8F);
            frontRightCorner.setTextureSize(128, 32);
            frontRightCorner.mirror = true;
            setRotation(frontRightCorner, 0F, 0F, 0F);
            rearLeftCorner = new ModelRenderer(this, 52, 18);
            rearLeftCorner.addBox(0F, 0F, 0F, 3, 11, 3);
            rearLeftCorner.setRotationPoint(-8F, 8F, 5F);
            rearLeftCorner.setTextureSize(128, 32);
            rearLeftCorner.mirror = true;
            setRotation(rearLeftCorner, 0F, 0F, 0F);
            rearRightCorner = new ModelRenderer(this, 40, 18);
            rearRightCorner.addBox(0F, 0F, 0F, 3, 11, 3);
            rearRightCorner.setRotationPoint(5F, 8F, 5F);
            rearRightCorner.setTextureSize(128, 32);
            rearRightCorner.mirror = true;
            setRotation(rearRightCorner, 0F, 0F, 0F);
            piston = new ModelRenderer(this, 88, 14);
            piston.addBox(0F, 0F, 0F, 10, 8, 10);
            piston.setRotationPoint(-5F, 8F, -5F);
            piston.setTextureSize(128, 32);
            piston.mirror = true;
            setRotation(piston, 0F, 0F, 0F);
            plate = new ModelRenderer(this, 0, 23);
            plate.addBox(0F, 0F, 0F, 8, 1, 8);
            plate.setRotationPoint(-4F, 21F, -4F);
            plate.setTextureSize(128, 32);
            plate.mirror = true;
            setRotation(plate, 0F, 0F, 0F);
        }
        public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
            super.render(entity, f, f1, f2, f3, f4, f5);
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            frontLeftLeg.render(f5);
            frontRightLeg.render(f5);
            rearRightLeg.render(f5);
            rearLeftLeg.render(f5);
            leftBeam.render(f5);
            rightBeam.render(f5);
            frontBeam.render(f5);
            rearBeam.render(f5);
            frontLeftCorner.render(f5);
            frontRightCorner.render(f5);
            rearLeftCorner.render(f5);
            rearRightCorner.render(f5);
            piston.render(f5);
            plate.render(f5);
        }

        public void renderModel(float f5){
            frontLeftLeg.render(f5);
            frontRightLeg.render(f5);
            rearRightLeg.render(f5);
            rearLeftLeg.render(f5);
            leftBeam.render(f5);
            rightBeam.render(f5);
            frontBeam.render(f5);
            rearBeam.render(f5);
            frontLeftCorner.render(f5);
            frontRightCorner.render(f5);
            rearLeftCorner.render(f5);
            rearRightCorner.render(f5);
            piston.render(f5);
            plate.render(f5);
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
