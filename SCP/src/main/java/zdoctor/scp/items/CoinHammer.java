package zdoctor.scp.items;

import net.minecraft.item.ItemStack;

public class CoinHammer extends SCPItem {
	public CoinHammer() {
		super("CoinHammer");
		setMaxDamage(80);
		this.maxStackSize = 1;
		setNoRepair();
	}

	public ItemStack getContainerItem(ItemStack itemStack) {
		itemStack.setItemDamage(itemStack.getMetadata() + 1);
		return itemStack;
	}

	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
		return false;
	}
}
