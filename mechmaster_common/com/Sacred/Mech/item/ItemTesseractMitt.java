package com.Sacred.Mech.item;

import com.Sacred.Mech.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;

public class ItemTesseractMitt extends ItemMM{
	public ItemTesseractMitt(int id){
		super(id);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName(Strings.TESSERACT_MITT_NAME);
		}
}
