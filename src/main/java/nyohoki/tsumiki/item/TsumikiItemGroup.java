package nyohoki.tsumiki.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.block.*;

import java.lang.reflect.GenericArrayType;

public class TsumikiItemGroup {
	public static ItemGroup TSUMIKI = Registry.register(
		Registries.ITEM_GROUP,
		new Identifier(
			"tsumiki",
			"tsumiki"
		),
		FabricItemGroup
			.builder()
			.displayName(Text.translatable("itemgroup.tsumiki"))
			.icon(() -> new ItemStack(NyohokiBlock.NYOHOKI))
			.entries(((displayContext, entries) -> {
				entries.add(NyohokiItem.IKOHOYN);
				entries.add(NyohokiBlock.NYOHOKI);

				entries.add(ButtonBlocks.GLASS_BUTTON);
				entries.add(ButtonBlocks.WHITE_STAINED_GLASS_BUTTON);
				entries.add(ButtonBlocks.PINK_STAINED_GLASS_BUTTON);
				entries.add(ButtonBlocks.RED_STAINED_GLASS_BUTTON);
				entries.add(ButtonBlocks.ORANGE_STAINED_GLASS_BUTTON);
				entries.add(ButtonBlocks.YELLOW_STAINED_GLASS_BUTTON);
				entries.add(ButtonBlocks.LIME_STAINED_GLASS_BUTTON);
				entries.add(ButtonBlocks.GREEN_STAINED_GLASS_BUTTON);

				entries.add(CarpetBlocks.GLASS_CARPET);
				entries.add(CarpetBlocks.WHITE_STAINED_GLASS_CARPET);
				
				entries.add(FenceBlocks.GLASS_FENCE);
				entries.add(FenceBlocks.WHITE_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.PINK_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.RED_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.ORANGE_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.YELLOW_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.LIME_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.GREEN_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.CYAN_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.BLUE_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.PURPLE_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.MAGENTA_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.BROWN_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.GRAY_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.BLACK_STAINED_GLASS_FENCE);
				entries.add(FenceBlocks.TINTED_GLASS_FENCE);
				entries.add(FenceBlocks.WHITE_WOOL_FENCE);
				entries.add(FenceBlocks.PINK_WOOL_FENCE);
				entries.add(FenceBlocks.RED_WOOL_FENCE);
				entries.add(FenceBlocks.ORANGE_WOOL_FENCE);
				entries.add(FenceBlocks.YELLOW_WOOL_FENCE);
				entries.add(FenceBlocks.LIME_WOOL_FENCE);
				entries.add(FenceBlocks.GREEN_WOOL_FENCE);
				entries.add(FenceBlocks.CYAN_WOOL_FENCE);
				entries.add(FenceBlocks.LIGHT_BLUE_WOOL_FENCE);
				entries.add(FenceBlocks.BLUE_WOOL_FENCE);
				entries.add(FenceBlocks.PURPLE_WOOL_FENCE);
				entries.add(FenceBlocks.MAGENTA_WOOL_FENCE);
				entries.add(FenceBlocks.BROWN_WOOL_FENCE);
				entries.add(FenceBlocks.LIGHT_GRAY_WOOL_FENCE);
				entries.add(FenceBlocks.GRAY_WOOL_FENCE);
				entries.add(FenceBlocks.BLACK_WOOL_FENCE);

				entries.add(GateBlocks.GLASS_GATE);
				
				entries.add(PressurePlateBlocks.GLASS_PRESSURE_PLATE);
				
				entries.add(SlabBlocks.GLASS_SLAB);
				
				entries.add(StairBlocks.GLASS_STAIRS);
				
				entries.add(TrapdoorBlocks.GLASS_TRAPDOOR);
				
				entries.add(WallBlocks.GLASS_WALL);
				entries.add(WallBlocks.WHITE_STAINED_GLASS_WALL);
				entries.add(WallBlocks.PINK_STAINED_GLASS_WALL);
				entries.add(WallBlocks.RED_STAINED_GLASS_WALL);
				entries.add(WallBlocks.ORANGE_STAINED_GLASS_WALL);
				entries.add(WallBlocks.YELLOW_STAINED_GLASS_WALL);
				entries.add(WallBlocks.LIME_STAINED_GLASS_WALL);
				entries.add(WallBlocks.GREEN_STAINED_GLASS_WALL);
				entries.add(WallBlocks.CYAN_STAINED_GLASS_WALL);
				entries.add(WallBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);
				entries.add(WallBlocks.BLUE_STAINED_GLASS_WALL);
				entries.add(WallBlocks.PURPLE_STAINED_GLASS_WALL);
				entries.add(WallBlocks.MAGENTA_STAINED_GLASS_WALL);
				entries.add(WallBlocks.BROWN_STAINED_GLASS_WALL);
				entries.add(WallBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);
				entries.add(WallBlocks.GRAY_STAINED_GLASS_WALL);
				entries.add(WallBlocks.BLACK_STAINED_GLASS_WALL);
				entries.add(WallBlocks.TINTED_GLASS_WALL);
				entries.add(WallBlocks.WHITE_WOOL_WALL);
				entries.add(WallBlocks.PINK_WOOL_WALL);
				entries.add(WallBlocks.RED_WOOL_WALL);
				entries.add(WallBlocks.ORANGE_WOOL_WALL);
				entries.add(WallBlocks.YELLOW_WOOL_WALL);
				entries.add(WallBlocks.LIME_WOOL_WALL);
				entries.add(WallBlocks.GREEN_WOOL_WALL);
				entries.add(WallBlocks.CYAN_WOOL_WALL);
				entries.add(WallBlocks.LIGHT_BLUE_WOOL_WALL);
				entries.add(WallBlocks.BLUE_WOOL_WALL);
				entries.add(WallBlocks.PURPLE_WOOL_WALL);
				entries.add(WallBlocks.MAGENTA_WOOL_WALL);
				entries.add(WallBlocks.BROWN_WOOL_WALL);
				entries.add(WallBlocks.LIGHT_GRAY_WOOL_WALL);
				entries.add(WallBlocks.GRAY_WOOL_WALL);
				entries.add(WallBlocks.BLACK_WOOL_WALL);

			}))
			.build()
	);

	public static void registerItemGroup() {
		/*ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
			entries.add(NyohokiBlock.NYOHOKI);
		});*/
	}
}
