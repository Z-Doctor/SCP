package zdoctor.scp.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDeco2 extends ItemBlock {
	static final String[] subBlocks = { "concretefloor", "downwallbottom", "downwallmiddle", "downwalltop",
			"medwallbottom", "medwallmiddle", "medwalltop", "mesh", "officewallbottom", "officewallmiddle",
			"officewalltop", "rockmoss", "thickwall", "wallside", "desklarge" };

	public ItemBlockDeco2(Block dogshit) {
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
