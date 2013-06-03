package com.Sacred.Mech;

import com.Sacred.Mech.block.ModBlocks;
import com.Sacred.Mech.core.handler.LocalizationHandler;
import com.Sacred.Mech.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
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
		serverSideRequired = false,
		clientSideRequired = true
		)

public class MechMaster {

	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		
		LocalizationHandler.loadLanguages(); // LocalizationHandler needs to run before ModBlocks
		
		ModBlocks.BlocksInit(); // Switched the LocilzationHandler and ModBlocks
	}
	
	@Init
	public void Init(FMLInitializationEvent event){
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
