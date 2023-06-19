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

public class DoorBlocks {
	public static final Block GLASS_DOOR = registerBlock(
		"glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CLEAR)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block WHITE_STAINED_GLASS_DOOR = registerBlock(
		"white_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block PINK_STAINED_GLASS_DOOR = registerBlock(
		"pink_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block RED_STAINED_GLASS_DOOR = registerBlock(
		"red_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block ORANGE_STAINED_GLASS_DOOR = registerBlock(
		"orange_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block YELLOW_STAINED_GLASS_DOOR = registerBlock(
		"yellow_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block LIME_STAINED_GLASS_DOOR = registerBlock(
		"lime_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block GREEN_STAINED_GLASS_DOOR = registerBlock(
		"green_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block CYAN_STAINED_GLASS_DOOR = registerBlock(
		"cyan_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock(
		"light_blue_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block BLUE_STAINED_GLASS_DOOR = registerBlock(
		"blue_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block PURPLE_STAINED_GLASS_DOOR = registerBlock(
		"purple_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);public static final Block MAGENTA_STAINED_GLASS_DOOR = registerBlock(
		"magenta_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block BROWN_STAINED_GLASS_DOOR = registerBlock(
		"brown_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock(
		"light_gray_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);public static final Block GRAY_STAINED_GLASS_DOOR = registerBlock(
		"gray_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block BLACK_STAINED_GLASS_DOOR = registerBlock(
		"black_stained_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block TINTED_GLASS_DOOR = registerBlock(
		"tinted_glass_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block WHITE_WOOL_DOOR = registerBlock(
		"white_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block PINK_WOOL_DOOR = registerBlock(
		"pink_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block RED_WOOL_DOOR = registerBlock(
		"red_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block ORANGE_WOOL_DOOR = registerBlock(
		"orange_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block YELLOW_WOOL_DOOR = registerBlock(
		"yellow_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block LIME_WOOL_DOOR = registerBlock(
		"lime_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block GREEN_WOOL_DOOR = registerBlock(
		"green_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block CYAN_WOOL_DOOR = registerBlock(
		"cyan_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_WOOL_DOOR = registerBlock(
		"light_blue_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block BLUE_WOOL_DOOR = registerBlock(
		"blue_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block PURPLE_WOOL_DOOR = registerBlock(
		"purple_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);public static final Block MAGENTA_WOOL_DOOR = registerBlock(
		"magenta_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block BROWN_WOOL_DOOR = registerBlock(
		"brown_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_WOOL_DOOR = registerBlock(
		"light_gray_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);public static final Block GRAY_WOOL_DOOR = registerBlock(
		"gray_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
		)
	);
	public static final Block BLACK_WOOL_DOOR = registerBlock(
		"black_wool_door",
		new DoorBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType
				.CHERRY
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
	public static void registerDoorBlocks() {
		Tsumiki.LOGGER.info(
			"Registering Door Blocks for " + Tsumiki.MOD_ID
		);
	}
}
