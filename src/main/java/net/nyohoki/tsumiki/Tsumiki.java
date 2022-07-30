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

	// nyohoki block
	public static final Block GURASU = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// glass block
	// clear glass
	public static final Block GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));

	// white glass
	public static final Block WHITE_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block WHITE_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// pink glass
	public static final Block PINK_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PINK_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// red glass
	public static final Block RED_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block RED_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// orange glass
	public static final Block ORANGE_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block ORANGE_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// yellow glass
	public static final Block YELLOW_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block YELLOW_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// lime glass
	public static final Block LIME_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIME_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// green glass
	public static final Block GREEN_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GREEN_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// cyan glass
	public static final Block CYAN_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block CYAN_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// light blue glass
	public static final Block LIGHT_BLUE_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// blue glass
	public static final Block BLUE_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLUE_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// purple glass
	public static final Block PURPLE_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block PURPLE_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// magenta glass
	public static final Block MAGENTA_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block MAGENTA_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// brown glass
	public static final Block BROWN_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BROWN_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// light gray glass
	public static final Block LIGHT_GRAY_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// gray glass
	public static final Block GRAY_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GRAY_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// black glass
	public static final Block BLACK_STAINED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block BLACK_STAINED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	// tinted glass
	public static final Block TINTED_GLASS_BUTTON = new StoneButtonBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_DOOR = new DoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_PRESSURE_PLATE = new TsumikiPlate(PressurePlateBlock.ActivationRule.EVERYTHING,
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
		FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block TINTED_GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	
	
	@Override
	public void onInitialize() {
		LOGGER.info("Henlo Fren :3c");
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gurasu"), GURASU);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gurasu"),
			new BlockItem(GURASU, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
			
			
		// glass
		// clear
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_button"), GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_button"),
			new BlockItem(GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_carpet"), GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_carpet"),
			new BlockItem(GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_door"), GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_door"),
			new BlockItem(GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_fence"), GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_fence"),
			new BlockItem(GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_gate"), GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_gate"),
			new BlockItem(GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_pressure_plate"), GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_pressure_plate"),
			new BlockItem(GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_slab"), GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_slab"),
			new BlockItem(GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_stairs"), GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_stairs"),
			new BlockItem(GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_trapdoor"), GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_trapdoor"),
			new BlockItem(GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_wall"), GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_wall"),
			new BlockItem(GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
			
		// white
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_button"), WHITE_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_button"),
			new BlockItem(WHITE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_carpet"), WHITE_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_carpet"),
			new BlockItem(WHITE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_door"), WHITE_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_door"),
			new BlockItem(WHITE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_fence"), WHITE_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_fence"),
			new BlockItem(WHITE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_gate"), WHITE_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_gate"),
			new BlockItem(WHITE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_pressure_plate"), WHITE_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_pressure_plate"),
			new BlockItem(WHITE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_slab"), WHITE_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_slab"),
			new BlockItem(WHITE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_stairs"), WHITE_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_stairs"),
			new BlockItem(WHITE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_trapdoor"), WHITE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_trapdoor"),
			new BlockItem(WHITE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "white_stained_glass_wall"), WHITE_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "white_stained_glass_wall"),
			new BlockItem(WHITE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
			
		// pink
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_button"), PINK_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_button"),
			new BlockItem(PINK_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_carpet"), PINK_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_carpet"),
			new BlockItem(PINK_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_door"), PINK_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_door"),
			new BlockItem(PINK_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_fence"), PINK_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_fence"),
			new BlockItem(PINK_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_gate"), PINK_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_gate"),
			new BlockItem(PINK_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_pressure_plate"), PINK_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_pressure_plate"),
			new BlockItem(PINK_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_slab"), PINK_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_slab"),
			new BlockItem(PINK_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_stairs"), PINK_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_stairs"),
			new BlockItem(PINK_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_trapdoor"), PINK_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_trapdoor"),
			new BlockItem(PINK_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "pink_stained_glass_wall"), PINK_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "pink_stained_glass_wall"),
			new BlockItem(PINK_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
			
		// red
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_button"), RED_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_button"),
			new BlockItem(RED_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_carpet"), RED_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_carpet"),
			new BlockItem(RED_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_door"), RED_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_door"),
			new BlockItem(RED_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_fence"), RED_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_fence"),
			new BlockItem(RED_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_gate"), RED_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_gate"),
			new BlockItem(RED_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_pressure_plate"), RED_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_pressure_plate"),
			new BlockItem(RED_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_slab"), RED_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_slab"),
			new BlockItem(RED_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_stairs"), RED_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_stairs"),
			new BlockItem(RED_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_trapdoor"), RED_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_trapdoor"),
			new BlockItem(RED_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "red_stained_glass_wall"), RED_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "red_stained_glass_wall"),
			new BlockItem(RED_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
			
		// orange
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_button"), ORANGE_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_button"),
			new BlockItem(ORANGE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_carpet"), ORANGE_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_carpet"),
			new BlockItem(ORANGE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_door"), ORANGE_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_door"),
			new BlockItem(ORANGE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_fence"), ORANGE_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_fence"),
			new BlockItem(ORANGE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_gate"), ORANGE_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_gate"),
			new BlockItem(ORANGE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_pressure_plate"), ORANGE_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_pressure_plate"),
			new BlockItem(ORANGE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_slab"), ORANGE_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_slab"),
			new BlockItem(ORANGE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_stairs"), ORANGE_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_stairs"),
			new BlockItem(ORANGE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_trapdoor"), ORANGE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_trapdoor"),
			new BlockItem(ORANGE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "orange_stained_glass_wall"), ORANGE_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "orange_stained_glass_wall"),
			new BlockItem(ORANGE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// yellow
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_button"), YELLOW_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_button"),
			new BlockItem(YELLOW_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_carpet"), YELLOW_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_carpet"),
			new BlockItem(YELLOW_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_door"), YELLOW_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_door"),
			new BlockItem(YELLOW_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_fence"), YELLOW_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_fence"),
			new BlockItem(YELLOW_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_gate"), YELLOW_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_gate"),
			new BlockItem(YELLOW_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_pressure_plate"), YELLOW_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_pressure_plate"),
			new BlockItem(YELLOW_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_slab"), YELLOW_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_slab"),
			new BlockItem(YELLOW_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_stairs"), YELLOW_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_stairs"),
			new BlockItem(YELLOW_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_trapdoor"), YELLOW_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_trapdoor"),
			new BlockItem(YELLOW_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "yellow_stained_glass_wall"), YELLOW_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "yellow_stained_glass_wall"),
			new BlockItem(YELLOW_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		
		// lime
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_button"), LIME_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_button"),
			new BlockItem(LIME_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_carpet"), LIME_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_carpet"),
			new BlockItem(LIME_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_door"), LIME_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_door"),
			new BlockItem(LIME_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_fence"), LIME_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_fence"),
			new BlockItem(LIME_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_gate"), LIME_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_gate"),
			new BlockItem(LIME_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_pressure_plate"), LIME_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_pressure_plate"),
			new BlockItem(LIME_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_slab"), LIME_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_slab"),
			new BlockItem(LIME_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_stairs"), LIME_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_stairs"),
			new BlockItem(LIME_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_trapdoor"), LIME_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_trapdoor"),
			new BlockItem(LIME_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "lime_stained_glass_wall"), LIME_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "lime_stained_glass_wall"),
			new BlockItem(LIME_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// green
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_button"), GREEN_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_button"),
			new BlockItem(GREEN_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_carpet"), GREEN_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_carpet"),
			new BlockItem(GREEN_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_door"), GREEN_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_door"),
			new BlockItem(GREEN_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_fence"), GREEN_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_fence"),
			new BlockItem(GREEN_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_gate"), GREEN_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_gate"),
			new BlockItem(GREEN_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_pressure_plate"), GREEN_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_pressure_plate"),
			new BlockItem(GREEN_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_slab"), GREEN_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_slab"),
			new BlockItem(GREEN_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_stairs"), GREEN_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_stairs"),
			new BlockItem(GREEN_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_trapdoor"), GREEN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_trapdoor"),
			new BlockItem(GREEN_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "green_stained_glass_wall"), GREEN_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "green_stained_glass_wall"),
			new BlockItem(GREEN_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// cyan
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_button"), CYAN_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_button"),
			new BlockItem(CYAN_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_carpet"), CYAN_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_carpet"),
			new BlockItem(CYAN_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_door"), CYAN_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_door"),
			new BlockItem(CYAN_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_fence"), CYAN_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_fence"),
			new BlockItem(CYAN_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_gate"), CYAN_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_gate"),
			new BlockItem(CYAN_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_pressure_plate"), CYAN_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_pressure_plate"),
			new BlockItem(CYAN_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_slab"), CYAN_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_slab"),
			new BlockItem(CYAN_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_stairs"), CYAN_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_stairs"),
			new BlockItem(CYAN_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_trapdoor"), CYAN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_trapdoor"),
			new BlockItem(CYAN_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "cyan_stained_glass_wall"), CYAN_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "cyan_stained_glass_wall"),
			new BlockItem(CYAN_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// light blue
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_button"), LIGHT_BLUE_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_button"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_carpet"), LIGHT_BLUE_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_carpet"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_door"), LIGHT_BLUE_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_door"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_fence"), LIGHT_BLUE_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_fence"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_gate"), LIGHT_BLUE_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_gate"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_pressure_plate"), LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_pressure_plate"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_slab"), LIGHT_BLUE_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_slab"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_stairs"), LIGHT_BLUE_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_stairs"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_trapdoor"), LIGHT_BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_trapdoor"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_blue_stained_glass_wall"), LIGHT_BLUE_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_blue_stained_glass_wall"),
			new BlockItem(LIGHT_BLUE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// blue
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_button"), BLUE_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_button"),
			new BlockItem(BLUE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_carpet"), BLUE_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_carpet"),
			new BlockItem(BLUE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_door"), BLUE_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_door"),
			new BlockItem(BLUE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_fence"), BLUE_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_fence"),
			new BlockItem(BLUE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_gate"), BLUE_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_gate"),
			new BlockItem(BLUE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_pressure_plate"), BLUE_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_pressure_plate"),
			new BlockItem(BLUE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_slab"), BLUE_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_slab"),
			new BlockItem(BLUE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_stairs"), BLUE_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_stairs"),
			new BlockItem(BLUE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_trapdoor"), BLUE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_trapdoor"),
			new BlockItem(BLUE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "blue_stained_glass_wall"), BLUE_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "blue_stained_glass_wall"),
			new BlockItem(BLUE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// purple
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_button"), PURPLE_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_button"),
			new BlockItem(PURPLE_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_carpet"), PURPLE_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_carpet"),
			new BlockItem(PURPLE_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_door"), PURPLE_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_door"),
			new BlockItem(PURPLE_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_fence"), PURPLE_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_fence"),
			new BlockItem(PURPLE_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_gate"), PURPLE_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_gate"),
			new BlockItem(PURPLE_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_pressure_plate"), PURPLE_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_pressure_plate"),
			new BlockItem(PURPLE_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_slab"), PURPLE_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_slab"),
			new BlockItem(PURPLE_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_stairs"), PURPLE_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_stairs"),
			new BlockItem(PURPLE_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_trapdoor"), PURPLE_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_trapdoor"),
			new BlockItem(PURPLE_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "purple_stained_glass_wall"), PURPLE_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "purple_stained_glass_wall"),
			new BlockItem(PURPLE_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// magenta
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_button"), MAGENTA_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_button"),
			new BlockItem(MAGENTA_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_carpet"), MAGENTA_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_carpet"),
			new BlockItem(MAGENTA_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_door"), MAGENTA_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_door"),
			new BlockItem(MAGENTA_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_fence"), MAGENTA_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_fence"),
			new BlockItem(MAGENTA_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_gate"), MAGENTA_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_gate"),
			new BlockItem(MAGENTA_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_pressure_plate"), MAGENTA_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_pressure_plate"),
			new BlockItem(MAGENTA_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_slab"), MAGENTA_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_slab"),
			new BlockItem(MAGENTA_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_stairs"), MAGENTA_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_stairs"),
			new BlockItem(MAGENTA_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_trapdoor"), MAGENTA_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_trapdoor"),
			new BlockItem(MAGENTA_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "magenta_stained_glass_wall"), MAGENTA_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "magenta_stained_glass_wall"),
			new BlockItem(MAGENTA_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// brown
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_button"), BROWN_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_button"),
			new BlockItem(BROWN_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_carpet"), BROWN_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_carpet"),
			new BlockItem(BROWN_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_door"), BROWN_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_door"),
			new BlockItem(BROWN_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_fence"), BROWN_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_fence"),
			new BlockItem(BROWN_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_gate"), BROWN_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_gate"),
			new BlockItem(BROWN_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_pressure_plate"), BROWN_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_pressure_plate"),
			new BlockItem(BROWN_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_slab"), BROWN_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_slab"),
			new BlockItem(BROWN_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_stairs"), BROWN_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_stairs"),
			new BlockItem(BROWN_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_trapdoor"), BROWN_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_trapdoor"),
			new BlockItem(BROWN_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "brown_stained_glass_wall"), BROWN_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "brown_stained_glass_wall"),
			new BlockItem(BROWN_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		
		// light_gray
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_button"), LIGHT_GRAY_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_button"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_carpet"), LIGHT_GRAY_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_carpet"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_door"), LIGHT_GRAY_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_door"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_fence"), LIGHT_GRAY_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_fence"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_gate"), LIGHT_GRAY_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_gate"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_pressure_plate"), LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_pressure_plate"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_slab"), LIGHT_GRAY_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_slab"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_stairs"), LIGHT_GRAY_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_stairs"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_trapdoor"), LIGHT_GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_trapdoor"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "light_gray_stained_glass_wall"), LIGHT_GRAY_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "light_gray_stained_glass_wall"),
			new BlockItem(LIGHT_GRAY_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// gray
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_button"), GRAY_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_button"),
			new BlockItem(GRAY_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_carpet"), GRAY_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_carpet"),
			new BlockItem(GRAY_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_door"), GRAY_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_door"),
			new BlockItem(GRAY_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_fence"), GRAY_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_fence"),
			new BlockItem(GRAY_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_gate"), GRAY_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_gate"),
			new BlockItem(GRAY_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_pressure_plate"), GRAY_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_pressure_plate"),
			new BlockItem(GRAY_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_slab"), GRAY_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_slab"),
			new BlockItem(GRAY_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_stairs"), GRAY_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_stairs"),
			new BlockItem(GRAY_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_trapdoor"), GRAY_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_trapdoor"),
			new BlockItem(GRAY_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gray_stained_glass_wall"), GRAY_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gray_stained_glass_wall"),
			new BlockItem(GRAY_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// black
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_button"), BLACK_STAINED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_button"),
			new BlockItem(BLACK_STAINED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_carpet"), BLACK_STAINED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_carpet"),
			new BlockItem(BLACK_STAINED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_door"), BLACK_STAINED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_door"),
			new BlockItem(BLACK_STAINED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_fence"), BLACK_STAINED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_fence"),
			new BlockItem(BLACK_STAINED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_gate"), BLACK_STAINED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_gate"),
			new BlockItem(BLACK_STAINED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_pressure_plate"), BLACK_STAINED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_pressure_plate"),
			new BlockItem(BLACK_STAINED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_slab"), BLACK_STAINED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_slab"),
			new BlockItem(BLACK_STAINED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_stairs"), BLACK_STAINED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_stairs"),
			new BlockItem(BLACK_STAINED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_trapdoor"), BLACK_STAINED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_trapdoor"),
			new BlockItem(BLACK_STAINED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "black_stained_glass_wall"), BLACK_STAINED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "black_stained_glass_wall"),
			new BlockItem(BLACK_STAINED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
			
		// tinted
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_button"), TINTED_GLASS_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_button"),
			new BlockItem(TINTED_GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.REDSTONE)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_carpet"), TINTED_GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_carpet"),
			new BlockItem(TINTED_GLASS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_door"), TINTED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_door"),
			new BlockItem(TINTED_GLASS_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_fence"), TINTED_GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_fence"),
			new BlockItem(TINTED_GLASS_FENCE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_gate"), TINTED_GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_gate"),
			new BlockItem(TINTED_GLASS_GATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_pressure_plate"), TINTED_GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_pressure_plate"),
			new BlockItem(TINTED_GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_slab"), TINTED_GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_slab"),
			new BlockItem(TINTED_GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_stairs"), TINTED_GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_stairs"),
			new BlockItem(TINTED_GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_trapdoor"), TINTED_GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_trapdoor"),
			new BlockItem(TINTED_GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.REDSTONE)));			
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "tinted_glass_wall"), TINTED_GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "tinted_glass_wall"),
			new BlockItem(TINTED_GLASS_WALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	}
}
