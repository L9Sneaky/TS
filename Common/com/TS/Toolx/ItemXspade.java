package com.TS.Toolx;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

public class ItemXspade extends ItemTool
{
    /** an array of the blocks this spade is effective against */
    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};

    public ItemXspade(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, 1.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }
}
