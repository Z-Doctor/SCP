package zdoctor.scp.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelButtonOn extends ModelBase {
	ModelRenderer Block;
	ModelRenderer Block1;
	ModelRenderer Block2;
	ModelRenderer Block3;
	ModelRenderer Block4;

	public ModelButtonOn() {
		this(0.0f);
	}

	public ModelButtonOn(final float par1) {
		(this.Block = new ModelRenderer((ModelBase) this, 4, 4)).setTextureSize(32, 32);
		this.Block.addBox(-2.0f, -11.0f, -1.0f, 4, 6, 1);
		this.Block.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block1 = new ModelRenderer((ModelBase) this, 15, 15)).setTextureSize(32, 32);
		this.Block1.addBox(-1.5f, -10.75f, -1.25f, 3, 2, 1);
		this.Block1.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block2 = new ModelRenderer((ModelBase) this, 4, 12)).setTextureSize(32, 32);
		this.Block2.addBox(-1.5f, -8.5f, -1.5f, 3, 3, 1);
		this.Block2.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block3 = new ModelRenderer((ModelBase) this, 5, 17)).setTextureSize(32, 32);
		this.Block3.addBox(-1.0f, -8.0f, -1.6f, 2, 2, 1);
		this.Block3.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block4 = new ModelRenderer((ModelBase) this, 15, 18)).setTextureSize(32, 32);
		this.Block4.addBox(-1.0f, -8.0f, -1.25f, 2, 2, 1);
		this.Block4.setRotationPoint(0.0f, 24.0f, -0.25f);
	}

	public void func_78088_a(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch, float scale) {
		this.Block.rotateAngleX = 0.0f;
		this.Block.rotateAngleY = 0.0f;
		this.Block.rotateAngleZ = 0.0f;
		this.Block.render(scale);
		this.Block1.rotateAngleX = 0.0f;
		this.Block1.rotateAngleY = 0.0f;
		this.Block1.rotateAngleZ = 0.0f;
		this.Block1.render(scale);
		this.Block2.rotateAngleX = 0.0f;
		this.Block2.rotateAngleY = 0.0f;
		this.Block2.rotateAngleZ = 0.0f;
		this.Block2.render(scale);
		this.Block3.rotateAngleX = 0.0f;
		this.Block3.rotateAngleY = 0.0f;
		this.Block3.rotateAngleZ = 0.0f;
		this.Block3.render(scale);
		this.Block4.rotateAngleX = 0.0f;
		this.Block4.rotateAngleY = 0.0f;
		this.Block4.rotateAngleZ = 0.0f;
		this.Block4.render(scale);
	}
}
