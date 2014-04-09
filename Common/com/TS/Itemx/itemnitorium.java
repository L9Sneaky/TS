package com.TS.Itemx;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itemnitorium extends Item {

	public itemnitorium(int par1) {
		super(par1);
		this.setUnlocalizedName("itemnitoruim");
		this.setCreativeTab(mainClass.TSTab);
		this.setMaxStackSize(1);
		this.setHasSubtypes(true);
	}
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:Nitorium");
	}
}