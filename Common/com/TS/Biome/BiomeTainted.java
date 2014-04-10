package com.TS.Biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeTainted extends BiomeGenBase {

	public BiomeTainted(int par1) {
		super(par1);
		topBlock = (byte)Block.grass.blockID;
		fillerBlock = (byte)Block.dirt.blockID;
		this.theBiomeDecorator.treesPerChunk = 15;
	}
	

}
