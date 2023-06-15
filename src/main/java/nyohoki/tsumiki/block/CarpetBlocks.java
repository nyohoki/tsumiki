package nyohoki.tsumiki.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.Tsumiki;
import nyohoki.tsumiki.item.TsumikiItemGroup;

public class CarpetBlocks {
	public static final Block GLASS_CARPET = registerBlock("glass_carpet",
		new CarpetBlock(AbstractBlock.Settings.create().mapColor(MapColor.CLEAR)
			.strength(0.3f, 0.3f)
			.sounds(BlockSoundGroup.GLASS)
			.nonOpaque()
		),
		TsumikiItemGroup.TSUMIKI
	);

	private static Block registerBlock(String name, Block block, ItemGroup group) {

		registerBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(Tsumiki.MOD_ID, name), block);
	}
	private static void registerBlockItem(String name, Block block, ItemGroup group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Tsumiki.MOD_ID, name),
			new BlockItem(block, new FabricItemSettings()));
	}
	public static void registerCarpetBlocks() {
		Tsumiki.LOGGER.info("Registering Carpet Blocks for " + Tsumiki.MOD_ID);
	}
}
