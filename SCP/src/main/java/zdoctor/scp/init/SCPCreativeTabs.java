package zdoctor.scp.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SCPCreativeTabs {
	public static final CreativeTabs SCPTab = new CreativeTabs("tabscp") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.DIAMOND);
		}
	};
}
