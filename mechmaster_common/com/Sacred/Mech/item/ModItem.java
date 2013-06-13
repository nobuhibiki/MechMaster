package com.Sacred.Mech.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

import com.Sacred.Mech.lib.ItemIds;
import com.Sacred.Mech.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItem {
	public static Item LeatherMitt;
	public static Item TesseractMitt;
	public static Item TesseractShard;
	public static Item TesseractMK1;
	public static EnumToolMaterial LeatherMittMaterial;
	public static EnumToolMaterial TesseractMittMaterial;
	
	public static void itemInit(){
		//Material
		LeatherMittMaterial = EnumHelper.addToolMaterial(Strings.LEATHER_MITT_MATERIAL_NAME, 2, 1000, 10F, 1, 3);
		TesseractMittMaterial = EnumHelper.addToolMaterial(Strings.TESSERACT_MITT_MATERIAL_NAME, 3, 4000, 23F, 3, 5);
		
		//Items
		LeatherMitt = new ItemLeatherMitt(ItemIds.LEATHER_MITT_ID, LeatherMittMaterial);
		TesseractMitt = new ItemTesseractMitt(ItemIds.TESSERACT_MITT_ID, TesseractMittMaterial);
		TesseractShard = new ItemTesseractShard(ItemIds.TESSERACT_SHARD_ID);
		TesseractMK1 = new ItemTesseractMK1(ItemIds.TESSERACT_MK1_ID);
		
		recipesInit();
	}
	public static void recipesInit(){
		
		GameRegistry.addRecipe(new ItemStack(ModItem.LeatherMitt,1,0), new Object[]{
			"ILL","IEL","ILL",'I',Item.ingotIron, 'L',Item.leather, 'E',Item.emerald 
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.TesseractMitt,1,0), new Object[]{
			"TTT","TMT","TTT",'T',ModItem.TesseractShard, 'M',ModItem.LeatherMitt
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.TesseractMK1,1,0), new Object[]{
			"ITI","TDT","ITI",'T',ModItem.TesseractShard, 'I',Item.ingotIron, 'D',Item.diamond
		});
	}
	
}
