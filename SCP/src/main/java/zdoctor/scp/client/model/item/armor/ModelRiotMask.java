package zdoctor.scp.client.model.item.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRiotMask extends ModelBase {
	ModelRenderer Block;
	ModelRenderer Block1;
	ModelRenderer Block2;
	ModelRenderer Block3;
	ModelRenderer Block4;
	ModelRenderer Block5;
	ModelRenderer Block6;
	ModelRenderer Block7;
	ModelRenderer Block8;
	ModelRenderer Block9;

	public ModelRiotMask() {
		this(0.0F);
	}

	public ModelRiotMask(float par1) {
		this.Block = new ModelRenderer(this, 31, 14);
		this.Block.setTextureSize(64, 64);
		this.Block.addBox(-4.0F, -33.0F, -4.5F, 8, 4, 1);
		this.Block.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block1 = new ModelRenderer(this, 9, 28);
		this.Block1.setTextureSize(64, 64);
		this.Block1.addBox(-4.5F, -29.5F, -5.0F, 9, 4, 1);
		this.Block1.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block2 = new ModelRenderer(this, 7, 36);
		this.Block2.setTextureSize(64, 64);
		this.Block2.addBox(-4.0F, -33.0F, 3.5F, 8, 6, 1);
		this.Block2.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block3 = new ModelRenderer(this, 32, 34);
		this.Block3.setTextureSize(64, 64);
		this.Block3.addBox(3.5F, -33.0F, -4.0F, 1, 4, 8);
		this.Block3.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block4 = new ModelRenderer(this, 4, 14);
		this.Block4.setTextureSize(64, 64);
		this.Block4.addBox(-4.5F, -33.0F, -4.0F, 1, 4, 8);
		this.Block4.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block5 = new ModelRenderer(this, 6, 47);
		this.Block5.setTextureSize(64, 64);
		this.Block5.addBox(-4.0F, -33.5F, -4.0F, 8, 1, 8);
		this.Block5.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block6 = new ModelRenderer(this, 38, 23);
		this.Block6.setTextureSize(64, 64);
		this.Block6.addBox(3.5F, -29.0F, -2.0F, 1, 2, 6);
		this.Block6.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block7 = new ModelRenderer(this, 16, 13);
		this.Block7.setTextureSize(64, 64);
		this.Block7.addBox(-4.5F, -29.0F, -2.0F, 1, 2, 6);
		this.Block7.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block8 = new ModelRenderer(this, 46, 7);
		this.Block8.setTextureSize(64, 64);
		this.Block8.addBox(-4.25F, -29.5F, -4.0F, 1, 2, 2);
		this.Block8.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block9 = new ModelRenderer(this, 46, 7);
		this.Block9.setTextureSize(64, 64);
		this.Block9.addBox(3.25F, -29.5F, -4.0F, 1, 2, 2);
		this.Block9.setRotationPoint(0.0F, 24.0F, 0.0F);
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		this.Block.rotateAngleX = 0.0F;
		this.Block.rotateAngleY = 0.0F;
		this.Block.rotateAngleZ = 0.0F;
		this.Block.renderWithRotation(par7);

		this.Block1.rotateAngleX = 0.0F;
		this.Block1.rotateAngleY = 0.0F;
		this.Block1.rotateAngleZ = 0.0F;
		this.Block1.renderWithRotation(par7);

		this.Block2.rotateAngleX = 0.0F;
		this.Block2.rotateAngleY = 0.0F;
		this.Block2.rotateAngleZ = 0.0F;
		this.Block2.renderWithRotation(par7);

		this.Block3.rotateAngleX = 0.0F;
		this.Block3.rotateAngleY = 0.0F;
		this.Block3.rotateAngleZ = 0.0F;
		this.Block3.renderWithRotation(par7);

		this.Block4.rotateAngleX = 0.0F;
		this.Block4.rotateAngleY = 0.0F;
		this.Block4.rotateAngleZ = 0.0F;
		this.Block4.renderWithRotation(par7);

		this.Block5.rotateAngleX = 0.0F;
		this.Block5.rotateAngleY = 0.0F;
		this.Block5.rotateAngleZ = 0.0F;
		this.Block5.renderWithRotation(par7);

		this.Block6.rotateAngleX = 0.0F;
		this.Block6.rotateAngleY = 0.0F;
		this.Block6.rotateAngleZ = 0.0F;
		this.Block6.renderWithRotation(par7);

		this.Block7.rotateAngleX = 0.0F;
		this.Block7.rotateAngleY = 0.0F;
		this.Block7.rotateAngleZ = 0.0F;
		this.Block7.renderWithRotation(par7);

		this.Block8.rotateAngleX = 0.0F;
		this.Block8.rotateAngleY = 0.0F;
		this.Block8.rotateAngleZ = 0.0F;
		this.Block8.renderWithRotation(par7);

		this.Block9.rotateAngleX = 0.0F;
		this.Block9.rotateAngleY = 0.0F;
		this.Block9.rotateAngleZ = 0.0F;
		this.Block9.renderWithRotation(par7);
	}
}
