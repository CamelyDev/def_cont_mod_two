package com.camelychan.defconttwo.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.crafting.RepairItemRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.CraftingContainer;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import com.camelychan.defconttwo.init.DefconttwoModItems;

@Mixin(RepairItemRecipe.class)
public abstract class DefconttwoModRepairItemRecipeMixin {
	@Inject(method = "assemble", at = @At("HEAD"), cancellable = true)
	public void assemble(CraftingContainer craftingContainer, CallbackInfoReturnable<ItemStack> cir) {
		ItemStack itemStack3;
		ItemStack itemStack;
		ArrayList<ItemStack> list = Lists.newArrayList();
		for (int i = 0; i < craftingContainer.getContainerSize(); ++i) {
			ItemStack itemStack2;
			itemStack = craftingContainer.getItem(i);
			if (itemStack.isEmpty())
				continue;
			list.add(itemStack);
		}
		if ((itemStack3 = (ItemStack) list.get(0)).is((DefconttwoModItems.TOTALIS_GEM))) {
			cir.setReturnValue(ItemStack.EMPTY);
		}
		if ((itemStack3 = (ItemStack) list.get(0)).is((DefconttwoModItems.STATERA_GEM))) {
			cir.setReturnValue(ItemStack.EMPTY);
		}
	}
}
