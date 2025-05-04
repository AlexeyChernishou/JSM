package com.jsm.block;

import com.jsm.JSM;

import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;

public class BlockBaseOre extends BlockOre {
	
	public BlockBaseOre(String id, float hardness, float resistance, int harvestLevel) {
		
		this.setRegistryName(JSM.MOD_ID, id);
		this.setTranslationKey(JSM.MOD_ID + "." + id);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setSoundType(SoundType.STONE);
		
	}

}