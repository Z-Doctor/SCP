package zdoctor.scp.entity;

import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class EntityShyGuy
  extends EntityMob
{
  private static final UUID attackingSpeedBoostModifierUUID = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
  private static final AttributeModifier attackingSpeedBoostModifier = new AttributeModifier(attackingSpeedBoostModifierUUID, "Attacking speed boost", 10.199999809265137D, 0).setSaved(false);
  private int stareTimer;
  private Entity lastEntityToAttack;
  private boolean isAggressive;
  
  public EntityShyGuy(World par1World)
  {
    super(par1World);
    setSize(0.72F, 2.34F);
    this.stepHeight = 1.0F;
    
    this.tasks.addTask(0, new EntityAISwimming(this));
    


    this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 0.5D));
    this.tasks.addTask(4, new EntityAIMoveThroughVillage(this, 0.5D, false));
    this.tasks.addTask(5, new EntityAIWander(this, 0.5D));
    this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 40.0F));
    this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityDClass.class, 40.0F));
    this.tasks.addTask(7, new EntityAILookIdle(this));
    this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
  }
  



  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
    getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
  }
  
  public boolean ableToCauseSkullDrop() {
    return true;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataManager.addObject(16, new Byte((byte)0));
    this.dataManager.addObject(17, new Byte((byte)0));
    this.dataManager.addObject(18, new Byte((byte)0));
  }
  





  protected Entity findPlayerToAttack()
  {
    EntityPlayer entityplayer = this.world.getClosestVulnerablePlayerToEntity(this, 64.0D);
    
    if (entityplayer != null)
    {
      if (shouldAttackPlayer(entityplayer))
      {
        this.isAggressive = true;
        
        if ((this.stareTimer != 0) || 
        



          (this.stareTimer++ == 0))
        {
          this.stareTimer = 0;
          setScreaming(true);
          return entityplayer;
        }
      }
      else
      {
        this.stareTimer = 0;
      }
    }
    
    return null;
  }
  



  private boolean shouldAttackPlayer(EntityPlayer player)
  {
    ItemStack itemstack = player.inventory.armorInventory[3];
    
    if ((itemstack != null) && (itemstack.getItem() == Item.getItemFromBlock(Blocks.PUMPKIN)))
    {
      return false;
    }
    

    Vec3 vec3 = player.getLook(1.0F).normalize();
    Vec3 vec31 = Vec3.createVectorHelper(this.posX - player.posX, this.boundingBox.minY + this.height / 2.0F - (player.posY + player.getEyeHeight()), this.posZ - player.posZ);
    double d0 = vec31.lengthVector();
    vec31 = vec31.normalize();
    double d1 = vec3.dotProduct(vec31);
    return (d1 > 1.0D - 0.025D / d0) && (player.canEntityBeSeen(this));
  }
  








  public void onLivingUpdate()
  {
    if (this.lastEntityToAttack != this.entityToAttack)
    {
      IAttributeInstance iattributeinstance = getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
      iattributeinstance.removeModifier(attackingSpeedBoostModifier);
      
      if (this.entityToAttack != null)
      {
        iattributeinstance.applyModifier(attackingSpeedBoostModifier);
      }
    }
    
    this.lastEntityToAttack = this.entityToAttack;
    

    if ((!this.world.isRemote) && (this.world.getGameRules().getBoolean("mobGriefing")))
    {




      if (getCarriedBlock().getMaterial() == Material.AIR)
      {
        if (this.rand.nextInt(20) != 0) {}
      }
    }
    



    for (int k = 0; k < 2; k++) {}
    


    if ((this.world.isDaytime()) && (!this.world.isRemote))
    {
      float f = getBrightness(1.0F);
      
      if ((f > 0.5F) && (this.world.canBlockSeeTheSky(MathHelper.floor(this.posX), MathHelper.floor(this.posY), MathHelper.floor(this.posZ))) && (this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F))
      {
        this.entityToAttack = null;
        setScreaming(false);
        this.isAggressive = false;
      }
    }
    

    this.entityToAttack = null;
    setScreaming(false);
    this.isAggressive = false;
    

    if ((isScreaming()) && (!this.isAggressive) && (this.rand.nextInt(100) == 0))
    {
      setScreaming(true);
    }
    
    this.isJumping = false;
    
    if (this.entityToAttack != null)
    {
      faceEntity(this.entityToAttack, 100.0F, 100.0F);
    }
    
    super.onLivingUpdate();
  }
  





































  protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier)
  {
    Item item = getDropItem();
    
    if (item != null)
    {
      int j = this.rand.nextInt(2 + lootingModifier);
      
      for (int k = 0; k < j; k++)
      {
        dropItem(item, 1);
      }
    }
  }
  
  public void setCarriedBlock(Block p_146081_1_)
  {
    this.dataManager.updateObject(16, Byte.valueOf((byte)(Block.getIdFromBlock(p_146081_1_) & 0xFF)));
  }
  
  public Block getCarriedBlock()
  {
    return Block.getBlockById(this.dataManager.getWatchableObjectByte(16));
  }
  



  public boolean attackEntityFrom(DamageSource source, float amount)
  {
    if (isEntityInvulnerable())
    {
      return false;
    }
    

    setScreaming(true);
    
    if (((source instanceof EntityDamageSource)) && ((source.getTrueSource() instanceof EntityPlayer)))
    {
      this.isAggressive = true;
    }
    
    if ((source instanceof EntityDamageSourceIndirect))
    {
      this.isAggressive = false;
      
      int i = 0; if (i < 64)
      {

        return true;
      }
      

      return super.attackEntityFrom(source, amount);
    }
    

    return super.attackEntityFrom(source, amount);
  }
  


  public boolean isScreaming()
  {
    return this.dataManager.getWatchableObjectByte(18) > 0;
  }
  
  public void setScreaming(boolean p_70819_1_)
  {
    this.dataManager.updateObject(18, Byte.valueOf((byte)(p_70819_1_ ? 1 : 0)));
  }
}


