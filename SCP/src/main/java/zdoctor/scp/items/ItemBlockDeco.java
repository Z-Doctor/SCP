package zdoctor.scp.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDeco extends ItemBlock {
	static final String[] subBlocks = { "ctile", "ctileg", "floortile", "wallbottom", "wallmiddle", "walltop",
			"1162wall", "1162walla", "concrete", "pdfloor", "pdwallbottom", "pdwallmiddle", "pdwalltop", "red",
			"vent" };

	public ItemBlockDeco(Block dogshit) {
		super(dogshit);
		setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getMetadata();
		if ((i < 0) || (i >= subBlocks.length)) {
			i = 0;
		}

		return super.getUnlocalizedName() + "." + subBlocks[i];
	}

	public int getMetadata(int meta) {
		return meta;
	}
}
