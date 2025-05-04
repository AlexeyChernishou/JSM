package com.jsm.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class JSMRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(JSMBlocks.COPPER_ORE, new ItemStack(JSMItems.COPPER_INGOT), 0.7F);
		
	}

}