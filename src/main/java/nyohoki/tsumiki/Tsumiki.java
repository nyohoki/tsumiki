package nyohoki.tsumiki;

import net.fabricmc.api.ModInitializer;

import nyohoki.tsumiki.block.*;
import nyohoki.tsumiki.item.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tsumiki implements ModInitializer {

	public static final String MOD_ID = "tsumiki";
    public static final Logger LOGGER = LoggerFactory.getLogger("tsumiki");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fren! :3c");

		TsumikiItemGroup.registerItemGroup();
		
		// debug 
		NyohokiBlock.registerNyohokiBlock();
		NyohokiItem.registerNyohokiItem();

		// blocks
		ButtonBlocks.registerButtonBlocks();
		CarpetBlocks.registerCarpetBlocks();
		DoorBlocks.registerDoorBlocks();
		FenceBlocks.registerFenceBlocks();
		GateBlocks.registerGateBlocks();
		PressurePlateBlocks.registerPressurePlateBlocks();
		SlabBlocks.registerSlabBlocks();
		StairBlocks.registerStairBlocks();
		TrapdoorBlocks.registerTrapdoorBlocks();
		WallBlocks.registerWallBlocks();
	}
}
