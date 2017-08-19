package zdoctor.scp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSCP079 extends ModelBase
{
  ModelRenderer Block1;
  ModelRenderer Block11;
  ModelRenderer Block12;
  ModelRenderer Block13;
  ModelRenderer Block14;
  ModelRenderer Block15;
  ModelRenderer Block16;
  ModelRenderer Block17;
  ModelRenderer Block18;
  ModelRenderer Block19;
  ModelRenderer Block110;
  ModelRenderer Block111;
  ModelRenderer Block112;
  ModelRenderer Block113;
  ModelRenderer Block114;
  ModelRenderer Block115;
  ModelRenderer Block116;
  ModelRenderer Block117;
  ModelRenderer Block118;
  ModelRenderer Block119;
  
  public ModelSCP079()
  {
    this(0.0F);
  }
  
  public ModelSCP079(float par1)
  {
    this.Block1 = new ModelRenderer(this, 29, 4);
    this.Block1.setTextureSize(64, 64);
    this.Block1.addBox(-1.0F, -8.0F, 1.0F, 8, 8, 6);
    this.Block1.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block11 = new ModelRenderer(this, 28, 21);
    this.Block11.setTextureSize(64, 64);
    this.Block11.addBox(-4.0F, -2.0F, 0.0F, 8, 2, 1);
    this.Block11.setRotationPoint(3.0F, 24.0F, 0.0F);
    this.Block12 = new ModelRenderer(this, 3, 19);
    this.Block12.setTextureSize(64, 64);
    this.Block12.addBox(-4.0F, -8.0F, 0.0F, 8, 1, 1);
    this.Block12.setRotationPoint(3.0F, 24.0F, 0.0F);
    this.Block13 = new ModelRenderer(this, 10, 11);
    this.Block13.setTextureSize(64, 64);
    this.Block13.addBox(-4.0F, -7.0F, 0.0F, 1, 5, 1);
    this.Block13.setRotationPoint(3.0F, 24.0F, 0.0F);
    this.Block14 = new ModelRenderer(this, 18, 11);
    this.Block14.setTextureSize(64, 64);
    this.Block14.addBox(3.0F, -7.0F, 0.0F, 1, 5, 1);
    this.Block14.setRotationPoint(3.0F, 24.0F, 0.0F);
    this.Block15 = new ModelRenderer(this, 4, 25);
    this.Block15.setTextureSize(64, 64);
    this.Block15.addBox(-2.0F, -2.0F, -3.0F, 8, 2, 2);
    this.Block15.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Block16 = new ModelRenderer(this, 2, 32);
    this.Block16.setTextureSize(64, 64);
    this.Block16.addBox(-4.0F, -1.0F, -7.0F, 8, 1, 4);
    this.Block16.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block17 = new ModelRenderer(this, 26, 25);
    this.Block17.setTextureSize(64, 64);
    this.Block17.addBox(-3.5F, -1.5F, -6.5F, 7, 1, 4);
    this.Block17.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block18 = new ModelRenderer(this, 42, 31);
    this.Block18.setTextureSize(64, 64);
    this.Block18.addBox(-3.0F, -1.6F, -6.3F, 6, 1, 3);
    this.Block18.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block19 = new ModelRenderer(this, 23, 33);
    this.Block19.setTextureSize(64, 64);
    this.Block19.addBox(7.5F, -1.0F, -5.5F, 3, 1, 5);
    this.Block19.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block110 = new ModelRenderer(this, 42, 36);
    this.Block110.setTextureSize(64, 64);
    this.Block110.addBox(8.5F, -0.5F, -0.5F, 1, 1, 5);
    this.Block110.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block111 = new ModelRenderer(this, 32, 43);
    this.Block111.setTextureSize(64, 64);
    this.Block111.addBox(5.0F, -0.5F, 4.5F, 4, 1, 1);
    this.Block111.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block112 = new ModelRenderer(this, 32, 43);
    this.Block112.setTextureSize(64, 64);
    this.Block112.addBox(-7.0F, -0.5F, 3.5F, 4, 1, 1);
    this.Block112.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block113 = new ModelRenderer(this, 44, 38);
    this.Block113.setTextureSize(64, 64);
    this.Block113.addBox(-7.5F, -0.5F, 0.5F, 1, 1, 3);
    this.Block113.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block114 = new ModelRenderer(this, 4, 42);
    this.Block114.setTextureSize(64, 64);
    this.Block114.addBox(-12.5F, -2.0F, -5.0F, 7, 2, 6);
    this.Block114.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block115 = new ModelRenderer(this, 2, 42);
    this.Block115.setTextureSize(64, 64);
    this.Block115.addBox(-7.5F, -1.5F, -6.0F, 1, 1, 2);
    this.Block115.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block116 = new ModelRenderer(this, 2, 42);
    this.Block116.setTextureSize(64, 64);
    this.Block116.addBox(-9.5F, -1.5F, -6.0F, 1, 1, 2);
    this.Block116.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block117 = new ModelRenderer(this, 2, 42);
    this.Block117.setTextureSize(64, 64);
    this.Block117.addBox(-11.5F, -1.5F, -6.0F, 1, 1, 2);
    this.Block117.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block118 = new ModelRenderer(this, 26, 40);
    this.Block118.setTextureSize(64, 64);
    this.Block118.addBox(4.1F, -7.5F, 3.0F, 1, 1, 2);
    this.Block118.setRotationPoint(2.0F, 24.0F, 0.0F);
    this.Block119 = new ModelRenderer(this, 45, 45);
    this.Block119.setTextureSize(64, 64);
    this.Block119.addBox(-0.5F, -7.5F, 0.25F, 7, 7, 1);
    this.Block119.setRotationPoint(0.0F, 24.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    this.Block1.rotateAngleX = 0.0F;
    this.Block1.rotateAngleY = 0.0F;
    this.Block1.rotateAngleZ = 0.0F;
    this.Block1.renderWithRotation(par7);
    
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
    
    this.Block15.rotateAngleX = 0.0F;
    this.Block15.rotateAngleY = 0.0F;
    this.Block15.rotateAngleZ = 0.0F;
    this.Block15.renderWithRotation(par7);
    
    this.Block16.rotateAngleX = 0.0F;
    this.Block16.rotateAngleY = 0.0F;
    this.Block16.rotateAngleZ = 0.0F;
    this.Block16.renderWithRotation(par7);
    
    this.Block17.rotateAngleX = 0.0F;
    this.Block17.rotateAngleY = 0.0F;
    this.Block17.rotateAngleZ = 0.0F;
    this.Block17.renderWithRotation(par7);
    
    this.Block18.rotateAngleX = 0.0F;
    this.Block18.rotateAngleY = 0.0F;
    this.Block18.rotateAngleZ = 0.0F;
    this.Block18.renderWithRotation(par7);
    
    this.Block19.rotateAngleX = 0.0F;
    this.Block19.rotateAngleY = 0.0F;
    this.Block19.rotateAngleZ = 0.0F;
    this.Block19.renderWithRotation(par7);
    
    this.Block110.rotateAngleX = 0.0F;
    this.Block110.rotateAngleY = 0.0F;
    this.Block110.rotateAngleZ = 0.0F;
    this.Block110.renderWithRotation(par7);
    
    this.Block111.rotateAngleX = 0.0F;
    this.Block111.rotateAngleY = 0.0F;
    this.Block111.rotateAngleZ = 0.0F;
    this.Block111.renderWithRotation(par7);
    
    this.Block112.rotateAngleX = 0.0F;
    this.Block112.rotateAngleY = 0.0F;
    this.Block112.rotateAngleZ = 0.0F;
    this.Block112.renderWithRotation(par7);
    
    this.Block113.rotateAngleX = 0.0F;
    this.Block113.rotateAngleY = 0.0F;
    this.Block113.rotateAngleZ = 0.0F;
    this.Block113.renderWithRotation(par7);
    
    this.Block114.rotateAngleX = 0.0F;
    this.Block114.rotateAngleY = 0.0F;
    this.Block114.rotateAngleZ = 0.0F;
    this.Block114.renderWithRotation(par7);
    
    this.Block115.rotateAngleX = 0.0F;
    this.Block115.rotateAngleY = 0.0F;
    this.Block115.rotateAngleZ = 0.0F;
    this.Block115.renderWithRotation(par7);
    
    this.Block116.rotateAngleX = 0.0F;
    this.Block116.rotateAngleY = 0.0F;
    this.Block116.rotateAngleZ = 0.0F;
    this.Block116.renderWithRotation(par7);
    
    this.Block117.rotateAngleX = 0.0F;
    this.Block117.rotateAngleY = 0.0F;
    this.Block117.rotateAngleZ = 0.0F;
    this.Block117.renderWithRotation(par7);
    
    this.Block118.rotateAngleX = 0.0F;
    this.Block118.rotateAngleY = 0.0F;
    this.Block118.rotateAngleZ = 0.0F;
    this.Block118.renderWithRotation(par7);
    
    this.Block119.rotateAngleX = 0.0F;
    this.Block119.rotateAngleY = 0.0F;
    this.Block119.rotateAngleZ = 0.0F;
    this.Block119.renderWithRotation(par7);
  }
}


