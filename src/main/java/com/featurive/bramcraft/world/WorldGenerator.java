package com.featurive.bramcraft.world;

import com.featurive.bramcraft.block.BlockList;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fluids.FluidRegistry;

import java.util.Random;

public class WorldGenerator implements IWorldGenerator {

    private WorldGenMinable dark_ore = new WorldGenMinable(BlockList.dark_ore, 12);
    private WorldGenMinable crystal_ore = new WorldGenMinable(BlockList.crystal_ore, 8);
    private WorldGenMinable ferrum_ore = new WorldGenMinable(BlockList.ferrum_ore, 12);
    private int FlagPoleHeight = 10;

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


    public void generateSurface(World world, int x, int z, Random random){
        if (random.nextInt(10) == 0) {
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = world.getHeightValue(randX, randZ);
            if(randY <= (world.getHeight() - FlagPoleHeight) && world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.river && world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.ocean) {
                Block block = world.getBlock(randX, randY - 1, randZ);
                if (!(block instanceof BlockLiquid) || FluidRegistry.lookupFluidForBlock(block) != null){
                    generateFlag(world, randX, randY, randZ);
                }
            }
        }

        for(int i = 0; i < 5; i++) {
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

    }

    public void generateEnd(World world, int x, int z, Random random) {

    }

    private void generateFlag(World world, int x, int y, int z){
        for(int i = 0; i < FlagPoleHeight; i++) {
            world.setBlock(x, y + i, z, Blocks.fence, 0, 2);
        }
        for(int dx = 0; dx < 3; dx++) {
            for(int dy = 0; dy < 3; dy++) {
                world.setBlock(x + 1 + dx, y + (FlagPoleHeight - 3) + dy, z, BlockList.dutch_flag, 0, 2);
            }
        }
    }
}
