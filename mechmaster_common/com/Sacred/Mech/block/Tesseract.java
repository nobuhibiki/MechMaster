package com.Sacred.Mech.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.Sacred.Mech.lib.Strings;

public class Tesseract extends BlockMM {
	public Tesseract(int id) {
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
<<<<<<< HEAD
		this.setUnlocalizedName(Strings.TESSERACT_NAME);
	}
=======
		this.setUnlocalizedName("Tesseract"); //Added
	}	// You needed to add a name to your block
		// Watch tutorial 4 and 6
>>>>>>> 9157bbc4d3e273c559da25d4c2641c67e697f8f5

}
