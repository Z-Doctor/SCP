package zdoctor.scp.items;

import net.minecraft.item.Item;
import zdoctor.lazymodder.easy.items.EasyItem;
import zdoctor.scp.init.SCPCreativeTabs;

public class SCPItem extends EasyItem {
	public SCPItem(String name) {
		this(name, 1);
	}
	public SCPItem(String name, int subTypeCount) {
		super(name, subTypeCount);
		initItem(this);
	}
	public static void initItem(Item item) {
		item.setCreativeTab(SCPCreativeTabs.SCPTab);
	}
	
}
