package fr.alasdiablo.janoeo.arsenal.init;

import fr.alasdiablo.janoeo.arsenal.Arsenal;
import fr.alasdiablo.janoeo.arsenal.utils.ArmorsMaterials;
import fr.alasdiablo.janoeo.arsenal.utils.Registries;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class Armors {

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_HELMET)
    public static Item COPPER_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_CHESTPLATE)
    public static Item COPPER_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_LEGGINGS)
    public static Item COPPER_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_BOOTS)
    public static Item COPPER_BOOTS;


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            IForgeRegistry<Item> e = event.getRegistry();
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.COPPER_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.COPPER_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.COPPER_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.COPPER_BOOTS));
        }
    }
}
