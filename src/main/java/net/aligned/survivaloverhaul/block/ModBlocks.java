package net.aligned.survivaloverhaul.block;

import com.mojang.serialization.Lifecycle;
import net.aligned.survivaloverhaul.SurvivalOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Overwrite;

public class ModBlocks {
    public static Block RegisterBlock(String name, Block block, ItemGroup tab) {
        RegisterBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(SurvivalOverhaul.MOD_ID, name), block);
    }

    public static Item RegisterBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(SurvivalOverhaul.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void RegisterModBlocks() {
        SurvivalOverhaul.LOGGER.debug("Registering ModBlocks!");
    }
}
