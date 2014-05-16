package com.TS.Handlers;

import java.io.File;

import com.TS.Armor.itemAmethystBoots;
import com.TS.Armor.itemAmethystChestplate;
import com.TS.Armor.itemAmethystHelmet;
import com.TS.Armor.itemAmethystLeggings;
import com.TS.Itemx.itemadvancesigil;
import com.TS.Itemx.itembluegem;
import com.TS.Itemx.itemblueingot;
import com.TS.Itemx.itemdimrod;
import com.TS.Itemx.itemenderedstone;
import com.TS.Itemx.itemendereyestone;
import com.TS.Itemx.itemenergizedendereyestone;
import com.TS.Itemx.itemgoldenbread;
import com.TS.Itemx.itemingotdarkiron;
import com.TS.Itemx.itemmistdiamond;
import com.TS.Itemx.itemredgem;
import com.TS.Itemx.itemredingot;
import com.TS.Itemx.itemswordComlexbottomcore;
import com.TS.Itemx.itemswordComlextopcore;
import com.TS.Itemx.itemtainquartz;
import com.TS.Toolx.ItemXaxe;
import com.TS.Toolx.ItemXhoe;
import com.TS.Toolx.ItemXpickaxe;
import com.TS.Toolx.ItemXspade;
import com.TS.Toolx.ItemXsword;
import com.TS.Toolx.itemmistaxe;
import com.TS.Toolx.itemmisthoe;
import com.TS.Toolx.itemmistpickaxe;
import com.TS.Toolx.itemmistspade;
import com.TS.Toolx.itemmistsword;
import com.TS.Toolx.itemswordComlexMist;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class Config {
	
	public void initConfiguration(FMLInitializationEvent event){
		Configuration config = new Configuration(new File("config/TrioSphere.cfg"));
		config.load();
		
	//	BlockID = config.get("Blocks", "blockoreMist", 4000).getInt();
		Ids.v4000ID = config.get("Blocks", "blockoreMist", Ids.v4000IDDefault).getInt();
		Ids.v4001ID = config.get("Blocks", "blockmistglass", Ids.v4001IDDefault).getInt();
		Ids.v4002ID = config.get("Blocks", "blockairritual", Ids.v4002IDDefault).getInt();
		Ids.v4003ID = config.get("Blocks", "blockelectriclightidle", Ids.v4003IDDefault).getInt();
		Ids.v4004ID = config.get("Blocks", "blockelectriclightactive", Ids.v4004IDDefault).getInt();
		Ids.v4005ID = config.get("Blocks", "blockmachineframe", Ids.v4005IDDefault).getInt();
		Ids.v4006ID = config.get("Blocks", "blockenderflower", Ids.v4006IDDefault).getInt();
		Ids.v4007ID = config.get("Blocks", "blocktaintleaves", Ids.v4007IDDefault).getInt();
		Ids.v4008ID = config.get("Blocks", "blocktaintlog", Ids.v4008IDDefault).getInt();
		Ids.v4009ID = config.get("Blocks", "blocktaintsapling", Ids.v4009IDDefault).getInt();
		Ids.v4010ID = config.get("Blocks", "blocktainquartzchiseled", Ids.v4010IDDefault).getInt();
		Ids.v4011ID = config.get("Blocks", "blocktainquartzpillar", Ids.v4011IDDefault).getInt();
		Ids.v4012ID = config.get("Blocks", "blockmachinecpu", Ids.v4012IDDefault).getInt();
		Ids.v4013ID = config.get("Blocks", "blockblueore", Ids.v4013IDDefault).getInt();
		Ids.v4014ID = config.get("Blocks", "blockbluebrick", Ids.v4014IDDefault).getInt();
		Ids.v4015ID = config.get("Blocks", "blockredore", Ids.v4015IDDefault).getInt();
		Ids.v4016ID = config.get("Blocks", "blockredbrick", Ids.v4016IDDefault).getInt();
		Ids.v4017ID = config.get("Blocks", "blocktainquartzblock", Ids.v4017IDDefault).getInt();
		Ids.v4018ID = config.get("Blocks", "blocktaintblock", Ids.v4018IDDefault).getInt();
		Ids.v4019ID = config.get("Blocks", "blocktaintbrick", Ids.v4019IDDefault).getInt();
		Ids.v4020ID = config.get("Blocks", "blockqgen", Ids.v4020IDDefault).getInt();
		Ids.v4021ID = config.get("Blocks", "blockngen", Ids.v4021IDDefault).getInt();
		Ids.v4022ID = config.get("Blocks", "blockenergyblue", Ids.v4022IDDefault).getInt();
		Ids.v4023ID = config.get("Blocks", "blockenergyred", Ids.v4023IDDefault).getInt();
		Ids.v4024ID = config.get("Blocks", "blockbluemachineidle", Ids.v4024IDDefault).getInt();
		Ids.v4025ID = config.get("Blocks", "blockbluemachineBurning", Ids.v4025IDDefault).getInt();
		
		
//		BlockID = config.get("Blocks", "blockoreMist", 4000).getInt();
		Ids.v5000ID = config.get("Items", "itemdustMist", Ids.v5000IDDefault).getInt();
		Ids.v5001ID = config.get("Items", "itemingotMist", Ids.v5001IDDefault).getInt();
		Ids.v5002ID = config.get("Items", "itemopenStone", Ids.v5002IDDefault).getInt();
		Ids.v5003ID = config.get("Items", "itemswordComlexMist", Ids.v5003IDDefault).getInt();
		Ids.v5004ID = config.get("Items", "itemenderedstone", Ids.v5004IDDefault).getInt();
		Ids.v5005ID = config.get("Items", "itemendereyestone", Ids.v5005IDDefault).getInt();
		Ids.v5006ID = config.get("Items", "itemenergizedendereyestone", Ids.v5006IDDefault).getInt();
		Ids.v5007ID = config.get("Items", "itemdimrod", Ids.v5007IDDefault).getInt();
		Ids.v5008ID = config.get("Items", "itemadvancesigil", Ids.v5008IDDefault).getInt();
		Ids.v5009ID = config.get("Items", "itemnitorium", Ids.v5009IDDefault).getInt();
		Ids.v5010ID = config.get("Items", "itemAmethystChestplate", Ids.v5010IDDefault).getInt();
		Ids.v5011ID = config.get("Items", "itemAmethystBoots", Ids.v5011IDDefault).getInt();
		Ids.v5012ID = config.get("Items", "itemAmethystLeggings", Ids.v5012IDDefault).getInt();
		Ids.v5013ID = config.get("Items", "itemAmethystHelmet ", Ids.v5013IDDefault).getInt();
		Ids.v5014ID = config.get("Items", "itemgoldenbread", Ids.v5014IDDefault).getInt();
		Ids.v5015ID = config.get("Items", "itemmistpickaxe", Ids.v5015IDDefault).getInt();
		Ids.v5016ID = config.get("Items", "itemmistaxe ", Ids.v5016IDDefault).getInt();
		Ids.v5017ID = config.get("Items", "itemmistsword ", Ids.v5017IDDefault).getInt();
		Ids.v5018ID = config.get("Items", "itemmisthoe", Ids.v5018IDDefault).getInt();
		Ids.v5019ID = config.get("Items", "itemmistspade", Ids.v5019IDDefault).getInt();
		Ids.v5020ID = config.get("Items", "itemingotdarkiron", Ids.v5020IDDefault).getInt();
		Ids.v5021ID = config.get("Items", "itemswordComlexbottomcore", Ids.v5021IDDefault).getInt();
		Ids.v5022ID = config.get("Items", "itemswordComlextopcore", Ids.v5022IDDefault).getInt();
		Ids.v5023ID = config.get("Items", "itemtainquartz", Ids.v5023IDDefault).getInt();
		Ids.v5024ID = config.get("Items", "itemmistdiamond", Ids.v5024IDDefault).getInt();
		Ids.v5025ID = config.get("Items", "itembluegem", Ids.v5025IDDefault).getInt();
		Ids.v5026ID = config.get("Items", "itemblueingot", Ids.v5026IDDefault).getInt();
		Ids.v5027ID = config.get("Items", "itemredgem", Ids.v5027IDDefault).getInt();
		Ids.v5028ID = config.get("Items", "itemredingot", Ids.v5028IDDefault).getInt();
		
		
		
		
		
		
		config.save();
	}

}
