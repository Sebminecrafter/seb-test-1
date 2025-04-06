package io.github.sebminecrafter.test1.block;

import io.github.sebminecrafter.test1.SebminecraftersTestMod1;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TEST_BLOCK_1 = register("test_block_1",
            new Block(AbstractBlock.Settings.create().
                    strength(4f).
                    sounds(BlockSoundGroup.METAL)
            ));

    private static Block register(String name, Block block) {
        registerBlockItem(name, block);
        SebminecraftersTestMod1.LOGGER.info("Block registered: {}", name);
        return  Registry.register(Registries.BLOCK, Identifier.of(SebminecraftersTestMod1.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SebminecraftersTestMod1.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->
                entries.add(ModBlocks.TEST_BLOCK_1)
        );
    }
}