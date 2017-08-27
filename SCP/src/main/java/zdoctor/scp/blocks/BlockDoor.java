package zdoctor.scp.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import zdoctor.lazymodder.easy.blocks.tileentity.EasyDoorTileEntityBlockWithRender;
import zdoctor.lazymodder.easy.interfaces.ICustomStateMap;
import zdoctor.scp.client.render.entity.tile.RenderDoor;
import zdoctor.scp.entity.tile.TileEntityDoor;
import zdoctor.scp.init.ZItems;

public class BlockDoor extends EasyDoorTileEntityBlockWithRender implements ICustomStateMap {
	protected static AxisAlignedBB FULL_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 2.0D, 1.0D);

	protected static AxisAlignedBB TOP_AABB = new AxisAlignedBB(0.0D, 0.95D, 0.0D, 1.0D, 1.0D, 1.0D);
	protected static AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.1D, 0.0D, 0.0D, 0.9D, 1.0D, 0.05D);
	protected static AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.1D, 0.0D, 0.95D, 0.9D, 1.0D, 1.0D);
	protected static AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.95D, 0.0D, 0.1D, 1.0D, 1.0D, 0.9D);
	protected static AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.1D, 0.05D, 1.0D, 0.9D);

	protected static AxisAlignedBB DOORNS_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.6D, 1.0D, 1.0D, 0.31);
	protected static AxisAlignedBB DOOREW_AABB = new AxisAlignedBB(0.7D, 0.0D, 0.1D, 0.4D, 1.0D, 1.1D);

	public BlockDoor() {
		super("door", TileEntityDoor.class, RenderDoor.class);
		setHardness(3.5F);
		SCPBlock.initBlock(this);
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		TileEntityDoor te = (TileEntityDoor) worldIn.getTileEntity(pos);
		if (te != null) {
			if (state.getValue(HALF) == EnumDoorHalf.UPPER) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, TOP_AABB);
				state = worldIn.getBlockState(pos.down());
			}
			if (state.getValue(FACING) == EnumFacing.NORTH || state.getValue(FACING) == EnumFacing.SOUTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, EAST_AABB);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, WEST_AABB);
				if (!te.isOpen())
					addCollisionBoxToList(pos, entityBox, collidingBoxes, DOORNS_AABB);
//				else
//					addCollisionBoxToList(pos, entityBox, collidingBoxes, DOORNS_AABB.offset(-0.87, 0, 0));
			} else if (state.getValue(FACING) == EnumFacing.EAST || state.getValue(FACING) == EnumFacing.WEST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, SOUTH_AABB);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, NORTH_AABB); 
				if (!te.isOpen())
					addCollisionBoxToList(pos, entityBox, collidingBoxes, DOOREW_AABB);
//				else
//					addCollisionBoxToList(pos, entityBox, collidingBoxes, DOOREW_AABB.offset(0, 0, -0.97));
			}
		}
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		TileEntityDoor te = (TileEntityDoor) source.getTileEntity(pos);
		if (state.getValue(HALF) == EnumDoorHalf.UPPER)
			return FULL_AABB.offset(0, -1, 0);
		return FULL_AABB;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (worldIn.getTileEntity(pos) != null && worldIn.getTileEntity(pos) instanceof TileEntityDoor) {
			if (state.getValue(HALF) == EnumDoorHalf.UPPER) {
				pos = pos.down();
				state = worldIn.getBlockState(pos);
			}
			
			TileEntityDoor door = ((TileEntityDoor) worldIn.getTileEntity(pos));
			TileEntityDoor door2 = ((TileEntityDoor) worldIn.getTileEntity(pos.up()));
			if (playerIn.getHeldItemMainhand().getItem() == ZItems.KEY_CARD)
				hand = EnumHand.MAIN_HAND;
			else if (playerIn.getHeldItemOffhand().getItem() == ZItems.KEY_CARD)
				hand = EnumHand.OFF_HAND;
			else
				hand = null;
			if (hand != null && playerIn.getHeldItem(hand).getMetadata() > 0)
				door.toggleOpen();
			door2.setOpen(door.isOpen());
		}
		return true;
	}

	@Override
	public IStateMapper getStateMap() {
		return new StateMap.Builder().ignore(HALF).ignore(POWERED).ignore(FACING).ignore(HINGE).ignore(OPEN).build();
	}

}
