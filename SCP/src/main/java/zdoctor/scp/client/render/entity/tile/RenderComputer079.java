package zdoctor.scp.client.render.entity.tile;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;
import zdoctor.scp.ModMain;
import zdoctor.scp.client.model.entity.tile.ModelComputer079;

public class RenderComputer079 extends TileEntitySpecialRenderer {
	private static ResourceLocation TEXTURE = new EntityTextureLocation(ModMain.MODID, "scp079");
	private ModelComputer079 model;

	public RenderComputer079() {
		this.model = new ModelComputer079();
	}

	@Override
	public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		int i = 0;
		if (te != null)
			i = te.getBlockMetadata();

		GlStateManager.pushMatrix();
		bindTexture(TEXTURE);
		GlStateManager.translate(x + 0.5f, y + 1.5f, z + 0.5f);
		GlStateManager.rotate(180, 1, 0, 0);

		int j = 0;
		if (i == 3) {
			j = 270;
		}
		if (i == 2) {
			j = 180;
		}
		if (i == 1) {
			j = 90;
		}
		if (i == 0) {
			j = 360;
		}
		GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);

		model.render(null, 0, 0, 0, 0, 0, 0.0625F);
		GlStateManager.popMatrix();
	}

}
