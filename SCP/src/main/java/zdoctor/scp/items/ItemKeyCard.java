package zdoctor.scp.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKeyCard extends SCPItem {
	private static String[] subItems = new String[] {"mastercard", "level1", "level2", "level3", "level4", "level5", "masterkeycard"};
	public ItemKeyCard() {
		super("KeyCard", subItems.length);
		setMaxStackSize(1);
	}
	
	@Override
	public String getNameFromMeta(int meta) {
		if(subItems.length > meta)
			return subItems[meta];
		return "null";
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(stack.getMetadata() == 0)
			tooltip.add("0123 4567 8910 1112");
		else if(stack.getMetadata() == subItems.length-1)
			tooltip.add("Full Access");
		else if(stack.getMetadata() > 0)
			tooltip.add("Access Level: " + stack.getMetadata());
	}
	
}
