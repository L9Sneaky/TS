package com.TS.mainPackage;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;

import com.TS.Armor.itemAmethystBoots;
import com.TS.Armor.itemAmethystChestplate;
import com.TS.Armor.itemAmethystHelmet;
import com.TS.Armor.itemAmethystLeggings;
import com.TS.Biome.BiomeTainted;
import com.TS.Blockx.blockairritual;
import com.TS.Blockx.blockbluebrick;
import com.TS.Blockx.blockbluemachine;
import com.TS.Blockx.blockblueore;
import com.TS.Blockx.blockelectriclight;
import com.TS.Blockx.blockenderflower;
import com.TS.Blockx.blockenergyblue;
import com.TS.Blockx.blockenergyred;
import com.TS.Blockx.blockmachinecpu;
import com.TS.Blockx.blockmachineframe;
import com.TS.Blockx.blockmistglass;
import com.TS.Blockx.blockngen;
import com.TS.Blockx.blockqgen;
import com.TS.Blockx.blockredbrick;
import com.TS.Blockx.blockredore;
import com.TS.Blockx.blocktainquartzpillar;
import com.TS.Blockx.blocktaintblock;
import com.TS.Blockx.blocktaintbrick;
import com.TS.Blockx.blocktaintleaves;
import com.TS.Blockx.blocktaintlog;
import com.TS.Blockx.blocktaintquartzblock;
import com.TS.Blockx.blocktaintsapling;
import com.TS.Handlers.Ids;
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
import com.TS.Proxy.IProxy;
import com.TS.Reference.Reference;
import com.TS.Tab.TSTab;
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
import com.TS.WorldGem.Worldgen;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;



@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, certificateFingerprint = Reference.FINGERPRINT, version = "Beta-1.0.6.4")




public class mainClass {
	

@Instance
public static mainClass instance;

@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
public static IProxy proxy;
	//Register
	public static EnumToolMaterial CS = EnumHelper.addToolMaterial("Y", 3, 99999, 10.0F, 10000.0F, 99);	
	public static EnumToolMaterial Mist = EnumHelper.addToolMaterial("D", 3, 2000, 8.0F, 10.0F, 22);	
	public static EnumArmorMaterial AmethystArmor = EnumHelper.addArmorMaterial("AmethystArmor", 8, new int[] { 5, 8, 7, 4 }, 40);
	public static CreativeTabs TSTab = new TSTab(CreativeTabs.getNextID(), " TS Tab");
	
	
	//**Blocks**//
	public static Block blockoreMist = new com.TS.Blockx.blockoreMist(Ids.v4000ID, Material.rock);
	public static Block blockmistglass = new blockmistglass(Ids.v4001ID, Material.glass);
	public static Block blockairritual = new blockairritual (Ids.v4002ID, Material.clay);
	public static Block blockelectriclightidle = (new blockelectriclight(Ids.v4003ID, false));
	public static Block blockelectriclightactive =( new blockelectriclight(Ids.v4004ID, true)).setTextureName("Testing:blockelectriclightidle");
	public static Block blockmachineframe = new blockmachineframe(Ids.v4005ID , Material.rock);
	public static Block blockenderflower = new blockenderflower(Ids.v4006ID , Material.plants);
	public static Block blocktaintleaves = new blocktaintleaves(Ids.v4007ID, Material.leaves);
	public static Block blocktaintlog = new blocktaintlog (Ids.v4008ID, Material.wood);
	public static Block blocktaintsapling = new blocktaintsapling(Ids.v4009ID, 0);
	public static Block blocktainquartzchiseled = new com.TS.Blockx.blocktainquartzchiseled(Ids.v4010ID , Material.rock);
	public static Block blocktainquartzpillar = new blocktainquartzpillar(Ids.v4011ID , Material.rock);
	public static Block blockmachinecpu = new blockmachinecpu(Ids.v4012ID , Material.rock);
	public static Block blockblueore = new blockblueore (Ids.v4013ID , Material.rock);
	public static Block blockbluebrick = new blockbluebrick(Ids.v4014ID, Material.rock);
	public static Block blockredore = new blockredore (Ids.v4015ID , Material.rock);
	public static Block blockredbrick = new blockredbrick(Ids.v4016ID, Material.rock);
	public static Block blocktainquartzblock = new blocktaintquartzblock(Ids.v4017ID , Material.rock);
	public static Block blocktaintblock = new blocktaintblock(Ids.v4018ID, Material.rock);
	public static Block blocktaintbrick = new blocktaintbrick(Ids.v4019ID, Material.rock);
	public static Block blockqgen = new blockqgen(Ids.v4020ID, Material.rock);
	public static Block blockngen = new blockngen(Ids.v4021ID,Material.rock);
	public static Block blockenergyblue = new blockenergyblue(Ids.v4022ID,Material.rock);
	public static Block blockenergyred = new blockenergyred(Ids.v4023ID,Material.rock);
	public static Block blockbluemachineidle = new blockbluemachine(Ids.v4024ID, false);
	public static Block blockbluemachineBurning = new blockbluemachine(Ids.v4025ID, true);
	
	
	
	
	
