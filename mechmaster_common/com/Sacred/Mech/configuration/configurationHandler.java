package com.Sacred.Mech.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.Sacred.Mech.lib.BlockIds;
import com.Sacred.Mech.lib.ItemIds;
import com.Sacred.Mech.lib.Reference;
import com.Sacred.Mech.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class configurationHandler {
	public static Configuration config;
	
	public static void init(File file){
		config = new Configuration(file);
		
		try{
			config.load();
			
			//Blocks
			BlockIds.TESSERACT_ID = config.getBlock(Strings.TESSERACT_NAME, BlockIds.TESSERACT_ID_DEFAULT).getInt(BlockIds.TESSERACT_ID_DEFAULT);
			BlockIds.TESSERACT_ORE_ID = config.getBlock(Strings.TESSERACT_ORE_NAME, BlockIds.TESSERACT_ORE_ID_DEFAULT).getInt(BlockIds.TESSERACT_ORE_ID_DEFAULT);
			
			//Items
			ItemIds.LEATHER_MITT_ID = config.getItem(Strings.LEATHER_MITT_NAME, ItemIds.LEATHER_MITT_ID_DEFAULT).getInt(ItemIds.LEATHER_MITT_ID_DEFAULT);
			ItemIds.TESSERACT_MITT_ID = config.getItem(Strings.TESSERACT_MITT_NAME, ItemIds.TESSERACT_MITT_ID_DEFAULT).getInt(ItemIds.TESSERACT_MITT_ID_DEFAULT);
			ItemIds.TESSERACT_SHARD_ID = config.getItem(Strings.TESSERACT_SHARD_NAME, ItemIds.TESSERACT_SHARD_ID_DEFAULT).getInt(ItemIds.TESSERACT_SHARD_ID_DEFAULT);
			ItemIds.TESSERACT_MK1_ID = config.getItem(Strings.TESSERACT_MK1_NAME, ItemIds.TESSERACT_MK1_ID_DEFAULT).getInt(ItemIds.TESSERACT_MK1_ID_DEFAULT);
		}
		
		catch(Exception e){
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Problem Loading the Config File");
		}
		finally{
			config.save();
		}
		
	}
}
