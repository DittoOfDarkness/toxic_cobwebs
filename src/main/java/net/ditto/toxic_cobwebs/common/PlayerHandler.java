package net.ditto.toxic_cobwebs.common;

import net.ditto.toxic_cobwebs.toxic_cobwebs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWeb;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerHandler 
{
	@SubscribeEvent	
	public void onBlockHarvest(HarvestDropsEvent event)
	{
		if(event.getState().getBlock() == Blocks.WEB)
		{
			if(!event.getHarvester().isPotionActive(Potion.getPotionById(19)))
			{
				event.getHarvester().addPotionEffect(new PotionEffect(Potion.getPotionById(19), 50, 1, false, false));
			}
		}
	}
	
	@SubscribeEvent
	public void onUpdate(LivingUpdateEvent event)
	{
		Entity entity = event.getEntity();
		Block block1 = entity.getEntityWorld().getBlockState(new BlockPos(entity.getPosition())).getBlock();
		
		Block block2 = entity.getEntityWorld().getBlockState(new BlockPos(entity.posX, entity.posY + entity.height, entity.posZ)).getBlock();
		
		if (block1 instanceof BlockWeb || block2 instanceof BlockWeb)
		{
			if(!event.getEntityLiving().isPotionActive(Potion.getPotionById(19)))
			{
				event.getEntityLiving().addPotionEffect(new PotionEffect(Potion.getPotionById(19), 50, 0, false, false));
			}
		}
	}
}
