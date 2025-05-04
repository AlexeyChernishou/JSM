package com.jsm.item;

import com.jsm.JSM;

import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	public ItemBase(String id) {
		
		this.setRegistryName(JSM.MOD_ID, id);
		this.setTranslationKey(JSM.MOD_ID + "." + id);
		
	}

}