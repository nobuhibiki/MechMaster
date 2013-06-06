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
	public static EnumToolMaterial LeatherMittMaterial;
	
	public static void itemInit(){
		LeatherMittMaterial = EnumHelper.addToolMaterial(Strings.LEATHER_MITT_MATERIAL_NAME, 2, 1000, 10F, 1, 3);
		
		LeatherMitt = new ItemLeatherMitt(ItemIds.LEATHER_MITT_ID, LeatherMittMaterial);
		
		recipesInit();
	}
	public static void recipesInit(){
		
		GameRegistry.addRecipe(new ItemStack(ModItem.LeatherMitt,1,0), new Object[]{
			"ILL","IEL","ILL",'I',Item.ingotIron, 'L',Item.leather, 'E',Item.emerald 
		});
	}
	
}
