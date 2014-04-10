package com.TS.mainPackage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class blockmachinecpu extends Block {

	public blockmachinecpu(int par1, Material par2Material) {
		super(par1, par2Material);
		
		this.setCreativeTab(mainClass.TSTab);
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(3.0F);
		this.setUnlocalizedName("blockmachinecpu");
		
	}
	public void registerIcons(IconRegister IR) {
		blockIcon = IR.registerIcon("Testing:blockmachinecpu");
		
	}
}