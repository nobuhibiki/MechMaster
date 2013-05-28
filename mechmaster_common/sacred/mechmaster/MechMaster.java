package sacred.mechmaster;

import sacred.mechmaster.block.ModBlock;
import sacred.mechmaster.core.handler.LocalizationHandler;
import sacred.mechmaster.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
        modid = Reference.MOD_ID, 
        name = Reference.MOD_NAME, 
        version = Reference.VERSION
    )
@NetworkMod(
        serverSideRequired = false,
        clientSideRequired = true
        )

public class MechMaster {

    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        ModBlock.TesseractMK1();
        
        LocalizationHandler.loadLanguages();
    }
    
    @Init
    public void load(FMLInitializationEvent event) {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}