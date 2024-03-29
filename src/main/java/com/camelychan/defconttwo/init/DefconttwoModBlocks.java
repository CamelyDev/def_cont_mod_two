
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.camelychan.defconttwo.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.camelychan.defconttwo.block.VerumOreBlock;
import com.camelychan.defconttwo.block.VerumBlockBlock;
import com.camelychan.defconttwo.block.TenebrisOreBlock;
import com.camelychan.defconttwo.block.TenebrisBlockBlock;
import com.camelychan.defconttwo.block.RoburOreBlock;
import com.camelychan.defconttwo.block.RoburBlockBlock;
import com.camelychan.defconttwo.block.ObservantiaOreBlock;
import com.camelychan.defconttwo.block.ObservantiaBlockBlock;
import com.camelychan.defconttwo.block.LuxOreBlock;
import com.camelychan.defconttwo.block.LuxBlockBlock;
import com.camelychan.defconttwo.block.InfernumOreBlock;
import com.camelychan.defconttwo.block.InfernumBlockBlock;
import com.camelychan.defconttwo.block.CobaltiumOreBlock;
import com.camelychan.defconttwo.block.CobaltiumBlockBlock;
import com.camelychan.defconttwo.block.CalumniaOreBlock;
import com.camelychan.defconttwo.block.CalumniaBlockBlock;
import com.camelychan.defconttwo.block.BasisOreBlock;
import com.camelychan.defconttwo.block.BasisBlockBlock;
import com.camelychan.defconttwo.block.AdstutusOreBlock;
import com.camelychan.defconttwo.block.AdstutusBlockBlock;
import com.camelychan.defconttwo.block.AbnormisOreBlock;
import com.camelychan.defconttwo.block.AbnormisBlockBlock;
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
	public static Block CALUMNIA_ORE;
	public static Block CALUMNIA_BLOCK;
	public static Block LUX_ORE;
	public static Block LUX_BLOCK;
	public static Block TENEBRIS_ORE;
	public static Block TENEBRIS_BLOCK;
	public static Block ABNORMIS_ORE;
	public static Block ABNORMIS_BLOCK;
	public static Block BASIS_ORE;
	public static Block BASIS_BLOCK;
	public static Block INFERNUM_ORE;
	public static Block INFERNUM_BLOCK;
	public static Block COBALTIUM_ORE;
	public static Block COBALTIUM_BLOCK;

	public static void load() {
		ADSTUTUS_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "adstutus_ore"), new AdstutusOreBlock());
		ADSTUTUS_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "adstutus_block"), new AdstutusBlockBlock());
		OBSERVANTIA_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "observantia_ore"), new ObservantiaOreBlock());
		OBSERVANTIA_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "observantia_block"), new ObservantiaBlockBlock());
		ROBUR_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "robur_ore"), new RoburOreBlock());
		ROBUR_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "robur_block"), new RoburBlockBlock());
		VERUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "verum_ore"), new VerumOreBlock());
		VERUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "verum_block"), new VerumBlockBlock());
		CALUMNIA_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "calumnia_ore"), new CalumniaOreBlock());
		CALUMNIA_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "calumnia_block"), new CalumniaBlockBlock());
		LUX_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "lux_ore"), new LuxOreBlock());
		LUX_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "lux_block"), new LuxBlockBlock());
		TENEBRIS_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "tenebris_ore"), new TenebrisOreBlock());
		TENEBRIS_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "tenebris_block"), new TenebrisBlockBlock());
		ABNORMIS_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "abnormis_ore"), new AbnormisOreBlock());
		ABNORMIS_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "abnormis_block"), new AbnormisBlockBlock());
		BASIS_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "basis_ore"), new BasisOreBlock());
		BASIS_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "basis_block"), new BasisBlockBlock());
		INFERNUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "infernum_ore"), new InfernumOreBlock());
		INFERNUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "infernum_block"), new InfernumBlockBlock());
		COBALTIUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "cobaltium_ore"), new CobaltiumOreBlock());
		COBALTIUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(DefconttwoMod.MODID, "cobaltium_block"), new CobaltiumBlockBlock());
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
		CalumniaOreBlock.clientInit();
		CalumniaBlockBlock.clientInit();
		LuxOreBlock.clientInit();
		LuxBlockBlock.clientInit();
		TenebrisOreBlock.clientInit();
		TenebrisBlockBlock.clientInit();
		AbnormisOreBlock.clientInit();
		AbnormisBlockBlock.clientInit();
		BasisOreBlock.clientInit();
		BasisBlockBlock.clientInit();
		InfernumOreBlock.clientInit();
		InfernumBlockBlock.clientInit();
		CobaltiumOreBlock.clientInit();
		CobaltiumBlockBlock.clientInit();
	}
}
