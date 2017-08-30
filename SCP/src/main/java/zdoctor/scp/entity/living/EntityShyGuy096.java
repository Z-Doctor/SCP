package zdoctor.scp.entity.living;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import zdoctor.lazymodder.builtin.helpers.EntityDataHelper;

public class EntityShyGuy096 extends EntityMob {
	// private static final UUID attackingSpeedBoostModifierUUID;
	// private static final AttributeModifier attackingSpeedBoostModifier;
	//
	private static final DataParameter<Boolean> SCREAMING = EntityDataHelper.<Boolean>createKey(EntityShyGuy096.class,
			DataSerializers.BOOLEAN);

	public EntityShyGuy096(final World par1World) {
		super(par1World);
		this.stepHeight = 100.0f;
	}
	
	public boolean isScreaming() {
		return ((Boolean) this.dataManager.get(SCREAMING)).booleanValue();
	}

	public void setScreaming(boolean scream) {
		this.dataManager.set(SCREAMING, Boolean.valueOf(scream));
	}
	
	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SCREAMING, Boolean.valueOf(false));
	}
	
	@Override
	public AxisAlignedBB getCollisionBox(Entity entityIn) {
		// TODO Auto-generated method stub
		return super.getCollisionBox(entityIn);
	}
	
	@Override
	public float getCollisionBorderSize() {
		// TODO Auto-generated method stub
		return super.getCollisionBorderSize();
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox() {
		// TODO Auto-generated method stub
		return super.getCollisionBoundingBox();
	}
	
	@Override
	public AxisAlignedBB getEntityBoundingBox() {
		// TODO Auto-generated method stub
		return super.getEntityBoundingBox();
	}
	
	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		// TODO Auto-generated method stub
		return super.getRenderBoundingBox();
	}
	
	@Override
	public float getEyeHeight() {
		// TODO Auto-generated method stub
		return super.getEyeHeight();
	}

	// @Override
	// protected void initEntityAI() {
	// this.tasks.addTask(0, new EntityAISwimming(this));
	// this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
	// this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 0.5));
	// this.tasks.addTask(4, new EntityAIMoveThroughVillage(this, 0.5, false));
	// this.tasks.addTask(5, new EntityAIWander(this, 0.5));
	// this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class,
	// 40.0f));
	// this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityDClass.class,
	// 40.0f));
	// this.tasks.addTask(7, new EntityAILookIdle(this));
	//
	// this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
	// this.targetTasks.addTask(1, new EntityShyGuy096.AIFindTarget(this));
	// }
	//
	// @Override
	// protected void applyEntityAttributes() {
	// super.applyEntityAttributes();
	// this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0);
	// this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896);
	// this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0);
	// }
	//
	// @Override
	// public boolean isAIDisabled() {
	// return false;
	// }
	//
	// static class AIFindTarget extends
	// EntityAINearestAttackableTarget<EntityLivingBase> {
	// private final EntityShyGuy096 shyguy;
	// private EntityLivingBase target;
	//
	// public AIFindTarget(EntityShyGuy096 shyguy) {
	// super(shyguy, EntityLivingBase.class, -1, false, false, new
	// Predicate<EntityLivingBase>() {
	// @Override
	// public boolean apply(EntityLivingBase entityClass) {
	// return shyguy.isLookingAtMe(entityClass);
	// }
	// });
	//
	// this.shyguy = shyguy;
	// }
	//
	// @Override
	// public boolean shouldExecute() {
	// // double d0 = this.getTargetDistance();
	// // this.target = this.shyguy.world.geten
	// // AttackablePlayer(this.shyguy.posX, this.shyguy.posY,
	// // this.shyguy.posZ, d0, d0, (Function) null, new
	// // Predicate<EntityLivingBase>() {
	// // public boolean apply(@Nullable EntityLivingBase p_apply_1_) {
	// // return p_apply_1_ != null &&
	// // AIFindTarget.this.shyguy.shouldAttackPlayer(p_apply_1_);
	// // }
	// // });
	// // return this.target != null;
	// return super.shouldExecute();
	// }
	//
	// @Override
	// public void startExecuting() {
	// this.shyguy.setScreaming(true);
	// super.startExecuting();
	// }
	//
	// @Override
	// public void resetTask() {
	// // if (!this.shouldContinueExecuting()) {
	// super.resetTask();
	// // }
	// }
	//
	// @Override
	// public boolean shouldContinueExecuting() {
	// boolean flag = this.taskOwner.getAttackTarget() != null &&
	// this.taskOwner.getAttackTarget().isEntityAlive()
	// ? true : super.shouldContinueExecuting();
	// if (!flag)
	// this.shyguy.setScreaming(flag);
	//
	// return flag;
	// }
	//
	// @Override
	// public boolean isInterruptible() {
	// return false;
	// }
	//
	// @Override
	// public void updateTask() {
	// if (this.taskOwner.getAttackTarget() != null) {
	// if (this.taskOwner.getAttackTarget().getDistanceSqToEntity(this.shyguy) >
	// 256.0D) {
	// this.shyguy.teleportToEntity(this.taskOwner.getAttackTarget());
	// }
	// }
	// }
	// }
	//
	// protected boolean teleportToEntity(Entity target) {
	// Vec3d vec3d = new Vec3d(this.posX - target.posX,
	// this.getEntityBoundingBox().minY
	// + (double) (this.height / 2.0F) - target.posY + (double)
	// target.getEyeHeight(),
	// this.posZ - target.posZ);
	// vec3d = vec3d.normalize();
	// double d0 = 16.0D;
	// double d1 = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3d.x
	// * 16.0D;
	// double d2 = this.posY + (double) (this.rand.nextInt(16) - 8) - vec3d.y *
	// 16.0D;
	// double d3 = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3d.z
	// * 16.0D;
	// return this.teleportTo(d1, d2, d3);
	// }
	//
	// private boolean teleportTo(double x, double y, double z) {
	// ShyGuyTeleportEvent event = new ShyGuyTeleportEvent(this, x, y, z, 0);
	// if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event))
	// return false;
	// boolean flag = this.attemptTeleport(event.getTargetX(),
	// event.getTargetY(), event.getTargetZ());
	//
	// if (flag) {
	// // this.world.playSound((EntityPlayer) null, this.prevPosX,
	// // this.prevPosY, this.prevPosZ,
	// // SoundEvents.ENTITY_ENDERMEN_TELEPORT, this.getSoundCategory(),
	// // 1.0F, 1.0F);
	// // this.playSound(SoundEvents.ENTITY_ENDERMEN_TELEPORT, 1.0F, 1.0F);
	// }
	//
	// return flag;
	// }
	//
	// // replaced by target task
	// // protected Entity findPlayerToAttack() {
	// // final EntityPlayer entityplayer =
	// // this.field_70170_p.func_72856_b((Entity)this, 64.0);
	// // if (entityplayer != null) {
	// // if (this.shouldAttackPlayer(entityplayer)) {
	// // this.isAggressive = true;
	// // if (this.stareTimer == 0) {}
	// // if (this.stareTimer++ == 0) {
	// // this.stareTimer = 0;
	// // this.setScreaming(true);
	// // return (Entity)entityplayer;
	// // }
	// // }
	// // else {
	// // this.stareTimer = 0;
	// // }
	// // }
	// // return null;
	// // }
	//
	// private boolean shouldAttackPlayer(EntityPlayer player) {
	// return this.isLookingAtMe(player);
	// }
	//
	// private boolean isLookingAtMe(EntityLivingBase entity) {
	// Vec3d vec3d = entity.getLook(1.0F).normalize();
	// Vec3d vec3d1 = new Vec3d(this.posX - entity.posX,
	// this.getEntityBoundingBox().minY
	// + (double) this.getEyeHeight() - (entity.posY + (double)
	// entity.getEyeHeight()),
	// this.posZ - entity.posZ);
	// double d0 = vec3d1.lengthVector();
	// vec3d1 = vec3d1.normalize();
	// double d1 = vec3d.dotProduct(vec3d1);
	// return d1 > 1.0D - 0.025D / d0 ? entity.canEntityBeSeen(this) : false;
	// }
	//
	// // private boolean shouldAttackPlayer(final EntityPlayer p_70821_1_) {
	// // final ItemStack itemstack =
	// p_70821_1_.field_71071_by.field_70460_b[3];
	// // if (itemstack != null && itemstack.func_77973_b() ==
	// // Item.func_150898_a(Blocks.field_150423_aK)) {
	// // return false;
	// // }
	// // final Vec3 vec3 = p_70821_1_.func_70676_i(1.0f).func_72432_b();
	// // Vec3 vec4 = Vec3.func_72443_a(this.field_70165_t -
	// // p_70821_1_.field_70165_t, this.field_70121_D.field_72338_b +
	// // this.field_70131_O / 2.0f - (p_70821_1_.field_70163_u +
	// // p_70821_1_.func_70047_e()), this.field_70161_v -
	// // p_70821_1_.field_70161_v);
	// // final double d0 = vec4.func_72433_c();
	// // vec4 = vec4.func_72432_b();
	// // final double d2 = vec3.func_72430_b(vec4);
	// // return d2 > 1.0 - 0.025 / d0 &&
	// p_70821_1_.canEntityBeSeen((Entity)this);
	// // }
	//
	// @Override
	// public void onLivingUpdate() {
	// // if (this.lastEntityToAttack != this.entityToAttack) {
	// // final IAttributeInstance iattributeinstance =
	// // this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
	// //
	// iattributeinstance.func_111124_b(EntityShyGuy.attackingSpeedBoostModifier);
	// // if (this.getAttackTarget() != null) {
	// //
	// iattributeinstance.func_111121_a(EntityShyGuy.attackingSpeedBoostModifier);
	// // }
	// // }
	// // this.lastEntityToAttack = this.getAttackTarget();
	// // if (this.field_70170_p.field_72995_K ||
	// // !this.field_70170_p.func_82736_K().func_82766_b("mobGriefing") ||
	// // this.func_146080_bZ().func_149688_o() != Material.field_151579_a ||
	// // this.rand.nextInt(20) == 0) {}
	// // for (int k = 0; k < 2; ++k) {}
	// // if (this.field_70170_p.func_72935_r() &&
	// // !this.field_70170_p.field_72995_K) {
	// // final float f = this.func_70013_c(1.0f);
	// // if (f > 0.5f &&
	// //
	// this.field_70170_p.func_72937_j(MathHelper.func_76128_c(this.field_70165_t),
	// // MathHelper.func_76128_c(this.field_70163_u),
	// // MathHelper.func_76128_c(this.field_70161_v)) && this.rand.nextFloat()
	// // * 30.0f < (f - 0.4f) * 2.0f) {
	// // this.getAttackTarget() = null;
	// // this.setScreaming(false);
	// // this.isAggressive = false;
	// // }
	// // }
	// // this.getAttackTarget() = null;
	// // this.setScreaming(false);
	// // this.isAggressive = false;
	// // if (this.isScreaming() && !this.isAggressive &&
	// // this.rand.nextInt(100) == 0) {
	// // this.setScreaming(true);
	// // }
	// // this.field_70703_bu = false;
	// // if (this.getAttackTarget() != null) {
	// // this.func_70625_a(this.getAttackTarget(), 100.0f, 100.0f);
	// // }
	// super.onLivingUpdate();
	// }
	//
	// @Override
	// protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier)
	// {
	// final Item item = this.getDropItem();
	// if (item != null) {
	// for (int j = this.rand.nextInt(2 + lootingModifier), k = 0; k < j; ++k) {
	// this.dropItem(item, 1);
	// }
	// }
	// }
	//
	// // Do we really need to watch if it is carrying something?
	// // public void setCarriedBlock(Block block) {
	// // this.dataManager.set(byte16, (byte)(Block.getIdFromBlock(p_146081_1_)
	// &
	// // 0xFF));
	// // }
	//
	// // public Block func_146080_bZ() {
	// // return Block.func_149729_e((int)this.dataManager.func_75683_a(16));
	// // }
	// @Override
	// public void setHeldItem(EnumHand hand, ItemStack stack) {
	// // TODO Auto-generated method stub
	// super.setHeldItem(hand, stack);
	// }
	//
	// @Override
	// public ItemStack getHeldItem(EnumHand hand) {
	// return super.getHeldItem(hand);
	// }
	//
	// @Override
	// public boolean attackEntityFrom(DamageSource source, final float amount)
	// {
	// if (this.isEntityInvulnerable(source)) {
	// return false;
	// }
	// this.setScreaming(true);
	// if (source instanceof EntityDamageSource && source.getTrueSource()
	// instanceof EntityPlayer) {
	// // this.isAggressive = true;
	// }
	// if (source instanceof EntityDamageSourceIndirect) {
	// // this.isAggressive = false;
	// // Not sure what this was for
	// // final int i = 0;
	// // return i << 64 || super.attackEntityFrom(source, amount);
	// }
	// return super.attackEntityFrom(source, amount);
	// }
	//
	//
	// static {
	// attackingSpeedBoostModifierUUID =
	// UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
	// attackingSpeedBoostModifier = new
	// AttributeModifier(EntityShyGuy096.attackingSpeedBoostModifierUUID,
	// "Attacking speed boost", 10.199999809265137, 0).setSaved(false);
	// }
}
