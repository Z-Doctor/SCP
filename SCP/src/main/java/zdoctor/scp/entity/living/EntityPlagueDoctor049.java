package zdoctor.scp.entity.living;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityPlagueDoctor049 extends EntityMob {
	public EntityPlagueDoctor049(World par1World) {
		super(par1World);

		this.setSize(0.6f, 1.8f);
	}

//	@Override
//	protected void initEntityAI() {
//		this.tasks.addTask(0, new EntityAISwimming((EntityLiving) this));
//
//		this.tasks.addTask(1, new EntityAIAttackMelee(this, 0.7, true));
//
//		this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 0.5));
//		this.tasks.addTask(4, new EntityAIMoveThroughVillage(this, 0.5, false));
//		this.tasks.addTask(5, new EntityAIWander(this, 0.5));
//		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 40.0f));
//		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityDClass.class, 40.0f));
//		this.tasks.addTask(7, new EntityAILookIdle(this));
//		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
//
//		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
//		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
//		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityDClass.class, true));
//
//	}
//
//	@Override
//	protected void applyEntityAttributes() {
//		super.applyEntityAttributes();
//		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0);
//		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5);
//		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0);
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
//	protected Item getDropItem() {
//		return Items.APPLE;
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
