package zdoctor.scp.client.render.entity.tile;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoor.EnumDoorHalf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.EntityTextureLocation;
import zdoctor.scp.ModMain;
import zdoctor.scp.client.model.entity.tile.ModelDoorClosed;
import zdoctor.scp.client.model.entity.tile.ModelDoorOpen;
import zdoctor.scp.entity.tile.TileEntityDoor;

public class RenderDoor extends TileEntitySpecialRenderer {
	private static ResourceLocation TEXTURE = new EntityTextureLocation(ModMain.MODID, "scpdoor");
	private ModelDoorOpen modelOpen;
	private ModelDoorClosed modelClosed;

	public RenderDoor() {
		this.modelOpen = new ModelDoorOpen();
		this.modelClosed = new ModelDoorClosed();
	}

	@Override
	public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		TileEntityDoor door = (TileEntityDoor) te;
		IBlockState state = te.getWorld().getBlockState(te.getPos());
		EnumDoorHalf half = state.getValue(BlockDoor.HALF);
		if (half == BlockDoor.EnumDoorHalf.UPPER)
			return;

		int direction = 0;
		if (te != null)
			direction = te.getBlockMetadata();

		bindTexture(TEXTURE);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5f, y + 1.5f, z + 0.5f);
		GlStateManager.rotate(180, 1, 0, 0);

		if (direction == 3) {
			direction = 0;
		} else if (direction == 1) {
			direction = 2;
		} else if (direction == 0) {
			direction = 1;
		} else if (direction == 2) {
			direction = 3;
		}

		GlStateManager.rotate(direction * 90.0F, 0.0F, 1.0F, 0.0F);

		if (door.isOpen())
			modelOpen.render(null, 0, 0, 0, 0, 0, 0.0625F);
		else
			modelClosed.render(null, 0, 0, 0, 0, 0, 0.0625F);

		GlStateManager.popMatrix();
	}
}
