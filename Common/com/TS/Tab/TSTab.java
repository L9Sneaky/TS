package com.TS.Tab;

import com.TS.Toolx.itemswordComlexMist;
import com.TS.mainPackage.mainClass;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TSTab extends CreativeTabs{
	
	public TSTab(int par1, String par2Str){
		
		super(par1, par2Str);
			}


	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()	{
		
		return mainClass.itemswordComlexMist.itemID;
}

	
	public String getTranslatedTabLabel(){
			
		return "Trio Sphere";
			}

}
