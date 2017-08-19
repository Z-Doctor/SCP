package zdoctor.scp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelButtonOn extends ModelBase
{
  ModelRenderer Block;
  ModelRenderer Block1;
  ModelRenderer Block2;
  ModelRenderer Block3;
  ModelRenderer Block4;
  
  public ModelButtonOn()
  {
    this(0.0F);
  }
  
  public ModelButtonOn(float par1)
  {
    this.Block = new ModelRenderer(this, 4, 4);
    this.Block.setTextureSize(32, 32);
    this.Block.addBox(-2.0F, -11.0F, -1.0F, 4, 6, 1);
    this.Block.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block1 = new ModelRenderer(this, 15, 15);
    this.Block1.setTextureSize(32, 32);
    this.Block1.addBox(-1.5F, -10.75F, -1.25F, 3, 2, 1);
    this.Block1.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block2 = new ModelRenderer(this, 4, 12);
    this.Block2.setTextureSize(32, 32);
    this.Block2.addBox(-1.5F, -8.5F, -1.5F, 3, 3, 1);
    this.Block2.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block3 = new ModelRenderer(this, 5, 17);
    this.Block3.setTextureSize(32, 32);
    this.Block3.addBox(-1.0F, -8.0F, -1.6F, 2, 2, 1);
    this.Block3.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block4 = new ModelRenderer(this, 15, 18);
    this.Block4.setTextureSize(32, 32);
    this.Block4.addBox(-1.0F, -8.0F, -1.25F, 2, 2, 1);
    this.Block4.setRotationPoint(0.0F, 24.0F, -0.25F);
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
  }
}


