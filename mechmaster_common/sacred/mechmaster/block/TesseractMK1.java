package sacred.mechmaster.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TesseractMK1 extends Block {
    public TesseractMK1(int id){
        super(id, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName("TesseractMK1");
    }
    
}