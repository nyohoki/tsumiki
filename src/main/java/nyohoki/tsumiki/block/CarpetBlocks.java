package nyohoki.tsumiki.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.Tsumiki;

public class CarpetBlocks { // ゆかめん 床面
	public static final Block GLASS_CARPET = registerBlock(
		"glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColo r(MapColor.CLEAR)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block WHITE_STAINED_GLASS_CARPET = registerBlock(
		"white_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block PINK_STAINED_GLASS_CARPET = registerBlock(
		"pink_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block RED_STAINED_GLASS_CARPET = registerBlock(
		"red_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block ORANGE_STAINED_GLASS_CARPET = registerBlock(
		"orange_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block YELLOW_STAINED_GLASS_CARPET = registerBlock(
		"yellow_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block LIME_STAINED_GLASS_CARPET = registerBlock(
		"lime_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block GREEN_STAINED_GLASS_CARPET = registerBlock(
		"green_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block CYAN_STAINED_GLASS_CARPET = registerBlock(
		"cyan_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_CARPET = registerBlock(
		"light_blue_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block BLUE_STAINED_GLASS_CARPET = registerBlock(
		"blue_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block PURPLE_STAINED_GLASS_CARPET = registerBlock(
		"purple_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block MAGENTA_STAINED_GLASS_CARPET = registerBlock(
		"magenta_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block BROWN_STAINED_GLASS_CARPET = registerBlock(
		"brown_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_CARPET = registerBlock(
		"light_gray_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block GRAY_STAINED_GLASS_CARPET = registerBlock(
		"gray_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block BLACK_STAINED_GLASS_CARPET = registerBlock(
		"black_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	public static final Block TINTED_GLASS_CARPET = registerBlock(
		"tinted_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
		)
	);
	private static Block registerBlock(
		String name,
		Block block
	) {
		registerBlockItem(
			name,
			block
		);
		return Registry.register(
			Registries.BLOCK,
			new Identifier(
				Tsumiki.MOD_ID,
				name
			), 
			block
		);
	}
	private static Item registerBlockItem(
		String name,
		Block block
	) {
		Item item = Registry.register(
			Registries.ITEM,
			new Identifier(
				Tsumiki.MOD_ID,
				name
			),
			new BlockItem(
				block,
				new FabricItemSettings()
			)
		);
		return item;
	}
	public static void registerCarpetBlocks() {
		Tsumiki.LOGGER.info(
			"Registering Carpet Blocks for " + Tsumiki.MOD_ID
		);
	}
}
