/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.mcreator.crazystuff.client.renderer.ScaryRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CrazyStuffModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(CrazyStuffModEntities.SCARY, ScaryRenderer::new);
	}
}