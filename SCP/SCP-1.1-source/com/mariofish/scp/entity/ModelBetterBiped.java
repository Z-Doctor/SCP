package zdoctor.scp.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;



@SideOnly(Side.CLIENT)
public class ModelBetterBiped
  extends ModelBase
{
  public ModelRenderer bipedHead;
  public ModelRenderer bipedHeadwear;
  public ModelRenderer bipedBody;
  public ModelRenderer bipedRightArm;
  public ModelRenderer bipedLeftArm;
  public ModelRenderer bipedRightLeg;
  public ModelRenderer bipedLeftLeg;
  public ModelRenderer bipedEars;
  public ModelRenderer bipedCloak;
  public int heldItemLeft;
  public int heldItemRight;
  public boolean isSneak;
  public boolean aimedBow;
  
  public ModelBetterBiped()
  {
    this(0.0F);
  }
  
  public ModelBetterBiped(float modelSize)
  {
    this(modelSize, 0.0F, 64, 64);
  }
  
  public ModelBetterBiped(float modelSize, float p_i1149_2_, int textureWidthIn, int textureHeightIn)
  {
    this.textureWidth = textureWidthIn;
    this.textureHeight = textureHeightIn;
    this.bipedCloak = new ModelRenderer(this, 0, 0);
    this.bipedCloak.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, modelSize);
    this.bipedEars = new ModelRenderer(this, 24, 0);
    this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, modelSize);
    this.bipedHead = new ModelRenderer(this, 0, 0);
    this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, modelSize);
    this.bipedHead.setRotationPoint(0.0F, 0.0F + p_i1149_2_, 0.0F);
    this.bipedHeadwear = new ModelRenderer(this, 32, 0);
    this.bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, modelSize + 0.5F);
    this.bipedHeadwear.setRotationPoint(0.0F, 0.0F + p_i1149_2_, 0.0F);
    this.bipedBody = new ModelRenderer(this, 16, 16);
    this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, modelSize);
    this.bipedBody.setRotationPoint(0.0F, 0.0F + p_i1149_2_, 0.0F);
    this.bipedRightArm = new ModelRenderer(this, 40, 16);
    this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, modelSize);
    this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + p_i1149_2_, 0.0F);
    this.bipedLeftArm = new ModelRenderer(this, 40, 16);
    this.bipedLeftArm.mirror = true;
    this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, modelSize);
    this.bipedLeftArm.setRotationPoint(5.0F, 2.0F + p_i1149_2_, 0.0F);
    this.bipedRightLeg = new ModelRenderer(this, 0, 16);
    this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, modelSize);
    this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + p_i1149_2_, 0.0F);
    this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
    this.bipedLeftLeg.mirror = true;
    this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, modelSize);
    this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F + p_i1149_2_, 0.0F);
  }
  



  public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
  {
    setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
    
    if (this.isChild)
    {
      float f6 = 2.0F;
      GL11.glPushMatrix();
      GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
      GL11.glTranslatef(0.0F, 16.0F * scale, 0.0F);
      this.bipedHead.render(scale);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
      GL11.glTranslatef(0.0F, 24.0F * scale, 0.0F);
      this.bipedBody.render(scale);
      this.bipedRightArm.render(scale);
      this.bipedLeftArm.render(scale);
      this.bipedRightLeg.render(scale);
      this.bipedLeftLeg.render(scale);
      this.bipedHeadwear.render(scale);
      GL11.glPopMatrix();
    }
    else
    {
      this.bipedHead.render(scale);
      this.bipedBody.render(scale);
      this.bipedRightArm.render(scale);
      this.bipedLeftArm.render(scale);
      this.bipedRightLeg.render(scale);
      this.bipedLeftLeg.render(scale);
      this.bipedHeadwear.render(scale);
    }
  }
  





  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
  {
    this.bipedHead.rotateAngleY = (netHeadYaw / 57.295776F);
    this.bipedHead.rotateAngleX = (headPitch / 57.295776F);
    this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
    this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
    this.bipedRightArm.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 2.0F * limbSwingAmount * 0.5F);
    this.bipedLeftArm.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F);
    this.bipedRightArm.rotateAngleZ = 0.0F;
    this.bipedLeftArm.rotateAngleZ = 0.0F;
    this.bipedRightLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
    this.bipedLeftLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount);
    this.bipedRightLeg.rotateAngleY = 0.0F;
    this.bipedLeftLeg.rotateAngleY = 0.0F;
    
    if (this.isRiding)
    {
      this.bipedRightArm.rotateAngleX += -0.62831855F;
      this.bipedLeftArm.rotateAngleX += -0.62831855F;
      this.bipedRightLeg.rotateAngleX = -1.2566371F;
      this.bipedLeftLeg.rotateAngleX = -1.2566371F;
      this.bipedRightLeg.rotateAngleY = 0.31415927F;
      this.bipedLeftLeg.rotateAngleY = -0.31415927F;
    }
    
    if (this.heldItemLeft != 0)
    {
      this.bipedLeftArm.rotateAngleX = (this.bipedLeftArm.rotateAngleX * 0.5F - 0.31415927F * this.heldItemLeft);
    }
    
    if (this.heldItemRight != 0)
    {
      this.bipedRightArm.rotateAngleX = (this.bipedRightArm.rotateAngleX * 0.5F - 0.31415927F * this.heldItemRight);
    }
    
    this.bipedRightArm.rotateAngleY = 0.0F;
    this.bipedLeftArm.rotateAngleY = 0.0F;
    


    if (this.swingProgress > -9990.0F)
    {
      float f6 = this.swingProgress;
      this.bipedBody.rotateAngleY = (MathHelper.sin(MathHelper.sqrt(f6) * 3.1415927F * 2.0F) * 0.2F);
      this.bipedRightArm.rotationPointZ = (MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F);
      this.bipedRightArm.rotationPointX = (-MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F);
      this.bipedLeftArm.rotationPointZ = (-MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F);
      this.bipedLeftArm.rotationPointX = (MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F);
      this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
      this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
      this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
      f6 = 1.0F - this.swingProgress;
      f6 *= f6;
      f6 *= f6;
      f6 = 1.0F - f6;
      float f7 = MathHelper.sin(f6 * 3.1415927F);
      float f8 = MathHelper.sin(this.swingProgress * 3.1415927F) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
      this.bipedRightArm.rotateAngleX = ((float)(this.bipedRightArm.rotateAngleX - (f7 * 1.2D + f8)));
      this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
      this.bipedRightArm.rotateAngleZ = (MathHelper.sin(this.swingProgress * 3.1415927F) * -0.4F);
    }
    
    if (this.isSneak)
    {
      this.bipedBody.rotateAngleX = 0.5F;
      this.bipedRightArm.rotateAngleX += 0.4F;
      this.bipedLeftArm.rotateAngleX += 0.4F;
      this.bipedRightLeg.rotationPointZ = 4.0F;
      this.bipedLeftLeg.rotationPointZ = 4.0F;
      this.bipedRightLeg.rotationPointY = 9.0F;
      this.bipedLeftLeg.rotationPointY = 9.0F;
      this.bipedHead.rotationPointY = 1.0F;
      this.bipedHeadwear.rotationPointY = 1.0F;
    }
    else
    {
      this.bipedBody.rotateAngleX = 0.0F;
      this.bipedRightLeg.rotationPointZ = 0.1F;
      this.bipedLeftLeg.rotationPointZ = 0.1F;
      this.bipedRightLeg.rotationPointY = 12.0F;
      this.bipedLeftLeg.rotationPointY = 12.0F;
      this.bipedHead.rotationPointY = 0.0F;
      this.bipedHeadwear.rotationPointY = 0.0F;
    }
    
    this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
    this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
    this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    
    if (this.aimedBow)
    {
      float f6 = 0.0F;
      float f7 = 0.0F;
      this.bipedRightArm.rotateAngleZ = 0.0F;
      this.bipedLeftArm.rotateAngleZ = 0.0F;
      this.bipedRightArm.rotateAngleY = (-(0.1F - f6 * 0.6F) + this.bipedHead.rotateAngleY);
      this.bipedLeftArm.rotateAngleY = (0.1F - f6 * 0.6F + this.bipedHead.rotateAngleY + 0.4F);
      this.bipedRightArm.rotateAngleX = (-1.5707964F + this.bipedHead.rotateAngleX);
      this.bipedLeftArm.rotateAngleX = (-1.5707964F + this.bipedHead.rotateAngleX);
      this.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
      this.bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
      this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
      this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
      this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
      this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    }
  }
  



  public void renderEars(float p_78110_1_)
  {
    this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
    this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
    this.bipedEars.rotationPointX = 0.0F;
    this.bipedEars.rotationPointY = 0.0F;
    this.bipedEars.render(p_78110_1_);
  }
  



  public void renderCloak(float p_78111_1_)
  {
    this.bipedCloak.render(p_78111_1_);
  }
}


