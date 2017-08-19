package zdoctor.scp.client.render.entity.living;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.MobTextureLocation;

public class RenderLarry106 extends RenderLiving {
	private static final ResourceLocation mobTextures = new MobTextureLocation("scp", "larry");;
	private static final String __OBFID = "CL_00000984";

	public RenderLarry106(RenderManager renderManager) {
		super(renderManager, new ModelBiped(), 0);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return mobTextures;
	}

}
