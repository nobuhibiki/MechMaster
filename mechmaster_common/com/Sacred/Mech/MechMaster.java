package com.Sacred.Mech;

import java.io.File;

import com.Sacred.Mech.block.ModBlocks;
import com.Sacred.Mech.configuration.configurationHandler;
import com.Sacred.Mech.core.handler.LocalizationHandler;
import com.Sacred.Mech.core.proxy.CommonProxy;
import com.Sacred.Mech.item.ModItem;
import com.Sacred.Mech.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod( 
		modid = Reference.MOD_ID, 
		name = Reference.MOD_NAME, 
		version = Reference.VERSION
	)

@NetworkMod(
		channels = Reference.CHANNEL_NAME,
		serverSideRequired = false,
		clientSideRequired = true
		)

public class MechMaster {
	
	@SidedProxy(
			clientSide = Reference.CLIENT_PROXY_LOCATION,
			serverSide = Reference.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event){
<<<<<<< HEAD
<<<<<<< HEAD
		LocalizationHandler.loadLanguages();
		
		ModBlocks.BlocksInit();
		ModItem.itemInit();
		
		configurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
=======
		
		LocalizationHandler.loadLanguages(); // LocalizationHandler needs to run before ModBlocks
		
		ModBlocks.BlocksInit(); // Switched the LocilzationHandler and ModBlocks
>>>>>>> 9157bbc4d3e273c559da25d4c2641c67e697f8f5
=======
		
		LocalizationHandler.loadLanguages(); // LocalizationHandler needs to run before ModBlocks
		
		ModBlocks.BlocksInit(); // Switched the LocilzationHandler and ModBlocks
>>>>>>> 9157bbc4d3e273c559da25d4c2641c67e697f8f5
	}
	
	@Init
	public void Init(FMLInitializationEvent event){
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
