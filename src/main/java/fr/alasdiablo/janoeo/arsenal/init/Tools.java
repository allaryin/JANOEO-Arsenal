package fr.alasdiablo.janoeo.arsenal.init;

import fr.alasdiablo.janoeo.arsenal.Arsenal;
import fr.alasdiablo.janoeo.arsenal.utils.ItemsTiers;
import fr.alasdiablo.janoeo.arsenal.utils.Registries;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

public class Tools {

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_AXE)
    public static Item COPPER_AXE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_HOE)
    public static Item COPPER_HOE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_PICKAXE)
    public static Item COPPER_PICKAXE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_SHOVEL)
    public static Item COPPER_SHOVEL;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.COPPER_SWORD)
    public static Item COPPER_SWORD;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            IForgeRegistry<Item> e = event.getRegistry();
            e.register(new AxeItem(ItemsTiers.COPPER, 6.5f, -3.15f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_AXE));
            e.register(new HoeItem(ItemsTiers.COPPER, -1.5f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_HOE));
            e.register(new PickaxeItem(ItemsTiers.COPPER, 1, -2.8f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_PICKAXE));
            e.register(new ShovelItem(ItemsTiers.COPPER, 1.5f, -3.0f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_SHOVEL));
            e.register(new SwordItem(ItemsTiers.COPPER, 3, -2.4f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_SWORD));

        }
    }
}