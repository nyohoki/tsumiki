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

public class FenceBlocks {
	public static final Block GLASS_FENCE = registerBlock(
		"glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CLEAR)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block WHITE_STAINED_GLASS_FENCE = registerBlock(
		"white_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.WHTIE)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block PINK_STAINED_GLASS_FENCE = registerBlock(
		"pink_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PINK)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block RED_STAINED_GLASS_FENCE = registerBlock(
		"red_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.RED)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block ORANGE_STAINED_GLASS_FENCE = registerBlock(
		"orange_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.ORANGE)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block YELLOW_STAINED_GLASS_FENCE = registerBlock(
		"yellow_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.YELLOW)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block LIME_STAINED_GLASS_FENCE = registerBlock(
		"lime_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIME)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block GREEN_STAINED_GLASS_FENCE = registerBlock(
		"green_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GREEN)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block CYAN_STAINED_GLASS_FENCE = registerBlock(
		"cyan_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.CYAN)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE = registerBlock(
		"light_blue_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_BLUE)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block BLUE_STAINED_GLASS_FENCE = registerBlock(
		"blue_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BLUE)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);public static final Block PURPLE_STAINED_GLASS_FENCE = registerBlock(
		"purple_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.PURPLE)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block MAGENTA_STAINED_GLASS_FENCE = registerBlock(
		"magenta_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.MAGENTA)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block BROWN_STAINED_GLASS_FENCE = registerBlock(
		"brown_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.BROWN)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE = registerBlock(
		"light_gray_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.LIGHT_GRAY)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
		)
	);
	public static final Block GRAY_STAINED_GLASS_FENCE = registerBlock(
		"gray_stained_glass_fence",
		new FenceBlock(
			FabricBlockSettings
				.create()
				.mapColor(MapColor.GRAY)
				.nonOpaque()
				.strength(0.3f, 0.3f)
				.sounds(BlockSoundGroup.GLASS)
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
		String name, Block block
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
	public static void registerFenceBlocks() {
		Tsumiki.LOGGER.info(
			"Registering Fence Blocks for " + Tsumiki.MOD_ID
		);
	}
}
