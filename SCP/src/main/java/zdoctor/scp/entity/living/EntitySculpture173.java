package zdoctor.scp.entity.living;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntitySculpture173 extends EntityMob {
//	private static final DataParameter<Boolean> SEEN = EntityDataHelper.<Boolean>createKey(EntitySculpture173.class,
//			DataSerializers.BOOLEAN);

	// private static final SoundEvent stepSound = new SoundEvent(new
	// ResourceLocation("scp:mob.0173.step"));

	// public Minecraft mc;
	// private int[] transparentBlocks;

	public EntitySculpture173(World world) {
		super(world);
		// this.mc = Minecraft.getMinecraft();
		// this.transparentBlocks = new int[] { 8, 9, 10, 11, 18, 27, 28, 30,
		// 31, 32, 37, 38, 39, 40, 44, 50, 51, 52, 59,
		// 64, 65, 66, 67, 69, 70, 72, 75, 76, 77, 78, 83, 85, 90, 92, 106, 71,
		// 107, 108, 109, 111, 113, 114, 114,
		// 117 };
		this.stepHeight = 4.0f;
		this.setSize(0.6f, 2.8f);
		this.isImmuneToFire = true;
		// ((PathNavigateGround) this.getNavigator()).setEnterDoors(true);
	}

//	@Override
//	protected void applyEntityAttributes() {
//		super.applyEntityAttributes();
//		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(9001.0);
//		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(9000.0);
//		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.5);
//	}
//
//	@Override
//	protected void initEntityAI() {
//		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false) {
//			@Override
//			public boolean shouldExecute() {
//				return !isSeen() && super.shouldExecute();
//			}
//
//			@Override
//			public boolean shouldContinueExecuting() {
//				return !isSeen() && super.shouldContinueExecuting();
//			}
//
//		});
//		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
//		// this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
//		// this.tasks.addTask(8, new EntityAIWatchClosest(this,
//		// EntityPlayer.class, 0));
//		// this.tasks.addTask(8, new EntityAILookIdle(this));
//
//		this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
//		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
//		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLivingBase.class, -1, false, true,
//				Predicates.alwaysTrue()) {
//			@Override
//			public boolean shouldExecute() {
//				return !isSeen() && super.shouldExecute();
//			}
//
//			@Override
//			public boolean shouldContinueExecuting() {
//				return !isSeen() && super.shouldContinueExecuting();
//			}
//
//		});
//	}
//
//	@Override
//	protected void entityInit() {
//		super.entityInit();
//		this.dataManager.register(SEEN, Boolean.valueOf(false));
//	}
//
//	@Override
//	protected void playStepSound(BlockPos pos, Block blockIn) {
//		// this.playSound(stepSound, 0.15f, 1.0f);
//	}
//
//	@Override
//	public boolean canBePushed() {
//		return false;
//	}
//
//	@Override
//	protected boolean canDespawn() {
//		return false;
//	}
//
//	@Override
//	public int getTalkInterval() {
//		return 220;
//	}
//
//	@Override
//	public float getAIMoveSpeed() {
//		return super.getAIMoveSpeed();// * 3.0f;
//	}
//
//	@Override
//	public boolean attackEntityFrom(DamageSource source, float amount) {
//		return super.attackEntityFrom(source, amount);
//	}
//
//	@Override
//	public void performHurtAnimation() {
//	}
//
//	@Override
//	protected void updateAITasks() {
//		if (this.getAttackTarget() != null && !isSeen()) {
//			super.updateAITasks();
//		}
//	}
//
//	public boolean isSeen() {
//		return this.dataManager.get(SEEN).booleanValue();
//	}
//
//	public void setSeen(boolean seen) {
//		this.dataManager.set(SEEN, Boolean.valueOf(seen));
//	}
//
//	@Override
//	public void onUpdate() {
//		setSeen(canBeSeen());
//		// this.isJumping = false;
//		// if (this.getAttackTarget() != null && this.getAttackTarget()
//		// instanceof EntityPlayer) {
//		// if (this.isSeen()) {
//		// this.directLook((EntityPlayer) this.getAttackTarget());
//		// final float n = 0.0f;
//		// this.moveForward = n;
//		// this.moveStrafing = n;
//		// this.getNavigator().setSpeed(0.0);
//		// } else {
//		// this.faceEntity(this.getAttackTarget(), 100.0f, 100.0f);
//		// final float n2 = 0.23f;
//		// this.moveForward = n2;
//		// this.moveStrafing = n2;
//		// this.getNavigator().setSpeed(0.23);
//		// }
//		// }
//		super.onUpdate();
//	}
//
//	private boolean canBeSeen() {
//		int i = 0;
//		List<EntityLivingBase> list = this.world.getEntitiesWithinAABB(EntityLivingBase.class,
//				this.getEntityBoundingBox().expand(64d, 20d, 64d), new Predicate<EntityLivingBase>() {
//
//					@Override
//					public boolean apply(EntityLivingBase input) {
//						Iterator<ItemStack> armor = input.getArmorInventoryList().iterator();
//						while (armor.hasNext()) {
//							ItemStack stack = armor.next();
//							if (stack.isItemEqualIgnoreDurability(new ItemStack(Items.DIAMOND_HELMET)))
//								return false;
//						}
//						return true;
//					}
//				});
//
//		for (EntityLivingBase entity : list) {
//			if (canSeeMe(entity))
//				return true;
//		}
//		return false;
//	}
//
//	private boolean canSeeMe(EntityLivingBase entityIn) {
//		RayTraceResult rayTrace = this.world.rayTraceBlocks(
//				new Vec3d(this.posX, this.posY + (double) this.getEyeHeight(), this.posZ),
//				new Vec3d(entityIn.posX, entityIn.posY + (double) entityIn.getEyeHeight(), entityIn.posZ), false, true,
//				false);
//		if (rayTrace == null)
//			return false;
//		if (rayTrace.typeOfHit == Type.BLOCK)
//			return this.world.getBlockState(rayTrace.getBlockPos()).isTranslucent();
//		if (rayTrace.typeOfHit == Type.ENTITY)
//			return true;
//		return false;
//	}

	// private boolean lineOfSightCheck(final EntityLivingBase entity) {
	// return this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t, this.field_70163_u +
	// this.func_70047_e(), this.field_70161_v),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t, this.field_70163_u +
	// this.field_70131_O,
	// this.field_70161_v),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t, this.field_70163_u +
	// this.field_70131_O * 0.1,
	// this.field_70161_v),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t + 0.7, this.field_70163_u +
	// this.func_70047_e(),
	// this.field_70161_v),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t - 0.7, this.field_70163_u +
	// this.func_70047_e(),
	// this.field_70161_v),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t, this.field_70163_u +
	// this.func_70047_e(),
	// this.field_70161_v + 0.7),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t, this.field_70163_u +
	// this.func_70047_e(),
	// this.field_70161_v - 0.7),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t, this.field_70163_u +
	// this.field_70131_O * 1.2,
	// this.field_70161_v - 0.7),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null
	// || this.field_70170_p.func_72933_a(
	// Vec3.func_72443_a(this.field_70165_t, this.field_70163_u +
	// this.field_70131_O * 1.2 + 1.0,
	// this.field_70161_v),
	// Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u +
	// entity.func_70047_e(),
	// entity.field_70161_v)) == null;
	// }

	// private boolean isBlockTransparent(final int i) {
	// for (final int transparentBlock : this.transparentBlocks) {
	// if (i == transparentBlock) {
	// return true;
	// }
	// }
	// return true;
	// }
	//
	// private boolean directLook(final EntityPlayer player) {
	// if
	// (this.field_70170_p.func_72883_k(MathHelper.func_76128_c(this.field_70165_t),
	// MathHelper.func_76128_c(this.field_70163_u),
	// MathHelper.func_76128_c(this.field_70161_v)) < 1) {
	// return false;
	// }
	// final Vec3 vec3a = player.func_70676_i(1.0f).func_72432_b();
	// Vec3 vec3b = Vec3.func_72443_a(this.field_70165_t - player.field_70165_t,
	// this.field_70121_D.field_72338_b + this.field_70131_O -
	// player.field_70163_u + player.func_70047_e(),
	// this.field_70161_v - player.field_70161_v);
	// final double d = vec3b.func_72433_c();
	// vec3b = vec3b.func_72432_b();
	// final double d2 = vec3a.func_72430_b(vec3b);
	// return d2 > 1.0 - 0.025 / d && player.canEntityBeSeen((Entity) this);
	// }
	//
	// public double getDistance(final int i, final int j, final int k, final
	// int l, final int i1, final int j1) {
	// final int k2 = l - i;
	// final int l2 = i1 - j;
	// final int i2 = j1 - k;
	// return Math.sqrt(k2 * k2 + l2 * l2 + i2 * i2);
	// }
	//
	// private float[] getFacing(final EntityLivingBase entity, final float
	// par2, final float par3) {
	// final double d0 = this.field_70165_t - entity.field_70165_t;
	// final double d2 = this.field_70161_v - entity.field_70161_v;
	// final double d3 = this.func_70047_e() + this.field_70163_u -
	// (entity.field_70165_t + entity.func_70047_e());
	// final double d4 = MathHelper.func_76133_a(d0 * d0 + d2 * d2);
	// final float f2 = (float) (Math.atan2(d2, d0) * 180.0 / 3.141592653589793)
	// - 90.0f;
	// final float f3 = (float) (-Math.atan2(d3, d4) * 180.0 /
	// 3.141592653589793);
	// final float yaw = this.updateRotation(entity.rotationYaw, f2, par2);
	// final float pitch = this.updateRotation(entity.field_70125_A, f3, par3);
	// final float[] facing = { yaw, pitch };
	// return facing;
	// }

	// private float updateRotation(final float p_70663_1_, final float
	// p_70663_2_, final float p_70663_3_) {
	// float f3 = MathHelper.func_76142_g(p_70663_2_ - p_70663_1_);
	// if (f3 > p_70663_3_) {
	// f3 = p_70663_3_;
	// }
	// if (f3 < -p_70663_3_) {
	// f3 = -p_70663_3_;
	// }
	// return p_70663_1_ + f3;
	// }

	// private boolean isInFieldOfVision(final EntityLivingBase entity, final
	// float f4i, final float f5i) {
	// final float[] facing = this.getFacing(entity, 360.0f, 360.0f);
	// final float f = facing[0];
	// final float f2 = facing[1];
	// final float f3 = entity.rotationYaw - f4i;
	// final float f4 = entity.rotationYaw + f4i;
	// final float f5 = entity.field_70125_A - f5i;
	// final float f6 = entity.field_70125_A + f5i;
	// final boolean flag = this.getFlag(f3, f4, f, 0.0f, 360.0f);
	// final boolean flag2 = this.getFlag(f5, f6, f2, -180.0f, 180.0f);
	// return flag && flag2 && (entity.canEntityBeSeen((Entity) this) ||
	// this.lineOfSightCheck(entity));
	// }

	// public boolean getFlag(final float f, final float f1, final float f2,
	// final float f3, final float f4) {
	// if (f < f3) {
	// if (f2 >= f + f4) {
	// return true;
	// }
	// if (f2 <= f1) {
	// return true;
	// }
	// }
	// if (f1 >= f4) {
	// if (f2 <= f1 - f4) {
	// return true;
	// }
	// if (f2 >= f) {
	// return true;
	// }
	// }
	// return f1 < f4 && f >= f3 && f2 <= f1 && f2 > f;
	// }

	// protected String func_70639_aQ() {
	// return "scp:mob.0173.say";
	// }

//	@Override
//	public int getMaxSpawnedInChunk() {
//		return 4;
//	}
}
