package zdoctor.scp.client.model.entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBetterBiped extends ModelBase {
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

	public ModelBetterBiped() {
		this(0.0f);
	}

	public ModelBetterBiped(final float p_i1148_1_) {
		this(p_i1148_1_, 0.0f, 64, 64);
	}

	public ModelBetterBiped(final float p_i1149_1_, final float p_i1149_2_, final int textureWidth,
			final int textureHeight) {
		this.textureWidth = textureWidth;
		this.textureHeight = textureHeight;
		(this.bipedCloak = new ModelRenderer((ModelBase) this, 0, 0)).addBox(-5.0f, 0.0f, -1.0f, 10, 16, 1, p_i1149_1_);
		(this.bipedEars = new ModelRenderer((ModelBase) this, 24, 0)).addBox(-3.0f, -6.0f, -1.0f, 6, 6, 1, p_i1149_1_);
		(this.bipedHead = new ModelRenderer((ModelBase) this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, p_i1149_1_);
		this.bipedHead.setRotationPoint(0.0f, 0.0f + p_i1149_2_, 0.0f);
		(this.bipedHeadwear = new ModelRenderer((ModelBase) this, 32, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8,
				p_i1149_1_ + 0.5f);
		this.bipedHeadwear.setRotationPoint(0.0f, 0.0f + p_i1149_2_, 0.0f);
		(this.bipedBody = new ModelRenderer((ModelBase) this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, p_i1149_1_);
		this.bipedBody.setRotationPoint(0.0f, 0.0f + p_i1149_2_, 0.0f);
		(this.bipedRightArm = new ModelRenderer((ModelBase) this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4,
				p_i1149_1_);
		this.bipedRightArm.setRotationPoint(-5.0f, 2.0f + p_i1149_2_, 0.0f);
		this.bipedLeftArm = new ModelRenderer((ModelBase) this, 40, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, p_i1149_1_);
		this.bipedLeftArm.setRotationPoint(5.0f, 2.0f + p_i1149_2_, 0.0f);
		(this.bipedRightLeg = new ModelRenderer((ModelBase) this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4,
				p_i1149_1_);
		this.bipedRightLeg.setRotationPoint(-1.9f, 12.0f + p_i1149_2_, 0.0f);
		this.bipedLeftLeg = new ModelRenderer((ModelBase) this, 0, 16);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, p_i1149_1_);
		this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f + p_i1149_2_, 0.0f);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		if (this.isChild) {
			final float f6 = 2.0f;
			GL11.glPushMatrix();
			GL11.glScalef(1.5f / f6, 1.5f / f6, 1.5f / f6);
			GL11.glTranslatef(0.0f, 16.0f * scale, 0.0f);
			this.bipedHead.render(scale);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glScalef(1.0f / f6, 1.0f / f6, 1.0f / f6);
			GL11.glTranslatef(0.0f, 24.0f * scale, 0.0f);
			this.bipedBody.render(scale);
			this.bipedRightArm.render(scale);
			this.bipedLeftArm.render(scale);
			this.bipedRightLeg.render(scale);
			this.bipedLeftLeg.render(scale);
			this.bipedHeadwear.render(scale);
			GL11.glPopMatrix();
		} else {
			this.bipedHead.render(scale);
			this.bipedBody.render(scale);
			this.bipedRightArm.render(scale);
			this.bipedLeftArm.render(scale);
			this.bipedRightLeg.render(scale);
			this.bipedLeftLeg.render(scale);
			this.bipedHeadwear.render(scale);
		}
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale, Entity entityIn) {
		this.bipedHead.rotateAngleY = netHeadYaw / 57.295776f;
		this.bipedHead.rotateAngleX = headPitch / 57.295776f;
		this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
		this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
		this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount
				* 0.5f;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		this.bipedRightArm.rotateAngleZ = 0.0f;
		this.bipedLeftArm.rotateAngleZ = 0.0f;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		this.bipedRightLeg.rotateAngleY = 0.0f;
		this.bipedLeftLeg.rotateAngleY = 0.0f;
		if (this.isRiding) {
			final ModelRenderer bipedRightArm = this.bipedRightArm;
			bipedRightArm.rotateAngleX -= 0.62831855f;
			final ModelRenderer bipedLeftArm = this.bipedLeftArm;
			bipedLeftArm.rotateAngleX -= 0.62831855f;
			this.bipedRightLeg.rotateAngleX = -1.2566371f;
			this.bipedLeftLeg.rotateAngleX = -1.2566371f;
			this.bipedRightLeg.rotateAngleY = 0.31415927f;
			this.bipedLeftLeg.rotateAngleY = -0.31415927f;
		}
		if (this.heldItemLeft != 0) {
			this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemLeft;
		}
		if (this.heldItemRight != 0) {
			this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemRight;
		}
		this.bipedRightArm.rotateAngleY = 0.0f;
		this.bipedLeftArm.rotateAngleY = 0.0f;
		if (this.swingProgress > -9990.0f) {
			float f6 = this.swingProgress;
			this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f6) * 3.1415927f * 2.0f) * 0.2f;
			this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
			this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
			this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
			this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
			final ModelRenderer bipedRightArm2 = this.bipedRightArm;
			bipedRightArm2.rotateAngleY += this.bipedBody.rotateAngleY;
			final ModelRenderer bipedLeftArm2 = this.bipedLeftArm;
			bipedLeftArm2.rotateAngleY += this.bipedBody.rotateAngleY;
			final ModelRenderer bipedLeftArm3 = this.bipedLeftArm;
			bipedLeftArm3.rotateAngleX += this.bipedBody.rotateAngleY;
			f6 = 1.0f - this.swingProgress;
			f6 *= f6;
			f6 *= f6;
			f6 = 1.0f - f6;
			final float f7 = MathHelper.sin(f6 * 3.1415927f);
			final float f8 = MathHelper.sin(this.swingProgress * 3.1415927f) * -(this.bipedHead.rotateAngleX - 0.7f)
					* 0.75f;
			this.bipedRightArm.rotateAngleX -= (float) (f7 * 1.2 + f8);
			final ModelRenderer bipedRightArm3 = this.bipedRightArm;
			bipedRightArm3.rotateAngleY += this.bipedBody.rotateAngleY * 2.0f;
			this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.swingProgress * 3.1415927f) * -0.4f;
		}
		if (this.isSneak) {
			this.bipedBody.rotateAngleX = 0.5f;
			final ModelRenderer bipedRightArm4 = this.bipedRightArm;
			bipedRightArm4.rotateAngleX += 0.4f;
			final ModelRenderer bipedLeftArm4 = this.bipedLeftArm;
			bipedLeftArm4.rotateAngleX += 0.4f;
			this.bipedRightLeg.rotationPointZ = 4.0f;
			this.bipedLeftLeg.rotationPointZ = 4.0f;
			this.bipedRightLeg.rotationPointY = 9.0f;
			this.bipedLeftLeg.rotationPointY = 9.0f;
			this.bipedHead.rotationPointY = 1.0f;
			this.bipedHeadwear.rotationPointY = 1.0f;
		} else {
			this.bipedBody.rotateAngleX = 0.0f;
			this.bipedRightLeg.rotationPointZ = 0.1f;
			this.bipedLeftLeg.rotationPointZ = 0.1f;
			this.bipedRightLeg.rotationPointY = 12.0f;
			this.bipedLeftLeg.rotationPointY = 12.0f;
			this.bipedHead.rotationPointY = 0.0f;
			this.bipedHeadwear.rotationPointY = 0.0f;
		}
		final ModelRenderer bipedRightArm5 = this.bipedRightArm;
		bipedRightArm5.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
		final ModelRenderer bipedLeftArm5 = this.bipedLeftArm;
		bipedLeftArm5.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
		final ModelRenderer bipedRightArm6 = this.bipedRightArm;
		bipedRightArm6.rotateAngleX += MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
		final ModelRenderer bipedLeftArm6 = this.bipedLeftArm;
		bipedLeftArm6.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
		if (this.aimedBow) {
			final float f6 = 0.0f;
			final float f7 = 0.0f;
			this.bipedRightArm.rotateAngleZ = 0.0f;
			this.bipedLeftArm.rotateAngleZ = 0.0f;
			this.bipedRightArm.rotateAngleY = -(0.1f - f6 * 0.6f) + this.bipedHead.rotateAngleY;
			this.bipedLeftArm.rotateAngleY = 0.1f - f6 * 0.6f + this.bipedHead.rotateAngleY + 0.4f;
			this.bipedRightArm.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
			this.bipedLeftArm.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
			final ModelRenderer bipedRightArm7 = this.bipedRightArm;
			bipedRightArm7.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
			final ModelRenderer bipedLeftArm7 = this.bipedLeftArm;
			bipedLeftArm7.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
			final ModelRenderer bipedRightArm8 = this.bipedRightArm;
			bipedRightArm8.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
			final ModelRenderer bipedLeftArm8 = this.bipedLeftArm;
			bipedLeftArm8.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09f) * 0.05f + 0.05f;
			final ModelRenderer bipedRightArm9 = this.bipedRightArm;
			bipedRightArm9.rotateAngleX += MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
			final ModelRenderer bipedLeftArm9 = this.bipedLeftArm;
			bipedLeftArm9.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067f) * 0.05f;
		}
	}

	public void renderEars(final float p_78110_1_) {
		this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
		this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
		this.bipedEars.rotationPointX = 0.0f;
		this.bipedEars.rotationPointY = 0.0f;
		this.bipedEars.render(p_78110_1_);
	}

	public void renderCloak(final float p_78111_1_) {
		this.bipedCloak.render(p_78111_1_);
	}
}
