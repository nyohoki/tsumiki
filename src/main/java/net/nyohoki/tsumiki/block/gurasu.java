package net.nyohoki.tsumiki.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class gurasu implements ModInitializer {
    public static final Block GURASU = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("tsumiki", "gurasu"), GURASU);
        Registry.register(Registry.ITEM, new Identifier("tsumiki", "gurasu"), new BlockItem(GURASU, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
