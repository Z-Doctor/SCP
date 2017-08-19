package zdoctor.scp.client.render.entity.living;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.MobTextureLocation;
import zdoctor.scp.client.model.entity.living.mob.ModelPlagueDoctor049;

public class RenderPlagueDoctor049 extends RenderLiving {
	private static final ResourceLocation mobTextures = new MobTextureLocation("scp", "plaguedoctor");
	private static final String __OBFID = "CL_00000984";

	public RenderPlagueDoctor049(RenderManager renderManager) {
		super(renderManager, new ModelPlagueDoctor049(), 0f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return mobTextures;
	}
}
