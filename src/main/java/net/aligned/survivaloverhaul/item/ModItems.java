package net.aligned.survivaloverhaul.item;

import net.aligned.survivaloverhaul.SurvivalOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item DIAMOND_NUGGET = RegisterItem("diamond_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item DIAMOND_CHUNK = RegisterItem("diamond_chunk",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SurvivalOverhaul.MOD_ID, name), item);
    }

    public static void RegisterModItems()
    {
        SurvivalOverhaul.LOGGER.debug("Registering ModItems");
    }
}
