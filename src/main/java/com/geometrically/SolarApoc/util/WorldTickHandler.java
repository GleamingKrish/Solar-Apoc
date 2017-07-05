package com.geometrically.SolarApoc.util;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;


public class WorldTickHandler {
	
	public static int ticker;
	@SubscribeEvent
	public void onWorldTick(WorldTickEvent handler){
		ticker++;
		System.out.println("tick" + ticker);
		//Tick Checkers
		if (ticker > SAConfiguration.dayoneStart){
			SAMethods.beginDayOne();
		}
		if (ticker > SAConfiguration.daytwoStart){
			SAMethods.beginDayTwo();
		}
		if (ticker > SAConfiguration.daythreeStart){
			SAMethods.beginDayThree();
		}
		if (ticker > SAConfiguration.dayfourStart){
			SAMethods.beginDayFour();
		}
		if (ticker > SAConfiguration.dayfiveStart){
			SAMethods.beginDayFive();
		}
		  printMessages(player);
		
	}
	
	public void printMessages(EntityPlayer player){

		//Message Printers
		if (ticker == SAConfiguration.dayoneStart){
			SAMethods.beginDayOne();
			System.out.println("Day One has started");
			player.addChatComponentMessage(new TextComponentString(TextFormatting.RED + "The Solar Apocalypse has started. Day One will now upbring its wrath."));
		}
		if (ticker == SAConfiguration.daytwoStart){
			SAMethods.beginDayTwo();
			System.out.println("Day Two has started");
			player.addChatComponentMessage(new TextComponentString(TextFormatting.RED + "The Solar Apocalypse's second wave has arrived. Day Two will now upbring its wrath."));
		}
		if (ticker == SAConfiguration.daythreeStart){
			SAMethods.beginDayThree();
			System.out.println("Day Three has started");
			player.addChatComponentMessage(new TextComponentString(TextFormatting.RED + "The Solar Apocalypse's third wave has arrived. Day Three will now upbring its wrath."));
		}
		if (ticker == SAConfiguration.dayfourStart){
			SAMethods.beginDayFour();
			System.out.println("Day Four has started");
			player.addChatComponentMessage(new TextComponentString(TextFormatting.RED + "The Solar Apocalypse's fourth wave has arrived. Day Four will now upbring its wrath."));
		}
		if (ticker == SAConfiguration.dayfiveStart){
			SAMethods.beginDayFive();
			System.out.println("Day Five has started");
			player.addChatComponentMessage(new TextComponentString(TextFormatting.RED + "The Solar Apocalypse's fifth and final wave has arrived. Let's see how long you can survive. "));
			player.addChatComponentMessage(new TextComponentString(TextFormatting.GOLD + "Escape if you can."));
		}
	}
	
}
