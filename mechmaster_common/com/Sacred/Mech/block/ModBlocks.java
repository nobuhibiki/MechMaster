package com.Sacred.Mech.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Sacred.Mech.lib.BlockIds;
import com.Sacred.Mech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block Tesseract;
	public static Block TesseractOre;
	
	public static void BlocksInit(){
		Tesseract = new Tesseract(BlockIds.TESSERACT_ID);
		TesseractOre = new TesseractOre(BlockIds.TESSERACT_ORE_ID);
		
		
		GameRegistry.registerBlock(Tesseract, Strings.TESSERACT_NAME);
		GameRegistry.registerBlock(TesseractOre, Strings.TESSERACT_ORE_NAME);
		
		
		recipesInit();
		
	}
	public static void recipesInit(){
		GameRegistry.addRecipe(new ItemStack(ModBlocks.Tesseract,1,0), new Object[]{
			"IDI","IEI","IDI",'I',Item.ingotIron, 'D',Item.diamond, 'E',Item.emerald 
		});
	}
}