	//**Items**//
	public static Item itemdustMist = new com.TS.Itemx.itemdustMist(Ids.v5000ID);
	public static Item itemingotMist = new com.TS.Itemx.itemingotMist(Ids.v5001ID);
	public static Item itemopenStone = new com.TS.Itemx.itemopenStone(Ids.v5002ID);
	public static itemswordComlexMist itemswordComlexMist = new itemswordComlexMist(Ids.v5003ID, CS);
	public static Item itemenderedstone = new itemenderedstone(Ids.v5004ID);
	public static Item itemendereyestone = new itemendereyestone(Ids.v5005ID);
	public static Item itemenergizedendereyestone = new itemenergizedendereyestone(Ids.v5006ID);
	public static Item itemdimrod = new itemdimrod(Ids.v5007ID);
	public static Item itemadvancesigil = new itemadvancesigil(Ids.v5008ID);
	public static Item itemnitorium = new com.TS.Itemx.itemnitorium(Ids.v5009ID);
	public static Item itemAmethystChestplate = new itemAmethystChestplate(Ids.v5010ID,AmethystArmor,5,1);
	public static Item itemAmethystBoots = new itemAmethystBoots(Ids.v5011ID,AmethystArmor,5,3);
	public static Item itemAmethystLeggings = new itemAmethystLeggings(Ids.v5012ID,AmethystArmor,5,2);
	public static Item itemAmethystHelmet = new itemAmethystHelmet(Ids.v5013ID,AmethystArmor,5,0);
	public static Item itemgoldenbread = new itemgoldenbread(Ids.v5014ID, 4, 1.2F, false);
	public static ItemXpickaxe itemmistpickaxe = new itemmistpickaxe(Ids.v5015ID, Mist);
	public static ItemXaxe itemmistaxe = new itemmistaxe(Ids.v5016ID, Mist);
	public static ItemXsword itemmistsword = new itemmistsword(Ids.v5017ID, Mist);
	public static ItemXhoe itemmisthoe = new itemmisthoe(Ids.v5018ID, Mist);
	public static ItemXspade itemmistspade = new itemmistspade(Ids.v5019ID, Mist);
	public static Item itemingotdarkiron = new itemingotdarkiron(Ids.v5020ID);
	public static Item itemswordComlexbottomcore = new itemswordComlexbottomcore(Ids.v5021ID);
	public static Item itemswordComlextopcore = new itemswordComlextopcore(Ids.v5022ID);
	public static Item itemtainquartz = new itemtainquartz(Ids.v5023ID);
	public static Item itemmistdiamond = new itemmistdiamond(Ids.v5024ID);
	public static Item itembluegem = new itembluegem(Ids.v5025ID);
	public static Item itemblueingot = new itemblueingot(Ids.v5026ID);
	public static Item itemredgem = new itemredgem(Ids.v5027ID);
	public static Item itemredingot = new itemredingot(Ids.v5028ID);
	
	
	
	
	
	
	
	
	
