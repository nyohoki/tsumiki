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

import static net.minecraft.block.Blocks.GLASS;


public class Tsumiki implements ModInitializer {
	public static final String MOD_ID = "tsumiki";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Block GURASU = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_STAIRS = new TsumikiStairs(Tsumiki.GURASU.getDefaultState(),
			FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_SLAB = new SlabBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final Block GLASS_FENCE = new FenceBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final	Block GLASS_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));
	public static final	Block GLASS_WALL = new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fren :3");
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gurasu"), GURASU);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "gurasu"),
				new BlockItem(GURASU, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_stairs"), GLASS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_stairs"),
				new BlockItem(GLASS_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_slab"), GLASS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_slab"),
				new BlockItem(GLASS_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_fence"), GLASS_FENCE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_fence"),
				new BlockItem(GLASS_FENCE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_gate"), GLASS_GATE);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_gate"),
				new BlockItem(GLASS_GATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "glass_wall"), GLASS_WALL);
		Registry.register(Registry.ITEM, new Identifier("tsumiki", "glass_wall"),
				new BlockItem(GLASS_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
