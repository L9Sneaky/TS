package com.TS.Itemx;

import java.awt.List;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class itemopenStone extends Item{


	public itemopenStone(int par1){
		super(par1);
		this.setCreativeTab(mainClass.TSTab);
		this.setUnlocalizedName("itemopenStone");
		this.setMaxStackSize(1);
		this.setNoRepair();
		this.setFull3D();
	}
	
	
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:openStone");
	}
	
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("One-Time-Use");
		
	}
}
