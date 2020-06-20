package fr.alasdiablo.janoeo.arsenal.event;

import fr.alasdiablo.janoeo.arsenal.init.WoolsArmors;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import java.util.Arrays;
import java.util.List;

public class WoolArmorEvent implements IInitEvent {

    @Override
    public void init() {
        final List<ItemStack> woolArmor = Arrays.asList(
                new ItemStack(WoolsArmors.BLACK_WOOL_BOOTS),
                new ItemStack(WoolsArmors.BLUE_WOOL_BOOTS),
                new ItemStack(WoolsArmors.BROWN_WOOL_BOOTS),
                new ItemStack(WoolsArmors.CYAN_WOOL_BOOTS),
                new ItemStack(WoolsArmors.GRAY_WOOL_BOOTS),
                new ItemStack(WoolsArmors.GREEN_WOOL_BOOTS),
                new ItemStack(WoolsArmors.LIGHT_BLUE_WOOL_BOOTS),
                new ItemStack(WoolsArmors.LIGHT_GRAY_WOOL_BOOTS),
                new ItemStack(WoolsArmors.LIME_WOOL_BOOTS),
                new ItemStack(WoolsArmors.MAGENTA_WOOL_BOOTS),
                new ItemStack(WoolsArmors.ORANGE_WOOL_BOOTS),
                new ItemStack(WoolsArmors.PINK_WOOL_BOOTS),
                new ItemStack(WoolsArmors.PURPLE_WOOL_BOOTS),
                new ItemStack(WoolsArmors.RED_WOOL_BOOTS),
                new ItemStack(WoolsArmors.WHITE_WOOL_BOOTS),
                new ItemStack(WoolsArmors.YELLOW_WOOL_BOOTS)
        );
        MinecraftForge.EVENT_BUS.<LivingFallEvent>addListener(e -> {
            if (e.getEntityLiving() instanceof PlayerEntity || e.getEntityLiving() instanceof ServerPlayerEntity) {
                final ItemStack boots = e.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.FEET);

                for (ItemStack armor : woolArmor) {
                    if (boots.isItemEqualIgnoreDurability(armor)) {
                        e.setDamageMultiplier(0.5F);
                        break;
                    }
                }
            }
        });
    }
}
