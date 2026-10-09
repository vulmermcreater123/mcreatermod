/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.crazystuff.entity.ScaryEntity;
import net.mcreator.crazystuff.CrazyStuffMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class CrazyStuffModEntities {
	public static EntityType<ScaryEntity> SCARY = register("scary", EntityType.Builder.<ScaryEntity>of(ScaryEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.sized(0.6f, 1.8f));

	public static void load() {
		init();
		registerAttributes();
	}

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(CrazyStuffMod.MODID, registryname),
				(EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(CrazyStuffMod.MODID, registryname))));
	}

	public static void init() {
		ScaryEntity.init();
	}

	public static void registerAttributes() {
		FabricDefaultAttributeRegistry.register(SCARY, ScaryEntity.createAttributes());
	}
}