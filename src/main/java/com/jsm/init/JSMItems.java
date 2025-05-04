package com.jsm.init;

import com.jsm.item.ItemBase;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JSMItems {
	
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
	
	public static void init() {
		
		registerItem(COPPER_INGOT);
		registerItem(COPPER_NUGGET);
		
	}
	
	public static void initModels() {
		
		registerModel(COPPER_INGOT);
		registerModel(COPPER_NUGGET);
		
	}
	
	private static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerModel(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}

}