package com.TS.Itemx;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itemdustMist extends Item{

	public itemdustMist(int par1) {
		super(par1);
		this.setCreativeTab(mainClass.TSTab);
		this.setUnlocalizedName("itemdustMist");
		
	}
	
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:dustMist");
	}
}
