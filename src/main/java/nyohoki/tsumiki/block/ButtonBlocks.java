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
	public static final Block GLASS_BUTTON = registerBlock("glass_button",
		new ButtonBlock(AbstractBlock.Settings.create().mapColor(MapColor.CLEAR)
			.strength(0.3f, 0.3f)
			.sounds(BlockSoundGroup.GLASS)
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
