package zdoctor.scp.blocks;

import net.minecraft.block.material.Material;
import zdoctor.lazymodder.easy.blocks.EasyMetaBlock;

public class BlockDeco2 extends EasyMetaBlock {
	static final String[] subBlocks = { "concretefloor", "downwallbottom", "downwallmiddle", "downwalltop",
			"medwallbottom", "medwallmiddle", "medwalltop", "mesh", "officewallbottom", "officewallmiddle",
			"officewalltop", "rockmoss", "thickwall", "wallside" };
	
	public BlockDeco2() {
		super("DecoBlock2", subBlocks.length, Material.ROCK);
		setHardness(1.0F);
		SCPBlock.initBlock(this);
	}

	@Override
	public String getNameFromMeta(int meta) {
		return subBlocks[meta];
	}
	
}
