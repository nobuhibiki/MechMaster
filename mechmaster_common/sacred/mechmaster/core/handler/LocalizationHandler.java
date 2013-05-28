package sacred.mechmaster.core.handler;

import sacred.mechmaster.core.helper.LocalizationHelper;
import sacred.mechmaster.lib.Localizations;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
    public static void loadLanguages(){
        for(String LocationFile: Localizations.localefiles){
            LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
        }
    }
}