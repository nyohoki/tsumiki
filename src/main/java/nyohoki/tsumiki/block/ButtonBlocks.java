package nyohoki.tsumiki.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.Tsumiki;

public class ButtonBlocks {
	public static final Block GLASS_BUTTON =
		registerBlock(
			"glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.CLEAR)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
			BlockSetType.IRON,30,false
			)
		);
	public static final Block WHITE_STAINED_GLASS_BUTTON =
		registerBlock(
			"white_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.WHITE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block PINK_STAINED_GLASS_BUTTON =
		registerBlock(
			"pink_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.PINK)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block RED_STAINED_GLASS_BUTTON =
		registerBlock(
			"red_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.RED)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block ORANGE_STAINED_GLASS_BUTTON =
		registerBlock(
			"orange_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.ORANGE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block YELLOW_STAINED_GLASS_BUTTON =
		registerBlock(
			"yellow_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.YELLOW)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block LIME_STAINED_GLASS_BUTTON =
		registerBlock(
			"lime_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.LIME)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block GREEN_STAINED_GLASS_BUTTON =
		registerBlock(
			"green_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.GREEN)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block CYAN_STAINED_GLASS_BUTTON =
		registerBlock(
			"cyan_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.CYAN)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_BUTTON =
		registerBlock(
			"light_blue_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.LIGHT_BLUE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block BLUE_STAINED_GLASS_BUTTON =
		registerBlock(
			"blue_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.BLUE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block PURPLE_STAINED_GLASS_BUTTON =
		registerBlock(
			"purple_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.PURPLE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block MAGENTA_STAINED_GLASS_BUTTON =
		registerBlock(
			"magenta_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.MAGENTA)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block BROWN_STAINED_GLASS_BUTTON =
		registerBlock(
			"brown_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.BROWN)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_BUTTON =
		registerBlock(
			"light_gray_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.LIGHT_GRAY)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block GRAY_STAINED_GLASS_BUTTON =
		registerBlock(
			"gray_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.GRAY)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block BLACK_STAINED_GLASS_BUTTON =
		registerBlock(
			"black_stained_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.BLACK)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block TINTED_GLASS_BUTTON =
		registerBlock(
			"tinted_glass_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.BLACK)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.GLASS)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block WHITE_WOOL_BUTTON =
		registerBlock(
			"white_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.WHITE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block PINK_WOOL_BUTTON =
		registerBlock(
			"pink_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.PINK)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block RED_WOOL_BUTTON =
		registerBlock(
			"red_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.RED)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block ORANGE_WOOL_BUTTON =
		registerBlock(
			"orange_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.ORANGE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block YELLOW_WOOL_BUTTON =
		registerBlock(
			"yellow_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.YELLOW)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block LIME_WOOL_BUTTON =
		registerBlock(
			"lime_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.LIME)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block GREEN_WOOL_BUTTON =
		registerBlock(
			"green_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.GREEN)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block CYAN_WOOL_BUTTON =
		registerBlock(
			"cyan_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.CYAN)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block LIGHT_BLUE_WOOL_BUTTON =
		registerBlock(
			"light_blue_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.LIGHT_BLUE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block BLUE_WOOL_BUTTON =
		registerBlock(
			"blue_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.BLUE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block PURPLE_WOOL_BUTTON =
		registerBlock(
			"purple_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.PURPLE)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block MAGENTA_WOOL_BUTTON =
		registerBlock(
			"magenta_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.MAGENTA)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block BROWN_WOOL_BUTTON =
		registerBlock(
			"brown_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.BROWN)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block LIGHT_GRAY_WOOL_BUTTON =
		registerBlock(
			"light_gray_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.LIGHT_GRAY)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.wool)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block GRAY_WOOL_BUTTON =
		registerBlock(
			"gray_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.GRAY)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	public static final Block BLACK_WOOL_BUTTON =
		registerBlock(
			"black_wool_button",
			new ButtonBlock(
				AbstractBlock.Settings.create()
					.mapColor(MapColor.BLACK)
					.strength(0.3f, 0.3f)
					.sounds(BlockSoundGroup.WOOL)
					.noCollision()
					.nonOpaque(),
				BlockSetType.IRON,30,false
			)
		);
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(Tsumiki.MOD_ID, name), block);
	}
	private static void registerBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Tsumiki.MOD_ID, name),
			new BlockItem(block, new FabricItemSettings()));
	}
	public static void registerButtonBlocks() {
		Tsumiki.LOGGER.info("Registering Button Blocks for " + Tsumiki.MOD_ID);
	}
}
