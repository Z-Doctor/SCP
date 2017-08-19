package zdoctor.scp.blocks;

import net.minecraft.block.material.Material;
import zdoctor.lazymodder.easy.blocks.EasyMetaBlock;

public class BlockDeco3 extends EasyMetaBlock {
	static final String[] subBlocks = { "metalboxa", "metalboxb", "metalboxc", "metalboxd" };
	
	public BlockDeco3() {
		super("DecoBlock3", subBlocks.length, Material.ROCK);
		setHardness(1.0F);
		SCPBlock.initBlock(this);
	}

	@Override
	public String getNameFromMeta(int meta) {
		return subBlocks[meta];
	}
}
