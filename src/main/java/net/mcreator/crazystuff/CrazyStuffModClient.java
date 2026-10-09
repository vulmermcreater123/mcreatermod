package net.mcreator.crazystuff;

import net.mcreator.crazystuff.init.CrazyStuffModScreens;
import net.mcreator.crazystuff.init.CrazyStuffModModels;
import net.mcreator.crazystuff.init.CrazyStuffModMenus;
import net.mcreator.crazystuff.init.CrazyStuffModEntityRenderers;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class CrazyStuffModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		CrazyStuffModModels.clientLoad();
		CrazyStuffModEntityRenderers.clientLoad();
		CrazyStuffModScreens.clientLoad();
		CrazyStuffModMenus.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}