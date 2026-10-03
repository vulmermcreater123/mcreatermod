package net.mcreator.crazystuff.procedures;

import net.minecraft.world.entity.Entity;

public class SlangbellaLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.push(4, 4, 4);
	}
}