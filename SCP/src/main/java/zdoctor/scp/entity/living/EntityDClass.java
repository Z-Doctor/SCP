package zdoctor.scp.entity.living;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.world.World;
import zdoctor.lazymodder.builtin.helpers.EntityDataHelper;

public class EntityDClass extends EntityMob {
//	private static final DataParameter<Boolean> KNOWLEGE_SHYGUY = EntityDataHelper.createKey(EntityDClass.class,
//			DataSerializers.BOOLEAN);
//
	public EntityDClass(final World par1World) {
		super(par1World);

		this.setSize(0.6f, 1.8f);
	}

	@Override
	protected void initEntityAI() {
//		this.tasks.addTask(0, new EntityAISwimming(this));
//		this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 0.5));
//		this.tasks.addTask(4, new EntityAIMoveThroughVillage(this, 0.5, false));
//		this.tasks.addTask(5, new EntityAIWander(this, 0.5));
//		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 20.0f, .3f));
//		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityShyGuy096.class, 20.0f, .005f) {
//			@Override
//			public boolean shouldExecute() {
//				if (knowsShyGuy())
//					return false;
//				return super.shouldExecute();
//			}
//		});
//		this.tasks.addTask(7, new EntityAILookIdle(this));
//		this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0f, 0.5, 0.6));
//		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityPlagueDoctor049.class, 8.0f, 0.5, 0.6));
//		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityShyGuy096.class, new Predicate<EntityShyGuy096>() {
//
//			@Override
//			public boolean apply(EntityShyGuy096 shyGuy) {
//				if (!knowsShyGuy() && shyGuy.isScreaming()) {
//					learn(shyGuy);
//				}
//
//				return shyGuy.isScreaming() || knowsShyGuy();
//			}
//		}, 8.0f, 0.5, 0.6));
//
//		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
	}

//	protected void learn(EntityShyGuy096 shyGuy) {
//		this.dataManager.set(KNOWLEGE_SHYGUY, Boolean.valueOf(true));
//	}
//
//	@Override
//	protected void entityInit() {
//		this.dataManager.register(KNOWLEGE_SHYGUY, Boolean.valueOf(this.getRNG().nextFloat() >= .4f ? false : true));
//		super.entityInit();
//	}
//
//	protected boolean knowsShyGuy() {
//		return this.dataManager.get(KNOWLEGE_SHYGUY).booleanValue();
//	}
//
//	protected void applyEntityAttributes() {
//		super.applyEntityAttributes();
//		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0);
//		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5);
//		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0);
//	}
//
//	@Override
//	public boolean isAIDisabled() {
//		return false;
//	}
//
//	@Override
//	protected float getSoundVolume() {
//		return 0.4f;
//	}
//
//	@Override
//	protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {
//		final Item item = this.getDropItem();
//		if (item != null) {
//			int j = this.rand.nextInt(3);
//			if (lootingModifier > 0) {
//				j += this.rand.nextInt(lootingModifier + 1);
//			}
//			for (int k = 0; k < j; ++k) {
//				this.dropItem(item, 1);
//			}
//		}
//	}
}
