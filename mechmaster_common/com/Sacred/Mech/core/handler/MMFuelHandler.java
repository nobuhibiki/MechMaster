package com.Sacred.Mech.core.handler;

import net.minecraft.item.ItemStack;

import com.Sacred.Mech.item.ModItem;

import cpw.mods.fml.common.IFuelHandler;

public class MMFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == ModItem.TesseractShard.itemID){
			return 2000;
		}
		else return 0;
	}

}
