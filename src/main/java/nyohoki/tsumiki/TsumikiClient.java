package nyohoki.tsumiki;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import nyohoki.tsumiki.block.*;

public class TsumikiClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(
			CarpetBlocks.GLASS_CARPET,
			RenderLayer.getTranslucent()
		);
		BlockRenderLayerMap.INSTANCE.putBlock(
			CarpetBlocks.WHITE_STAINED_GLASS_CARPET,
			RenderLayer.getTranslucent()
		);

		BlockRenderLayerMap.INSTANCE.putBlock(
			DoorBlocks.GLASS_DOOR,
			RenderLayer.getTranslucent()
		);
	}
}
