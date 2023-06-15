package nyohoki.tsumiki.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.Tsumiki;

public class WallBlocks {
	public static final Block GLASS_WALL = registerBlock("glass_wall",
		new WallBlock(FabricBlockSettings.create()
			.mapColor(MapColor.CLEAR)
			.strength(0.3f, 0.3f)
			.sounds(BlockSoundGroup.GLASS)
			.nonOpaque()
		)
	);
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(Tsumiki.MOD_ID, name), block);
	}
	private static Item registerBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Tsumiki.MOD_ID, name),
			new BlockItem(block, new FabricItemSettings()));
	}
	public static void registerWallBlocks() {
		Tsumiki.LOGGER.info("Registering Wall Blocks for " + Tsumiki.MOD_ID);
	}
}
