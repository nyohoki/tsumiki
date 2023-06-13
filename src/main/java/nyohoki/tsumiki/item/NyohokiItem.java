package nyohoki.tsumiki.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.Tsumiki;

public class NyohokiItem {
	public static final Item IKOHOYN = registerItem("ikohoyn",
		new Item(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Tsumiki.MOD_ID, name), item);
	}
	public static void registerNyohokiItem() {
		Tsumiki.LOGGER.info("Registering Ikohoyn Item for " + Tsumiki.MOD_ID);
	}
}
