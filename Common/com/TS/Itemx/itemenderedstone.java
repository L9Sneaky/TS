package com.TS.Itemx;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itemenderedstone extends Item {

	public itemenderedstone(int par1) {
		super(par1);
		this.setUnlocalizedName("itemenderedstone");
		this.setCreativeTab(mainClass.TSTab);
		this.setMaxStackSize(1);
	}
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:enderedstone");
	}
}
