package zdoctor.scp.init;

import org.lwjgl.opengl.EXTFramebufferBlit;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import zdoctor.lazymodder.easy.blocks.tileentity.EasyTESRBlock;

public class SkyBlock extends EasyTESRBlock {
	public SkyBlock() {
		super("SkyBlock", SkyTile.class, SkyRenderer.class, Material.ROCK);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return super.isOpaqueCube(state);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	public static class SkyTile extends TileEntity {

	}

	public static class RenderManager {
		public static final RenderManager INSTANCE = new RenderManager();

		private Framebuffer skyFb;

	}

	public static class SkyRenderer extends TileEntitySpecialRenderer {
		private Framebuffer skyFb;

		@Override
		public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage,
				float alpha) {
			GlStateManager.pushMatrix();
			final Framebuffer mcFb = Minecraft.getMinecraft().getFramebuffer();

			mcFb.bindFramebuffer(false);
			if (skyFb == null) {
				skyFb = new Framebuffer(mcFb.framebufferWidth, mcFb.framebufferHeight, false);
			} else if (skyFb.framebufferWidth != mcFb.framebufferWidth
					|| skyFb.framebufferHeight != mcFb.framebufferHeight) {
				skyFb.createBindFramebuffer(mcFb.framebufferWidth, mcFb.framebufferHeight);
			}
			blitFramebuffer(mcFb, skyFb);
			renderSkyTexture();
			GlStateManager.popMatrix();
		}

		private void bufferFrame(Framebuffer in, Framebuffer out) {
			GL30.glBlitFramebuffer(0, 0, in.framebufferWidth, in.framebufferHeight, 0, 0, out.framebufferWidth,
					out.framebufferHeight, GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);

		}

		public void renderSkyTexture() {
			// if (!isActive)
			// return;

			final Minecraft mc = Minecraft.getMinecraft();
			final Framebuffer mcFb = mc.getFramebuffer();

			GlStateManager.disableFog();
			GlStateManager.disableLighting();

			GlStateManager.matrixMode(GL11.GL_PROJECTION);
			GlStateManager.pushMatrix();
			GlStateManager.matrixMode(GL11.GL_MODELVIEW);
			GlStateManager.pushMatrix();

			GlStateManager.depthMask(false);
			skyFb.framebufferRender(mc.displayWidth, mc.displayHeight);
			GlStateManager.enableDepth();
			GlStateManager.viewport(0, 0, mcFb.framebufferWidth, mcFb.framebufferHeight);

			GlStateManager.popMatrix();
			GlStateManager.matrixMode(GL11.GL_PROJECTION);
			GlStateManager.popMatrix();
			GlStateManager.matrixMode(GL11.GL_MODELVIEW);

			GlStateManager.enableLighting();
			GlStateManager.enableFog();
		}
	}

	public static void blitFramebuffer(Framebuffer in, Framebuffer out) {
		OpenGlHelper.glBindFramebuffer(EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, in.framebufferObject);
		OpenGlHelper.glBindFramebuffer(EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, out.framebufferObject);

		blitFramebufferOp(in, out);

		OpenGlHelper.glBindFramebuffer(EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, 0);
		OpenGlHelper.glBindFramebuffer(EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, 0);
	}

	public static void blitFramebufferOp(Framebuffer in, Framebuffer out) {
		EXTFramebufferBlit.glBlitFramebufferEXT(0, 0, in.framebufferWidth, in.framebufferHeight, 0, 0,
				out.framebufferWidth, out.framebufferHeight, GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);
	}

}
