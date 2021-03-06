package zdoctor.scp.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zdoctor.lazymodder.easy.registry.EasyRegistry;
import zdoctor.scp.init.ZBlocks;
import zdoctor.scp.init.ZEvents;
import zdoctor.scp.init.ZItems;
import zdoctor.scp.init.ZMobs;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ZItems.preInit();
		ZBlocks.preInit();
		ZMobs.preInit();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {
		EasyRegistry.register(ZEvents.class);
	}

}