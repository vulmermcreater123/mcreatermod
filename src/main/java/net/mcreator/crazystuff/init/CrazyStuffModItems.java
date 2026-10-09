/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.crazystuff.item.SmachHammerItem;
import net.mcreator.crazystuff.item.SlangbellaItem;
import net.mcreator.crazystuff.CrazyStuffMod;

import java.util.function.Function;

public class CrazyStuffModItems {
	public static Item SMACH_HAMMER;
	public static Item SLANGBELLA;
	public static Item ROCK;
	public static Item AMOS_BLOCK;

	public static void load() {
		SMACH_HAMMER = register("smach_hammer", SmachHammerItem::new);
		SLANGBELLA = register("slangbella", SlangbellaItem::new);
		ROCK = block(CrazyStuffModBlocks.ROCK, "rock", new Item.Properties().stacksTo(12));
		AMOS_BLOCK = block(CrazyStuffModBlocks.AMOS_BLOCK, "amos_block");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CrazyStuffMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CrazyStuffMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}