package net.mcreator.crazystuff.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.crazystuff.procedures.RockEntityWalksOnTheBlockProcedure;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class RockBlock extends ButtonBlock {
	public RockBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.STONE, 20, properties.sound(SoundType.ANVIL).strength(0.5f, 10f).noCollision().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).replaceable().instrument(NoteBlockInstrument.BASEDRUM));
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		RockEntityWalksOnTheBlockProcedure.execute(world, entity);
	}
}