package net.mcreator.crazystuff.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

public class AmosprocProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof ServerLevel _level) {
			_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Du \u00E4r nu Amos").withColor(0x663300).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.UNDERLINE), false);
		}
	}
}