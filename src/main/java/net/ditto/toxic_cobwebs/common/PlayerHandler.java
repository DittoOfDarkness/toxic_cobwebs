package net.ditto.toxic_cobwebs.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWeb;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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
		Block block = event.getEntity().getEntityWorld().getBlockState(event.getEntity().getPosition()).getBlock();
		if (block instanceof BlockWeb)
		{
			if(!event.getEntityLiving().isPotionActive(Potion.getPotionById(19)))
			{
				event.getEntityLiving().addPotionEffect(new PotionEffect(Potion.getPotionById(19), 50, 0, false, false));
			}
		}
	}
}
