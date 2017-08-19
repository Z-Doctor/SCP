package zdoctor.scp.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import zdoctor.scp.SCP;

public class ArmorRiotMask extends ItemArmor {
	public ArmorRiotMask(ItemArmor.ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		setCreativeTab(SCP.tabscp);

		if (slot == 0) {
			getByNameOrId("SCP:rioticon");
		} else if (slot != 1) {
		}
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
		if ((itemstack.getItem() == SCP.armorRMHelm) || (itemstack.getItem() == SCP.armorGMHelm)
				|| (itemstack.getItem() == SCP.armorRMHelm)) {
			return "scp:textures/model/armor/riotmask.png";
		}
		return null;
	}
}
