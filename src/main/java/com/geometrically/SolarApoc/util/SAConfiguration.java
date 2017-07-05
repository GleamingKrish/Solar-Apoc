package com.geometrically.SolarApoc.util;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class SAConfiguration {
	
	public static Configuration config;
	
	public static int dayoneStart;
	public static int daytwoStart;
	public static int daythreeStart;
	public static int dayfourStart;
	public static int dayfiveStart;


	  public static void syncConfig() {
		String category;
		  try {
		      
		        config.load();
	
		        category = "Utility";
				config.addCustomCategoryComment(category, "Utility Settings - Controls when tick counts will be deployed");
				  dayoneStart = config.getInt("dayoneStart", category, 120000, 20, 10000000, "How long until Day 1 of the Solar Apocalypse should start after the world has been created.");
				  daytwoStart = config.getInt("daytwoStart", category, 144000, 20, 10000000, "How long until Day 2 of the Solar Apocalypse should start after the world has been created.");
				  daythreeStart = config.getInt("daythreeStart", category, 168000, 20, 10000000, "How long until Day 3 of the Solar Apocalypse should start after the world has been created.");
				  dayfourStart = config.getInt("dayfourStart", category, 192000, 20, 10000000, "How long until Day 4 of the Solar Apocalypse should start after the world has been created.");
				  dayfiveStart = config.getInt("dayfiveStart", category, 214000, 20, 10000000, "How long until Day 5 of the Solar Apocalypse should start after the world has been created.");
		    } catch (Exception e) {
		       
		    } finally {

		        if (config.hasChanged()) config.save();
		    }
	}
}
