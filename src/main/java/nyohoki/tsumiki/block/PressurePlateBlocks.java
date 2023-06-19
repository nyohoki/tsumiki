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

public class PressurePlateBlocks {
	public static final Block GLASS_PRESSURE_PLATE = registerBlock(
		"glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CLEAR)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block WHITE_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"white_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PINK_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"pink_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block RED_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"red_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block ORANGE_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"orange_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block YELLOW_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"yellow_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIME_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"lime_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GREEN_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"green_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block CYAN_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"cyan_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"light_blue_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"blue_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PURPLE_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"purple_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block MAGENTA_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"magenta_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BROWN_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"brown_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"light_gray_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"gray_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLACK_STAINED_GLASS_PRESSURE_PLATE = registerBlock(
		"black_stained_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block TINTED_GLASS_PRESSURE_PLATE = registerBlock(
		"tinted_glass_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f),
			BlockSetType.CHERRY
		)
	);
	public static final Block WHITE_WOOL_PRESSURE_PLATE = registerBlock(
		"white_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PINK_WOOL_PRESSURE_PLATE = registerBlock(
		"pink_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block RED_WOOL_PRESSURE_PLATE = registerBlock(
		"red_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block ORANGE_WOOL_PRESSURE_PLATE = registerBlock(
		"orange_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block YELLOW_WOOL_PRESSURE_PLATE = registerBlock(
		"yellow_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIME_WOOL_PRESSURE_PLATE = registerBlock(
		"lime_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GREEN_WOOL_PRESSURE_PLATE = registerBlock(
		"green_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block CYAN_WOOL_PRESSURE_PLATE = registerBlock(
		"cyan_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_BLUE_WOOL_PRESSURE_PLATE = registerBlock(
		"light_blue_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLUE_WOOL_PRESSURE_PLATE = registerBlock(
		"blue_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block PURPLE_WOOL_PRESSURE_PLATE = registerBlock(
		"purple_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block MAGENTA_WOOL_PRESSURE_PLATE = registerBlock(
		"magenta_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BROWN_WOOL_PRESSURE_PLATE = registerBlock(
		"brown_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block LIGHT_GRAY_WOOL_PRESSURE_PLATE = registerBlock(
		"light_gray_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block GRAY_WOOL_PRESSURE_PLATE = registerBlock(
		"gray_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
		)
	);
	public static final Block BLACK_WOOL_PRESSURE_PLATE = registerBlock(
		"black_wool_pressure_plate",
		new PressurePlateBlock(
			PressurePlateBlock
				.ActivationRule
				.EVERYTHING,
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.noCollision()
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f),
			BlockSetType.CHERRY
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
	public static void registerPressurePlateBlocks() {
		Tsumiki.LOGGER.info(
			"Registering Pressure Plate Blocks for " + Tsumiki.MOD_ID
		);
	}
}