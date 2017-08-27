package zdoctor.scp.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMap;
import zdoctor.lazymodder.easy.blocks.tileentity.EasyRotatingTileEntityBlockWithRender;
import zdoctor.lazymodder.easy.interfaces.ICustomStateMap;
import zdoctor.scp.client.render.entity.tile.RenderSmallDesk;
import zdoctor.scp.entity.tile.TileEntitySmallDesk;

public class BlockSmallDesk extends EasyRotatingTileEntityBlockWithRender implements ICustomStateMap {
	public BlockSmallDesk() {
		super("BlockSmallDesk", TileEntitySmallDesk.class,  RenderSmallDesk.class, Material.WOOD);
		setHardness(2.0F);
		SCPBlock.initBlock(this);
	}
	
	@Override
	public IStateMapper getStateMap() {
		return new StateMap.Builder().ignore(FACING).build();
	}

}
