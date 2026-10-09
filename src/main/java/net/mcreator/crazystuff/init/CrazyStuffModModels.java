/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.mcreator.crazystuff.client.model.Modelthe_irritator;

import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CrazyStuffModModels {
	public static void clientLoad() {
		ModelLayerRegistry.registerModelLayer(Modelthe_irritator.LAYER_LOCATION, Modelthe_irritator::createBodyLayer);
	}
}