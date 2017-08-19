package zdoctor.scp.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zdoctor.scp.SCP;
import zdoctor.scp.proxy.ClientProxy;

public class ArmorTest extends ItemArmor {
	public ArmorTest(ItemArmor.ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		setCreativeTab(SCP.tabscp);

		if (slot == 0) {
			getByNameOrId("SCP:rioticon");
		} else if (slot != 1) {
		}
	}

	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot) {
		ModelBiped armorModel = (ModelBiped) ClientProxy.armorModels.get(this);

		if (armorModel != null) {
			armorModel.bipedHead.showModel = (armorSlot == 0);
			armorModel.bipedHeadwear.showModel = false;
			armorModel.bipedBody.showModel = ((armorSlot == 1) || (armorSlot == 2));
			armorModel.bipedRightArm.showModel = (armorSlot == 1);
			armorModel.bipedLeftArm.showModel = (armorSlot == 1);
			armorModel.bipedRightLeg.showModel = ((armorSlot == 2) || (armorSlot == 3));
			armorModel.bipedLeftLeg.showModel = ((armorSlot == 2) || (armorSlot == 3));

			armorModel.isSneak = entityLiving.isSneaking();
			armorModel.isRiding = entityLiving.isRiding();
			armorModel.isChild = entityLiving.isChild();

			armorModel.heldItemRight = 0;
			armorModel.aimedBow = false;

			EntityPlayer player = (EntityPlayer) entityLiving;

			ItemStack held_item = player.getEquipmentInSlot(0);

			if (held_item != null) {
				armorModel.heldItemRight = 1;

				if (player.getItemInUseCount() > 0) {
					EnumAction enumaction = held_item.getItemUseAction();

					if (enumaction == EnumAction.bow) {
						armorModel.aimedBow = true;
					} else if (enumaction == EnumAction.block) {
						armorModel.heldItemRight = 3;
					}
				}
			}
		}

		return armorModel;
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
		if ((itemstack.getItem() == SCP.test_helm) || (itemstack.getItem() == SCP.test_helm)
				|| (itemstack.getItem() == SCP.armorRMHelm)) {
			return "scp:textures/model/armor/test.png";
		}
		return null;
	}
}
