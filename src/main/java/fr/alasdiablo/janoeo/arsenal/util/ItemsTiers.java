package fr.alasdiablo.janoeo.arsenal.util;

import fr.alasdiablo.janoeo.item.IngotsItems;
import fr.alasdiablo.janoeo.tags.ItemsTags;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

public enum ItemsTiers implements IItemTier {
    COPPER(2, 32, 6.0f, 1.5f, 9, Ingredient.fromTag(ItemsTags.Ingots.COPPER)),
    ALUMINIUM(2, 28, 5.0f, 1.0f, 6, Ingredient.fromTag(ItemsTags.Ingots.ALUMINIUM)),
    TIN(2, 30, 5.5f, 1.25f, 7, Ingredient.fromTag(ItemsTags.Ingots.TIN));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ItemsTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Ingredient repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialIn;
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }
}
