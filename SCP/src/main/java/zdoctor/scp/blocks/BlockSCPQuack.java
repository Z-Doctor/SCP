package zdoctor.scp.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import zdoctor.lazymodder.easy.blocks.tileentity.EasyRotatingTileEntityBlockWithRender;
import zdoctor.lazymodder.easy.interfaces.ICustomStateMap;
import zdoctor.scp.client.render.entity.tile.RenderSCPQuack;
import zdoctor.scp.entity.tile.TileEntitySCPQuack;

public class BlockSCPQuack extends EasyRotatingTileEntityBlockWithRender implements ICustomStateMap {
	public BlockSCPQuack() {
		super("BlockSCPQuack", TileEntitySCPQuack.class,  RenderSCPQuack.class, Material.WOOD);
		setHardness(2.0F);
		SCPBlock.initBlock(this);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return FULL_BLOCK_AABB.contract(0.7, 0.425, 0.375).offset(0.35, 0, 0.075);
	}
	
	@Override
	public IStateMapper getStateMap() {
		return new StateMap.Builder().ignore(FACING).build();
	}

}
