package zdoctor.scp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import zdoctor.lazymodder.easy.blocks.EasyRotatingPillar;
import zdoctor.lazymodder.easy.items.EasyItemBlock;

public class BlockPillarDeco extends Block {
	 public static final String[] VARIANTSLIST = { "wall", "pd", "downwall", "medwall", "officewall"};

	// static final String[] subBlocks = { "ctile", "ctileg", "floortile",
	// "wallbottom", "wallmiddle", "walltop",
	// "1162wall", "1162walla", "concrete", "pdfloor", "pdwallbottom",
	// "pdwallmiddle", "pdwalltop", "red",
	// "vent" };

	public BlockPillarDeco() {
		super(Material.ROCK);
		for(int i = 0; i < VARIANTSLIST.length; i++) {
			EasyRotatingPillar block = new EasyRotatingPillar(VARIANTSLIST[i], 1, false, Material.ROCK) {
				@Override
				public ItemBlock createItem() {
					return new EasyItemBlock(this, getSubCount()) {
						@Override
						public String getRegistryNameForMeta(int meta) {
							return "scp:pillarblocks";
						}
						
						@Override
						public int getMetadata(ItemStack stack) {
							return 0;
						}
					};
				}
				
				@Override
				public String getRegistryNameForMeta(int meta) {
					return "scp:pillarblocks";
				}
				
			};
			block.setHardness(1.0F);
			SCPBlock.initBlock(block);
		}
	}
}
