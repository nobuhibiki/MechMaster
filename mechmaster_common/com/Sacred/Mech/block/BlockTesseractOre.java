package com.Sacred.Mech.block;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.lib.Strings;

import net.minecraft.block.material.Material;

public class BlockTesseractOre extends BlockMM {
	public BlockTesseractOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(MechMaster.TabMM);
		this.setUnlocalizedName(Strings.BLOCK_TESSERACT_ORE_NAME);
	}

}
