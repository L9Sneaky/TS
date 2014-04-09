package com.TS.Blockx;

import java.awt.List;
import java.util.Random;

import com.TS.mainPackage.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class blockenderflower extends Block implements IPlantable {

	public blockenderflower(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setUnlocalizedName("blockenderflower");
		this.setCreativeTab(mainClass.TSTab);
		this.setStepSound(soundGrassFootstep);
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		return null;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z) {
		return blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z) {
		return 0;
	}
	
	public boolean canThisBlockAt(World par1World, int par2, int par3, int par4){
		return super.canPlaceBlockAt(par1World, par2 , par3 , par4) && canBlockStay(par1World ,par2, par3, par4);
		
	}
	protected boolean canThisPlantGrowOnThisBlockID(int par1){
		return par1 == Block.whiteStone.blockID ;
	}
	public boolean isOpaqueCube(){
		return false;
	}
	public boolean renderAsNormalBlock(){
		return false;
	}
	public int getRenderType(){
		return 1;
	}
	public void uptadeTick(World par1World, int par2, int par3, int par4, Random par5Random){
		this.checkFlowerChange(par1World ,par2, par3, par4);
	}
	protected final void checkFlowerChange(World par1World, int par2, int par3, int par4){
		if(!this.canBlockStay(par1World, par2, par3, par4)){
			this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
		par1World.setBlock(par2, par3, par4, 0 , 0 , 2);
		}
	}
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5){
		super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
		this.checkFlowerChange(par1World, par2, par3, par4);
	}
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.enderPearl.itemID;
    }
	public int quantityDropped(Random par2Random){
		return 1 - 2;
	}
	
	public void registerIcons(IconRegister IR) {
		blockIcon = IR.registerIcon("Testing:blockenderflower");
		
	}
	public AxisAlignedBB getCollisionBouningBoxFromPool(World par1World, int i , int j, int k){
		return null;
		
	}
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("WIP");
		
	}
	
}
