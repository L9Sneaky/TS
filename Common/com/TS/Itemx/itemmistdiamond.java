package com.TS.Itemx;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itemmistdiamond extends Item {

	public itemmistdiamond(int par1) {
		super(par1);
		this.setUnlocalizedName("itemmistdiamond");
		this.setCreativeTab(mainClass.TSTab);
		
	}
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:itemmistdiamond");
	}
}