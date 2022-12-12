
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.camelychan.defconttwo.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.camelychan.defconttwo.block.VerumOreBlock;
import com.camelychan.defconttwo.block.VerumBlockBlock;
import com.camelychan.defconttwo.block.RoburOreBlock;
import com.camelychan.defconttwo.block.RoburBlockBlock;
import com.camelychan.defconttwo.block.ObservantiaOreBlock;
import com.camelychan.defconttwo.block.ObservantiaBlockBlock;
import com.camelychan.defconttwo.block.AdstutusOreBlock;
import com.camelychan.defconttwo.block.AdstutusBlockBlock;
import com.camelychan.defconttwo.DefconttwoMod;

public class DefconttwoModBlocks {
	public static Block ADSTUTUS_ORE;
	public static Block ADSTUTUS_BLOCK;
	public static Block OBSERVANTIA_ORE;
	public static Block OBSERVANTIA_BLOCK;
	public static Block ROBUR_ORE;
	public static Block ROBUR_BLOCK;
	public static Block VERUM_ORE;
	public static Block VERUM_BLOCK;

	public static void load() {
		ADSTUTUS_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "adstutus_ore"), new AdstutusOreBlock());
		ADSTUTUS_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "adstutus_block"), new AdstutusBlockBlock());
		OBSERVANTIA_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "observantia_ore"), new ObservantiaOreBlock());
		OBSERVANTIA_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "observantia_block"),
				new ObservantiaBlockBlock());
		ROBUR_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "robur_ore"), new RoburOreBlock());
		ROBUR_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "robur_block"), new RoburBlockBlock());
		VERUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "verum_ore"), new VerumOreBlock());
		VERUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "verum_block"), new VerumBlockBlock());
	}

	public static void clientLoad() {
		AdstutusOreBlock.clientInit();
		AdstutusBlockBlock.clientInit();
		ObservantiaOreBlock.clientInit();
		ObservantiaBlockBlock.clientInit();
		RoburOreBlock.clientInit();
		RoburBlockBlock.clientInit();
		VerumOreBlock.clientInit();
		VerumBlockBlock.clientInit();
	}
}