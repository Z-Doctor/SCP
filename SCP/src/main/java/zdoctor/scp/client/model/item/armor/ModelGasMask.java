package zdoctor.scp.client.model.item.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGasMask extends ModelBiped {
	ModelRenderer basehorn;
	ModelRenderer horn1;
	ModelRenderer rightshoulder;
	ModelRenderer leftshoulder;

	public ModelGasMask(float expand) {
		super(expand, 0.0F, 64, 64);

		this.basehorn = new ModelRenderer(this, 38, 0);
		this.basehorn.addBox(-1.0F, -9.0F, -4.5F, 2, 2, 2, expand);
		this.basehorn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.basehorn.setTextureSize(64, 32);
		this.basehorn.mirror = true;
		setRotation(this.basehorn, 0.0F, 0.0F, 0.0F);

		this.horn1 = new ModelRenderer(this, 33, 0);
		this.horn1.addBox(-0.5F, -14.5F, 0.7666667F, 1, 5, 1, expand / 3.0F);
		this.horn1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.horn1.setTextureSize(64, 32);
		this.horn1.mirror = true;
		setRotation(this.horn1, 0.5576792F, 0.0F, 0.0F);

		this.rightshoulder = new ModelRenderer(this, 0, 33);
		this.rightshoulder.addBox(-3.5F, -3.0F, -2.5F, 5, 5, 5, expand / 1.2F);
		this.rightshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rightshoulder.setTextureSize(64, 32);
		this.rightshoulder.mirror = true;
		setRotation(this.rightshoulder, 0.0F, 0.0F, 0.0F);

		this.leftshoulder = new ModelRenderer(this, 0, 33);
		this.leftshoulder.addBox(-1.5F, -3.0F, -2.5F, 5, 5, 5, expand / 1.2F);
		this.leftshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leftshoulder.setTextureSize(64, 32);
		this.leftshoulder.mirror = true;
		setRotation(this.leftshoulder, 0.0F, 0.0F, 0.0F);

		this.basehorn.addChild(this.horn1);
		this.bipedHead.addChild(this.basehorn);

		this.bipedRightArm.addChild(this.rightshoulder);
		this.bipedLeftArm.addChild(this.leftshoulder);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
