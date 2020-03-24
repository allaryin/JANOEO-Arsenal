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

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.CYAN_WOOL_HELMET)
    public static Item CYAN_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.CYAN_WOOL_CHESTPLATE)
    public static Item CYAN_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.CYAN_WOOL_LEGGINGS)
    public static Item CYAN_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.CYAN_WOOL_BOOTS)
    public static Item CYAN_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GRAY_WOOL_HELMET)
    public static Item GRAY_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GRAY_WOOL_CHESTPLATE)
    public static Item GRAY_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GRAY_WOOL_LEGGINGS)
    public static Item GRAY_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GRAY_WOOL_BOOTS)
    public static Item GRAY_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GREEN_WOOL_HELMET)
    public static Item GREEN_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GREEN_WOOL_CHESTPLATE)
    public static Item GREEN_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GREEN_WOOL_LEGGINGS)
    public static Item GREEN_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.GREEN_WOOL_BOOTS)
    public static Item GREEN_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_BLUE_WOOL_HELMET)
    public static Item LIGHT_BLUE_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_BLUE_WOOL_CHESTPLATE)
    public static Item LIGHT_BLUE_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_BLUE_WOOL_LEGGINGS)
    public static Item LIGHT_BLUE_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_BLUE_WOOL_BOOTS)
    public static Item LIGHT_BLUE_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_GRAY_WOOL_HELMET)
    public static Item LIGHT_GRAY_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_GRAY_WOOL_CHESTPLATE)
    public static Item LIGHT_GRAY_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_GRAY_WOOL_LEGGINGS)
    public static Item LIGHT_GRAY_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIGHT_GRAY_WOOL_BOOTS)
    public static Item LIGHT_GRAY_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIME_WOOL_HELMET)
    public static Item LIME_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIME_WOOL_CHESTPLATE)
    public static Item LIME_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIME_WOOL_LEGGINGS)
    public static Item LIME_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.LIME_WOOL_BOOTS)
    public static Item LIME_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.MAGENTA_WOOL_HELMET)
    public static Item MAGENTA_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.MAGENTA_WOOL_CHESTPLATE)
    public static Item MAGENTA_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.MAGENTA_WOOL_LEGGINGS)
    public static Item MAGENTA_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.MAGENTA_WOOL_BOOTS)
    public static Item MAGENTA_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ORANGE_WOOL_HELMET)
    public static Item ORANGE_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ORANGE_WOOL_CHESTPLATE)
    public static Item ORANGE_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ORANGE_WOOL_LEGGINGS)
    public static Item ORANGE_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ORANGE_WOOL_BOOTS)
    public static Item ORANGE_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PINK_WOOL_HELMET)
    public static Item PINK_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PINK_WOOL_CHESTPLATE)
    public static Item PINK_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PINK_WOOL_LEGGINGS)
    public static Item PINK_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PINK_WOOL_BOOTS)
    public static Item PINK_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PURPLE_WOOL_HELMET)
    public static Item PURPLE_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PURPLE_WOOL_CHESTPLATE)
    public static Item PURPLE_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PURPLE_WOOL_LEGGINGS)
    public static Item PURPLE_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.PURPLE_WOOL_BOOTS)
    public static Item PURPLE_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_HELMET)
    public static Item RED_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_CHESTPLATE)
    public static Item RED_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_LEGGINGS)
    public static Item RED_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_BOOTS)
    public static Item RED_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_HELMET)
    public static Item WHITE_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_CHESTPLATE)
    public static Item WHITE_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_LEGGINGS)
    public static Item WHITE_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_BOOTS)
    public static Item WHITE_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_HELMET)
    public static Item YELLOW_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_CHESTPLATE)
    public static Item YELLOW_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_LEGGINGS)
    public static Item YELLOW_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_BOOTS)
    public static Item YELLOW_WOOL_BOOTS;


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
            e.register(new ArmorItem(ArmorsMaterials.BROWN_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BROWN_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.BROWN_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.BROWN_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.CYAN_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.CYAN_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.CYAN_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.CYAN_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.CYAN_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.CYAN_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.CYAN_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.CYAN_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.GRAY_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.GRAY_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.GRAY_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.GRAY_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.GRAY_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.GRAY_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.GRAY_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.GRAY_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.GREEN_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.GREEN_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.GREEN_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.GREEN_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.GREEN_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.GREEN_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.GREEN_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.GREEN_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.LIGHT_BLUE_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIGHT_BLUE_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.LIGHT_BLUE_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIGHT_BLUE_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.LIGHT_BLUE_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.LIGHT_BLUE_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.LIGHT_BLUE_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIGHT_BLUE_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.LIGHT_GRAY_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIGHT_GRAY_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.LIGHT_GRAY_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIGHT_GRAY_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.LIGHT_GRAY_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.LIGHT_GRAY_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.LIGHT_GRAY_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIGHT_GRAY_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.LIME_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIME_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.LIME_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIME_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.LIME_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIME_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.LIME_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.LIME_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.MAGENTA_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.MAGENTA_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.MAGENTA_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.MAGENTA_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.MAGENTA_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.MAGENTA_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.MAGENTA_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.MAGENTA_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.ORANGE_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.ORANGE_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.ORANGE_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.ORANGE_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.ORANGE_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.ORANGE_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.ORANGE_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.ORANGE_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.PINK_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PINK_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.PINK_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PINK_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.PINK_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PINK_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.PINK_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PINK_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.PURPLE_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PURPLE_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.PURPLE_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PURPLE_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.PURPLE_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PURPLE_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.PURPLE_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.PURPLE_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.RED_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.RED_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.RED_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.RED_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.WHITE_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.WHITE_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.WHITE_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.WHITE_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.YELLOW_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.YELLOW_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName( Registries.YELLOW_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(Arsenal.setup.janoeoArmorGroup)).setRegistryName(Registries.YELLOW_WOOL_BOOTS));
        }
    }
}
