package zdoctor.scp.proxy;

import zdoctor.scp.SCP;
import zdoctor.scp.blocks.render.ButtonOffRender;
import zdoctor.scp.blocks.render.ButtonOnRender;
import zdoctor.scp.blocks.render.DeskSmallRender;
import zdoctor.scp.blocks.render.DoorClosedRender;
import zdoctor.scp.blocks.render.DoorClosedRender2;
import zdoctor.scp.blocks.render.DoorRender;
import zdoctor.scp.blocks.render.DoorRender2;
import zdoctor.scp.blocks.render.SCP079Render;
import zdoctor.scp.blocks.render.SCP895Render;
import zdoctor.scp.blocks.render.SCPQuackRender;
import zdoctor.scp.blocks.tileentity.TileEntityButtonOff;
import zdoctor.scp.blocks.tileentity.TileEntityButtonOn;
import zdoctor.scp.blocks.tileentity.TileEntityDeskSmall;
import zdoctor.scp.blocks.tileentity.TileEntityDoor;
import zdoctor.scp.blocks.tileentity.TileEntityDoor2;
import zdoctor.scp.blocks.tileentity.TileEntityDoorClosed;
import zdoctor.scp.blocks.tileentity.TileEntityDoorClosed2;
import zdoctor.scp.blocks.tileentity.TileEntitySCP079;
import zdoctor.scp.blocks.tileentity.TileEntitySCP895;
import zdoctor.scp.blocks.tileentity.TileEntitySCPQuack;
import zdoctor.scp.entity.Entity173;
import zdoctor.scp.entity.EntityDClass;
import zdoctor.scp.entity.EntityLarry;
import zdoctor.scp.entity.EntityPlagueDoctor;
import zdoctor.scp.entity.EntityShyGuy;
import zdoctor.scp.entity.render.RenderDClass;
import zdoctor.scp.entity.render.RenderLarry;
import zdoctor.scp.entity.render.RenderPlagueDoctor;
import zdoctor.scp.entity.render.RenderSculpture;
import zdoctor.scp.entity.render.RenderShyGuy;
import zdoctor.scp.models.ModelSCP049;
import zdoctor.scp.models.ModelSCP096;
import zdoctor.scp.models.ModelSCP173;
import zdoctor.scp.models.armor.ModelGasMask;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;







public class ClientProxy
  extends CommonProxy
{
  public static final Map<Item, ModelBiped> armorModels = new HashMap();
  


  public void registerRenderThings()
  {
    RenderingRegistry.registerEntityRenderingHandler(EntityLarry.class, new RenderLarry(new ModelBiped(), 0.0F));
    RenderingRegistry.registerEntityRenderingHandler(Entity173.class, new RenderSculpture(new ModelSCP173(), 0));
    RenderingRegistry.registerEntityRenderingHandler(EntityDClass.class, new RenderDClass(new ModelBiped(), 0.0F));
    RenderingRegistry.registerEntityRenderingHandler(EntityShyGuy.class, new RenderShyGuy(new ModelSCP096(), 0.0F));
    RenderingRegistry.registerEntityRenderingHandler(EntityPlagueDoctor.class, new RenderPlagueDoctor(new ModelSCP049(), 0.0F));
    

    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDoor.class, new DoorRender());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDoorClosed.class, new DoorClosedRender());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDoor2.class, new DoorRender2());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDoorClosed2.class, new DoorClosedRender2());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeskSmall.class, new DeskSmallRender());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySCP079.class, new SCP079Render());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySCP895.class, new SCP895Render());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityButtonOn.class, new ButtonOnRender());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityButtonOff.class, new ButtonOffRender());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySCPQuack.class, new SCPQuackRender());
    


    ModelGasMask test_armor = new ModelGasMask(1.0F);
    
    armorModels.put(SCP.test_helm, test_armor);
  }
}


