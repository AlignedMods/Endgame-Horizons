package net.aligned.endgamehorizons.terrain;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.WorldChunk;

public class ReplaceBlocks {

    public static void registerChunkListener() {
        // Register event listener for when a chunk is loaded
        ServerChunkEvents.CHUNK_LOAD.register((world, chunk) -> onChunkLoad(world, chunk));
    }

    private static void onChunkLoad(ServerWorld world, Chunk chunk) {
        if (chunk instanceof WorldChunk) {
            WorldChunk worldChunk = (WorldChunk) chunk;

            // Iterate through every block in the chunk
            for (BlockPos pos : BlockPos.iterate(
                    chunk.getPos().getStartX(), 0, chunk.getPos().getStartZ(),
                    chunk.getPos().getEndX(), world.getHeight() - 1, chunk.getPos().getEndZ())) {

                // Check if the block is stone, then replace it
                if (worldChunk.getBlockState(pos).getBlock() == Blocks.STONE) {
                    worldChunk.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState(), false);
                }
            }
        }
    }
}