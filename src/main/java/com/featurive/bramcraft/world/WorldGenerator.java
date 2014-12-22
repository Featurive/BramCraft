package com.featurive.bramcraft.world;

import com.featurive.bramcraft.block.BlockList;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class WorldGenerator implements IWorldGenerator{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        world.setBlock(chunkX * 16, 30, chunkZ * 16, BlockList.dark_ore, 0, 2);
    }
}