	@EventHandler 
	public void load (FMLPreInitializationEvent event){
	
		//Blocks 
		
		GameRegistry.registerBlock(blockoreMist, "Mist Ore");
		LanguageRegistry.addName(blockoreMist, "Mist Ore");
		
		GameRegistry.registerBlock(blockmistglass, "Mist Glass");
		LanguageRegistry.addName(blockmistglass, "Mist Glass");

		GameRegistry.registerBlock(blockairritual, "Airred Stone");
		LanguageRegistry.addName(blockairritual, "Airred Stone");
		
		GameRegistry.registerBlock(blockelectriclightidle, "Electric Lamp");
		LanguageRegistry.addName(blockelectriclightidle, "Electric Lamp");
		
		GameRegistry.registerBlock(blockmachineframe, "Machine Frame");
		LanguageRegistry.addName(blockmachineframe, "Machine Frame");
		
		GameRegistry.registerBlock(blockenderflower, "Ender Flower");
		LanguageRegistry.addName(blockenderflower, "Ender Flower");
		
		GameRegistry.registerBlock(blocktaintleaves, "Tainted Leaves");
		LanguageRegistry.addName(blocktaintleaves, "Tainted Leaves");
		
		GameRegistry.registerBlock(blocktaintlog, "Tainted Log");
		LanguageRegistry.addName(blocktaintlog, "Tainted Log");
		
		GameRegistry.registerBlock(blocktaintsapling, "Tainted Sapling");
		LanguageRegistry.addName(blocktaintsapling, "Tainted Sapling");
		
		GameRegistry.registerBlock(blocktainquartzchiseled, "Tainted Quartz Chiseled");
		LanguageRegistry.addName(blocktainquartzchiseled, "Tainted Quartz Chiseled");
		
		GameRegistry.registerBlock(blocktainquartzpillar, "Tainted Quartz Pillar");
		LanguageRegistry.addName(blocktainquartzpillar, "Tainted Quartz Pillar");
		
		GameRegistry.registerBlock(blockblueore, "Blue Ore");
		LanguageRegistry.addName(blockblueore, "Blue Ore");

		GameRegistry.registerBlock(blockmachinecpu, "Machine CPU");
		LanguageRegistry.addName(blockmachinecpu, "Machine CPU");
		
		GameRegistry.registerBlock(blockbluebrick, "Blue Brick");
		LanguageRegistry.addName(blockbluebrick, "Blue Brick");
		
		GameRegistry.registerBlock(blockredore, "Red Ore");
		LanguageRegistry.addName(blockredore, "Red Ore");
		
		GameRegistry.registerBlock(blockbluebrick, "Red Brick");
		LanguageRegistry.addName(blockbluebrick, "Red Brick");

		GameRegistry.registerBlock(blockqgen, "Q_Gen");
		LanguageRegistry.addName(blockqgen, "Q_Gen");

		GameRegistry.registerBlock(blockngen, "N_Gen");
		LanguageRegistry.addName(blockngen, "N_Gen");

		GameRegistry.registerBlock(blockenergyblue, "Energized Blue Brick");
		LanguageRegistry.addName(blockenergyblue, "Energized Blue Brick");

		GameRegistry.registerBlock(blockenergyred, "Energized Red Brick");
		LanguageRegistry.addName(blockenergyred, "Energized Red Brick");
		
		GameRegistry.registerBlock(blockbluemachineidle, "Blue Machine");
		LanguageRegistry.addName(blockbluemachineidle, "Blue Machine");
		
		
		
		//Items
		
		LanguageRegistry.addName(itemingotMist, "Mist Ingot");
		LanguageRegistry.addName(itemdustMist, "Mist Dust");
		LanguageRegistry.addName(itemopenStone, "Open Stone");
		LanguageRegistry.addName(itemswordComlexMist, "Comlex Mist");
		LanguageRegistry.addName(itemenderedstone, "Endered Stone");
		LanguageRegistry.addName(itemendereyestone, "Endered Eye Stone");
		LanguageRegistry.addName(itemenergizedendereyestone, "Energized Endered Eye Stone");
		LanguageRegistry.addName(itemdimrod, "DIM Rod");
		LanguageRegistry.addName(itemadvancesigil, "Advance Sigil");
		LanguageRegistry.addName(itemnitorium, "Nitorium");
		LanguageRegistry.addName(itemAmethystBoots, "Amethyst Boots");
		LanguageRegistry.addName(itemAmethystChestplate, "Amethyst Chestplate");
		LanguageRegistry.addName(itemAmethystHelmet, "Amethyst Helmet");
		LanguageRegistry.addName(itemAmethystLeggings, "Amethyst Leggings");
		LanguageRegistry.addName(itemgoldenbread, "Golden Bread");
		LanguageRegistry.addName(itemmistaxe, "Mist Axe");
		LanguageRegistry.addName(itemmisthoe, "Mist Hoe");
		LanguageRegistry.addName(itemmistpickaxe, "Mist Pickaxe");
		LanguageRegistry.addName(itemmistspade, "Mist Shovel");
		LanguageRegistry.addName(itemmistsword, "Mist Sword");
		LanguageRegistry.addName(itemswordComlexbottomcore, "Comlex Bottom Core");
		LanguageRegistry.addName(itemswordComlextopcore, "Comlex Top Core");
		LanguageRegistry.addName(itemingotdarkiron, "Dark Iron Ingot");
		LanguageRegistry.addName(itemtainquartz, "Tainted Quartz");
		LanguageRegistry.addName(itembluegem, "Blue Gem");
		LanguageRegistry.addName(itemblueingot, "Blue Ingot");
		LanguageRegistry.addName(itemredgem, "Red Gem");
		LanguageRegistry.addName(itemredingot, "Red Ingot");
		LanguageRegistry.addName(itemmistdiamond, "Mist Diamond");
		
		
		
		
		
		
		RenderingRegistry.addNewArmourRendererPrefix("AmethystArmor");
		GameRegistry.registerWorldGenerator(new Worldgen());
		GameRegistry.addBiome(new BiomeTainted(5));
		//GameRegistry.registerWorldGenerator(new );
		//Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(itemingotMist, 1) ,
				new Object[] {
			new ItemStack(itemdustMist),new ItemStack(Item.ghastTear), new ItemStack(Item.ingotIron)});
		GameRegistry.addRecipe(new ItemStack(itemopenStone,1), new Object[]{
			"#T#",
			"TdT",
			"#T#",
			'T',itemingotMist,'#',Item.ghastTear,'d',Item.diamond
			});
		GameRegistry.addRecipe(new ItemStack(itemendereyestone,1), new Object[]{
			"RDR",
			"BEB",
			"GSG",
			'D',Item.redstoneRepeater,'R',Item.netherStar,'B',Item.blazePowder,'G',Item.ghastTear,'E',mainClass.itemenderedstone,'S',Item.slimeBall
			});
		GameRegistry.addRecipe(new ItemStack(itemdimrod,1), new Object[]{
			"O",
			"O",
			'O',Block.obsidian
			});
		GameRegistry.addRecipe(new ItemStack(blockmistglass,8), new Object[]{
			"GOG",
			"O#O",
			"GOG",
			'O',Block.obsidian, 'G',Block.glass
			});
		GameRegistry.addRecipe(new ItemStack(itemadvancesigil,1), new Object[]{
			"#O#",
			"OGO",
			"#O#",
			'O',Block.obsidian, 'G',Item.ghastTear
			});
		GameRegistry.addRecipe(new ItemStack(itemmistpickaxe,1), new Object[]{
			"TTT",
			" Y ",
			" Y ",
			'T',itemingotMist,'Y',Item.stick
			});
		GameRegistry.addRecipe(new ItemStack(itemingotdarkiron,1), new Object[]{
			"#O#",
			"DAD",
			"#I#",
			'O',Block.obsidian, 'A',itemadvancesigil , 'D',itemdustMist ,'I',Item.ingotIron
			});
		GameRegistry.addRecipe(new ItemStack(itemingotdarkiron,1), new Object[]{
			"#I#",
			"DAD",
			"#O#",
			'O',Block.obsidian, 'A',itemadvancesigil , 'D',itemdustMist ,'I',Item.ingotIron
			});
		GameRegistry.addRecipe(new ItemStack(itemswordComlextopcore,1), new Object[]{
			"DDD",
			"ONO",
			"#S#",
			'O',Block.obsidian, 'D',itemingotdarkiron,'N',itemnitorium,'S',Item.stick,
			});
		GameRegistry.addRecipe(new ItemStack(itemswordComlexbottomcore,1), new Object[]{
			"DDD",
			"OSI",
			"OSA",
			'O',Block.obsidian, 'D',itemingotdarkiron,'A',Item.slimeBall,'S',Item.stick,'I',itemdimrod,
			});
		GameRegistry.addRecipe(new ItemStack(itemswordComlextopcore,1), new Object[]{
			"DDD",
			"ONO",
			"#S#",
			'O',Block.obsidian, 'D',itemingotdarkiron,'N',itemnitorium,'S',Item.stick,
			});
		GameRegistry.addRecipe(new ItemStack(itemswordComlexMist,1), new Object[]{
			"ETE",
			"APA",
			"GBG",
			'O',Block.obsidian, 'E',Item.enchantedBook,'T',itemswordComlextopcore,'B',itemswordComlexbottomcore,'A',itemadvancesigil,'P',itemenergizedendereyestone,'G',itemdimrod
			});
		GameRegistry.addRecipe(new ItemStack(itemtainquartz,32), new Object[]{
			"OCO",
			"CQC",
			"OCO",
			'O',Block.obsidian, 'C',Item.coal,'Q',Item.netherQuartz
			});

