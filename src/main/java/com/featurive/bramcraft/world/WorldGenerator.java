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
        int x = chunkX * 16;
        int z = chunkZ * 16;

        switch (world.provider.dimensionId){
            case 0:
                generateSurface(world, x, z, random);
                break;
            case -1:
                generateNether(world, x, z, random);
                break;
            case 1:
                generateEnd(world, x, z, random);
                break;
            default:
                generateSurface(world, x, z, random);
        }
    }


    private void generateSurface(World world, int x, int z, Random random){
        if (random.nextInt(10) == 0) {
            int randX = x * 16 + random.nextInt(16);
            int randZ = z * 16 + random.nextInt(16);
            int y = world.getHeightValue(randX, randZ);

            generateFlag(world, x, y, z);
        }
    }

    private void generateNether(World world, int x, int z, Random random) {

    }

    private void generateEnd(World world, int x, int z, Random random) {

    }

    private void generateFlag(World world, int x, int y, int z){
        for (int i = 0; i < 10; i++) {
            world.setBlock(x, y + i, z, Blocks.fence, 0, 2);
        }

        for (int cx = 0; cx < 4; cx++){
            for (int cy = 0; cy < 3; cy++){
                for (int slab = 0; slab < 5; slab++){
                    world.setBlock(x+1+cx, y + 7 + cy, z, BlockList.dutch_flag, 0, 2);
                    world.setBlock(x+slab, y + 10, z, Blocks.wooden_slab, 0, 2);
                }
            }
        }

    }
}
