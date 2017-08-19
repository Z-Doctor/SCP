package zdoctor.scp.entity;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Entity173
  extends EntityMob
{
  public Minecraft mc = Minecraft.getMinecraft();
  private int[] transparentBlocks = { 8, 9, 10, 11, 18, 27, 28, 30, 31, 32, 37, 38, 39, 40, 44, 50, 51, 52, 59, 64, 65, 66, 67, 69, 70, 72, 75, 76, 77, 78, 83, 85, 90, 92, 106, 71, 107, 108, 109, 111, 113, 114, 114, 117 };
  
  public Entity173(World world)
  {
    super(world);
    this.stepHeight = 4.0F;
    setSize(0.6F, 1.6F);
    this.isImmuneToFire = true;
    getNavigator().setEnterDoors(true);
  }
  
  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(9001.0D);
    getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(9000.0D);
    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(200.0D);
  }
  
  protected void playStepSound(int par1, int par2, int par3, Block block)
  {
    playSound("scp:mob.0173.step", 0.15F, 1.0F);
  }
  
  public boolean canBePushed()
  {
    return false;
  }
  
  protected boolean canDespawn()
  {
    return false;
  }
  
  public int getTalkInterval()
  {
    return 220;
  }
  
  public float getAIMoveSpeed()
  {
    return super.getAIMoveSpeed() * 3.0F;
  }
  
  protected Entity findPlayerToAttack()
  {
    EntityPlayer player = this.world.getClosestPlayerToEntity(this, 16.0D);
    if ((player != null) && (canBeSeen(player))) {
      return player;
    }
    return null;
  }
  
  protected void attackEntity(Entity entity, float f)
  {
    if ((this.entityToAttack != null) && 
      ((this.entityToAttack instanceof EntityPlayer)) && 
      (!canBeSeen((EntityPlayer)this.entityToAttack)) && 
      (this.rand.nextInt(20) != 0)) {
      super.attackEntity(entity, f);
    }
  }
  



  protected void updateEntityActionState()
  {
    if ((this.entityToAttack != null) && ((this.entityToAttack instanceof EntityPlayer)))
    {
      if (!canBeSeen((EntityPlayer)this.entityToAttack)) {
        super.updateEntityActionState();
      }
    }
    else {
      super.updateEntityActionState();
    }
  }
  
  public void onCollideWithPlayer(EntityPlayer player) {}
  
  public boolean attackEntityFrom(DamageSource dmgSource, float value)
  {
    return false;
  }
  
  public void performHurtAnimation() {}
  
  protected void handleJumpWater()
  {
    if ((this.entityToAttack != null) && (!canBeSeen())) {
      super.handleJumpWater();
    }
  }
  
  public void onUpdate()
  {
    this.isJumping = false;
    if ((this.entityToAttack != null) && ((this.entityToAttack instanceof EntityPlayer))) {
      if (canBeSeen((EntityPlayer)this.entityToAttack))
      {
        directLook((EntityPlayer)this.entityToAttack);
        this.moveStrafing = (this.moveVertical = 0.0F);
        getNavigator().setSpeed(0.0D);
      }
      else
      {
        faceEntity(this.entityToAttack, 100.0F, 100.0F);
        this.moveStrafing = (this.moveVertical = 0.23F);
        getNavigator().setSpeed(0.23D);
      }
    }
    super.onUpdate();
  }
  
  public boolean canBeSeen(EntityPlayer player)
  {
    if ((player.canEntityBeSeen(this)) || (lineOfSightCheck(player))) {
      return isInFieldOfVision(player, 100.0F, 100.0F);
    }
    return false;
  }
  
  private boolean canBeSeen()
  {
    int i = 0;
    List list = this.world.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.grow(64.0D, 20.0D, 64.0D));
    for (Object o : list)
    {
      EntityPlayer entity1 = (EntityPlayer)o;
      if (((entity1 instanceof EntityPlayer)) && 
        (canBeSeen(entity1))) {
        i++;
      }
    }
    
    if (i > 0) {
      return true;
    }
    return false;
  }
  
  private boolean lineOfSightCheck(EntityLivingBase entity)
  {
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX, this.posY + 
      
      getEyeHeight(), this.posZ), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX, this.posY + this.height, this.posZ), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX, this.posY + this.height * 0.1D, this.posZ), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX + 0.7D, this.posY + 
      
      getEyeHeight(), this.posZ), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX - 0.7D, this.posY + 
      
      getEyeHeight(), this.posZ), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX, this.posY + 
      
      getEyeHeight(), this.posZ + 0.7D), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX, this.posY + 
      
      getEyeHeight(), this.posZ - 0.7D), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX, this.posY + this.height * 1.2D, this.posZ - 0.7D), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    if (this.world.rayTraceBlocks(
      Vec3.createVectorHelper(this.posX, this.posY + this.height * 1.2D + 1.0D, this.posZ), 
      
      Vec3.createVectorHelper(entity.posX, entity.posY + entity
      
      .getEyeHeight(), entity.posZ)) == null) {
      return true;
    }
    return false;
  }
  
  private boolean isBlockTransparent(int i)
  {
    for (int transparentBlock : this.transparentBlocks) {
      if (i == transparentBlock) {
        return true;
      }
    }
    return true;
  }
  
  private boolean directLook(EntityPlayer player)
  {
    if (this.world.getFullBlockLightValue(
      MathHelper.floor(this.posX), 
      MathHelper.floor(this.posY), 
      MathHelper.floor(this.posZ)) < 1)
    {


      return false;
    }
    Vec3 vec3a = player.getLook(1.0F).normalize();
    Vec3 vec3b = Vec3.createVectorHelper(this.posX - player.posX, this.boundingBox.minY + this.height - player.posY + player
    
      .getEyeHeight(), this.posZ - player.posZ);
    
    double d = vec3b.lengthVector();
    vec3b = vec3b.normalize();
    double d1 = vec3a.dotProduct(vec3b);
    
    return (d1 > 1.0D - 0.025D / d) && (player.canEntityBeSeen(this));
  }
  
  public double getDistance(int i, int j, int k, int l, int i1, int j1)
  {
    int k1 = l - i;
    int l1 = i1 - j;
    int i2 = j1 - k;
    return Math.sqrt(k1 * k1 + l1 * l1 + i2 * i2);
  }
  
  private float[] getFacing(EntityLivingBase entity, float par2, float par3)
  {
    double d0 = this.posX - entity.posX;
    double d2 = this.posZ - entity.posZ;
    double d1 = getEyeHeight() + this.posY - (entity.posX + entity.getEyeHeight());
    double d3 = MathHelper.sqrt(d0 * d0 + d2 * d2);
    float f2 = (float)(Math.atan2(d2, d0) * 180.0D / 3.141592653589793D) - 90.0F;
    float f3 = (float)(-Math.atan2(d1, d3) * 180.0D / 3.141592653589793D);
    float yaw = updateRotation(entity.rotationYaw, f2, par2);
    float pitch = updateRotation(entity.rotationPitch, f3, par3);
    float[] facing = new float[2];
    facing[0] = yaw;
    facing[1] = pitch;
    return facing;
  }
  
  private float updateRotation(float angle, float targetAngle, float maxIncrease)
  {
    float f3 = MathHelper.wrapDegrees(targetAngle - angle);
    if (f3 > maxIncrease) {
      f3 = maxIncrease;
    }
    if (f3 < -maxIncrease) {
      f3 = -maxIncrease;
    }
    return angle + f3;
  }
  
  private boolean isInFieldOfVision(EntityLivingBase entity, float f4i, float f5i)
  {
    float[] facing = getFacing(entity, 360.0F, 360.0F);
    float f = facing[0];
    float f1 = facing[1];
    float f6 = entity.rotationYaw - f4i;
    float f7 = entity.rotationYaw + f4i;
    float f8 = entity.rotationPitch - f5i;
    float f9 = entity.rotationPitch + f5i;
    boolean flag = getFlag(f6, f7, f, 0.0F, 360.0F);
    boolean flag1 = getFlag(f8, f9, f1, -180.0F, 180.0F);
    
    return (flag) && (flag1) && ((entity.canEntityBeSeen(this)) || (lineOfSightCheck(entity)));
  }
  
  public boolean getFlag(float f, float f1, float f2, float f3, float f4)
  {
    if (f < f3)
    {
      if (f2 >= f + f4) {
        return true;
      }
      if (f2 <= f1) {
        return true;
      }
    }
    if (f1 >= f4)
    {
      if (f2 <= f1 - f4) {
        return true;
      }
      if (f2 >= f) {
        return true;
      }
    }
    if ((f1 < f4) && (f >= f3)) {
      return (f2 <= f1) && (f2 > f);
    }
    return false;
  }
  
  public void setYaw(float f)
  {
    this.rotationYaw = f;
  }
  
  protected String getLivingSound()
  {
    return "scp:mob.0173.say";
  }
  
  public boolean canBeCollidedWith()
  {
    return true;
  }
  
  public int getMaxSpawnedInChunk()
  {
    return 0;
  }
}


