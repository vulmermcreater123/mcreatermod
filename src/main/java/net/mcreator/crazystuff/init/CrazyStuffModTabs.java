/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.crazystuff.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.crazystuff.CrazyStuffMod;

public class CrazyStuffModTabs {
	public static ResourceKey<CreativeModeTab> TAB_COOLSTUFF = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(CrazyStuffMod.MODID, "coolstuff"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_COOLSTUFF,
				CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.crazy_stuff.coolstuff")).icon(() -> new ItemStack(Blocks.HEAVY_CORE)).displayItems((parameters, tabData) -> {
					tabData.accept(CrazyStuffModItems.SMACH_HAMMER);
					tabData.accept(CrazyStuffModItems.SLANGBELLA);
					tabData.accept(CrazyStuffModItems.PEARL_WAND);
				}).build());
	}
}