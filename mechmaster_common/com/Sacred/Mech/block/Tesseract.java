package com.Sacred.Mech.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.Sacred.Mech.lib.Strings;

public class Tesseract extends BlockMM {
	public Tesseract(int id) {
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Strings.TESSERACT_NAME);
	}

}
