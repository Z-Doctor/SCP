package zdoctor.scp.init;

import zdoctor.scp.SCP;
import zdoctor.scp.entity.Entity173;
import zdoctor.scp.entity.EntityDClass;
import zdoctor.scp.entity.EntityLarry;
import zdoctor.scp.entity.EntityPlagueDoctor;
import zdoctor.scp.entity.EntityShyGuy;
import cpw.mods.fml.common.registry.EntityRegistry;
import java.util.HashMap;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;





public class Entities
{
  public static void mainRegistry() {}
  
  public static void registerEntity()
  {
    createEntity(EntityLarry.class, "Larry", 1639426, 3155493);
    createEntity(Entity173.class, "Sculpture", 16053492, 10032138);
    createEntity(EntityDClass.class, "DClass", 15049753, 14405818);
    createEntity(EntityShyGuy.class, "ShyGuy", 15724527, 14405818);
    createEntity(EntityPlagueDoctor.class, "PlagueDoctor", 131586, 11184810);
  }
  
  public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
    int randomId = EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
    EntityRegistry.registerModEntity(entityClass, entityName, randomId, SCP.instance, 64, 1, true);
    

    createEgg(randomId, solidColor, spotColor);
  }
  
  private static void createEgg(int randomId, int solidColor, int spotColor)
  {
    EntityList.ENTITY_EGGS.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
  }
}


