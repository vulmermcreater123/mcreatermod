package net.mcreator.crazystuff.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;

import net.mcreator.crazystuff.entity.ScaryEntity;
import net.mcreator.crazystuff.client.model.animations.the_irritatorAnimation;
import net.mcreator.crazystuff.client.model.Modelthe_irritator;

import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.Map;

@Environment(EnvType.CLIENT)
public class ScaryRenderer extends MobRenderer<ScaryEntity, LivingEntityRenderState, Modelthe_irritator> {
	private final Identifier entityTexture = Identifier.parse("crazy_stuff:textures/entities/scary_texture.png");

	public ScaryRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelthe_irritator.LAYER_LOCATION)), 0.5f);
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

	private static final class AnimatedModel extends Modelthe_irritator {
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(the_irritatorAnimation.animation);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			ScaryEntity entity = state.getData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final RenderStateDataKey<ScaryEntity> ENTITY_KEY = RenderStateDataKey.create(() -> "crazy_stuff:scary_entity");
}