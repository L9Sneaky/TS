package com.TS.Blockx;

import com.TS.mainPackage.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class blocktaintblock extends Block {

	public blocktaintblock(int par1, Material par2Material) {
		super(par1, par2Material);
		
		this.setCreativeTab(mainClass.TSTab);
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(3.4F);
		this.setResistance(5.7F);
		this.setUnlocalizedName("blocktaintblock");
		
	}
	public void registerIcons(IconRegister IR) {
		blockIcon = IR.registerIcon("Testing:blocktaintblock");
		
	}

}
