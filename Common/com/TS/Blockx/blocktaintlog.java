package com.TS.Blockx;

import java.util.List;
import java.util.Random;

import com.TS.mainPackage.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class blocktaintlog extends Block {
	
	public static final String[] woodType = new String[] {"taint"};
	
	private Icon iconLogTop;
	private Icon iconLogBottom;
	
	
	public blocktaintlog(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setUnlocalizedName("blocktaintlog");
		this.setHardness(2.0F);
		this.setStepSound(soundWoodFootstep);
		this.setResistance(1.0F);
		this.setCreativeTab(mainClass.TSTab);
	}
	public int onBlockPlaced(World par1World, int par2 ,int par3,int par4,int par5, float par6,float par7,float par8,int par9){
		int j1 = par9 & 3;
		byte b0 = 0;
		switch(par5){
		case 0:
		case 1:
		b0 = 0;
		break;
		case 2:
		case 3:
		b0 = 8;
		break;
		case 4:
		case 5:
		b0 = 4;
		
		
		}
		return j1 | b0;
		
		
	}
	public int idDropped(int par1, Random par2Random, int par3){
		return this.blockID;
	}
	public Icon getIcon(int par1, int par2){
		return par1 == 1 ? this.iconLogTop : (par1 == 0 ? this.iconLogBottom : this.blockIcon);
	}
	public void registerIcons(IconRegister IR) {
		this.blockIcon = IR.registerIcon("Testing:blocktaintlog_side");
		this.iconLogTop = IR.registerIcon("Testing:blocktaintlog_top");
		this.iconLogBottom = IR.registerIcon("Testing:blocktaintlog_bottom");
	}
	public boolean isWood(World world, int x,int y, int z){
		return true;
	}
	public boolean canSustainLeaves(World world,int x,int y,int z){
	return true;
	}
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List){
		par3List.add(new ItemStack(par1, 1 ,0));
	}
	
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("WIP");
		
	}
	
	
}
