package com.featurive.bramcraft.world;

import com.featurive.bramcraft.block.BlockList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenerator implements IWorldGenerator {

    private WorldGenMinable dark_ore = new WorldGenMinable(BlockList.dark_ore.getDefaultState(), 12);
    private WorldGenMinable crystal_ore = new WorldGenMinable(BlockList.crystal_ore.getDefaultState(), 8);
    private WorldGenMinable ferrum_ore = new WorldGenMinable(BlockList.ferrum_ore.getDefaultState(), 12);

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int x = chunkX * 16;
        int z = chunkZ * 16;

        switch (world.provider.getDimensionId()){
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


    public void generateSurface(World world, int x, int z, Random random){
        if (random.nextInt(16) == 0) {
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = world.getTopSolidOrLiquidBlock(new BlockPos(randX, 0, randZ)).getY();
            BlockPos pos = new BlockPos(randX, randY, randZ);
            BiomeGenBase biome = world.getBiomeGenForCoords(pos);
            if(biome != BiomeGenBase.river && biome != BiomeGenBase.ocean){
                IBlockState block = world.getBlockState(pos);
                if(block != Blocks.water && block != Blocks.lava){
                    generateFlag(world, pos);
                }
            }
        }

        for(int i = 0; i < 5; i++){
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = 24 + random.nextInt(40);
            BlockPos pos = new BlockPos(randX, randY, randZ);
            dark_ore.generate(world, random, pos);
        }

        for(int i = 0; i < 4; i++){
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = random.nextInt(24);
            BlockPos pos = new BlockPos(randX, randY, randZ);
            crystal_ore.generate(world, random, pos);
        }

        for(int i = 0; i < 5; i++){
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = 24 + random.nextInt(48);
            BlockPos pos = new BlockPos(randX, randY, randZ);
            ferrum_ore.generate(world, random, pos);
        }
    }

    public void generateNether(World world, int x, int z, Random random) {

    }

    public void generateEnd(World world, int x, int z, Random random) {

    }

    private void generateFlag(World world, BlockPos pos){
        for (int i = 0; i < 10; i++) {
            world.setBlockState(new BlockPos(pos.getX(), pos.getY()+i, pos.getZ()), Blocks.oak_fence.getDefaultState(), 2);
        }

        for (int cx = 0; cx < 4; cx++){
            for (int cy = 0; cy < 3; cy++){
                for (int slab = 0; slab < 5; slab++){
                    world.setBlockState(new BlockPos(pos.getX()+1+cx, pos.getY()+7+cy, pos.getZ()), BlockList.dutch_flag.getDefaultState(), 2);
                    world.setBlockState(new BlockPos(pos.getX()+slab, pos.getY() + 10, pos.getZ()), Blocks.wooden_slab.getDefaultState(), 2);
                }
            }
        }
    }
}
