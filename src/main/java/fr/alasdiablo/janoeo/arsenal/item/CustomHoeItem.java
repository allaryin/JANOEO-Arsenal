package fr.alasdiablo.janoeo.arsenal.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class CustomHoeItem extends HoeItem {
    public CustomHoeItem(IItemTier iItemTier, int attackDamageIn, float attackSpeedIn, Properties properties) {
        super(iItemTier, attackDamageIn, attackSpeedIn, properties);
    }
}
