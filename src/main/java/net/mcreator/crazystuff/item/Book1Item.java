package net.mcreator.crazystuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Book1Item extends Item {
	public Book1Item(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}