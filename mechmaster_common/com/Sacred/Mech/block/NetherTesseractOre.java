package com.Sacred.Mech.block;

import java.util.Random;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.item.ModItem;
import com.Sacred.Mech.lib.Strings;

import net.minecraft.block.material.Material;

public class NetherTesseractOre extends BlockMM {

	public NetherTesseractOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(MechMaster.TabMM);
		this.setUnlocalizedName(Strings.NETHER_TESSERACT_ORE_NAME);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
	}
	public int quantityDropped(Random par1Random)
    {
            return 3;
    }
	@Override
	public int idDropped(int i, Random rand, int j){
		return ModItem.TesseractShard.itemID;
	}
}
