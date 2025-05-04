package com.jsm.block;

import com.jsm.JSM;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
	
	public BlockBase(Material material, SoundType soundType, String id, float hardness, float resistance, String toolClass, int harvestLevel) {
		
		super(material);
		
		this.setSoundType(soundType);
		this.setRegistryName(JSM.MOD_ID, id);
		this.setTranslationKey(JSM.MOD_ID + "." + id);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel(toolClass, harvestLevel);
		
	}

}