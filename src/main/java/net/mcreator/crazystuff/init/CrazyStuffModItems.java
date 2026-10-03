/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.crazystuff.item.SmachHammerItem;
import net.mcreator.crazystuff.item.SlangbellaItem;
import net.mcreator.crazystuff.item.PearlWandItem;
import net.mcreator.crazystuff.CrazyStuffMod;

import java.util.function.Function;

public class CrazyStuffModItems {
	public static Item SMACH_HAMMER;
	public static Item SLANGBELLA;
	public static Item PEARL_WAND;

	public static void load() {
		SMACH_HAMMER = register("smach_hammer", SmachHammerItem::new);
		SLANGBELLA = register("slangbella", SlangbellaItem::new);
		PEARL_WAND = register("pearl_wand", PearlWandItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CrazyStuffMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}