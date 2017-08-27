//package zdoctor.scp.client.render.entity.tile;
//
//import org.lwjgl.opengl.GL11;
//
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
//import net.minecraft.entity.Entity;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.ResourceLocation;
//import zdoctor.scp.client.model.entity.ModelButtonOn;
//import zdoctor.scp.entity.tile.TileEntityButtonOn;
//
//public class ButtonOnRender extends TileEntitySpecialRenderer {
//	private ModelButtonOn model;
//
//	public ButtonOnRender() {
//		this.model = new ModelButtonOn();
//	}
//
//	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
//		TileEntityButtonOn Door = (TileEntityButtonOn) te;
//		int direction = te.getWorld().getBlockMetadata(te.xCoord, te.yCoord, te.zCoord);
//		if (direction == 3) {
//			direction = 1;
//		} else if (direction == 1) {
//			direction = 3;
//		} else if (direction == 0) {
//			direction = 2;
//		} else if (direction == 2) {
//			direction = 0;
//		}
//		GL11.glPushMatrix();
//		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
//		ResourceLocation textures = new ResourceLocation("scp:textures/model/button.png");
//		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
//		GL11.glPushMatrix();
//		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
//		GL11.glRotatef(direction * 90.0F, 0.0F, 1.0F, 0.0F);
//		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
//		GL11.glPopMatrix();
//		GL11.glPopMatrix();
//	}
//}
