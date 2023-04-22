package net.nyohoki.tsumiki;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tsumiki implements ModInitializer {
	public static final String MOD_ID = "tsumiki";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
// nyohoki block might be able to remove this later
	public static final Block GURASU =
		new Block(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// clear glass blocks
	public static final Block GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// white stained glass blocks
	public static final Block WHITE_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block WHITE_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// pink stained glass blocks
	public static final Block PINK_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PINK_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// red stained glass blocks
	public static final Block RED_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block RED_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// orange stained glass blocks
	public static final Block ORANGE_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block ORANGE_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// yellow stained glass blocks
	public static final Block YELLOW_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS).
		strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block YELLOW_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// lime stained glass blocks
	public static final Block LIME_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIME_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// green stained glass block
	public static final Block GREEN_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GREEN_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// cyan stained glass blocks
	public static final Block CYAN_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block CYAN_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// light blue stained glass blocks
	public static final Block LIGHT_BLUE_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_BLUE_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// blue stained glass block
	public static final Block BLUE_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLUE_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// purple stained glass blocks
	public static final Block PURPLE_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block PURPLE_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// magenta stained glass blocks
	public static final Block MAGENTA_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block MAGENTA_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// brown stained glass blocks
	public static final Block BROWN_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BROWN_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// light gray stained glass blocks
	public static final Block LIGHT_GRAY_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block LIGHT_GRAY_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// gray stained glass blocks
	public static final Block GRAY_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block GRAY_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// black stained glass blocks
	public static final Block BLACK_STAINED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block BLACK_STAINED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// tinted glass blocks
	public static final Block TINTED_GLASS_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f)
		.nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
	public static final Block TINTED_GLASS_WALL =
		new WallBlock(FabricBlockSettings.of(Material.GLASS)
		.strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)
		);
// white wool blocks
	public static final Block WHITE_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block WHITE_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// pink wool blocks
	public static final Block PINK_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PINK_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// red wool blocks
	public static final Block RED_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block RED_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// orange wool blocks
	public static final Block ORANGE_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block ORANGE_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// yellow wool blocks
	public static final Block YELLOW_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block YELLOW_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// lime wool blocks
	public static final Block LIME_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIME_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// green wool blocks
	public static final Block GREEN_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GREEN_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// cyan wool blocks
	public static final Block CYAN_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block CYAN_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// light blue wool blocks
	public static final Block LIGHT_BLUE_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_BLUE_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// blue wool blocks
	public static final Block BLUE_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLUE_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// purple wool blocks
	public static final Block PURPLE_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block PURPLE_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// magenta wool blocks
	public static final Block MAGENTA_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block MAGENTA_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// brown wool blocks
	public static final Block BROWN_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BROWN_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// light gray wool blocks
	public static final Block LIGHT_GRAY_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block LIGHT_GRAY_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// gray wool blocks
	public static final Block GRAY_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f).
		sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block GRAY_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// black wool blocks
	public static final Block BLACK_WOOL_BUTTON =
		new StoneButtonBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_DOOR =
		new DoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_FENCE =
		new FenceBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_GATE =
		new FenceGateBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_PRESSURE_PLATE =
		new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_SLAB =
		new SlabBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_STAIRS =
		new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.WOOL).strength(0.3f)
		.sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_TRAPDOOR =
		new TrapdoorBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
	public static final Block BLACK_WOOL_WALL =
		new WallBlock(FabricBlockSettings.of(Material.WOOL)
		.strength(0.8f).sounds(BlockSoundGroup.WOOL)
		);
// deepslate brick blocks
	public static final Block DEEPSLATE_BRICK_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.STONE)
		.strength(6f).nonOpaque().sounds(BlockSoundGroup.STONE)
		);
// deepslate tile blocks
	public static final Block DEEPSLATE_TILE_CARPET =
		new CarpetBlock(FabricBlockSettings.of(Material.STONE)
		.strength(6f).nonOpaque().sounds(BlockSoundGroup.STONE)
		);

