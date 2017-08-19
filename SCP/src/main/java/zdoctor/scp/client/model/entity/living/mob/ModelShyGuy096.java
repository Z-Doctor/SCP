package zdoctor.scp.client.model.entity.living.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelShyGuy096 extends ModelBiped {
	public ModelShyGuy096() {
		this(0.0f);
	}

	public ModelShyGuy096(final float p_i1156_1_) {
		super(p_i1156_1_, 0.0f, 64, 32);
		(this.bipedRightArm = new ModelRenderer((ModelBase) this, 40, 16)).addBox(-1.0f, -2.0f, -1.0f, 2, 12, 2,
				p_i1156_1_);
		this.bipedRightArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
		this.bipedLeftArm = new ModelRenderer((ModelBase) this, 40, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.addBox(-1.0f, -2.0f, -1.0f, 2, 12, 2, p_i1156_1_);
		this.bipedLeftArm.setRotationPoint(5.0f, 2.0f, 0.0f);
		(this.bipedRightLeg = new ModelRenderer((ModelBase) this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 12, 2,
				p_i1156_1_);
		this.bipedRightLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		this.bipedLeftLeg = new ModelRenderer((ModelBase) this, 0, 16);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.addBox(-1.0f, 0.0f, -1.0f, 2, 12, 2, p_i1156_1_);
		this.bipedLeftLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
	}
}
