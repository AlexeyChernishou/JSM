package com.jsm;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = JSM.MOD_ID, name = JSM.MOD_NAME, version = JSM.MOD_VERSION, dependencies = JSM.MOD_DEPENDENCIES, useMetadata = JSM.USE_META, acceptedMinecraftVersions = JSM.MC_VERSION, updateJSON = JSM.UPDATE_URL)
public class JSM {
	
	public static final String MOD_ID = "jsm";
	public static final String MOD_NAME = "JSM";
	public static final String MOD_VERSION = "0.1.0-beta.1";
	public static final String MOD_DEPENDENCIES = "required-after:forge@[14.23.5.2860,)";
	public static final boolean USE_META = true;
	public static final String MC_VERSION = "[1.12.2]";
	public static final String UPDATE_URL = "https://raw.githubusercontent.com/AlexeyChernishou/JSM/refs/heads/main/updates.json";

}