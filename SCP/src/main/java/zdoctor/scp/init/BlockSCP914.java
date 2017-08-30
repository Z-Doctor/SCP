package zdoctor.scp.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import zdoctor.lazymodder.easy.blocks.tileentity.EasyTESRBlock;
import zdoctor.scp.client.render.entity.tile.RenderSCP914;
import zdoctor.scp.entity.tile.TileEntitySCP914;

public class BlockSCP914 extends EasyTESRBlock {

	public BlockSCP914() {
		super("SCP914", TileEntitySCP914.class, RenderSCP914.class, Material.IRON);
	}

}
