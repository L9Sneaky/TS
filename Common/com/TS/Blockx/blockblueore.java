package com.TS.Blockx;

import java.util.Random;

import com.TS.mainPackage.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class blockblueore extends Block {

	public blockblueore(int par1, Material par2Material) {
		super(par1, par2Material);
		
		this.setCreativeTab(mainClass.TSTab);
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(3.4F);
		this.setResistance(5.7F);
		this.setUnlocalizedName("blockblueore");
		
	}
	public void registerIcons(IconRegister IR) {
		blockIcon = IR.registerIcon("Testing:blockblueore");
		
	}
	public int idDropped(int par1, Random par2Random, int par3){
		return mainClass.itembluegem.itemID;
}
	public int quantityDropped(Random random){
		return 4;
}
}