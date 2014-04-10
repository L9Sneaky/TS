package com.TS.Itemx;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itemblueingot extends Item{

	public itemblueingot(int par1) {
		super(par1);
		this.setCreativeTab(mainClass.TSTab);
		this.setUnlocalizedName("itemblueingot");
		
	}
	
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:itemblueingot");
	}
}