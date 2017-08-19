package zdoctor.scp.client.model.entity.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSmallDesk extends ModelBase {
	ModelRenderer Block;
	ModelRenderer Block1;
	ModelRenderer Block2;
	ModelRenderer Block3;
	ModelRenderer Block4;
	ModelRenderer Block5;
	ModelRenderer Block6;
	ModelRenderer Block7;
	ModelRenderer Block8;

	public ModelSmallDesk() {
		this(0.0f);
	}

	public ModelSmallDesk(final float par1) {
		(this.Block = new ModelRenderer((ModelBase) this, 0, 0)).setTextureSize(64, 64);
		this.Block.addBox(-8.0f, -16.0f, -8.0f, 16, 1, 16);
		this.Block.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block1 = new ModelRenderer((ModelBase) this, 16, 43)).setTextureSize(64, 64);
		this.Block1.addBox(-7.0f, -15.0f, -7.0f, 1, 1, 14);
		this.Block1.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block2 = new ModelRenderer((ModelBase) this, 13, 25)).setTextureSize(64, 64);
		this.Block2.addBox(6.0f, -15.0f, -7.0f, 1, 1, 14);
		this.Block2.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block3 = new ModelRenderer((ModelBase) this, 22, 20)).setTextureSize(64, 64);
		this.Block3.addBox(-6.0f, -15.0f, -7.0f, 12, 1, 1);
		this.Block3.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block4 = new ModelRenderer((ModelBase) this, 33, 29)).setTextureSize(64, 64);
		this.Block4.addBox(-6.0f, -15.0f, 6.0f, 12, 1, 1);
		this.Block4.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block5 = new ModelRenderer((ModelBase) this, 8, 20)).setTextureSize(64, 64);
		this.Block5.addBox(-7.0f, -14.0f, -7.0f, 1, 14, 1);
		this.Block5.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block6 = new ModelRenderer((ModelBase) this, 5, 39)).setTextureSize(64, 64);
		this.Block6.addBox(-7.0f, -14.0f, 6.0f, 1, 14, 1);
		this.Block6.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block7 = new ModelRenderer((ModelBase) this, 17, 22)).setTextureSize(64, 64);
		this.Block7.addBox(6.0f, -14.0f, -7.0f, 1, 14, 1);
		this.Block7.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block8 = new ModelRenderer((ModelBase) this, 52, 41)).setTextureSize(64, 64);
		this.Block8.addBox(-7.0f, -14.0f, 6.0f, 1, 14, 1);
		this.Block8.setRotationPoint(13.0f, 24.0f, 0.0f);
	}
	
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
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
		this.Block5.rotateAngleX = 0.0f;
		this.Block5.rotateAngleY = 0.0f;
		this.Block5.rotateAngleZ = 0.0f;
		this.Block5.render(scale);
		this.Block6.rotateAngleX = 0.0f;
		this.Block6.rotateAngleY = 0.0f;
		this.Block6.rotateAngleZ = 0.0f;
		this.Block6.render(scale);
		this.Block7.rotateAngleX = 0.0f;
		this.Block7.rotateAngleY = 0.0f;
		this.Block7.rotateAngleZ = 0.0f;
		this.Block7.render(scale);
		this.Block8.rotateAngleX = 0.0f;
		this.Block8.rotateAngleY = 0.0f;
		this.Block8.rotateAngleZ = 0.0f;
		this.Block8.render(scale);
	}
}
