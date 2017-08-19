package zdoctor.scp.client.model.entity.living.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import zdoctor.scp.client.model.entity.ModelBetterBiped;

public class ModelPlagueDoctor049 extends ModelBetterBiped {
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;

	public ModelPlagueDoctor049() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		(this.Shape1 = new ModelRenderer((ModelBase) this, 44, 32)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 7);
		this.Shape1.setRotationPoint(-1.0f, -2.0f, -9.0f);
		this.Shape1.setTextureSize(64, 64);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.3490659f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer((ModelBase) this, 43, 46)).addBox(-3.0f, 0.0f, 0.0f, 8, 0, 2);
		this.Shape2.setRotationPoint(-1.0f, -8.0f, -6.0f);
		this.Shape2.setTextureSize(64, 64);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer((ModelBase) this, 33, 32)).addBox(0.0f, 0.0f, 0.0f, 0, 7, 2);
		this.Shape3.setRotationPoint(-4.0f, -8.0f, -6.0f);
		this.Shape3.setTextureSize(64, 64);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer((ModelBase) this, 33, 32)).addBox(0.0f, 0.0f, 0.0f, 0, 7, 2);
		this.Shape4.setRotationPoint(4.0f, -8.0f, -6.0f);
		this.Shape4.setTextureSize(64, 64);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		this.bipedHead.addChild(this.Shape1);
		this.bipedHead.addChild(this.Shape2);
		this.bipedHead.addChild(this.Shape3);
		this.bipedHead.addChild(this.Shape4);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
	}
}
