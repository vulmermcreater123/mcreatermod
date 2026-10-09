package net.mcreator.crazystuff.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.mcreator.crazystuff.CrazyStuffMod;

public class ScarystuffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Event started").withColor(0xcccc00).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.UNDERLINE), false);
		}
		CrazyStuffMod.queueServerWork(140, () -> {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACKSTONE));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		});
	}
}