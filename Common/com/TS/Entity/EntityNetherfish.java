package com.TS.Entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityNetherfish {
	
//	    private int allySummonCooldown;
//
//	    public EntityNetherfish(World par1World)
//	    {
//	        super(par1World);
//	        this.setSize(0.3F, 0.7F);
//	        this.
//	    }
//
//	   
//		
//
//		protected void applyEntityAttributes()
//	    {
//	        super.applyEntityAttributes();
//	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(8.0D);
//	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(8.9D);
//	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(1.5D);
//	    }
//
//	    /**
//	     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
//	     * prevent them from trampling crops
//	     */
//	    protected boolean canTriggerWalking()
//	    {
//	        return false;
//	    }
//
//	    /**
//	     * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
//	     * (Animals, Spiders at day, peaceful PigZombies).
//	     */
//	    protected Entity findPlayerToAttack()
//	    {
//	        double d0 = 8.0D;
//	        return this.worldObj.getClosestVulnerablePlayerToEntity(this, d0);
//	    }
//
//	    /**
//	     * Returns the sound this mob makes while it's alive.
//	     */
//	    protected String getLivingSound()
//	    {
//	        return "mob.silverfish.say";
//	    }
//
//	    /**
//	     * Returns the sound this mob makes when it is hurt.
//	     */
//	    protected String getHurtSound()
//	    {
//	        return "mob.silverfish.hit";
//	    }
//
//	    /**
//	     * Returns the sound this mob makes on death.
//	     */
//	    protected String getDeathSound()
//	    {
//	        return "mob.silverfish.kill";
//	    }
//
//	    /**
//	     * Called when the entity is attacked.
//	     */
//	    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
//	    {
//	        if (this.isEntityInvulnerable())
//	        {
//	            return false;
//	        }
//	        else
//	        {
//	            if (this.allySummonCooldown <= 0 && (par1DamageSource instanceof EntityDamageSource || par1DamageSource == DamageSource.magic))
//	            {
//	                this.allySummonCooldown = 20;
//	            }
//
//	            return super.attackEntityFrom(par1DamageSource, par2);
//	        }
//	    }
//
//	    /**
//	     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
//	     */
//	    protected void attackEntity(Entity par1Entity, float par2)
//	    {
//	        if (this.attackTime <= 0 && par2 < 2.0F && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY)
//	        {
//	            this.attackTime = 20;
//	            this.attackEntityAsMob(par1Entity);
//	        }
//	        else if (par2 < 30.0F)
//	        {
//	            double d0 = par1Entity.posX - this.posX;
//	            double d1 = par1Entity.boundingBox.minY + (double)(par1Entity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
//	            double d2 = par1Entity.posZ - this.posZ;
//
//	            if (this.attackTime == 0)
//	            {
//	                ++this.field_70846_g;
//
//	                if (this.field_70846_g == 1)
//	                {
//	                    this.attackTime = 60;
//	                    this.func_70844_e(true);
//	                }
//	                else if (this.field_70846_g <= 4)
//	                {
//	                    this.attackTime = 6;
//	                }
//	                else
//	                {
//	                    this.attackTime = 100;
//	                    this.field_70846_g = 0;
//	                    this.func_70844_e(false);
//	                }
//
//	                if (this.field_70846_g > 1)
//	                {
//	                    float f1 = MathHelper.sqrt_float(par2) * 0.5F;
//	                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
//
//	                    for (int i = 0; i < 1; ++i)
//	                    {
//	                        EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
//	                        entitysmallfireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
//	                        this.worldObj.spawnEntityInWorld(entitysmallfireball);
//	                    }
//	                }
//	            }
//
//	            this.rotationYaw = (float)(Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
//	            this.hasAttacked = true;
//	        }
//	    }
//
//	  
//	    protected void playStepSound(int par1, int par2, int par3, int par4)
//	    {
//	        this.playSound("mob.silverfish.step", 0.15F, 1.0F);
//	    }
//
//	    protected int getDropItemId(){
//	        return Item.blazeRod.itemID;}
//	    
//
//	            if (this.entityToAttack == null && !this.hasPath())
//	            {
//	                i = MathHelper.floor_double(this.posX);
//	                j = MathHelper.floor_double(this.posY + 0.5D);
//	                k = MathHelper.floor_double(this.posZ);
//	                int i2 = this.rand.nextInt(6);
//	                l = this.worldObj.getBlockId(i + Facing.offsetsXForSide[i2], j + Facing.offsetsYForSide[i2], k + Facing.offsetsZForSide[i2]);
//
//	                if (BlockSilverfish.getPosingIdByMetadata(l))
//	                {
//	                    this.worldObj.setBlock(i + Facing.offsetsXForSide[i2], j + Facing.offsetsYForSide[i2], k + Facing.offsetsZForSide[i2], Block.silverfish.blockID, BlockSilverfish.getMetadataForBlockType(l), 3);
//	                    this.spawnExplosionParticle();
//	                    this.setDead();
//	                }
//	                else
//	                {
//	                    this.updateWanderPath();
//	                }
//	            }
//	            else if (this.entityToAttack != null && !this.hasPath())
//	            {
//	                this.entityToAttack = null;
//	            }
//	        }
//	    }
//
//	    /**
//	     * Takes a coordinate in and returns a weight to determine how likely this creature will try to path to the block.
//	     * Args: x, y, z
//	     */
//	    public float getBlockPathWeight(int par1, int par2, int par3)
//	    {
//	        return this.worldObj.getBlockId(par1, par2 - 1, par3) == Block.stone.blockID ? 10.0F : super.getBlockPathWeight(par1, par2, par3);
//	    }
//
//	    /**
//	     * Checks to make sure the light is not too bright where the mob is spawning
//	     */
//	    protected boolean isValidLightLevel()
//	    {
//	        return true;
//	    }
//	    
//	    public EnumCreatureAttribute getCreatureAttribute()
//	    {
//	        return EnumCreatureAttribute.ARTHROPOD;
//	    }
//	}
//
//
//
}
