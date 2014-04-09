package com.TS.Blockx;

import java.awt.List;
import java.util.Random;

import com.TS.mainPackage.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class blocktaintleaves extends Block {

	public blocktaintleaves(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setUnlocalizedName("blocktaintleaves");
		this.setCreativeTab(mainClass.TSTab);
		this.setStepSound(soundGrassFootstep);
		this.setHardness(0.2F);
		this.setResistance(1.0F);
	}
	public boolean isOpaqueCube(){
        return false;
    }
	public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? 1 : 0;
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.sapling.blockID;
    }
	
	
	public void registerIcons(IconRegister IR) {
		blockIcon = IR.registerIcon("Testing:blocktaintleaves");
		
	}
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("WIP");
		
	}

}
