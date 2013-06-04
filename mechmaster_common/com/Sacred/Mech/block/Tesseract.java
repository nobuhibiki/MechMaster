package com.Sacred.Mech.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Tesseract extends BlockMM {
	public Tesseract(int id) {
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("Tesseract"); //Added
	}	// You needed to add a name to your block
		// Watch tutorial 4 and 6

}
