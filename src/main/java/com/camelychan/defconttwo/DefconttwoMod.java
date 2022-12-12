/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package com.camelychan.defconttwo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import com.camelychan.defconttwo.init.DefconttwoModItems;
import com.camelychan.defconttwo.init.DefconttwoModFeatures;
import com.camelychan.defconttwo.init.DefconttwoModBlocks;

public class DefconttwoMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "defconttwo";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing DefconttwoMod");

		DefconttwoModBlocks.load();
		DefconttwoModItems.load();

		DefconttwoModFeatures.load();

	}
}
