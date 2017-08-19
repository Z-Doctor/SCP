package zdoctor.scp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDeskSmall extends ModelBase
{
  ModelRenderer Block;
  ModelRenderer Block1;
  ModelRenderer Block2;
  ModelRenderer Block3;
  ModelRenderer Block4;
  ModelRenderer Block5;
  ModelRenderer Block6;
  ModelRenderer Block7;
  ModelRenderer Block8;
  
  public ModelDeskSmall()
  {
    this(0.0F);
  }
  
  public ModelDeskSmall(float par1)
  {
    this.Block = new ModelRenderer(this, 0, 0);
    this.Block.setTextureSize(64, 64);
    this.Block.addBox(-8.0F, -16.0F, -8.0F, 16, 1, 16);
    this.Block.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block1 = new ModelRenderer(this, 16, 43);
    this.Block1.setTextureSize(64, 64);
    this.Block1.addBox(-7.0F, -15.0F, -7.0F, 1, 1, 14);
    this.Block1.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block2 = new ModelRenderer(this, 13, 25);
    this.Block2.setTextureSize(64, 64);
    this.Block2.addBox(6.0F, -15.0F, -7.0F, 1, 1, 14);
    this.Block2.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block3 = new ModelRenderer(this, 22, 20);
    this.Block3.setTextureSize(64, 64);
    this.Block3.addBox(-6.0F, -15.0F, -7.0F, 12, 1, 1);
    this.Block3.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block4 = new ModelRenderer(this, 33, 29);
    this.Block4.setTextureSize(64, 64);
    this.Block4.addBox(-6.0F, -15.0F, 6.0F, 12, 1, 1);
    this.Block4.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block5 = new ModelRenderer(this, 8, 20);
    this.Block5.setTextureSize(64, 64);
    this.Block5.addBox(-7.0F, -14.0F, -7.0F, 1, 14, 1);
    this.Block5.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block6 = new ModelRenderer(this, 5, 39);
    this.Block6.setTextureSize(64, 64);
    this.Block6.addBox(-7.0F, -14.0F, 6.0F, 1, 14, 1);
    this.Block6.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block7 = new ModelRenderer(this, 17, 22);
    this.Block7.setTextureSize(64, 64);
    this.Block7.addBox(6.0F, -14.0F, -7.0F, 1, 14, 1);
    this.Block7.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block8 = new ModelRenderer(this, 52, 41);
    this.Block8.setTextureSize(64, 64);
    this.Block8.addBox(-7.0F, -14.0F, 6.0F, 1, 14, 1);
    this.Block8.setRotationPoint(13.0F, 24.0F, 0.0F);
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
  }
}


