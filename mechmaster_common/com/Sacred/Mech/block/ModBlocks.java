package com.Sacred.Mech.block;

import net.minecraft.block.Block;

import com.Sacred.Mech.lib.BlockIds;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block Tesseract;
	public static void BlocksInit(){
		Tesseract = new Tesseract(BlockIds.TESSERACT_ID);
		
		GameRegistry.registerBlock(Tesseract);
	}
}
