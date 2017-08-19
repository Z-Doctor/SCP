package zdoctor.scp.client.model.entity.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSCPQuack extends ModelBase {
	ModelRenderer Block;
	ModelRenderer Block1;
	ModelRenderer Block2;
	ModelRenderer Block3;
	ModelRenderer Block4;
	ModelRenderer Block5;
	ModelRenderer Block6;
	ModelRenderer Block7;

	public ModelSCPQuack() {
		this(0.0f);
	}

	public ModelSCPQuack(final float par1) {
		(this.Block = new ModelRenderer((ModelBase) this, 2, 10)).setTextureSize(32, 32);
		this.Block.addBox(-2.5f, -5.0f, 2.0f, 5, 8, 3);
		this.Block.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block1 = new ModelRenderer((ModelBase) this, 0, 0)).setTextureSize(32, 32);
		this.Block1.addBox(-2.0f, -9.0f, -5.0f, 4, 4, 4);
		this.Block1.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block2 = new ModelRenderer((ModelBase) this, 16, 4)).setTextureSize(32, 32);
		this.Block2.addBox(-2.0f, -7.0f, -7.0f, 4, 2, 2);
		this.Block2.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block3 = new ModelRenderer((ModelBase) this, 20, 13)).setTextureSize(32, 32);
		this.Block3.addBox(-1.5f, -5.5f, 2.5f, 3, 1, 1);
		this.Block3.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block4 = new ModelRenderer((ModelBase) this, 20, 19)).setTextureSize(32, 32);
		this.Block4.addBox(-2.5f, -8.5f, -4.5f, 5, 1, 1);
		this.Block4.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block5 = new ModelRenderer((ModelBase) this, 17, 5)).setTextureSize(32, 32);
		this.Block5.addBox(-2.0f, -6.5f, -7.5f, 4, 1, 1);
		this.Block5.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block6 = new ModelRenderer((ModelBase) this, 3, 11)).setTextureSize(32, 32);
		this.Block6.addBox(-2.0f, -4.5f, 0.0f, 4, 7, 2);
		this.Block6.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block7 = new ModelRenderer((ModelBase) this, 1, 9)).setTextureSize(32, 32);
		this.Block7.addBox(-1.5f, -5.5f, 0.5f, 3, 1, 4);
		this.Block7.setRotationPoint(0.0f, 24.0f, 0.0f);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		this.Block.rotateAngleX = 1.570796f;
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
		this.Block5.rotateAngleX = 0.0f;
		this.Block5.rotateAngleY = 0.0f;
		this.Block5.rotateAngleZ = 0.0f;
		this.Block5.render(scale);
		this.Block6.rotateAngleX = 1.570796f;
		this.Block6.rotateAngleY = 0.0f;
		this.Block6.rotateAngleZ = 0.0f;
		this.Block6.render(scale);
		this.Block7.rotateAngleX = 1.570796f;
		this.Block7.rotateAngleY = 0.0f;
		this.Block7.rotateAngleZ = 0.0f;
		this.Block7.render(scale);
	}
}
