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
				.mapColor(MapColor.CLEAR)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block WHITE_STAINED_GLASS_CARPET = registerBlock(
		"white_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block PINK_STAINED_GLASS_CARPET = registerBlock(
		"pink_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block RED_STAINED_GLASS_CARPET = registerBlock(
		"red_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block ORANGE_STAINED_GLASS_CARPET = registerBlock(
		"orange_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block YELLOW_STAINED_GLASS_CARPET = registerBlock(
		"yellow_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block LIME_STAINED_GLASS_CARPET = registerBlock(
		"lime_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block GREEN_STAINED_GLASS_CARPET = registerBlock(
		"green_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block CYAN_STAINED_GLASS_CARPET = registerBlock(
		"cyan_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_CARPET = registerBlock(
		"light_blue_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block BLUE_STAINED_GLASS_CARPET = registerBlock(
		"blue_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block PURPLE_STAINED_GLASS_CARPET = registerBlock(
		"purple_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block MAGENTA_STAINED_GLASS_CARPET = registerBlock(
		"magenta_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block BROWN_STAINED_GLASS_CARPET = registerBlock(
		"brown_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_CARPET = registerBlock(
		"light_gray_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block GRAY_STAINED_GLASS_CARPET = registerBlock(
		"gray_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block BLACK_STAINED_GLASS_CARPET = registerBlock(
		"black_stained_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block TINTED_GLASS_CARPET = registerBlock(
		"tinted_glass_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block OAK_WOOD_CARPET = registerBlock(
		"oak_wood_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block DARK_OAK_WOOD_CARPET = registerBlock(
		"dark_oak_wood_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block BIRCH_WOOD_CARPET = registerBlock(
		"birch_wood_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block SPRUCE_WOOD_CARPET = registerBlock(
		"spruce_wood_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block JUNGLE_WOOD_CARPET = registerBlock(
		"jungle_wood_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block ACACIA_WOOD_CARPET = registerBlock(
		"acacia_wood_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block MANGROVE_WOOD_CARPET = registerBlock(
		"mangrove_wood_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block CRIMSON_HYPHAE_CARPET = registerBlock(
		"crimson_hyphae_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block WARPED_HYPHAE_CARPET = registerBlock(
		"warped_hyphae_carpet",
		new CarpetBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.sounds(BlockSoundGroup.WOOD)
				.strength(0.3f, 0.3f)
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
