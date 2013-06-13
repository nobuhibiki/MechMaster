package com.Sacred.Mech.block;

import java.util.Random;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.item.ModItem;
import com.Sacred.Mech.lib.Strings;

import net.minecraft.block.material.Material;

public class EndTesseractOre extends BlockMM {

	public EndTesseractOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(MechMaster.TabMM);
		this.setUnlocalizedName(Strings.END_TESSERACT_ORE_NAME);
		this.setHardness(3.0F);
		this.setResistance(1000.0F);
	}
	public int quantityDropped(Random par1Random)
    {
            return 4;
    }
	@Override
	public int idDropped(int i, Random rand, int j){
		return ModItem.TesseractShard.itemID;
	}
}