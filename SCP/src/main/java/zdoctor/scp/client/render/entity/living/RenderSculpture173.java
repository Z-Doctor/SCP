package zdoctor.scp.client.render.entity.living;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.MobTextureLocation;
import zdoctor.scp.client.model.entity.living.mob.ModelSculpture173;

public class RenderSculpture173 extends RenderLiving {
	private static final ResourceLocation mobTextures = new MobTextureLocation("scp", "sculpture");

	public RenderSculpture173(RenderManager renderManager) {
		super(renderManager, new ModelSculpture173(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return mobTextures;
	}

}
