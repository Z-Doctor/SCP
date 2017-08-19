package zdoctor.scp.client.model.item.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNightVision extends ModelBiped {
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
	ModelRenderer Block10;
	ModelRenderer Block11;
	ModelRenderer Block12;
	ModelRenderer Block13;
	ModelRenderer Block14;

	public ModelNightVision() {
		this(0.0F);
	}

	public ModelNightVision(float par1) {
		this.Block = new ModelRenderer(this, 24, 5);
		this.Block.setTextureSize(64, 64);
		this.Block.addBox(3.5F, -28.5F, -3.5F, 1, 2, 8);
		this.Block.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block1 = new ModelRenderer(this, 2, 12);
		this.Block1.setTextureSize(64, 64);
		this.Block1.addBox(-1.0F, -32.5F, -3.5F, 2, 1, 8);
		this.Block1.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block2 = new ModelRenderer(this, 9, 30);
		this.Block2.setTextureSize(64, 64);
		this.Block2.addBox(-4.5F, -31.0F, -4.5F, 9, 6, 1);
		this.Block2.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block3 = new ModelRenderer(this, 3, 56);
		this.Block3.setTextureSize(64, 64);
		this.Block3.addBox(-2.0F, -32.25F, -4.25F, 4, 2, 3);
		this.Block3.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block4 = new ModelRenderer(this, 39, 29);
		this.Block4.setTextureSize(64, 64);
		this.Block4.addBox(1.0F, -28.5F, -6.0F, 2, 2, 2);
		this.Block4.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block5 = new ModelRenderer(this, 47, 38);
		this.Block5.setTextureSize(64, 64);
		this.Block5.addBox(1.5F, -28.0F, -6.1F, 1, 1, 1);
		this.Block5.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block6 = new ModelRenderer(this, 39, 29);
		this.Block6.setTextureSize(64, 64);
		this.Block6.addBox(-3.0F, -28.5F, -6.0F, 2, 2, 2);
		this.Block6.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block7 = new ModelRenderer(this, 47, 38);
		this.Block7.setTextureSize(64, 64);
		this.Block7.addBox(1.5F, -28.0F, -6.1F, 1, 1, 1);
		this.Block7.setRotationPoint(-4.0F, 24.0F, 0.0F);
		this.Block8 = new ModelRenderer(this, 39, 29);
		this.Block8.setTextureSize(64, 64);
		this.Block8.addBox(-1.0F, -30.75F, -6.0F, 2, 2, 2);
		this.Block8.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block9 = new ModelRenderer(this, 47, 38);
		this.Block9.setTextureSize(64, 64);
		this.Block9.addBox(1.5F, -28.0F, -6.1F, 1, 1, 1);
		this.Block9.setRotationPoint(-2.0F, 21.75F, 0.0F);
		this.Block10 = new ModelRenderer(this, 22, 17);
		this.Block10.setTextureSize(64, 64);
		this.Block10.addBox(3.5F, -30.5F, -3.5F, 1, 2, 3);
		this.Block10.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block11 = new ModelRenderer(this, 7, 4);
		this.Block11.setTextureSize(64, 64);
		this.Block11.addBox(-1.0F, -28.55F, 3.0F, 2, 2, 2);
		this.Block11.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block12 = new ModelRenderer(this, 24, 5);
		this.Block12.setTextureSize(64, 64);
		this.Block12.addBox(-4.5F, -28.5F, -3.5F, 1, 2, 8);
		this.Block12.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block13 = new ModelRenderer(this, 31, 12);
		this.Block13.setTextureSize(64, 64);
		this.Block13.addBox(-3.5F, -28.5F, 3.5F, 7, 2, 1);
		this.Block13.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.Block14 = new ModelRenderer(this, 31, 12);
		this.Block14.setTextureSize(64, 64);
		this.Block14.addBox(-1.0F, -31.5F, 3.5F, 2, 3, 1);
		this.Block14.setRotationPoint(0.0F, 24.0F, 0.0F);
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

		this.Block10.rotateAngleX = 0.0F;
		this.Block10.rotateAngleY = 0.0F;
		this.Block10.rotateAngleZ = 0.0F;
		this.Block10.renderWithRotation(par7);

		this.Block11.rotateAngleX = 0.0F;
		this.Block11.rotateAngleY = 0.0F;
		this.Block11.rotateAngleZ = 0.0F;
		this.Block11.renderWithRotation(par7);

		this.Block12.rotateAngleX = 0.0F;
		this.Block12.rotateAngleY = 0.0F;
		this.Block12.rotateAngleZ = 0.0F;
		this.Block12.renderWithRotation(par7);

		this.Block13.rotateAngleX = 0.0F;
		this.Block13.rotateAngleY = 0.0F;
		this.Block13.rotateAngleZ = 0.0F;
		this.Block13.renderWithRotation(par7);

		this.Block14.rotateAngleX = 0.0F;
		this.Block14.rotateAngleY = 0.0F;
		this.Block14.rotateAngleZ = 0.0F;
		this.Block14.renderWithRotation(par7);
	}
}
