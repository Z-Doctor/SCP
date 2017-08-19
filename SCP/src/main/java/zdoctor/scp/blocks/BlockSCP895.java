package zdoctor.scp.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import zdoctor.lazymodder.easy.entity.tile.EasyRotatingTileEntityBlock;
import zdoctor.lazymodder.easy.interfaces.ICustomStateMap;
import zdoctor.lazymodder.easy.interfaces.INoModel;
import zdoctor.scp.client.render.entity.tile.RenderSCP895;
import zdoctor.scp.entity.tile.TileEntitySCP895;

public class BlockSCP895 extends EasyRotatingTileEntityBlock implements ICustomStateMap {
	public BlockSCP895() {
		super("BlockSCP895", TileEntitySCP895.class, RenderSCP895.class, Material.WOOD);
		setHardness(2.0F);
		SCPBlock.initBlock(this);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return FULL_BLOCK_AABB.expand(0, 1, 0);
	}
	
	@Override
	public IStateMapper getStateMap() {
		return new StateMap.Builder().ignore(FACING).build();
	}

}
