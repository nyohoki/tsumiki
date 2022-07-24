package net.nyohoki.tsumiki;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tsumiki implements ModInitializer {
	public static final String MOD_ID = "tsumiki";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Block GURASU = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fren :3");
		Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gurasu"), GURASU);
	}
}
