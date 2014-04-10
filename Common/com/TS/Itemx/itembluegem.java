package com.TS.Itemx;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itembluegem extends Item{

	public itembluegem(int par1) {
		super(par1);
		this.setCreativeTab(mainClass.TSTab);
		this.setUnlocalizedName("itembluegem");
		
	}
	
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:itembluegem");
	}
}