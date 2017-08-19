package zdoctor.scp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSCPQuack extends ModelBase
{
  ModelRenderer Block;
  ModelRenderer Block1;
  ModelRenderer Block2;
  ModelRenderer Block3;
  ModelRenderer Block4;
  ModelRenderer Block5;
  ModelRenderer Block6;
  ModelRenderer Block7;
  
  public ModelSCPQuack()
  {
    this(0.0F);
  }
  
  public ModelSCPQuack(float par1)
  {
    this.Block = new ModelRenderer(this, 2, 10);
    this.Block.setTextureSize(32, 32);
    this.Block.addBox(-2.5F, -5.0F, 2.0F, 5, 8, 3);
    this.Block.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block1 = new ModelRenderer(this, 0, 0);
    this.Block1.setTextureSize(32, 32);
    this.Block1.addBox(-2.0F, -9.0F, -5.0F, 4, 4, 4);
    this.Block1.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block2 = new ModelRenderer(this, 16, 4);
    this.Block2.setTextureSize(32, 32);
    this.Block2.addBox(-2.0F, -7.0F, -7.0F, 4, 2, 2);
    this.Block2.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block3 = new ModelRenderer(this, 20, 13);
    this.Block3.setTextureSize(32, 32);
    this.Block3.addBox(-1.5F, -5.5F, 2.5F, 3, 1, 1);
    this.Block3.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block4 = new ModelRenderer(this, 20, 19);
    this.Block4.setTextureSize(32, 32);
    this.Block4.addBox(-2.5F, -8.5F, -4.5F, 5, 1, 1);
    this.Block4.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block5 = new ModelRenderer(this, 17, 5);
    this.Block5.setTextureSize(32, 32);
    this.Block5.addBox(-2.0F, -6.5F, -7.5F, 4, 1, 1);
    this.Block5.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block6 = new ModelRenderer(this, 3, 11);
    this.Block6.setTextureSize(32, 32);
    this.Block6.addBox(-2.0F, -4.5F, 0.0F, 4, 7, 2);
    this.Block6.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block7 = new ModelRenderer(this, 1, 9);
    this.Block7.setTextureSize(32, 32);
    this.Block7.addBox(-1.5F, -5.5F, 0.5F, 3, 1, 4);
    this.Block7.setRotationPoint(0.0F, 24.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    this.Block.rotateAngleX = 1.570796F;
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
    
    this.Block6.rotateAngleX = 1.570796F;
    this.Block6.rotateAngleY = 0.0F;
    this.Block6.rotateAngleZ = 0.0F;
    this.Block6.renderWithRotation(par7);
    
    this.Block7.rotateAngleX = 1.570796F;
    this.Block7.rotateAngleY = 0.0F;
    this.Block7.rotateAngleZ = 0.0F;
    this.Block7.renderWithRotation(par7);
  }
}


