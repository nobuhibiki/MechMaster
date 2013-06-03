package com.Sacred.Mech.core.handler;

import com.Sacred.Mech.core.helper.LocalizationHelper;
import com.Sacred.Mech.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	public static void loadLanguages(){
		for(String LocationFile: Localizations.localeFiles){
			LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocaleFromfileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
		}
	}
}
