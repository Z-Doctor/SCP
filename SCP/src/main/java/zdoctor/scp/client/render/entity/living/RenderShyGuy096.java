package zdoctor.scp.client.render.entity.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.MobTextureLocation;
import zdoctor.scp.client.model.entity.living.mob.ModelShyGuy096;
import zdoctor.scp.entity.living.EntityShyGuy096;

public class RenderShyGuy096 extends RenderLiving {
	private static final ResourceLocation ANGRY_TEXTURE = new MobTextureLocation("scp", "shyguy096angry");
	private static final ResourceLocation IDLE_TEXTURE = new MobTextureLocation("scp", "shyguy096idle");

	public RenderShyGuy096(RenderManager renderManager) {
		super(renderManager, new ModelShyGuy096(), 0f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return ((EntityShyGuy096)entity).isScreaming() ? ANGRY_TEXTURE : IDLE_TEXTURE;
	}
	
}