			GameRegistry.addRecipe(new ItemStack(itemmistsword,1), new Object[]{
			" T ",
			" T ",
			" Y ",
			'T',itemingotMist,'Y',Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(itemmistaxe,1), new Object[]{
			"TT ",
			"TY ",
			" Y ",
			'T',itemingotMist,'Y',Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(itemmisthoe,1), new Object[]{
			"TT ",
			" Y ",
			" Y ",
			'T',itemingotMist,'Y',Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(itemmistspade,1), new Object[]{
			" T ",
			" Y ",
			" Y ",
			'T',itemingotMist,'Y',Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(itemgoldenbread,1, 0), new Object[]{
				"GGG",
				"WWW",
				"GGG",
				'W',Item.wheat, 'G',Item.ingotGold
				});
			GameRegistry.addRecipe(new ItemStack(itemgoldenbread,1, 1), new Object[]{
				"DAD",
				"WWW",
				"GGG",
				'W',Item.wheat, 'G',Item.ghastTear,'D',Item.diamond,'A',itemadvancesigil
				});
			GameRegistry.addRecipe(new ItemStack(blockmachineframe), new Object[]{
					"III",
					"IAI",
					"III",
					'I',itemingotMist,'A',itemadvancesigil
					});
			
			GameRegistry.addRecipe(new ItemStack(blockbluebrick,1), new Object[]{
				"II",
				"II",
				'I',itemblueingot,
				});
			
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 1) ,
				new Object[] {
			new ItemStack(Item.ingotGold),new ItemStack(Item.ingotGold),new ItemStack(Item.ingotGold),new ItemStack(Item.ingotGold), new ItemStack(itemopenStone, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 1) ,
				new Object[] {
			new ItemStack(Item.ingotIron),new ItemStack(Item.ingotIron),new ItemStack(Item.ingotIron),new ItemStack(Item.ingotIron), new ItemStack(itemopenStone, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 1) ,
				
				new Object[] {
			new ItemStack(Item.ingotIron, 8), new ItemStack(itemopenStone, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 4) ,
				new Object[] {
			new ItemStack(Item.diamond, 1), new ItemStack(itemopenStone, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 4) ,
				new Object[] {
			new ItemStack(Item.enderPearl, 1), new ItemStack(itemopenStone, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 8) ,
				new Object[] {
			new ItemStack(Item.ingotGold, 1), new ItemStack(itemopenStone, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(mainClass.itemenderedstone) ,
				new Object[] {
			new ItemStack(Item.ghastTear), new ItemStack(itemopenStone), new ItemStack(Item.enderPearl)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(mainClass.blockairritual, 4) ,
				new Object[] {
			new ItemStack(Item.clay), new ItemStack(Item.silk), new ItemStack(Block.stone)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(mainClass.blockairritual, 16) ,
				new Object[] {
			new ItemStack(Block.blockClay), new ItemStack(Block.cloth), new ItemStack(Block.stoneBrick)});

		GameRegistry.addShapelessRecipe(new ItemStack(mainClass.itemmistdiamond) ,
				new Object[] {
			new ItemStack(Item.ghastTear), new ItemStack(Item.diamond), new ItemStack(itemdustMist)});
		
		
		
		{FurnaceRecipes.smelting().addSmelting(blockoreMist.blockID, 0, new ItemStack(itemdustMist), 0.1F);}
		{FurnaceRecipes.smelting().addSmelting(itemendereyestone.itemID, 0, new ItemStack(itemenergizedendereyestone), 3.8F);}
		{FurnaceRecipes.smelting().addSmelting(Item.enderPearl.itemID, 0, new ItemStack(itemnitorium), 0.1F);}
		{FurnaceRecipes.smelting().addSmelting(itembluegem.itemID, 0, new ItemStack(itemblueingot), 0.1F);}
	}

			
	@EventHandler
	public void load (FMLInitializationEvent event){
    	for(int i = 0;i < 1;i++){
    		System.out.println("This is Trio Sphere");
    		}
    	
		}
	
}
