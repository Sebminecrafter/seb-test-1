package io.github.sebminecrafter.test1.item;

import io.github.sebminecrafter.test1.SebminecraftersTestMod1;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE));
    }
    public static Item register(Item item, String id) {
        SebminecraftersTestMod1.LOGGER.info("Item registered: " + id);
        return Registry.register(Registries.ITEM, Identifier.of(SebminecraftersTestMod1.MOD_ID, id), item);
    }
    public static final Item SUSPICIOUS_SUBSTANCE = ModItems.register(
            new Item(new Item.Settings()),
            "suspicious_substance"
    );
}