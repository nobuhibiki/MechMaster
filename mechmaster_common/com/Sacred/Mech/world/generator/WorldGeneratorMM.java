package com.Sacred.Mech.world.generator;

import java.util.Random;

import com.Sacred.Mech.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMM implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:  generateOverworld(world, random, chunkX * 16, chunkZ * 16);
		case 1:  generateEnd(world, random, chunkX * 16, chunkZ * 16);
		case -1: generateNether(random, world, chunkX * 16, chunkZ * 16);
		}
	}
	private void generateNether(Random random, World world, int chunkX,
			int chunkZ) {
		// TODO Auto-generated method stub
		
	}
	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		// TODO Auto-generated method stub
		
	}
	public void generateOverworld(World world, Random random, int chunkX, int chunkZ){
		this.addOres(ModBlocks.TesseractOre, world, random, chunkX, chunkZ, 16, 16, 18, 20, 0, 100);
	}
	
	public void addOres(Block block, World world, Random random, int chunkX, int chunkZ, int maxX, int maxZ, int vainSize, int spawnChance, int yMin, int yMax) {
		for(int i = 0; i < spawnChance; i++){
			int posX = chunkX + random.nextInt(15);
			int posZ = chunkZ + random.nextInt(15);
			int posY = yMin + random.nextInt(yMax-yMin);
			(new WorldGenMinable(block.blockID, vainSize)).generate(world, random, posX, posY, posZ);
		}
	}

}
