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

public class GateBlocks {
	public static final Block GLASS_GATE = registerBlock(
		"glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CLEAR)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block WHITE_STAINED_GLASS_GATE = registerBlock(
		"white_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block PINK_STAINED_GLASS_GATE = registerBlock(
		"pink_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block RED_STAINED_GLASS_GATE = registerBlock(
		"red_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block ORANGE_STAINED_GLASS_GATE = registerBlock(
		"orange_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block YELLOW_STAINED_GLASS_GATE = registerBlock(
		"yellow_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block LIME_STAINED_GLASS_GATE = registerBlock(
		"lime_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block GREEN_STAINED_GLASS_GATE = registerBlock(
		"green_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block CYAN_STAINED_GLASS_GATE = registerBlock(
		"cyan_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_GATE = registerBlock(
		"light_blue_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block BLUE_STAINED_GLASS_GATE = registerBlock(
		"blue_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block PURPLE_STAINED_GLASS_GATE = registerBlock(
		"purple_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block MAGENTA_STAINED_GLASS_GATE = registerBlock(
		"magenta_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block BROWN_STAINED_GLASS_GATE = registerBlock(
		"brown_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_GATE = registerBlock(
		"light_gray_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block GRAY_STAINED_GLASS_GATE = registerBlock(
		"gray_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block BLACK_STAINED_GLASS_GATE = registerBlock(
		"black_stained_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block TINTED_GLASS_GATE = registerBlock(
		"tinted_glass_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			WoodType.CHERRY
		)
	);
	public static final Block WHITE_WOOL_GATE = registerBlock(
		"white_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block PINK_WOOL_GATE = registerBlock(
		"pink_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block RED_WOOL_GATE = registerBlock(
		"red_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block ORANGE_WOOL_GATE = registerBlock(
		"orange_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block YELLOW_WOOL_GATE = registerBlock(
		"yellow_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block LIME_WOOL_GATE = registerBlock(
		"lime_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block GREEN_WOOL_GATE = registerBlock(
		"green_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block CYAN_WOOL_GATE = registerBlock(
		"cyan_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_WOOL_GATE = registerBlock(
		"light_blue_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block BLUE_WOOL_GATE = registerBlock(
		"blue_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block PURPLE_WOOL_GATE = registerBlock(
		"purple_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block MAGENTA_WOOL_GATE = registerBlock(
		"magenta_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block BROWN_WOOL_GATE = registerBlock(
		"brown_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_WOOL_GATE = registerBlock(
		"light_gray_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block GRAY_WOOL_GATE = registerBlock(
		"gray_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
		)
	);
	public static final Block BLACK_WOOL_GATE = registerBlock(
		"black_wool_gate",
		new FenceGateBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			WoodType.CHERRY
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
	public static void registerGateBlocks() {
		Tsumiki.LOGGER.info(
			"Registering Gate Blocks for " + Tsumiki.MOD_ID
		);
	}
}
