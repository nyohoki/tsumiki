package nyohoki.tsumiki.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nyohoki.tsumiki.block.ButtonBlocks;
import nyohoki.tsumiki.block.CarpetBlocks;
import nyohoki.tsumiki.block.NyohokiBlock;

public class TsumikiItemGroup {
	public static ItemGroup TSUMIKI = Registry.register(Registries.ITEM_GROUP, new Identifier("tsumiki", "tsumiki" ),
		FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tsumiki"))
			.icon(() -> new ItemStack(NyohokiBlock.NYOHOKI))
			.entries(((displayContext, entries) -> {
				entries.add(NyohokiItem.IKOHOYN);
				entries.add(NyohokiBlock.NYOHOKI);

				entries.add(ButtonBlocks.GLASS_BUTTON);

				entries.add(CarpetBlocks.GLASS_CARPET);
			}))
			.build()
	);

	public static void registerItemGroup() {
	}
}