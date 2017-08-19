package zdoctor.scp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import zdoctor.lazymodder.easy.blocks.EasyBlock;
import zdoctor.scp.init.SCPCreativeTabs;

public class SCPBlock extends EasyBlock {
	public SCPBlock(String name) {
		this(name, 1, Material.ROCK);
	}
	public SCPBlock(String name, int subBlockCount) {
		this(name, subBlockCount, Material.ROCK);
	}
	public SCPBlock(String name, int subBlockCount, Material materialIn) {
		super(name, subBlockCount, materialIn);
		initBlock(this);
	}
	
	public static void initBlock(Block block) {
		block.setCreativeTab(SCPCreativeTabs.SCPTab);
	}
	
}
