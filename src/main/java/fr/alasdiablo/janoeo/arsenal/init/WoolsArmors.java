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
public class WoolsArmors {

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLACK_WOOL_HELMET)
    public static Item BLACK_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLACK_WOOL_CHESTPLATE)
    public static Item BLACK_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLACK_WOOL_LEGGINGS)
    public static Item BLACK_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLACK_WOOL_BOOTS)
    public static Item BLACK_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLUE_WOOL_HELMET)
    public static Item BLUE_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLUE_WOOL_CHESTPLATE)
    public static Item BLUE_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLUE_WOOL_LEGGINGS)
    public static Item BLUE_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BLUE_WOOL_BOOTS)
    public static Item BLUE_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BROWN_WOOL_HELMET)
    public static Item BROWN_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BROWN_WOOL_CHESTPLATE)
    public static Item BROWN_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BROWN_WOOL_LEGGINGS)
    public static Item BROWN_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.BROWN_WOOL_BOOTS)
    public static Item BROWN_WOOL_BOOTS;


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            IForgeRegistry<Item> e = event.getRegistry();
            e.register(new ArmorItem(ArmorsMaterials.BLACK_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BLACK_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.BLACK_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BLACK_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.BLACK_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.BLACK_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.BLACK_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BLACK_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.BLUE_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BLUE_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.BLUE_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BLUE_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.BLUE_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.BLUE_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.BLUE_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BLUE_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.BROWN_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BROWN_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.BROWN_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BROWN_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.BROWN_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.BROWN_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.BROWN_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BROWN_WOOL_BOOTS));
        }
    }
}
