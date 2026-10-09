package net.mcreator.crazystuff.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.crazystuff.entity.ScaryEntity;
import net.mcreator.crazystuff.client.model.Modelthe_irritator;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class ScaryRenderer extends MobRenderer<ScaryEntity, LivingEntityRenderState, Modelthe_irritator> {
	private final Identifier entityTexture = Identifier.parse("crazy_stuff:textures/entities/scary_texture.png");

	public ScaryRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthe_irritator(context.bakeLayer(Modelthe_irritator.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ScaryEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}