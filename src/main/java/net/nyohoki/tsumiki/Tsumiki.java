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
			new BlockItem(GLASS_BUTTON, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_carpet"), GLASS_CARPET);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_carpet"),
			new BlockItem(GLASS_CARPET, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_door"), GLASS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_door"),
			new BlockItem(GLASS_DOOR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_fence"), GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_fence"),
			new BlockItem(GLASS_FENCE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_gate"), GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_gate"),
			new BlockItem(GLASS_GATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_pressure_plate"), GLASS_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_pressure_plate"),
			new BlockItem(GLASS_PRESSURE_PLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_slab"), GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_slab"),
			new BlockItem(GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_stairs"), GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_stairs"),
			new BlockItem(GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_trapdoor"), GLASS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_trapdoor"),
			new BlockItem(GLASS_TRAPDOOR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_wall"), GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_wall"),
			new BlockItem(GLASS_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
