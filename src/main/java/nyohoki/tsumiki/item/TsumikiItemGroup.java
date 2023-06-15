package nyohoki.tsumiki.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.block.*;
import nyohoki.tsumiki.item.*;

public class TsumikiItemGroup {
	public static ItemGroup TSUMIKI = Registry.register(Registries.ITEM_GROUP, new Identifier("tsumiki", "tsumiki" ),
		FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tsumiki"))
			.icon(() -> new ItemStack(NyohokiBlock.NYOHOKI))
			.entries(((displayContext, entries) -> {
				entries.add(NyohokiItem.IKOHOYN);
				entries.add(NyohokiBlock.NYOHOKI);

				entries.add(ButtonBlocks.GLASS_BUTTON);

				entries.add(CarpetBlocks.GLASS_CARPET);
				entries.add(CarpetBlocks.WHITE_STAINED_GLASS_CARPET);
				
				entries.add(FenceBlocks.GLASS_FENCE);
				
				entries.add(GateBlocks.GLASS_GATE);
				
				entries.add(PressurePlateBlocks.GLASS_PRESSURE_PLATE);
				
				entries.add(SlabBlocks.GLASS_SLAB);
				
				entries.add(StairBlocks.GLASS_STAIRS);
				
				entires.add(TrapdoorBlocks.GLASS_TRAPDOOR);
				
				entries.add(WallBlocks.GLASS_WALL);
			}))
			.build()
	);

	public static void registerItemGroup() {
		/*ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
			entries.add(NyohokiBlock.NYOHOKI);
		});*/
	}
}
