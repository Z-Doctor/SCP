package zdoctor.scp.init;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import zdoctor.lazymodder.easy.entity.living.EasyLivingEntity;
import zdoctor.scp.client.render.entity.living.RenderDClass;
import zdoctor.scp.client.render.entity.living.RenderLarry106;
import zdoctor.scp.client.render.entity.living.RenderPlagueDoctor049;
import zdoctor.scp.client.render.entity.living.RenderSculpture173;
import zdoctor.scp.client.render.entity.living.RenderShyGuy096;
import zdoctor.scp.entity.living.EntityDClass;
import zdoctor.scp.entity.living.EntityLarry106;
import zdoctor.scp.entity.living.EntityPlagueDoctor049;
import zdoctor.scp.entity.living.EntitySculpture173;
import zdoctor.scp.entity.living.EntityShyGuy096;

public class ZMobs {
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();

	public static void preInit() {
		new EasyLivingEntity(EntityDClass.class, RenderDClass.class, "DClass", 0xff0000, 0xfff0f0);
		new EasyLivingEntity(EntityPlagueDoctor049.class, RenderPlagueDoctor049.class, "PlagueDoctor", 0, 0xffffff);
		new EasyLivingEntity(EntityShyGuy096.class, RenderShyGuy096.class, "ShyGuy", 0xffffff, 0);
		new EasyLivingEntity(EntityLarry106.class, RenderLarry106.class, "Larry", 0, 0);
		new EasyLivingEntity(EntitySculpture173.class, RenderSculpture173.class, "Sculpture", 0, 0xf0f0f0);
		
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDoor.class,
		// (TileEntitySpecialRenderer)new DoorRender());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDoorClosed.class,
		// (TileEntitySpecialRenderer)new DoorClosedRender());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDoor2.class,
		// (TileEntitySpecialRenderer)new DoorRender2());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDoorClosed2.class,
		// (TileEntitySpecialRenderer)new DoorClosedRender2());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDeskSmall.class,
		// (TileEntitySpecialRenderer)new DeskSmallRender());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntitySCP079.class,
		// (TileEntitySpecialRenderer)new SCP079Render());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntitySCP895.class,
		// (TileEntitySpecialRenderer)new SCP895Render());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityButtonOn.class,
		// (TileEntitySpecialRenderer)new ButtonOnRender());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityButtonOff.class,
		// (TileEntitySpecialRenderer)new ButtonOffRender());
		// ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntitySCPQuack.class,
		// (TileEntitySpecialRenderer)new SCPQuackRender());
		// final ModelGasMask test_armor = new ModelGasMask(1.0f);
		// ClientProxy.armorModels.put(SCP.test_helm, test_armor);
	}
}
