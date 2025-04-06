package io.github.sebminecrafter.test1;

import io.github.sebminecrafter.test1.block.ModBlocks;
import io.github.sebminecrafter.test1.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SebminecraftersTestMod1 implements ModInitializer {
	public static final String MOD_ID = "seb-test-1";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		LOGGER.info("Mod items initialized");
		ModBlocks.initialize();
		LOGGER.info("Mod blocks initialized");
	}
}