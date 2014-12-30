package com.featurive.bramcraft.world;

import com.featurive.bramcraft.block.BlockList;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGenerator implements IWorldGenerator {

    private WorldGenMinable dark_ore = new WorldGenMinable(BlockList.dark_ore, 12);
    private WorldGenMinable crystal_ore = new WorldGenMinable(BlockList.crystal_ore, 8);
    private WorldGenMinable ferrum_ore = new WorldGenMinable(BlockList.ferrum_ore, 12);

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
            case 20:
                break;
            default:
                generateSurface(world, x, z, random);
        }
    }


    public void generateSurface(World world, int x, int z, Random random){
        if (random.nextInt(16) == 0) {
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = world.getHeightValue(randX, randZ);

            BiomeGenBase biome = world.getBiomeGenForCoords(randX, randZ);
            if(biome != BiomeGenBase.river && biome != BiomeGenBase.ocean){
                Block block = world.getBlock(randX, randY-1, randZ);
                if(block != Blocks.water && block != Blocks.lava){
                    generateFlag(world, randX, randY, randZ);
                }
            }
        }

        for(int i = 0; i < 5; i++){
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = 24 + random.nextInt(40);
            dark_ore.generate(world, random, randX, randY, randZ);
        }

        for(int i = 0; i < 4; i++){
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = random.nextInt(24);
            crystal_ore.generate(world, random, randX, randY, randZ);
        }

        for(int i = 0; i < 5; i++){
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = 24 + random.nextInt(48);
            ferrum_ore.generate(world, random, randX, randY, randZ);
        }
    }

    public void generateNether(World world, int x, int z, Random random) {
        //for(int i = 0; i < 20; i++){
        //    int randX = x + random.nextInt(16);
        //    int randZ = z + random.nextInt(16);
        //    int randY = random.nextInt(128);
        //    ferrum_ore.generate(world, random, randX, randY, randZ);
        //}
    }

    public void generateEnd(World world, int x, int z, Random random) {

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
