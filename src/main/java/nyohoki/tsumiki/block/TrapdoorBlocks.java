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

public class TrapdoorBlocks {
	public static final Block GLASS_TRAPDOOR = registerBlock(
		"glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CLEAR)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block WHITE_STAINED_GLASS_TRAPDOOR = registerBlock(
		"white_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PINK_STAINED_GLASS_TRAPDOOR = registerBlock(
		"pink_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block RED_STAINED_GLASS_TRAPDOOR = registerBlock(
		"red_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block ORANGE_STAINED_GLASS_TRAPDOOR = registerBlock(
		"orange_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block YELLOW_STAINED_GLASS_TRAPDOOR = registerBlock(
		"yellow_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIME_STAINED_GLASS_TRAPDOOR = registerBlock(
		"lime_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GREEN_STAINED_GLASS_TRAPDOOR = registerBlock(
		"green_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block CYAN_STAINED_GLASS_TRAPDOOR = registerBlock(
		"cyan_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = registerBlock(
		"light_blue_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLUE_STAINED_GLASS_TRAPDOOR = registerBlock(
		"blue_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PURPLE_STAINED_GLASS_TRAPDOOR = registerBlock(
		"purple_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR = registerBlock(
		"magenta_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BROWN_STAINED_GLASS_TRAPDOOR = registerBlock(
		"brown_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = registerBlock(
		"light_gray_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GRAY_STAINED_GLASS_TRAPDOOR = registerBlock(
		"gray_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLACK_STAINED_GLASS_TRAPDOOR = registerBlock(
		"black_stained_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block TINTED_GLASS_TRAPDOOR = registerBlock(
		"tinted_glass_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block WHITE_WOOL_TRAPDOOR = registerBlock(
		"white_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PINK_WOOL_TRAPDOOR = registerBlock(
		"pink_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block RED_WOOL_TRAPDOOR = registerBlock(
		"red_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block ORANGE_WOOL_TRAPDOOR = registerBlock(
		"orange_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block YELLOW_WOOL_TRAPDOOR = registerBlock(
		"yellow_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIME_WOOL_TRAPDOOR = registerBlock(
		"lime_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GREEN_WOOL_TRAPDOOR = registerBlock(
		"green_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block CYAN_WOOL_TRAPDOOR = registerBlock(
		"cyan_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_WOOL_TRAPDOOR = registerBlock(
		"light_blue_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLUE_WOOL_TRAPDOOR = registerBlock(
		"blue_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PURPLE_WOOL_TRAPDOOR = registerBlock(
		"purple_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block MAGENTA_WOOL_TRAPDOOR = registerBlock(
		"magenta_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BROWN_WOOL_TRAPDOOR = registerBlock(
		"brown_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_WOOL_TRAPDOOR = registerBlock(
		"light_gray_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GRAY_WOOL_TRAPDOOR = registerBlock(
		"gray_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLACK_WOOL_TRAPDOOR = registerBlock(
		"black_wool_trapdoor",
		new TrapdoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	private static Block registerBlock(
		String name, Block block
	) {
		registerBlockItem(
			name,
			block
		);
		return Registry.register(
			Registries.BLOCK,
			new Identifier(
				Tsumiki.MOD_ID,
				name),
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
	public static void registerTrapdoorBlocks() {
		Tsumiki.LOGGER.info(
			"Registering Trapdoor Blocks for " + Tsumiki.MOD_ID
		);
	}
}
