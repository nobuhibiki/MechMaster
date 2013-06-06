package com.Sacred.Mech.item;

import com.Sacred.Mech.lib.ItemIds;

import net.minecraft.item.Item;

public class ModItem {
	public static Item TesseractMitt;
	
	public static void itemInit(){
		TesseractMitt = new ItemTesseractMitt(ItemIds.TESSERACT_MITT_ID);
	}
}
