package com.TS.Toolx;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.Explosion;

import com.TS.mainPackage.mainClass;

public class itemswordComlexMist extends ItemswordCM{
	private final EnumToolMaterial toolMaterial;
	
	

	public itemswordComlexMist(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName("itemswordComlexMist");
		this.setCreativeTab(mainClass.TSTab);
		this.toolMaterial = par2EnumToolMaterial;
		
		
		
	}

	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:itemswordComlexMist");
	}
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.epic;
	
	}
	public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
	public boolean hasEffect(ItemStack par1ItemStack, int pass)
    {
        return hasEffect(par1ItemStack) && (pass == 0 || itemID != Item.potion.itemID);
    }
//	public int getItemEnchantability()
//    {
//        return 5;
//    }
	public int getItemEnchantability()
    {
        return this.toolMaterial.getEnchantability();
    }
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.toolMaterial.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
	public static DamageSource causeThornsDamage(Entity par0Entity)
    {
        return (new EntityDamageSource("thorns", par0Entity)).setMagicDamage();
    }
	

	
}
