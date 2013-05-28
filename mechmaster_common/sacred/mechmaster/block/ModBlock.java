package sacred.mechmaster.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlock {
    public static Block TesseractMK1;
    @SuppressWarnings("deprecation")
    public static void TesseractMK1(){
        TesseractMK1 = new TesseractMK1(200);
        
        GameRegistry.registerBlock(TesseractMK1);
    }
    
}
