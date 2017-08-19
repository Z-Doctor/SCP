  package zdoctor.scp.items.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import zdoctor.lazymodder.builtin.helpers.TextureLocation.ItemTextureLocation;
import zdoctor.lazymodder.easy.items.EasyArmor;
import zdoctor.scp.ModMain;
import zdoctor.scp.client.model.item.armor.ModelGasMask;
import zdoctor.scp.init.SCPCreativeTabs;

public class ArmorGasMask extends EasyArmor {
	public ArmorGasMask() {
		super("GasMask", ArmorMaterial.DIAMOND, getRenderIndex(), EntityEquipmentSlot.HEAD);
		setCreativeTab(SCPCreativeTabs.SCPTab);

//		if (slot == 0) {
//			getByNameOrId("SCP:gasicon");
//		} else if (slot != 1) {
//		}
	}
	

	private static int getRenderIndex() {
		return 3;
	}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {
		return new ModelGasMask(1f);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return new ItemTextureLocation(ModMain.MODID, "armor/gasmask").toString();
	}


//	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
//		if ((itemstack.getItem() == SCP.armorGMHelm) || (itemstack.getItem() == SCP.armorGMHelm)
//				|| (itemstack.getItem() == SCP.armorRMHelm)) {
//			return "scp:textures/model/armor/gasmask.png";
//		}
//		return null;
//	}
//
//	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
//		if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(3) != null)
//				&& (player.getCurrentArmor(3) != null) && (player.getCurrentArmor(1) != null)) {
//			ItemStack helmet = player.getCurrentArmor(3);
//			if (helmet.getItem() == SCP.armorGMHelm) {
//				player.addPotionEffect(new PotionEffect(Potion.FIRE_RESISTANCE.getId(), 100, 1));
//			}
//		}
//	}
}
