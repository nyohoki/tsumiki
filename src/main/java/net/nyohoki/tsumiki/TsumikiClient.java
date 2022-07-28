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
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_WALL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_FLOWER, RenderLayer.getTranslucent());
        // BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_SIGN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());

    }
}
