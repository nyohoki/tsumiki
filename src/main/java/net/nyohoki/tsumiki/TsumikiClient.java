package net.nyohoki.tsumiki;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;

public class TsumikiClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GURASU, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_FENCE, RenderLayer.getTranslucent());
    }
}
