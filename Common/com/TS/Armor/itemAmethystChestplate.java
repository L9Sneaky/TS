package com.TS.Armor;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class itemAmethystChestplate extends ItemArmor {
	public itemAmethystChestplate(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
			super(par1, par2EnumArmorMaterial, par3, par4);
			this.setUnlocalizedName("itemAmethystChestplate");
			this.setCreativeTab(mainClass.TSTab);
			this.setMaxDamage(10000);
			}
			public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
			if (stack.itemID == mainClass.itemAmethystHelmet.itemID
			|| stack.itemID == mainClass.itemAmethystChestplate.itemID
			|| stack.itemID == mainClass.itemAmethystBoots.itemID) {
			return "Testing:armor/armor_layer_1.png";
			}
			if (stack.itemID == mainClass.itemAmethystLeggings.itemID) {
			return "Testing:armor/armor_layer_2.png";
			} else {
			return null;
			}

			}
			
			public void registerIcons(IconRegister IR) {
				itemIcon = IR.registerIcon("Testing:itemAmethystChestplate");
			}
}