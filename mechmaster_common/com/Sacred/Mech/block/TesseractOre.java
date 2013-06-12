package com.Sacred.Mech.block;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.item.ModItem;
import com.Sacred.Mech.lib.Strings;

public class TesseractOre extends BlockMM {
	public TesseractOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(MechMaster.TabMM);
		this.setUnlocalizedName(Strings.TESSERACT_ORE_NAME);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
	}
	@Override
	public int idDropped(int i, Random rand, int j){
		return ModItem.TesseractShard.itemID;
	}
}
