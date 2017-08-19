package zdoctor.scp.items;

public class ItemMedkit extends SCPItem {
	public ItemMedkit() {
		super("ItemMedKit");
	}

//	public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
//		datalist.add("Heals");
//	}

//	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
//		if ((par3EntityPlayer.capabilities.isCreativeMode)
//				|| (par3EntityPlayer.inventory.consumeInventoryItem(SCP.itemMedkit))) {
//			if (!par2World.isRemote) {
//				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.INSTANT_HEALTH.getId(), 2, 0));
//			}
//		}
//
//		return par1ItemStack;
//	}
}
