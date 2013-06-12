package com.Sacred.Mech.item;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.lib.Strings;


public class ItenTesseractShard extends ItemMM {

	public ItenTesseractShard(int id) {
		super(id);
		this.setCreativeTab(MechMaster.TabMM);
		this.setUnlocalizedName(Strings.TESSERACT_SHARD_NAME);
	}

}
