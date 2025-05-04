package com.jsm.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class JSMItems {
	
	public static void init() {
		
	}
	
	public static void initModels() {
		
	}
	
	private static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		
	}
	
	private static void registerModel(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}

}