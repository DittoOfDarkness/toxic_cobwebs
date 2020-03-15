package net.ditto.toxic_cobwebs;

import java.util.ArrayList;
import java.util.List;

import net.ditto.toxic_cobwebs.common.PlayerHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = toxic_cobwebs.MOD_ID, name = toxic_cobwebs.MOD_NAME, version = toxic_cobwebs.VERSION)
public class toxic_cobwebs {
	
	public static final String MOD_ID = "toxic_cobwebs";
	public static final String MOD_NAME = "Toxic Cobwebs";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static toxic_cobwebs instance;
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new PlayerHandler());
	}
}