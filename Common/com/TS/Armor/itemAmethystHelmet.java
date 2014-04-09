package com.TS.Armor;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class itemAmethystHelmet extends ItemArmor {
	public itemAmethystHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
			super(par1, par2EnumArmorMaterial, par3, par4);
			this.setUnlocalizedName("itemAmethystHelmet");
			this.setCreativeTab(mainClass.TSTab);
			this.setMaxDamage(10000);
			}
			
			public void registerIcons(IconRegister IR) {
				itemIcon = IR.registerIcon("Testing:itemAmethystHelmet");
			}
}