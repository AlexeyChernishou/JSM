package com.jsm.init;

import com.jsm.JSM;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JSMCreativeTabs {
	
	public static final CreativeTabs JSM_MAIN = new CreativeTabs(CreativeTabs.getNextID(), JSM.MOD_ID + "." + "main") {
		
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			
			return new ItemStack(Items.STONE_PICKAXE);
			
		}
		
	};
	
	public static void init() {
		
		JSMItems.COPPER_NUGGET.setCreativeTab(JSM_MAIN);
		JSMItems.COPPER_INGOT.setCreativeTab(JSM_MAIN);
		JSMBlocks.COPPER_BLOCK.setCreativeTab(JSM_MAIN);
		JSMBlocks.COPPER_ORE.setCreativeTab(JSM_MAIN);
		
	}

}