package net.community.projectwoven;

import net.community.projectwoven.block.ModBlocks;
import net.community.projectwoven.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WovenWorld implements ModInitializer {
	public static final String MOD_ID = "projectwoven";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
	}
}