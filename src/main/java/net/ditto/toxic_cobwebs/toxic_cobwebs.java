package net.ditto.toxic_cobwebs;

import java.util.ArrayList;
import java.util.List;

import net.ditto.toxic_cobwebs.common.PlayerHandler;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = toxic_cobwebs.MOD_ID, name = toxic_cobwebs.MOD_NAME, version = toxic_cobwebs.VERSION)
public class toxic_cobwebs {
	
	public static final String MOD_ID = "toxic_cobwebs";
	public static final String MOD_NAME = "Toxic Cobwebs";
	public static final String VERSION = "1.0.1";
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new PlayerHandler());
	}
}