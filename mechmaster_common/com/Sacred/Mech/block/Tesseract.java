package com.Sacred.Mech.block;

import net.minecraft.block.material.Material;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.lib.Strings;

public class Tesseract extends BlockMM {
	public Tesseract(int id) {
		super(id, Material.rock);
		this.setCreativeTab(MechMaster.TabMM);
		this.setUnlocalizedName(Strings.TESSERACT_NAME);
	}

}
