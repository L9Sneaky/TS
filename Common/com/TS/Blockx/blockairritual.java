package com.TS.Blockx;

import com.TS.mainPackage.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class blockairritual extends Block {

	public blockairritual(int par1, Material par2Material) {
		super(par1, par2Material);
		
		this.setCreativeTab(mainClass.TSTab);
		this.setStepSound(Block.soundClothFootstep);
		this.setHardness(3.4F);
		this.setUnlocalizedName("blockairritual");
		
		
	}
	public void registerIcons(IconRegister IR) {
		blockIcon = IR.registerIcon("Testing:blockairritual");
		
	}
}