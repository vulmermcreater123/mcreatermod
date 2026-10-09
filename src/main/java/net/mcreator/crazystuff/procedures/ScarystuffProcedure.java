package net.mcreator.crazystuff.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.crazystuff.CrazyStuffMod;

public class ScarystuffProcedure {
	public static void execute(LevelAccessor world) {
		CrazyStuffMod.queueServerWork(140, () -> {
		});
	}
}