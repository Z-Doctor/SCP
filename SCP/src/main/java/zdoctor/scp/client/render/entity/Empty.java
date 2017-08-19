package zdoctor.scp.client.render.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.MobTextureLocation;

public class Empty extends RenderLiving {
	private static final ResourceLocation mobTextures = new MobTextureLocation("scp", "dclasswhite");

	public Empty(RenderManager renderManager) {
		super(renderManager, new ModelBiped(), 0f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return mobTextures;
	}
}
