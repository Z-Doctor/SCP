package zdoctor.scp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSCP173 extends ModelBase
{
  ModelRenderer head;
  ModelRenderer neck;
  ModelRenderer torso;
  ModelRenderer leg;
  ModelRenderer leg1;
  ModelRenderer arm;
  ModelRenderer arm1;
  ModelRenderer eye;
  ModelRenderer eye1;
  
  public ModelSCP173()
  {
    this(0.0F);
  }
  
  public ModelSCP173(float par1)
  {
    this.head = new ModelRenderer(this, 54, 39);
    this.head.setTextureSize(128, 128);
    this.head.addBox(-5.5F, -45.0F, -5.5F, 11, 14, 11);
    this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.neck = new ModelRenderer(this, 13, 48);
    this.neck.setTextureSize(128, 128);
    this.neck.addBox(-4.0F, -31.5F, -4.0F, 8, 3, 8);
    this.neck.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.torso = new ModelRenderer(this, 14, 7);
    this.torso.setTextureSize(128, 128);
    this.torso.addBox(-4.5F, -29.0F, -4.5F, 9, 18, 9);
    this.torso.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.leg = new ModelRenderer(this, 63, 16);
    this.leg.setTextureSize(128, 128);
    this.leg.addBox(-5.0F, -11.0F, -2.0F, 4, 11, 4);
    this.leg.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 90, 14);
    this.leg1.setTextureSize(128, 128);
    this.leg1.addBox(1.0F, -11.0F, -2.0F, 4, 11, 4);
    this.leg1.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.arm = new ModelRenderer(this, 89, 71);
    this.arm.setTextureSize(128, 128);
    this.arm.addBox(4.0F, -26.0F, -9.5F, 4, 4, 11);
    this.arm.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.arm1 = new ModelRenderer(this, 89, 71);
    this.arm1.setTextureSize(128, 128);
    this.arm1.addBox(-8.0F, -26.0F, -9.5F, 4, 4, 11);
    this.arm1.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.eye = new ModelRenderer(this, 76, 71);
    this.eye.setTextureSize(128, 128);
    this.eye.addBox(3.0F, -40.5F, -5.6F, 2, 2, 2);
    this.eye.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.eye1 = new ModelRenderer(this, 67, 71);
    this.eye1.setTextureSize(128, 128);
    this.eye1.addBox(-5.0F, -40.5F, -5.6F, 2, 2, 2);
    this.eye1.setRotationPoint(0.0F, 24.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    this.head.rotateAngleX = 0.0F;
    this.head.rotateAngleY = 0.0F;
    this.head.rotateAngleZ = 0.0F;
    this.head.renderWithRotation(par7);
    
    this.neck.rotateAngleX = 0.0F;
    this.neck.rotateAngleY = 0.0F;
    this.neck.rotateAngleZ = 0.0F;
    this.neck.renderWithRotation(par7);
    
    this.torso.rotateAngleX = 0.0F;
    this.torso.rotateAngleY = 0.0F;
    this.torso.rotateAngleZ = 0.0F;
    this.torso.renderWithRotation(par7);
    
    this.leg.rotateAngleX = 0.0F;
    this.leg.rotateAngleY = 0.0F;
    this.leg.rotateAngleZ = 0.0F;
    this.leg.renderWithRotation(par7);
    
    this.leg1.rotateAngleX = 0.0F;
    this.leg1.rotateAngleY = 0.0F;
    this.leg1.rotateAngleZ = 0.0F;
    this.leg1.renderWithRotation(par7);
    
    this.arm.rotateAngleX = 0.0F;
    this.arm.rotateAngleY = 0.0F;
    this.arm.rotateAngleZ = 0.0F;
    this.arm.renderWithRotation(par7);
    
    this.arm1.rotateAngleX = 0.0F;
    this.arm1.rotateAngleY = 0.0F;
    this.arm1.rotateAngleZ = 0.0F;
    this.arm1.renderWithRotation(par7);
    
    this.eye.rotateAngleX = 0.0F;
    this.eye.rotateAngleY = 0.0F;
    this.eye.rotateAngleZ = 0.0F;
    this.eye.renderWithRotation(par7);
    
    this.eye1.rotateAngleX = 0.0F;
    this.eye1.rotateAngleY = 0.0F;
    this.eye1.rotateAngleZ = 0.0F;
    this.eye1.renderWithRotation(par7);
  }
}


