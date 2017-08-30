package zdoctor.scp.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zdoctor.lazymodder.easy.blocks.EasyBlock;
import zdoctor.scp.blocks.BlockDeco2;
import zdoctor.scp.blocks.BlockDeco3;
import zdoctor.scp.blocks.BlockDoor;
import zdoctor.scp.blocks.BlockDoor2;
import zdoctor.scp.blocks.BlockPillarDeco;
import zdoctor.scp.blocks.BlockSCP079;
import zdoctor.scp.blocks.BlockSCP895;
import zdoctor.scp.blocks.BlockSCPQuack;
import zdoctor.scp.blocks.BlockSmallDesk;

public class ZBlocks {
	public static Block DecoBlocks;
	public static Block DecoBlocks2;
	public static Block DecoBlocks3;

	public static Block blockDoor;
	public static Block blockDoor2;

	public static Block blockSmallDesk;

	public static Block blockSCP079;
	public static Block blockSCP895;
	public static Block blockSCPQuack;

	public static Block ButtonOff;
	public static Block ButtonOn;
	public static Block blockSkyBlock;
	public static Block blockSCP914;

	public static void preInit() {
		DecoBlocks = new BlockPillarDeco();
		DecoBlocks2 = new BlockDeco2();
		DecoBlocks3 = new BlockDeco3();

		blockDoor = new BlockDoor();
		blockDoor2 = new BlockDoor2();

		blockSmallDesk = new BlockSmallDesk();

		blockSCP079 = new BlockSCP079();
		blockSCP895 = new BlockSCP895();
		blockSCPQuack = new BlockSCPQuack();
		
		blockSCP914 = new BlockSCP914();
		
	}
}
