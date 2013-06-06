package com.Sacred.Mech.creativeTab;

import com.Sacred.Mech.item.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMM extends CreativeTabs {
	public TabMM(int id, String name){
		super(id, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack(){
		
		return new ItemStack(ModItem.LeatherMitt,1,0);
	}
}
