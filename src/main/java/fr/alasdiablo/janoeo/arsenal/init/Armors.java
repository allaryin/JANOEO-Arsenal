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

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_HELMET)
    public static Item ALUMINIUM_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_CHESTPLATE)
    public static Item ALUMINIUM_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_LEGGINGS)
    public static Item ALUMINIUM_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_BOOTS)
    public static Item ALUMINIUM_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_HELMET)
    public static Item COPPER_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_CHESTPLATE)
    public static Item COPPER_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_LEGGINGS)
    public static Item COPPER_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_BOOTS)
    public static Item COPPER_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LEAD_HELMET)
    public static Item LEAD_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LEAD_CHESTPLATE)
    public static Item LEAD_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LEAD_LEGGINGS)
    public static Item LEAD_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LEAD_BOOTS)
    public static Item LEAD_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.SILVER_HELMET)
    public static Item SILVER_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.SILVER_CHESTPLATE)
    public static Item SILVER_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.SILVER_LEGGINGS)
    public static Item SILVER_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.SILVER_BOOTS)
    public static Item SILVER_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_HELMET)
    public static Item TIN_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_CHESTPLATE)
    public static Item TIN_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_LEGGINGS)
    public static Item TIN_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_BOOTS)
    public static Item TIN_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.URANIUM_HELMET)
    public static Item URANIUM_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.URANIUM_CHESTPLATE)
    public static Item URANIUM_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.URANIUM_LEGGINGS)
    public static Item URANIUM_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.URANIUM_BOOTS)
    public static Item URANIUM_BOOTS;


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            IForgeRegistry<Item> e = event.getRegistry();
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.COPPER_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.COPPER_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.COPPER_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.COPPER_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.ALUMINIUM_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.ALUMINIUM_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.ALUMINIUM_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.ALUMINIUM_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LEAD_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LEAD_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.LEAD_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LEAD_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.SILVER_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.SILVER_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.SILVER_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.SILVER_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.TIN_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.TIN_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.TIN_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.TIN_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.URANIUM_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.URANIUM_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.URANIUM_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.URANIUM_BOOTS));
        }
    }
}
