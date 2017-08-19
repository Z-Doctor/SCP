package zdoctor.scp.init;

import net.minecraft.item.Item;
import zdoctor.scp.items.ItemKeyCard;
import zdoctor.scp.items.ItemMedkit;

public class ZItems {

	public static Item KEY_CARD;
	public static Item MED_KIT;

	public static Item armorNVHelm;
	public static Item armorGMHelm;
	public static Item armorRMHelm;
	

	public static void preInit() {
		KEY_CARD = new ItemKeyCard();
		MED_KIT = new ItemMedkit();
		
//		armorGMHelm = new ArmorGasMask();
//		armorNVHelm = new ArmorNVGoggles();
	}
}
