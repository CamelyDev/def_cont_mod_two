
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.camelychan.defconttwo.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.camelychan.defconttwo.item.VerumItem;
import com.camelychan.defconttwo.item.TotalisGemItem;
import com.camelychan.defconttwo.item.RoburItem;
import com.camelychan.defconttwo.item.ObservantiaItem;
import com.camelychan.defconttwo.item.AdstutusItem;
import com.camelychan.defconttwo.DefconttwoMod;

public class DefconttwoModItems {
	public static Item ADSTUTUS;
	public static Item ADSTUTUS_ORE;
	public static Item ADSTUTUS_BLOCK;
	public static Item OBSERVANTIA;
	public static Item OBSERVANTIA_ORE;
	public static Item OBSERVANTIA_BLOCK;
	public static Item ROBUR;
	public static Item ROBUR_ORE;
	public static Item ROBUR_BLOCK;
	public static Item VERUM;
	public static Item VERUM_ORE;
	public static Item VERUM_BLOCK;
	public static Item TOTALIS_GEM;

	public static void load() {
		ADSTUTUS = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "adstutus"), new AdstutusItem());
		ADSTUTUS_ORE = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "adstutus_ore"),
				new BlockItem(DefconttwoModBlocks.ADSTUTUS_ORE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		ADSTUTUS_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "adstutus_block"),
				new BlockItem(DefconttwoModBlocks.ADSTUTUS_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		OBSERVANTIA = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "observantia"), new ObservantiaItem());
		OBSERVANTIA_ORE = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "observantia_ore"),
				new BlockItem(DefconttwoModBlocks.OBSERVANTIA_ORE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		OBSERVANTIA_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "observantia_block"),
				new BlockItem(DefconttwoModBlocks.OBSERVANTIA_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		ROBUR = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "robur"), new RoburItem());
		ROBUR_ORE = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "robur_ore"),
				new BlockItem(DefconttwoModBlocks.ROBUR_ORE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		ROBUR_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "robur_block"),
				new BlockItem(DefconttwoModBlocks.ROBUR_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		VERUM = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "verum"), new VerumItem());
		VERUM_ORE = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "verum_ore"),
				new BlockItem(DefconttwoModBlocks.VERUM_ORE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		VERUM_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "verum_block"),
				new BlockItem(DefconttwoModBlocks.VERUM_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TOTALIS_GEM = Registry.register(Registry.ITEM, new ResourceLocation(DefconttwoMod.MODID, "totalis_gem"), new TotalisGemItem());
	}
}
