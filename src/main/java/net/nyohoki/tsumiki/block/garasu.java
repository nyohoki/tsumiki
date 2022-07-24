package net.nyohoki.tsumiki.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class garasu implements ModInitializer {
    public static final Block GARASU = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("nyohoki", "garasu"), GARASU);
    }
}
