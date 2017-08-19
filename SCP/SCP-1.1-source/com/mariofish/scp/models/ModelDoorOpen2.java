package zdoctor.scp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDoorOpen2 extends ModelBase
{
  ModelRenderer Block;
  ModelRenderer Block1;
  ModelRenderer Block2;
  ModelRenderer doortree;
  ModelRenderer Block3;
  ModelRenderer Block4;
  ModelRenderer Block5;
  ModelRenderer Block6;
  ModelRenderer Block7;
  ModelRenderer Block8;
  ModelRenderer Block9;
  ModelRenderer Block10;
  ModelRenderer Block11;
  ModelRenderer Block12;
  ModelRenderer Block13;
  ModelRenderer Block14;
  
  public ModelDoorOpen2()
  {
    this(0.0F);
  }
  
  public ModelDoorOpen2(float par1)
  {
    this.Block = new ModelRenderer(this, 2, 50);
    this.Block.setTextureSize(128, 128);
    this.Block.addBox(-8.0F, -32.5F, -6.5F, 16, 1, 13);
    this.Block.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block1 = new ModelRenderer(this, 17, 3);
    this.Block1.setTextureSize(128, 128);
    this.Block1.addBox(-8.5F, -32.0F, -6.5F, 1, 32, 13);
    this.Block1.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block2 = new ModelRenderer(this, 17, 3);
    this.Block2.setTextureSize(128, 128);
    this.Block2.addBox(7.5F, -32.0F, -6.5F, 1, 32, 13);
    this.Block2.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.doortree = new ModelRenderer(this, 54, 12);
    this.doortree.setTextureSize(128, 128);
    this.doortree.addBox(-22.0F, -32.0F, -1.5F, 16, 32, 3);
    this.doortree.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block3 = new ModelRenderer(this, 90, 55);
    this.Block3.setTextureSize(128, 128);
    this.Block3.addBox(-6.5F, -30.5F, 1.0F, 13, 1, 2);
    this.Block3.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block4 = new ModelRenderer(this, 63, 49);
    this.Block4.setTextureSize(128, 128);
    this.Block4.addBox(-5.5F, -25.5F, 1.0F, 11, 1, 2);
    this.Block4.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block5 = new ModelRenderer(this, 76, 69);
    this.Block5.setTextureSize(128, 128);
    this.Block5.addBox(1.5F, -24.5F, 1.5F, 1, 1, 1);
    this.Block5.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block6 = new ModelRenderer(this, 76, 69);
    this.Block6.setTextureSize(128, 128);
    this.Block6.addBox(-2.5F, -24.5F, 1.5F, 1, 1, 1);
    this.Block6.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block7 = new ModelRenderer(this, 62, 57);
    this.Block7.setTextureSize(128, 128);
    this.Block7.addBox(-5.5F, -14.5F, 1.0F, 11, 1, 2);
    this.Block7.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block8 = new ModelRenderer(this, 76, 69);
    this.Block8.setTextureSize(128, 128);
    this.Block8.addBox(-2.5F, -13.5F, 1.5F, 1, 1, 1);
    this.Block8.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block9 = new ModelRenderer(this, 76, 61);
    this.Block9.setTextureSize(128, 128);
    this.Block9.addBox(-5.5F, -5.5F, 1.0F, 11, 1, 2);
    this.Block9.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block10 = new ModelRenderer(this, 76, 69);
    this.Block10.setTextureSize(128, 128);
    this.Block10.addBox(1.5F, -5.0F, 1.5F, 1, 1, 1);
    this.Block10.setRotationPoint(-14.0F, 24.5F, 0.0F);
    this.Block11 = new ModelRenderer(this, 76, 69);
    this.Block11.setTextureSize(128, 128);
    this.Block11.addBox(-2.5F, -5.0F, 1.5F, 1, 1, 1);
    this.Block11.setRotationPoint(-14.0F, 24.5F, 0.0F);
    this.Block12 = new ModelRenderer(this, 91, 50);
    this.Block12.setTextureSize(128, 128);
    this.Block12.addBox(-6.5F, -0.5F, 1.0F, 13, 1, 2);
    this.Block12.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block13 = new ModelRenderer(this, 62, 61);
    this.Block13.setTextureSize(128, 128);
    this.Block13.addBox(5.5F, -29.5F, 1.0F, 1, 29, 2);
    this.Block13.setRotationPoint(-14.0F, 24.0F, 0.0F);
    this.Block14 = new ModelRenderer(this, 68, 61);
    this.Block14.setTextureSize(128, 128);
    this.Block14.addBox(-6.5F, -29.5F, 1.0F, 1, 29, 2);
    this.Block14.setRotationPoint(-14.0F, 24.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    this.Block.rotateAngleX = 0.0F;
    this.Block.rotateAngleY = 0.0F;
    this.Block.rotateAngleZ = 0.0F;
    this.Block.renderWithRotation(par7);
    
    this.Block1.rotateAngleX = 0.0F;
    this.Block1.rotateAngleY = 0.0F;
    this.Block1.rotateAngleZ = 0.0F;
    this.Block1.renderWithRotation(par7);
    
    this.Block2.rotateAngleX = 0.0F;
    this.Block2.rotateAngleY = 0.0F;
    this.Block2.rotateAngleZ = 0.0F;
    this.Block2.renderWithRotation(par7);
    
    this.doortree.rotateAngleX = 0.0F;
    this.doortree.rotateAngleY = 0.0F;
    this.doortree.rotateAngleZ = 0.0F;
    this.doortree.renderWithRotation(par7);
    
    this.Block3.rotateAngleX = 0.0F;
    this.Block3.rotateAngleY = 0.0F;
    this.Block3.rotateAngleZ = 0.0F;
    this.Block3.renderWithRotation(par7);
    
    this.Block4.rotateAngleX = 0.0F;
    this.Block4.rotateAngleY = 0.0F;
    this.Block4.rotateAngleZ = 0.0F;
    this.Block4.renderWithRotation(par7);
    
    this.Block5.rotateAngleX = 0.0F;
    this.Block5.rotateAngleY = 0.0F;
    this.Block5.rotateAngleZ = 0.0F;
    this.Block5.renderWithRotation(par7);
    
    this.Block6.rotateAngleX = 0.0F;
    this.Block6.rotateAngleY = 0.0F;
    this.Block6.rotateAngleZ = 0.0F;
    this.Block6.renderWithRotation(par7);
    
    this.Block7.rotateAngleX = 0.0F;
    this.Block7.rotateAngleY = 0.0F;
    this.Block7.rotateAngleZ = 0.0F;
    this.Block7.renderWithRotation(par7);
    
    this.Block8.rotateAngleX = 0.0F;
    this.Block8.rotateAngleY = 0.0F;
    this.Block8.rotateAngleZ = 0.0F;
    this.Block8.renderWithRotation(par7);
    
    this.Block9.rotateAngleX = 0.0F;
    this.Block9.rotateAngleY = 0.0F;
    this.Block9.rotateAngleZ = 0.0F;
    this.Block9.renderWithRotation(par7);
    
    this.Block10.rotateAngleX = 0.0F;
    this.Block10.rotateAngleY = 0.0F;
    this.Block10.rotateAngleZ = 0.0F;
    this.Block10.renderWithRotation(par7);
    
    this.Block11.rotateAngleX = 0.0F;
    this.Block11.rotateAngleY = 0.0F;
    this.Block11.rotateAngleZ = 0.0F;
    this.Block11.renderWithRotation(par7);
    
    this.Block12.rotateAngleX = 0.0F;
    this.Block12.rotateAngleY = 0.0F;
    this.Block12.rotateAngleZ = 0.0F;
    this.Block12.renderWithRotation(par7);
    
    this.Block13.rotateAngleX = 0.0F;
    this.Block13.rotateAngleY = 0.0F;
    this.Block13.rotateAngleZ = 0.0F;
    this.Block13.renderWithRotation(par7);
    
    this.Block14.rotateAngleX = 0.0F;
    this.Block14.rotateAngleY = 0.0F;
    this.Block14.rotateAngleZ = 0.0F;
    this.Block14.renderWithRotation(par7);
  }
}


