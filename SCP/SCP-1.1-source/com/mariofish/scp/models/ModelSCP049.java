package zdoctor.scp.models;

import zdoctor.scp.entity.ModelBetterBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;




public class ModelSCP049
  extends ModelBetterBiped
{
  ModelRenderer Shape1;
  ModelRenderer Shape2;
  ModelRenderer Shape3;
  ModelRenderer Shape4;
  
  public ModelSCP049()
  {
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.Shape1 = new ModelRenderer(this, 44, 32);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7);
    this.Shape1.setRotationPoint(-1.0F, -2.0F, -9.0F);
    this.Shape1.setTextureSize(64, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.3490659F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 43, 46);
    this.Shape2.addBox(-3.0F, 0.0F, 0.0F, 8, 0, 2);
    this.Shape2.setRotationPoint(-1.0F, -8.0F, -6.0F);
    this.Shape2.setTextureSize(64, 64);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 33, 32);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 0, 7, 2);
    this.Shape3.setRotationPoint(-4.0F, -8.0F, -6.0F);
    this.Shape3.setTextureSize(64, 64);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 33, 32);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 0, 7, 2);
    this.Shape4.setRotationPoint(4.0F, -8.0F, -6.0F);
    this.Shape4.setTextureSize(64, 64);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    
    this.bipedHead.addChild(this.Shape1);
    this.bipedHead.addChild(this.Shape2);
    this.bipedHead.addChild(this.Shape3);
    this.bipedHead.addChild(this.Shape4);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}


