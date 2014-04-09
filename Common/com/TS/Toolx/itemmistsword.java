package com.TS.Toolx;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;

import com.TS.mainPackage.mainClass;

public class itemmistsword extends ItemXsword {

	public itemmistsword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName("itemmistsword");
		this.setCreativeTab(mainClass.TSTab);
		
	}

	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:swordMist");
	}
}
