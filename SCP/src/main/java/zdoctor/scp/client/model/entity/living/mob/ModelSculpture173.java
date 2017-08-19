package zdoctor.scp.client.model.entity.living.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSculpture173 extends ModelBase {
	ModelRenderer head;
	ModelRenderer neck;
	ModelRenderer torso;
	ModelRenderer leg;
	ModelRenderer leg1;
	ModelRenderer arm;
	ModelRenderer arm1;
	ModelRenderer eye;
	ModelRenderer eye1;

	public ModelSculpture173() {
		this(0.0f);
	}

	public ModelSculpture173(final float par1) {
		(this.head = new ModelRenderer((ModelBase) this, 54, 39)).setTextureSize(128, 128);
		this.head.addBox(-5.5f, -45.0f, -5.5f, 11, 14, 11);
		this.head.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.neck = new ModelRenderer((ModelBase) this, 13, 48)).setTextureSize(128, 128);
		this.neck.addBox(-4.0f, -31.5f, -4.0f, 8, 3, 8);
		this.neck.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.torso = new ModelRenderer((ModelBase) this, 14, 7)).setTextureSize(128, 128);
		this.torso.addBox(-4.5f, -29.0f, -4.5f, 9, 18, 9);
		this.torso.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.leg = new ModelRenderer((ModelBase) this, 63, 16)).setTextureSize(128, 128);
		this.leg.addBox(-5.0f, -11.0f, -2.0f, 4, 11, 4);
		this.leg.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.leg1 = new ModelRenderer((ModelBase) this, 90, 14)).setTextureSize(128, 128);
		this.leg1.addBox(1.0f, -11.0f, -2.0f, 4, 11, 4);
		this.leg1.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.arm = new ModelRenderer((ModelBase) this, 89, 71)).setTextureSize(128, 128);
		this.arm.addBox(4.0f, -26.0f, -9.5f, 4, 4, 11);
		this.arm.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.arm1 = new ModelRenderer((ModelBase) this, 89, 71)).setTextureSize(128, 128);
		this.arm1.addBox(-8.0f, -26.0f, -9.5f, 4, 4, 11);
		this.arm1.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.eye = new ModelRenderer((ModelBase) this, 76, 71)).setTextureSize(128, 128);
		this.eye.addBox(3.0f, -40.5f, -5.6f, 2, 2, 2);
		this.eye.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.eye1 = new ModelRenderer((ModelBase) this, 67, 71)).setTextureSize(128, 128);
		this.eye1.addBox(-5.0f, -40.5f, -5.6f, 2, 2, 2);
		this.eye1.setRotationPoint(0.0f, 24.0f, 0.0f);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		this.head.rotateAngleX = 0.0f;
		this.head.rotateAngleY = 0.0f;
		this.head.rotateAngleZ = 0.0f;
		this.head.render(scale);
		this.neck.rotateAngleX = 0.0f;
		this.neck.rotateAngleY = 0.0f;
		this.neck.rotateAngleZ = 0.0f;
		this.neck.render(scale);
		this.torso.rotateAngleX = 0.0f;
		this.torso.rotateAngleY = 0.0f;
		this.torso.rotateAngleZ = 0.0f;
		this.torso.render(scale);
		this.leg.rotateAngleX = 0.0f;
		this.leg.rotateAngleY = 0.0f;
		this.leg.rotateAngleZ = 0.0f;
		this.leg.render(scale);
		this.leg1.rotateAngleX = 0.0f;
		this.leg1.rotateAngleY = 0.0f;
		this.leg1.rotateAngleZ = 0.0f;
		this.leg1.render(scale);
		this.arm.rotateAngleX = 0.0f;
		this.arm.rotateAngleY = 0.0f;
		this.arm.rotateAngleZ = 0.0f;
		this.arm.render(scale);
		this.arm1.rotateAngleX = 0.0f;
		this.arm1.rotateAngleY = 0.0f;
		this.arm1.rotateAngleZ = 0.0f;
		this.arm1.render(scale);
		this.eye.rotateAngleX = 0.0f;
		this.eye.rotateAngleY = 0.0f;
		this.eye.rotateAngleZ = 0.0f;
		this.eye.render(scale);
		this.eye1.rotateAngleX = 0.0f;
		this.eye1.rotateAngleY = 0.0f;
		this.eye1.rotateAngleZ = 0.0f;
		this.eye1.render(scale);
	}
}
