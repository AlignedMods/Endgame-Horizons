package net.aligned.endgamehorizons;

import net.aligned.endgamehorizons.block.ModBlocks;
import net.aligned.endgamehorizons.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndgameHorizons implements ModInitializer {
	public static final String MOD_ID = "endgamehorizons";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//ReplaceBlocks.registerChunkListener(); // replaces most blocks with my (better) versions
		ModBlocks.RegisterModBlocks();
		ModItems.RegisterModItems();
	}
}
