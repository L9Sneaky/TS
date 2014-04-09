package com.TS.Blockx;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.TS.mainPackage.mainClass;

	public class blockmistglass extends Block {

		public blockmistglass(int par1, Material glass) {
			super(par1,Material.glass);
			
			this.setCreativeTab(mainClass.TSTab);
			this.setStepSound(Block.soundGlassFootstep);
			this.setResistance(1.0F);
			this.setHardness(0.3F);
			this.setUnlocalizedName("blockmistglass");
}


		public boolean isOpaqueCube() {
			return false;
		}
		public boolean renderAsNormalBlock() {
			return false;
	}
		public int getRenderType() {
			return 0;
	}
		public int getRenderBlockPass() {
			return 0;
	}
		protected boolean canSilkHarvest() {
			return true;
	}

		public int idDropped(int par1, Random par2Random, int par3){
			return mainClass.blockmistglass.blockID;
	}
		public int quantityDropped(Random random){
			return 1;
	}
	
		public void registerIcons(IconRegister IR) {
			blockIcon = IR.registerIcon("Testing:mistglass");
			
		}

}