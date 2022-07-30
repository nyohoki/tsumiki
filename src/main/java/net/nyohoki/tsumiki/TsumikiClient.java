package net.nyohoki.tsumiki;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TsumikiClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GURASU, RenderLayer.getTranslucent());
		
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.WHITE_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PINK_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.RED_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.ORANGE_STAINED_GLASS_BUTTONGLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_BUTTONGLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.YELLOW_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIME_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GREEN_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.CYAN_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_BLUE_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLUE_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.PURPLE_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.MAGENTA_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BROWN_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.LIGHT_GRAY_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.GRAY_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.BLACK_STAINED_GLASS_WALL, RenderLayer.getTranslucent());
		// might need to change this
		BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_BUTTON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_CARPET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_FENCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_GATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_PRESSURE_PLATE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_SLAB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(Tsumiki.TINITED_GLASS_GLASS_WALL, RenderLayer.getTranslucent());
		
    }
}
