package zdoctor.scp.entity;

import java.util.Random;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityLarry
  extends EntityMob
{
  public EntityLarry(World par1World)
  {
    super(par1World);
    this.tasks.addTask(0, new EntityAISwimming(this));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
    this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 1.0D));
    this.tasks.addTask(4, new EntityAIMoveThroughVillage(this, 1.0D, false));
    this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
    this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 20.0F));
    this.tasks.addTask(7, new EntityAILookIdle(this));
    this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, true));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDClass.class, 0, true));
    
    setSize(0.6F, 1.8F);
  }
  
  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.7D);
    getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
  }
  















  protected float getSoundVolume()
  {
    return 0.4F;
  }
  
  protected Item getDropItem()
  {
    return Items.APPLE;
  }
  
  protected void dropFewItems(boolean bool, int chance)
  {
    Item item = getDropItem();
    if (item != null)
    {
      int j = this.rand.nextInt(3);
      if (chance > 0) {
        j += this.rand.nextInt(chance + 1);
      }
      for (int k = 0; k < j; k++) {
        dropItem(item, 1);
      }
    }
  }
}


