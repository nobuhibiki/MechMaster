package com.Sacred.Mech.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block Tesseract;
	public static void BlocksInit(){
		Tesseract = new Tesseract(3895);
		
		GameRegistry.registerBlock(Tesseract);
	}
}
