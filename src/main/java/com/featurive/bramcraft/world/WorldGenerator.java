package com.featurive.bramcraft.world;

import com.featurive.bramcraft.block.BlockList;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class WorldGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if (random.nextInt(10) == 0) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = 30;
            int z = chunkZ * 16 + random.nextInt(16);

            generateFlag(world, x, y, z);
        }
    }

    private void generateFlag(World world, int x, int y, int z)

    {
        for (int i = 0; i < 10; i++) {
            world.setBlock(x, y + i, z, Blocks.fence, 0, 2);
        }

        for (int cx = 0; cx < 4; cx++){
            for (int cy = 0; cy < 3; cy++){
                for (int slab = 0; slab < 4; slab++){
                    world.setBlock(x+1+cx, y + 7 + cy, z, BlockList.dutch_flag);
                    world.setBlock(x+1+cx, y + 7 + cy, z, Blocks.wooden_slab);
                }
            }
        }

    }
}
