package zdoctor.scp.entity.render;

import zdoctor.scp.models.ModelSCP173;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;


public class RenderSculpture
  extends RenderLiving
{
  private static final ResourceLocation TEXTURE = new ResourceLocation("scp:textures/entity/sculpture.png");
  
  public RenderSculpture(ModelSCP173 modelSCP173, int i)
  {
    super(new ModelSCP173(), 0.5F);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    return TEXTURE;
  }
  
  protected void preRenderCallback(EntityLivingBase entity, float f) {}
}


