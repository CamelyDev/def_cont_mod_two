
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.camelychan.defconttwo.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

import com.camelychan.defconttwo.world.features.ores.VerumOreFeature;
import com.camelychan.defconttwo.world.features.ores.TenebrisOreFeature;
import com.camelychan.defconttwo.world.features.ores.RoburOreFeature;
import com.camelychan.defconttwo.world.features.ores.ObservantiaOreFeature;
import com.camelychan.defconttwo.world.features.ores.LuxOreFeature;
import com.camelychan.defconttwo.world.features.ores.InfernumOreFeature;
import com.camelychan.defconttwo.world.features.ores.CobaltiumOreFeature;
import com.camelychan.defconttwo.world.features.ores.CalumniaOreFeature;
import com.camelychan.defconttwo.world.features.ores.BasisOreFeature;
import com.camelychan.defconttwo.world.features.ores.AdstutusOreFeature;
import com.camelychan.defconttwo.world.features.ores.AbnormisOreFeature;
import com.camelychan.defconttwo.DefconttwoMod;

public class DefconttwoModFeatures {
	public static void load() {
		register("adstutus_ore", AdstutusOreFeature.feature(), AdstutusOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("observantia_ore", ObservantiaOreFeature.feature(), ObservantiaOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("robur_ore", RoburOreFeature.feature(), RoburOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("verum_ore", VerumOreFeature.feature(), VerumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("calumnia_ore", CalumniaOreFeature.feature(), CalumniaOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lux_ore", LuxOreFeature.feature(), LuxOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("tenebris_ore", TenebrisOreFeature.feature(), TenebrisOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("abnormis_ore", AbnormisOreFeature.feature(), AbnormisOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("basis_ore", BasisOreFeature.feature(), BasisOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("infernum_ore", InfernumOreFeature.feature(), InfernumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("cobaltium_ore", CobaltiumOreFeature.feature(), CobaltiumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(DefconttwoMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(DefconttwoMod.MODID, registryName)));
	}
}