@Override
public void onInitialize() {
	LOGGER.info("Henlo Fren :3c");

	Registry.register(Registry.BLOCK,
		new Identifier("tsumiki", "gurasu"), GURASU
	);
	Registry.register(Registry.ITEM,
		new Identifier("tsumiki", "gurasu"),
		new BlockItem(GURASU,
		new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS))
	);
// clear glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_button"), GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_button"), new BlockItem(GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_carpet"), GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_carpet"), new BlockItem(GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_door"), GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_door"), new BlockItem(GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_fence"), GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_fence"), new BlockItem(GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_gate"), GLASS_GATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_gate"), new BlockItem(GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_pressure_plate"), GLASS_PRESSURE_PLATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_pressure_plate"), new BlockItem(GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_slab"), GLASS_SLAB);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_slab"), new BlockItem(GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_stairs"), GLASS_STAIRS);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_stairs"), new BlockItem(GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_trapdoor"), GLASS_TRAPDOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_trapdoor"), new BlockItem(GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_wall"), GLASS_WALL);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_wall"), new BlockItem(GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
// white stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_button"), WHITE_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_button"), new BlockItem(WHITE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_carpet"), WHITE_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_carpet"), new BlockItem(WHITE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_door"), WHITE_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_door"), new BlockItem(WHITE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_fence"), WHITE_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_fence"), new BlockItem(WHITE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_gate"), WHITE_STAINED_GLASS_GATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_gate"), new BlockItem(WHITE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_pressure_plate"), WHITE_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_pressure_plate"), new BlockItem(WHITE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_slab"), WHITE_STAINED_GLASS_SLAB);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_slab"), new BlockItem(WHITE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_stairs"), WHITE_STAINED_GLASS_STAIRS);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_stairs"), new BlockItem(WHITE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_trapdoor"), WHITE_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_trapdoor"), new BlockItem(WHITE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_wall"), WHITE_STAINED_GLASS_WALL);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_wall"), new BlockItem(WHITE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
// pink stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_button"), PINK_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_button"), new BlockItem(PINK_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_carpet"), PINK_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_carpet"), new BlockItem(PINK_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_door"), PINK_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_door"), new BlockItem(PINK_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_fence"), PINK_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_fence"), new BlockItem(PINK_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_gate"), PINK_STAINED_GLASS_GATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_gate"), new BlockItem(PINK_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_pressure_plate"), PINK_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_pressure_plate"), new BlockItem(PINK_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_slab"), PINK_STAINED_GLASS_SLAB);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_slab"), new BlockItem(PINK_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_stairs"), PINK_STAINED_GLASS_STAIRS);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_stairs"), new BlockItem(PINK_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_trapdoor"), PINK_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_trapdoor"), new BlockItem(PINK_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_wall"), PINK_STAINED_GLASS_WALL);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_wall"), new BlockItem(PINK_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
// red stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_button"), RED_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_button"), new BlockItem(RED_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_carpet"), RED_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_carpet"), new BlockItem(RED_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_door"), RED_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_door"), new BlockItem(RED_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_fence"), RED_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_fence"), new BlockItem(RED_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_gate"), RED_STAINED_GLASS_GATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_gate"), new BlockItem(RED_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_pressure_plate"), RED_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_pressure_plate"), new BlockItem(RED_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_slab"), RED_STAINED_GLASS_SLAB);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_slab"), new BlockItem(RED_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_stairs"), RED_STAINED_GLASS_STAIRS);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_stairs"), new BlockItem(RED_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_trapdoor"), RED_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_trapdoor"), new BlockItem(RED_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_wall"), RED_STAINED_GLASS_WALL);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_wall"), new BlockItem(RED_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
// orange stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_button"), ORANGE_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_button"), new BlockItem(ORANGE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_carpet"), ORANGE_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_carpet"), new BlockItem(ORANGE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_door"), ORANGE_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_door"), new BlockItem(ORANGE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_fence"), ORANGE_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_fence"), new BlockItem(ORANGE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_gate"), ORANGE_STAINED_GLASS_GATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_gate"), new BlockItem(ORANGE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));	
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_pressure_plate"), ORANGE_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_pressure_plate"), new BlockItem(ORANGE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_slab"), ORANGE_STAINED_GLASS_SLAB);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_slab"), new BlockItem(ORANGE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_stairs"), ORANGE_STAINED_GLASS_STAIRS);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_stairs"), new BlockItem(ORANGE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_trapdoor"), ORANGE_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_trapdoor"), new BlockItem(ORANGE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_wall"), ORANGE_STAINED_GLASS_WALL);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_wall"), new BlockItem(ORANGE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
// yellow stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_button"), YELLOW_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_button"), new BlockItem(YELLOW_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_carpet"), YELLOW_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_carpet"), new BlockItem(YELLOW_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_door"), YELLOW_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_door"), new BlockItem(YELLOW_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_fence"), YELLOW_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_fence"), new BlockItem(YELLOW_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_gate"), YELLOW_STAINED_GLASS_GATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_gate"), new BlockItem(YELLOW_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_pressure_plate"), YELLOW_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_pressure_plate"), new BlockItem(YELLOW_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_slab"), YELLOW_STAINED_GLASS_SLAB);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_slab"), new BlockItem(YELLOW_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_stairs"), YELLOW_STAINED_GLASS_STAIRS);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_stairs"), new BlockItem(YELLOW_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_trapdoor"), YELLOW_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_trapdoor"), new BlockItem(YELLOW_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_wall"), YELLOW_STAINED_GLASS_WALL);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_wall"), new BlockItem(YELLOW_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
// lime stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_button"), LIME_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_button"), new BlockItem(LIME_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_carpet"), LIME_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_carpet"), new BlockItem(LIME_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_door"), LIME_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_door"), new BlockItem(LIME_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_fence"), LIME_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_fence"), new BlockItem(LIME_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_gate"), LIME_STAINED_GLASS_GATE);

// green stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_button"), GREEN_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_button"), new BlockItem(GREEN_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_carpet"), GREEN_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_carpet"), new BlockItem(GREEN_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_door"), GREEN_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_door"), new BlockItem(GREEN_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_fence"), GREEN_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_fence"), new BlockItem(GREEN_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_gate"), GREEN_STAINED_GLASS_GATE);

// cyan stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_button"), CYAN_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_button"), new BlockItem(CYAN_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_carpet"), CYAN_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_carpet"), new BlockItem(CYAN_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_door"), CYAN_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_door"), new BlockItem(CYAN_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_fence"), CYAN_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_fence"), new BlockItem(CYAN_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_gate"), CYAN_STAINED_GLASS_GATE);

// light blue stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_button"), LIGHT_BLUE_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_button"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_carpet"), LIGHT_BLUE_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_carpet"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_door"), LIGHT_BLUE_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_door"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_fence"), LIGHT_BLUE_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_fence"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_gate"), LIGHT_BLUE_STAINED_GLASS_GATE);

// blue stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_button"), BLUE_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_button"), new BlockItem(BLUE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_carpet"), BLUE_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_carpet"), new BlockItem(BLUE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_door"), BLUE_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_door"), new BlockItem(BLUE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_fence"), BLUE_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_fence"), new BlockItem(BLUE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_gate"), BLUE_STAINED_GLASS_GATE);

// purple stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_button"), PURPLE_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_button"), new BlockItem(PURPLE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_carpet"), PURPLE_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_carpet"), new BlockItem(PURPLE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_door"), PURPLE_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_door"), new BlockItem(PURPLE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_fence"), PURPLE_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_fence"), new BlockItem(PURPLE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_gate"), PURPLE_STAINED_GLASS_GATE);

// magenta stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_button"), MAGENTA_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_button"), new BlockItem(MAGENTA_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_carpet"), MAGENTA_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_carpet"), new BlockItem(MAGENTA_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_door"), MAGENTA_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_door"), new BlockItem(MAGENTA_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_fence"), MAGENTA_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_fence"), new BlockItem(MAGENTA_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_gate"), MAGENTA_STAINED_GLASS_GATE);

// brown stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_button"), BROWN_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_button"), new BlockItem(BROWN_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_carpet"), BROWN_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_carpet"), new BlockItem(BROWN_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_door"), BROWN_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_door"), new BlockItem(BROWN_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_fence"), BROWN_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_fence"), new BlockItem(BROWN_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_gate"), BROWN_STAINED_GLASS_GATE);

// light gray stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_button"), LIGHT_GRAY_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_button"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_carpet"), LIGHT_GRAY_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_carpet"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));	
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_door"), LIGHT_GRAY_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_door"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_fence"), LIGHT_GRAY_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_fence"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_gate"), LIGHT_GRAY_STAINED_GLASS_GATE);

// gray stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_button"), GRAY_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_button"), new BlockItem(GRAY_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_carpet"), GRAY_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_carpet"), new BlockItem(GRAY_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_door"), GRAY_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_door"), new BlockItem(GRAY_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_fence"), GRAY_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_fence"), new BlockItem(GRAY_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_gate"), GRAY_STAINED_GLASS_GATE);

// black stained glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_button"), BLACK_STAINED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_button"), new BlockItem(BLACK_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_carpet"), BLACK_STAINED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_carpet"), new BlockItem(BLACK_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_door"), BLACK_STAINED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_door"), new BlockItem(BLACK_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_fence"), BLACK_STAINED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_fence"), new BlockItem(BLACK_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_gate"), BLACK_STAINED_GLASS_GATE);

// tinted glass blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_button"), TINTED_GLASS_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_button"), new BlockItem(TINTED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_carpet"), TINTED_GLASS_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_carpet"), new BlockItem(TINTED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_door"), TINTED_GLASS_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_door"), new BlockItem(TINTED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_fence"), TINTED_GLASS_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_fence"), new BlockItem(TINTED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_gate"), TINTED_GLASS_GATE);

// white wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_button"), WHITE_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_button"), new BlockItem(WHITE_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_door"), WHITE_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_door"), new BlockItem(WHITE_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_fence"), WHITE_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_fence"), new BlockItem(WHITE_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_gate"), WHITE_WOOL_GATE);

// pink wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_button"), PINK_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_button"), new BlockItem(PINK_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_door"), PINK_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_door"), new BlockItem(PINK_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_fence"), PINK_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_fence"), new BlockItem(PINK_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_gate"), PINK_WOOL_GATE);

// red wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_button"), RED_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_button"), new BlockItem(RED_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_door"), RED_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_door"), new BlockItem(RED_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_fence"), RED_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_fence"), new BlockItem(RED_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_gate"), RED_WOOL_GATE);

// orange wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_button"), ORANGE_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_button"), new BlockItem(ORANGE_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_door"), ORANGE_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_door"), new BlockItem(ORANGE_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_fence"), ORANGE_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_fence"), new BlockItem(ORANGE_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_gate"), ORANGE_WOOL_GATE);

// yellow wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_button"), YELLOW_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_button"), new BlockItem(YELLOW_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_door"), YELLOW_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_door"), new BlockItem(YELLOW_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_fence"), YELLOW_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_fence"), new BlockItem(YELLOW_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_gate"), YELLOW_WOOL_GATE);

// lime wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_button"), LIME_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_button"), new BlockItem(LIME_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_door"), LIME_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_door"), new BlockItem(LIME_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_fence"), LIME_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_fence"), new BlockItem(LIME_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_gate"), LIME_WOOL_GATE);

// green wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_button"), GREEN_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_button"), new BlockItem(GREEN_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_door"), GREEN_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_door"), new BlockItem(GREEN_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_fence"), GREEN_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_fence"), new BlockItem(GREEN_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_gate"), GREEN_WOOL_GATE);

// cyan wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_button"), CYAN_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_button"), new BlockItem(CYAN_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_door"), CYAN_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_door"), new BlockItem(CYAN_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_fence"), CYAN_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_fence"), new BlockItem(CYAN_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_gate"), CYAN_WOOL_GATE);

// light blue wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_button"), LIGHT_BLUE_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_button"), new BlockItem(LIGHT_BLUE_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_door"), LIGHT_BLUE_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_door"), new BlockItem(LIGHT_BLUE_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_fence"), LIGHT_BLUE_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_fence"), new BlockItem(LIGHT_BLUE_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_gate"), LIGHT_BLUE_WOOL_GATE);

// blue wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_button"), BLUE_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_button"), new BlockItem(BLUE_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_door"), BLUE_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_door"), new BlockItem(BLUE_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_fence"), BLUE_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_fence"), new BlockItem(BLUE_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_gate"), BLUE_WOOL_GATE);

// purple wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_button"), PURPLE_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_button"), new BlockItem(PURPLE_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_door"), PURPLE_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_door"), new BlockItem(PURPLE_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_fence"), PURPLE_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_fence"), new BlockItem(PURPLE_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_gate"), PURPLE_WOOL_GATE);

// magenta wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_button"), MAGENTA_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_button"), new BlockItem(MAGENTA_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_door"), MAGENTA_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_door"), new BlockItem(MAGENTA_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_fence"), MAGENTA_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_fence"), new BlockItem(MAGENTA_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_gate"), MAGENTA_WOOL_GATE);

// brown wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_button"), BROWN_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_button"), new BlockItem(BROWN_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_door"), BROWN_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_door"), new BlockItem(BROWN_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_fence"), BROWN_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_fence"), new BlockItem(BROWN_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_gate"), BROWN_WOOL_GATE);

// light gray wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_button"), LIGHT_GRAY_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_button"), new BlockItem(LIGHT_GRAY_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_door"), LIGHT_GRAY_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_door"), new BlockItem(LIGHT_GRAY_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_fence"), LIGHT_GRAY_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_fence"), new BlockItem(LIGHT_GRAY_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_gate"), LIGHT_GRAY_WOOL_GATE);

// gray wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_button"), GRAY_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_button"), new BlockItem(GRAY_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_door"), GRAY_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_door"), new BlockItem(GRAY_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_fence"), GRAY_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_fence"), new BlockItem(GRAY_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_gate"), GRAY_WOOL_GATE);

// block wool blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_button"), BLACK_WOOL_BUTTON);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_button"), new BlockItem(BLACK_WOOL_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_door"), BLACK_WOOL_DOOR);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_door"), new BlockItem(BLACK_WOOL_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_fence"), BLACK_WOOL_FENCE);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_fence"), new BlockItem(BLACK_WOOL_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_gate"), BLACK_WOOL_GATE);

// deepslate brick blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "deepslate_brick_carpet"), DEEPSLATE_BRICK_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "deepslate_brick_carpet"), new BlockItem(DEEPSLATE_BRICK_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

// deepslate tile blocks
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "deepslate_tile_carpet"), DEEPSLATE_TILE_CARPET);
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "deepslate_tile_carpet"), new BlockItem(DEEPSLATE_TILE_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));




	//item



	// gate
	// block



	// item

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_gate"), new BlockItem(LIME_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_gate"), new BlockItem(GREEN_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_gate"), new BlockItem(CYAN_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_gate"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_gate"), new BlockItem(BLUE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_gate"), new BlockItem(PURPLE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_gate"), new BlockItem(MAGENTA_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_gate"), new BlockItem(BROWN_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_gate"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_gate"), new BlockItem(GRAY_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_gate"), new BlockItem(BLACK_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_gate"), new BlockItem(TINTED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_gate"), new BlockItem(WHITE_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_gate"), new BlockItem(PINK_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_gate"), new BlockItem(RED_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_gate"), new BlockItem(ORANGE_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_gate"), new BlockItem(YELLOW_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_gate"), new BlockItem(LIME_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_gate"), new BlockItem(GREEN_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_gate"), new BlockItem(CYAN_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_gate"), new BlockItem(LIGHT_BLUE_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_gate"), new BlockItem(BLUE_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_gate"), new BlockItem(PURPLE_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_gate"), new BlockItem(MAGENTA_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_gate"), new BlockItem(BROWN_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_gate"), new BlockItem(LIGHT_GRAY_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_gate"), new BlockItem(GRAY_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_gate"), new BlockItem(BLACK_WOOL_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));

	// pressure plate
	// block

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_pressure_plate"), LIME_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_pressure_plate"), GREEN_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_pressure_plate"), CYAN_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_pressure_plate"), LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_pressure_plate"), BLUE_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_pressure_plate"), PURPLE_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_pressure_plate"), MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_pressure_plate"), BROWN_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_pressure_plate"), LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_pressure_plate"), GRAY_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_pressure_plate"), BLACK_STAINED_GLASS_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_pressure_plate"), TINTED_GLASS_PRESSURE_PLATE);

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_pressure_plate"), WHITE_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_pressure_plate"), PINK_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_pressure_plate"), RED_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_pressure_plate"), ORANGE_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_pressure_plate"), YELLOW_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_pressure_plate"), LIME_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_pressure_plate"), GREEN_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_pressure_plate"), CYAN_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_pressure_plate"), LIGHT_BLUE_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_pressure_plate"), BLUE_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_pressure_plate"), PURPLE_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_pressure_plate"), MAGENTA_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_pressure_plate"), BROWN_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_pressure_plate"), LIGHT_GRAY_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_pressure_plate"), GRAY_WOOL_PRESSURE_PLATE);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_pressure_plate"), BLACK_WOOL_PRESSURE_PLATE);

	// item

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_pressure_plate"), new BlockItem(LIME_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_pressure_plate"), new BlockItem(GREEN_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_pressure_plate"), new BlockItem(CYAN_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_pressure_plate"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_pressure_plate"), new BlockItem(BLUE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_pressure_plate"), new BlockItem(PURPLE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_pressure_plate"), new BlockItem(MAGENTA_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_pressure_plate"), new BlockItem(BROWN_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_pressure_plate"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_pressure_plate"), new BlockItem(GRAY_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_pressure_plate"), new BlockItem(BLACK_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_pressure_plate"), new BlockItem(TINTED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_pressure_plate"), new BlockItem(WHITE_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_pressure_plate"), new BlockItem(PINK_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_pressure_plate"), new BlockItem(RED_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_pressure_plate"), new BlockItem(ORANGE_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_pressure_plate"), new BlockItem(YELLOW_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_pressure_plate"), new BlockItem(LIME_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_pressure_plate"), new BlockItem(GREEN_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_pressure_plate"), new BlockItem(CYAN_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_pressure_plate"), new BlockItem(LIGHT_BLUE_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_pressure_plate"), new BlockItem(BLUE_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_pressure_plate"), new BlockItem(PURPLE_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_pressure_plate"), new BlockItem(MAGENTA_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_pressure_plate"), new BlockItem(BROWN_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_pressure_plate"), new BlockItem(LIGHT_GRAY_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_pressure_plate"), new BlockItem(GRAY_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_pressure_plate"), new BlockItem(BLACK_WOOL_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));

	// slab
	// block

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_slab"), LIME_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_slab"), GREEN_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_slab"), CYAN_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_slab"), LIGHT_BLUE_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_slab"), BLUE_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_slab"), PURPLE_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_slab"), MAGENTA_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_slab"), BROWN_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_slab"), LIGHT_GRAY_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_slab"), GRAY_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_slab"), BLACK_STAINED_GLASS_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_slab"), TINTED_GLASS_SLAB);

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_slab"), WHITE_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_slab"), PINK_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_slab"), RED_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_slab"), ORANGE_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_slab"), YELLOW_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_slab"), LIME_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_slab"), GREEN_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_slab"), CYAN_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_slab"), LIGHT_BLUE_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_slab"), BLUE_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_slab"), PURPLE_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_slab"), MAGENTA_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_slab"), BROWN_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_slab"), LIGHT_GRAY_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_slab"), GRAY_WOOL_SLAB);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_slab"), BLACK_WOOL_SLAB);

	// item

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_slab"), new BlockItem(LIME_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_slab"), new BlockItem(GREEN_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_slab"), new BlockItem(CYAN_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_slab"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_slab"), new BlockItem(BLUE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_slab"), new BlockItem(PURPLE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_slab"), new BlockItem(MAGENTA_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_slab"), new BlockItem(BROWN_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_slab"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_slab"), new BlockItem(GRAY_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_slab"), new BlockItem(BLACK_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_slab"), new BlockItem(TINTED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_slab"), new BlockItem(WHITE_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_slab"), new BlockItem(PINK_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_slab"), new BlockItem(RED_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_slab"), new BlockItem(ORANGE_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_slab"), new BlockItem(YELLOW_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_slab"), new BlockItem(LIME_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_slab"), new BlockItem(GREEN_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_slab"), new BlockItem(CYAN_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_slab"), new BlockItem(LIGHT_BLUE_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_slab"), new BlockItem(BLUE_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_slab"), new BlockItem(PURPLE_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_slab"), new BlockItem(MAGENTA_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_slab"), new BlockItem(BROWN_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_slab"), new BlockItem(LIGHT_GRAY_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_slab"), new BlockItem(GRAY_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_slab"), new BlockItem(BLACK_WOOL_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

	// stairs
	// block

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_stairs"), LIME_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_stairs"), GREEN_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_stairs"), CYAN_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_stairs"), LIGHT_BLUE_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_stairs"), BLUE_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_stairs"), PURPLE_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_stairs"), MAGENTA_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_stairs"), BROWN_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_stairs"), LIGHT_GRAY_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_stairs"), GRAY_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_stairs"), BLACK_STAINED_GLASS_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_stairs"), TINTED_GLASS_STAIRS);

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_stairs"), WHITE_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_stairs"), PINK_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_stairs"), RED_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_stairs"), ORANGE_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_stairs"), YELLOW_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_stairs"), LIME_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_stairs"), GREEN_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_stairs"), CYAN_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_stairs"), LIGHT_BLUE_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_stairs"), BLUE_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_stairs"), PURPLE_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_stairs"), MAGENTA_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_stairs"), BROWN_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_stairs"), LIGHT_GRAY_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_stairs"), GRAY_WOOL_STAIRS);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_stairs"), BLACK_WOOL_STAIRS);

	// item

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_stairs"), new BlockItem(LIME_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_stairs"), new BlockItem(GREEN_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_stairs"), new BlockItem(CYAN_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_stairs"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_stairs"), new BlockItem(BLUE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_stairs"), new BlockItem(PURPLE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_stairs"), new BlockItem(MAGENTA_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_stairs"), new BlockItem(BROWN_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_stairs"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_stairs"), new BlockItem(GRAY_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_stairs"), new BlockItem(BLACK_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_stairs"), new BlockItem(TINTED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_stairs"), new BlockItem(WHITE_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_stairs"), new BlockItem(PINK_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_stairs"), new BlockItem(RED_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_stairs"), new BlockItem(ORANGE_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_stairs"), new BlockItem(YELLOW_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_stairs"), new BlockItem(LIME_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_stairs"), new BlockItem(GREEN_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_stairs"), new BlockItem(CYAN_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_stairs"), new BlockItem(LIGHT_BLUE_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_stairs"), new BlockItem(BLUE_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_stairs"), new BlockItem(PURPLE_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_stairs"), new BlockItem(MAGENTA_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_stairs"), new BlockItem(BROWN_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_stairs"), new BlockItem(LIGHT_GRAY_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_stairs"), new BlockItem(GRAY_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_stairs"), new BlockItem(BLACK_WOOL_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

	// trapdoor
	// block

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_trapdoor"), LIME_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_trapdoor"), GREEN_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_trapdoor"), CYAN_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_trapdoor"), LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_trapdoor"), BLUE_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_trapdoor"), PURPLE_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_trapdoor"), MAGENTA_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_trapdoor"), BROWN_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_trapdoor"), LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_trapdoor"), GRAY_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_trapdoor"), BLACK_STAINED_GLASS_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_trapdoor"), TINTED_GLASS_TRAPDOOR);

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_trapdoor"), WHITE_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_trapdoor"), PINK_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_trapdoor"), RED_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_trapdoor"), ORANGE_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_trapdoor"), YELLOW_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_trapdoor"), LIME_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_trapdoor"), GREEN_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_trapdoor"), CYAN_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_trapdoor"), LIGHT_BLUE_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_trapdoor"), BLUE_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_trapdoor"), PURPLE_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_trapdoor"), MAGENTA_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_trapdoor"), BROWN_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_trapdoor"), LIGHT_GRAY_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_trapdoor"), GRAY_WOOL_TRAPDOOR);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_trapdoor"), BLACK_WOOL_TRAPDOOR);

	// item

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_trapdoor"), new BlockItem(LIME_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_trapdoor"), new BlockItem(GREEN_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_trapdoor"), new BlockItem(CYAN_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_trapdoor"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_trapdoor"), new BlockItem(BLUE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_trapdoor"), new BlockItem(PURPLE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_trapdoor"), new BlockItem(MAGENTA_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_trapdoor"), new BlockItem(BROWN_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_trapdoor"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_trapdoor"), new BlockItem(GRAY_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_trapdoor"), new BlockItem(BLACK_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));	
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_trapdoor"), new BlockItem(TINTED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_trapdoor"), new BlockItem(WHITE_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_trapdoor"), new BlockItem(PINK_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_trapdoor"), new BlockItem(RED_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_trapdoor"), new BlockItem(ORANGE_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_trapdoor"), new BlockItem(YELLOW_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_trapdoor"), new BlockItem(LIME_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_trapdoor"), new BlockItem(GREEN_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_trapdoor"), new BlockItem(CYAN_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_trapdoor"), new BlockItem(LIGHT_BLUE_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_trapdoor"), new BlockItem(BLUE_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_trapdoor"), new BlockItem(PURPLE_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_trapdoor"), new BlockItem(MAGENTA_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_trapdoor"), new BlockItem(BROWN_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_trapdoor"), new BlockItem(LIGHT_GRAY_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_trapdoor"), new BlockItem(GRAY_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_trapdoor"), new BlockItem(BLACK_WOOL_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));	

	// wall
	//block

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_wall"), LIME_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_wall"), GREEN_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_wall"), CYAN_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_wall"), LIGHT_BLUE_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_wall"), BLUE_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_wall"), PURPLE_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_wall"), MAGENTA_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_wall"), BROWN_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_wall"), LIGHT_GRAY_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_wall"), GRAY_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_wall"), BLACK_STAINED_GLASS_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_wall"), TINTED_GLASS_WALL);

	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_wool_wall"), WHITE_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_wool_wall"), PINK_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_wool_wall"), RED_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_wool_wall"), ORANGE_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_wool_wall"), YELLOW_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_wool_wall"), LIME_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_wool_wall"), GREEN_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_wool_wall"), CYAN_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_wool_wall"), LIGHT_BLUE_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_wool_wall"), BLUE_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_wool_wall"), PURPLE_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_wool_wall"), MAGENTA_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_wool_wall"), BROWN_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_wool_wall"), LIGHT_GRAY_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_wool_wall"), GRAY_WOOL_WALL);
	Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_wool_wall"), BLACK_WOOL_WALL);

	// item

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_wall"), new BlockItem(LIME_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_wall"), new BlockItem(GREEN_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_wall"), new BlockItem(CYAN_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_wall"), new BlockItem(LIGHT_BLUE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_wall"), new BlockItem(BLUE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_wall"), new BlockItem(PURPLE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_wall"), new BlockItem(MAGENTA_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_wall"), new BlockItem(BROWN_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_wall"), new BlockItem(LIGHT_GRAY_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_wall"), new BlockItem(GRAY_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_wall"), new BlockItem(BLACK_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_wall"), new BlockItem(TINTED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

	Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_wool_wall"), new BlockItem(WHITE_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_wool_wall"), new BlockItem(PINK_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_wool_wall"), new BlockItem(RED_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_wool_wall"), new BlockItem(ORANGE_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_wool_wall"), new BlockItem(YELLOW_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_wool_wall"), new BlockItem(LIME_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_wool_wall"), new BlockItem(GREEN_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_wool_wall"), new BlockItem(CYAN_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_wool_wall"), new BlockItem(LIGHT_BLUE_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_wool_wall"), new BlockItem(BLUE_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_wool_wall"), new BlockItem(PURPLE_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_wool_wall"), new BlockItem(MAGENTA_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_wool_wall"), new BlockItem(BROWN_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_wool_wall"), new BlockItem(LIGHT_GRAY_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_wool_wall"), new BlockItem(GRAY_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_wool_wall"), new BlockItem(BLACK_WOOL_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	}
}
