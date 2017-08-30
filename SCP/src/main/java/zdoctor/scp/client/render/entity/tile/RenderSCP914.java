package zdoctor.scp.client.render.entity.tile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;
import zdoctor.scp.ModMain;
import zdoctor.scp.client.model.entity.tile.ModelSCP914;

public class RenderSCP914 extends TileEntitySpecialRenderer {
	private static final ResourceLocation TEXTURE = new EntityTextureLocation(ModMain.MODID, "scp914");
	private ModelSCP914 model;

	public RenderSCP914() {
		this.model = new ModelSCP914();
	}

	@Override
	public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		bindTexture(TEXTURE);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5f, y + 1.5f, z + 0.5f);
		GlStateManager.rotate(180, 1, 0, 0);
		model.render(null, 0, 0, 0, 0, 0, 0.0625F);
		GlStateManager.popMatrix();
	}
}
