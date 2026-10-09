/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.mcreator.crazystuff.command.AmosCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class CrazyStuffModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, environment) -> {
			AmosCommand.register(dispatcher, commandBuildContext, environment);
		});
	}
}