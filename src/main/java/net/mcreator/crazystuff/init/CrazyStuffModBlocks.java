/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.crazystuff.block.RockBlock;
import net.mcreator.crazystuff.CrazyStuffMod;

import java.util.function.Function;

public class CrazyStuffModBlocks {
	public static Block ROCK;

	public static void load() {
		ROCK = register("rock", RockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CrazyStuffMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}