package zdoctor.scp.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import zdoctor.lazymodder.easy.entity.tile.EasyRotatingTileEntityBlock;
import zdoctor.lazymodder.easy.interfaces.ICustomStateMap;
import zdoctor.scp.client.render.entity.tile.RenderComputer079;
import zdoctor.scp.entity.tile.TileEntityComputer079;

public class BlockSCP079 extends EasyRotatingTileEntityBlock implements ICustomStateMap {
	public BlockSCP079() {
		super("BlockSCP079", TileEntityComputer079.class, RenderComputer079.class, Material.WOOD);
		setHardness(2.0F);
		SCPBlock.initBlock(this);
	}
	
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos) {
		return super.getSelectedBoundingBox(state, worldIn, pos);
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		super.addCollisionBoxToList(state, worldIn, pos, entityBox, collidingBoxes, entityIn, p_185477_7_);
	}
	
	@Override
	public IStateMapper getStateMap() {
		return new StateMap.Builder().ignore(FACING).build();
	}

}