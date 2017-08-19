package zdoctor.scp.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDoorOpen2 extends ModelBase {
	ModelRenderer Block;
	ModelRenderer Block1;
	ModelRenderer Block2;
	ModelRenderer doortree;
	ModelRenderer Block3;
	ModelRenderer Block4;
	ModelRenderer Block5;
	ModelRenderer Block6;
	ModelRenderer Block7;
	ModelRenderer Block8;
	ModelRenderer Block9;
	ModelRenderer Block10;
	ModelRenderer Block11;
	ModelRenderer Block12;
	ModelRenderer Block13;
	ModelRenderer Block14;

	public ModelDoorOpen2() {
		this(0.0f);
	}

	public ModelDoorOpen2(final float par1) {
		(this.Block = new ModelRenderer((ModelBase) this, 2, 50)).setTextureSize(128, 128);
		this.Block.addBox(-8.0f, -32.5f, -6.5f, 16, 1, 13);
		this.Block.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block1 = new ModelRenderer((ModelBase) this, 17, 3)).setTextureSize(128, 128);
		this.Block1.addBox(-8.5f, -32.0f, -6.5f, 1, 32, 13);
		this.Block1.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block2 = new ModelRenderer((ModelBase) this, 17, 3)).setTextureSize(128, 128);
		this.Block2.addBox(7.5f, -32.0f, -6.5f, 1, 32, 13);
		this.Block2.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.doortree = new ModelRenderer((ModelBase) this, 54, 12)).setTextureSize(128, 128);
		this.doortree.addBox(-22.0f, -32.0f, -1.5f, 16, 32, 3);
		this.doortree.setRotationPoint(0.0f, 24.0f, 0.0f);
		(this.Block3 = new ModelRenderer((ModelBase) this, 90, 55)).setTextureSize(128, 128);
		this.Block3.addBox(-6.5f, -30.5f, 1.0f, 13, 1, 2);
		this.Block3.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block4 = new ModelRenderer((ModelBase) this, 63, 49)).setTextureSize(128, 128);
		this.Block4.addBox(-5.5f, -25.5f, 1.0f, 11, 1, 2);
		this.Block4.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block5 = new ModelRenderer((ModelBase) this, 76, 69)).setTextureSize(128, 128);
		this.Block5.addBox(1.5f, -24.5f, 1.5f, 1, 1, 1);
		this.Block5.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block6 = new ModelRenderer((ModelBase) this, 76, 69)).setTextureSize(128, 128);
		this.Block6.addBox(-2.5f, -24.5f, 1.5f, 1, 1, 1);
		this.Block6.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block7 = new ModelRenderer((ModelBase) this, 62, 57)).setTextureSize(128, 128);
		this.Block7.addBox(-5.5f, -14.5f, 1.0f, 11, 1, 2);
		this.Block7.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block8 = new ModelRenderer((ModelBase) this, 76, 69)).setTextureSize(128, 128);
		this.Block8.addBox(-2.5f, -13.5f, 1.5f, 1, 1, 1);
		this.Block8.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block9 = new ModelRenderer((ModelBase) this, 76, 61)).setTextureSize(128, 128);
		this.Block9.addBox(-5.5f, -5.5f, 1.0f, 11, 1, 2);
		this.Block9.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block10 = new ModelRenderer((ModelBase) this, 76, 69)).setTextureSize(128, 128);
		this.Block10.addBox(1.5f, -5.0f, 1.5f, 1, 1, 1);
		this.Block10.setRotationPoint(-14.0f, 24.5f, 0.0f);
		(this.Block11 = new ModelRenderer((ModelBase) this, 76, 69)).setTextureSize(128, 128);
		this.Block11.addBox(-2.5f, -5.0f, 1.5f, 1, 1, 1);
		this.Block11.setRotationPoint(-14.0f, 24.5f, 0.0f);
		(this.Block12 = new ModelRenderer((ModelBase) this, 91, 50)).setTextureSize(128, 128);
		this.Block12.addBox(-6.5f, -0.5f, 1.0f, 13, 1, 2);
		this.Block12.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block13 = new ModelRenderer((ModelBase) this, 62, 61)).setTextureSize(128, 128);
		this.Block13.addBox(5.5f, -29.5f, 1.0f, 1, 29, 2);
		this.Block13.setRotationPoint(-14.0f, 24.0f, 0.0f);
		(this.Block14 = new ModelRenderer((ModelBase) this, 68, 61)).setTextureSize(128, 128);
		this.Block14.addBox(-6.5f, -29.5f, 1.0f, 1, 29, 2);
		this.Block14.setRotationPoint(-14.0f, 24.0f, 0.0f);
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
		this.doortree.rotateAngleX = 0.0f;
		this.doortree.rotateAngleY = 0.0f;
		this.doortree.rotateAngleZ = 0.0f;
		this.doortree.render(scale);
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
		this.Block9.rotateAngleX = 0.0f;
		this.Block9.rotateAngleY = 0.0f;
		this.Block9.rotateAngleZ = 0.0f;
		this.Block9.render(scale);
		this.Block10.rotateAngleX = 0.0f;
		this.Block10.rotateAngleY = 0.0f;
		this.Block10.rotateAngleZ = 0.0f;
		this.Block10.render(scale);
		this.Block11.rotateAngleX = 0.0f;
		this.Block11.rotateAngleY = 0.0f;
		this.Block11.rotateAngleZ = 0.0f;
		this.Block11.render(scale);
		this.Block12.rotateAngleX = 0.0f;
		this.Block12.rotateAngleY = 0.0f;
		this.Block12.rotateAngleZ = 0.0f;
		this.Block12.render(scale);
		this.Block13.rotateAngleX = 0.0f;
		this.Block13.rotateAngleY = 0.0f;
		this.Block13.rotateAngleZ = 0.0f;
		this.Block13.render(scale);
		this.Block14.rotateAngleX = 0.0f;
		this.Block14.rotateAngleY = 0.0f;
		this.Block14.rotateAngleZ = 0.0f;
		this.Block14.render(scale);
	}
}
