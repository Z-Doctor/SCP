package zdoctor.scp.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDeco3 extends ItemBlock {
	static final String[] subBlocks = { "metalboxa", "metalboxb", "metalboxc", "metalboxd" };

	public ItemBlockDeco3(Block dogshit) {
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
