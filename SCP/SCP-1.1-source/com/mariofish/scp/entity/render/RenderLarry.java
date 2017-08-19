package zdoctor.scp.entity.render;

import zdoctor.scp.entity.EntityLarry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderLarry
  extends RenderLiving
{
  private static final ResourceLocation mobTextures = new ResourceLocation("scp:textures/entity/larry.png");
  private static final String __OBFID = "CL_00000984";
  
  public RenderLarry(ModelBase par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityLarry entity)
  {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityLarry)entity);
  }
}


