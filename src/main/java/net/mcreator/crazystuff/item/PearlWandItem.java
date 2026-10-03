package net.mcreator.crazystuff.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.crazystuff.procedures.PearlWandRightclickedProcedure;

public class PearlWandItem extends Item {
	public PearlWandItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		PearlWandRightclickedProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}