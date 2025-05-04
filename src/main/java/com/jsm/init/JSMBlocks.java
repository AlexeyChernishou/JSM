package com.jsm.init;

import com.jsm.block.BlockBase;
import com.jsm.block.BlockBaseOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JSMBlocks {
	
	public static final Block COPPER_ORE = new BlockBaseOre("copper_ore", 3.0F, 5.0F, 1);
	public static final Block COPPER_BLOCK = new BlockBase(Material.IRON, SoundType.METAL, "copper_block", 5.0F, 10.0F, "pickaxe", 1);
	
	public static void init() {
		
		registerBlock(COPPER_ORE);
		registerBlock(COPPER_BLOCK);
		
	}
	
	public static void initModels() {
		
		registerModel(COPPER_ORE);
		registerModel(COPPER_BLOCK);
		
	}
	
	private static void registerBlock(Block block) {
		
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerModel(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}

}