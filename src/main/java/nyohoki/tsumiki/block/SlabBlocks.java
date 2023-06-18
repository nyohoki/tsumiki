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

public class SlabBlocks {
	public static final Block GLASS_SLAB = registerBlock(
		"glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CLEAR)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock(
		"white_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block PINK_STAINED_GLASS_SLAB = registerBlock(
		"pink_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block RED_STAINED_GLASS_SLAB = registerBlock(
		"red_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock(
		"orange_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock(
		"yellow_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block LIME_STAINED_GLASS_SLAB = registerBlock(
		"lime_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock(
		"green_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock(
		"cyan_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock(
		"light_blue_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock(
		"blue_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock(
		"purple_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock(
		"magenta_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock(
		"brown_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock(
		"light_gray_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock(
		"gray_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock(
		"black_stained_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block TINTED_GLASS_SLAB = registerBlock(
		"tinted_glass_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.GLASS)
				.strength(0.3f, 0.3f)
		)
	);
	public static final Block WHITE_WOOL_SLAB = registerBlock(
		"white_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHITE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block PINK_WOOL_SLAB = registerBlock(
		"pink_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block RED_WOOL_SLAB = registerBlock(
		"red_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block ORANGE_WOOL_SLAB = registerBlock(
		"orange_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block YELLOW_WOOL_SLAB = registerBlock(
		"yellow_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block LIME_WOOL_SLAB = registerBlock(
		"lime_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block GREEN_WOOL_SLAB = registerBlock(
		"green_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.strength(0.8f, 0.8f)
				.sounds(BlockSoundGroup.WOOL)
		)
	);
	public static final Block CYAN_WOOL_SLAB = registerBlock(
		"cyan_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock(
		"light_blue_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block BLUE_WOOLSLAB = registerBlock(
		"blue_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block PURPLE_WOOL_SLAB = registerBlock(
		"purple_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block MAGENTA_WOOL_SLAB = registerBlock(
		"magenta_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block BROWN_WOOL_SLAB = registerBlock(
		"brown_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock(
		"light_gray_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block GRAY_WOOL_SLAB = registerBlock(
		"gray_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
		)
	);
	public static final Block BLACK_WOOL_SLAB = registerBlock(
		"black_wool_slab",
		new SlabBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLACK)
				.nonOpaque()
				.sounds(BlockSoundGroup.WOOL)
				.strength(0.8f, 0.8f)
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
	public static void registerSlabBlocks() {
		Tsumiki.LOGGER.info(
			"Registering Slab Blocks for " + Tsumiki.MOD_ID
		);
	}
}
