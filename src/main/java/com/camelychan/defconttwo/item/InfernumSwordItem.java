
package com.camelychan.defconttwo.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.camelychan.defconttwo.init.DefconttwoModItems;

public class InfernumSwordItem extends SwordItem {
	public InfernumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 953;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 36;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DefconttwoModItems.INFERNUM_INGOT));
			}
		}, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
