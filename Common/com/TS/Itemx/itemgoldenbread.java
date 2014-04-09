package com.TS.Itemx;

import java.util.List;

import com.TS.mainPackage.mainClass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class itemgoldenbread extends ItemFood
{
    public itemgoldenbread(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setHasSubtypes(true);
        this.setAlwaysEdible();
        this.setPotionEffect(Potion.regeneration.id, 5, 1, 5.0F);
        this.setUnlocalizedName("itemgoldenbread");
        this.setCreativeTab(mainClass.TSTab);
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItemDamage() > 0;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
    }

    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 6000, 0));
        }

        if (par1ItemStack.getItemDamage() > 0)
        {
            if (!par2World.isRemote)
            {
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 6000, 4));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 6000, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 6000, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 6000, 0));
            }
        }
        else
        {
            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
    }
    public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:itemgoldenbread");
	}
}
