package zdoctor.scp.entity.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import zdoctor.lazymodder.easy.entity.tile.EasyTileEntity;

public class TileEntityDoor extends EasyTileEntity {
	private boolean isOpen = false;
	
	public boolean isOpen() {
		return isOpen;
	}
	
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
		markDirty();
	}
	
	public void toggleOpen() {
		setOpen(!isOpen());
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setBoolean("isOpen", isOpen());
		return super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		setOpen(compound.getBoolean("isOpen"));
	}
	
	@Override
	public boolean hasFastRenderer() {
		return false;
	}
	
}
