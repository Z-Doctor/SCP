package zdoctor.scp.models;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;




@SideOnly(Side.CLIENT)
public class ModelSCP096
  extends ModelBiped
{
  public ModelSCP096()
  {
    this(0.0F);
  }
  
  public ModelSCP096(float p_i1156_1_)
  {
    super(p_i1156_1_, 0.0F, 64, 32);
    this.bipedRightArm = new ModelRenderer(this, 40, 16);
    this.bipedRightArm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, p_i1156_1_);
    this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.bipedLeftArm = new ModelRenderer(this, 40, 16);
    this.bipedLeftArm.mirror = true;
    this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, p_i1156_1_);
    this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.bipedRightLeg = new ModelRenderer(this, 0, 16);
    this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, p_i1156_1_);
    this.bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
    this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
    this.bipedLeftLeg.mirror = true;
    this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, p_i1156_1_);
    this.bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
  }
}


