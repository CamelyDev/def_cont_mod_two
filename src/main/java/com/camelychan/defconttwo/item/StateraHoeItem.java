
package com.camelychan.defconttwo.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import com.camelychan.defconttwo.init.DefconttwoModItems;

public class StateraHoeItem extends HoeItem {
	public StateraHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DefconttwoModItems.STATERA_GEM));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
