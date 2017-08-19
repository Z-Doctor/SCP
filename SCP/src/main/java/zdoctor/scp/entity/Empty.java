package zdoctor.scp.entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class Empty extends EntityMob {
	public Empty(final World par1World) {
		super(par1World);
	}

	@Override
	protected void initEntityAI() {
	}

	@Override
	protected void entityInit() {
		super.entityInit();
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

}
