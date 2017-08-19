package zdoctor.scp.init;

import net.minecraft.block.Block;
import zdoctor.scp.blocks.BlockDeco;
import zdoctor.scp.blocks.BlockDeco2;
import zdoctor.scp.blocks.BlockDeco3;
import zdoctor.scp.blocks.BlockDoor;
import zdoctor.scp.blocks.BlockDoor2;
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

	public static void preInit() {
		DecoBlocks = new BlockDeco();
		DecoBlocks2 = new BlockDeco2();
		DecoBlocks3 = new BlockDeco3();
		
		blockDoor = new BlockDoor();
		blockDoor2 = new BlockDoor2();

		blockSmallDesk = new BlockSmallDesk();

		blockSCP079 = new BlockSCP079();
		blockSCP895 = new BlockSCP895();
		blockSCPQuack = new BlockSCPQuack();
	}
}
