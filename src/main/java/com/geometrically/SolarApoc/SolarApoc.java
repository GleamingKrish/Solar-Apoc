package com.geometrically.SolarApoc;

import com.geometrically.SolarApoc.proxy.CommonProxy;
import com.geometrically.SolarApoc.util.SAConfiguration;
import com.geometrically.SolarApoc.util.WorldTickHandler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import scala.reflect.io.File;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class SolarApoc {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	

	 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new WorldTickHandler());
		
		SAConfiguration.config = new Configuration(event.getSuggestedConfigurationFile());
		SAConfiguration.syncConfig();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}