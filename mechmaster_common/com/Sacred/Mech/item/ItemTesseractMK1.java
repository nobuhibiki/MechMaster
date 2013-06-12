package com.Sacred.Mech.item;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.lib.Strings;

public class ItemTesseractMK1 extends ItemMM {

	public ItemTesseractMK1(int id) {
		super(id);
		this.setCreativeTab(MechMaster.TabMM);
		this.setUnlocalizedName(Strings.TESSERACT_MK1_NAME);
	}

}
