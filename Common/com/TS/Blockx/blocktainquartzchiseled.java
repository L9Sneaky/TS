package com.TS.Blockx;

import java.util.List;
import java.util.Random;

import com.TS.mainPackage.mainClass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class blocktainquartzchiseled extends Block {
	
	private Icon iconTop;
	private Icon iconBottom;
	
	
	public blocktainquartzchiseled(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setUnlocalizedName("blocktainquartzchiseled");
		this.setHardness(2.0F);
		this.setStepSound(soundMetalFootstep);
		this.setResistance(1.0F);
		this.setCreativeTab(mainClass.TSTab);
	}
		public int idDropped(int par1, Random par2Random, int par3){
			return this.blockID;
		}
		public Icon getIcon(int par1, int par2){
			return par1 == 1 ? this.iconTop : (par1 == 0 ? this.iconBottom : this.blockIcon);
		}
		public void registerIcons(IconRegister IR) {
			this.blockIcon = IR.registerIcon("Testing:chiseledDarkQuartz0");
			this.iconTop = IR.registerIcon("Testing:chiseledDarkQuartz1");
			this.iconBottom = IR.registerIcon("Testing:chiseledDarkQuartz2");
	}
}

