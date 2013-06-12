package com.Sacred.Mech;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.Sacred.Mech.block.ModBlocks;
import com.Sacred.Mech.configuration.configurationHandler;
import com.Sacred.Mech.core.handler.LocalizationHandler;
import com.Sacred.Mech.core.handler.MMFuelHandler;
import com.Sacred.Mech.core.proxy.CommonProxy;
import com.Sacred.Mech.creativeTab.TabMM;
import com.Sacred.Mech.item.ModItem;
import com.Sacred.Mech.lib.Reference;
import com.Sacred.Mech.world.generator.WorldGeneratorMM;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

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
	
	WorldGeneratorMM worldGenerator = new WorldGeneratorMM();
	MMFuelHandler FuelHandler = new MMFuelHandler();
	@SidedProxy(
			clientSide = Reference.CLIENT_PROXY_LOCATION,
			serverSide = Reference.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;

	public static CreativeTabs TabMM = new TabMM(CreativeTabs.getNextID(),Reference.MOD_ID);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		LocalizationHandler.loadLanguages();
		
		configurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
		
		ModItem.itemInit();
		ModBlocks.BlocksInit();
		
		
		GameRegistry.registerWorldGenerator(worldGenerator);
		GameRegistry.registerFuelHandler(FuelHandler);
	}
	
	@Init
	public void Init(FMLInitializationEvent event){
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
