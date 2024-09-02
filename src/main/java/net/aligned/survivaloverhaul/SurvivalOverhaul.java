package net.aligned.survivaloverhaul;

import net.aligned.survivaloverhaul.block.ModBlocks;
import net.aligned.survivaloverhaul.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SurvivalOverhaul implements ModInitializer {
	public static final String MOD_ID = "survivaloverhaul";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.RegisterModBlocks();
		ModItems.RegisterModItems();
	}
}