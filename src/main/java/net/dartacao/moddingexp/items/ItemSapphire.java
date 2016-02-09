package net.dartacao.moddingexp.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSapphire extends Item {

	private final String name = "sapphire";

	public ItemSapphire() {
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(name)
	}
}
