//package zdoctor.scp.blocks;
//
//import java.util.Random;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockContainer;
//import net.minecraft.block.material.Material;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.world.World;
//import zdoctor.scp.SCP;
//import zdoctor.scp.entity.tile.TileEntityButtonOff;
//import zdoctor.scp.entity.tile.TileEntityButtonOn;
//
//public class Button extends BlockContainer {
//	private boolean isOn = false;
//
//	public Button(Material mat, boolean isOn) {
//		super(mat);
//		setHardness(3.5F);
//		setUnlocalizedName("button");
//		setSoundType(soundTypeMetal);
//		this.isOn = isOn;
//		setTextureName("scp:button");
//	}
//
////	public int getRenderType() {
////		return -1;
////	}
////
////	public boolean isOpaqueCube() {
////		return false;
////	}
////
////	public boolean isFullCube() {
////		return false;
////	}
////
////	public void onBlockAdded(World world, int x, int y, int z) {
////		if (!world.isRemote) {
////			if ((this.isOn) && (!world.isBlockIndirectlyGettingPowered(x, y, z))) {
////				world.scheduleBlockUpdate(x, y, z, this, 4);
////			} else if ((!this.isOn) && (world.isBlockIndirectlyGettingPowered(x, y, z))) {
////				world.setBlock(x, y, z, SCP.ButtonOn, world.getBlockMetadata(x, y, z), 2);
////			}
////		}
////	}
////
////	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
////		if (!world.isRemote) {
////			if ((this.isOn) && (!world.isBlockIndirectlyGettingPowered(x, y, z))) {
////				world.scheduleBlockUpdate(x, y, z, this, 4);
////			} else if ((!this.isOn) && (world.isBlockIndirectlyGettingPowered(x, y, z))) {
////				world.setBlock(x, y, z, SCP.ButtonOn, world.getBlockMetadata(x, y, z), 2);
////				setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F);
////			}
////		}
////	}
////
////	public void updateTick(World world, int x, int y, int z, Random random) {
////		if ((!world.isRemote) && (this.isOn) && (!world.isBlockIndirectlyGettingPowered(x, y, z))) {
////			world.setBlock(x, y, z, SCP.ButtonOff, world.getBlockMetadata(x, y, z), 2);
////			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
////		}
////	}
////
////	public Item getItemDropped(int i, Random random, int j) {
////		return Item.getItemFromBlock(SCP.ButtonOff);
////	}
////
////	protected ItemStack createStackedBlock(int i) {
////		return new ItemStack(SCP.ButtonOff);
////	}
////
////	public TileEntity createNewTileEntity(World worldIn, int meta) {
////		if (this.isOn) {
////			return new TileEntityButtonOn();
////		}
////		return new TileEntityButtonOff();
////	}
////
////	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
////		int l = MathHelper.floor(entity.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3;
////		world.setBlockMetadataWithNotify(x, y, z, l, 2);
////	}
//}
