package fr.alasdiablo.janoeo.arsenal.item;

import fr.alasdiablo.janoeo.arsenal.Arsenal;
import fr.alasdiablo.janoeo.arsenal.util.ItemsTiers;
import fr.alasdiablo.janoeo.arsenal.util.Registries;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
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

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_AXE)
    public static Item ALUMINIUM_AXE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_HOE)
    public static Item ALUMINIUM_HOE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_PICKAXE)
    public static Item ALUMINIUM_PICKAXE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_SHOVEL)
    public static Item ALUMINIUM_SHOVEL;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.ALUMINIUM_SWORD)
    public static Item ALUMINIUM_SWORD;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_AXE)
    public static Item TIN_AXE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_HOE)
    public static Item TIN_HOE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_PICKAXE)
    public static Item TIN_PICKAXE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_SHOVEL)
    public static Item TIN_SHOVEL;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.TIN_SWORD)
    public static Item TIN_SWORD;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            IForgeRegistry<Item> e = event.getRegistry();

            e.register(new AxeItem(ItemsTiers.COPPER, 6.5f, -3.15f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_AXE));
            e.register(new HoeItem(ItemsTiers.COPPER,  -1.5f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_HOE));
            e.register(new PickaxeItem(ItemsTiers.COPPER, 1, -2.8f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_PICKAXE));
            e.register(new ShovelItem(ItemsTiers.COPPER, 1.5f, -3.0f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_SHOVEL));
            e.register(new SwordItem(ItemsTiers.COPPER, 3, -2.4f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.COPPER_SWORD));

            e.register(new AxeItem(ItemsTiers.ALUMINIUM, 6.5f, -3.15f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.ALUMINIUM_AXE));
            e.register(new HoeItem(ItemsTiers.ALUMINIUM,  -1.5f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.ALUMINIUM_HOE));
            e.register(new PickaxeItem(ItemsTiers.ALUMINIUM, 1, -2.8f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.ALUMINIUM_PICKAXE));
            e.register(new ShovelItem(ItemsTiers.ALUMINIUM, 1.5f, -3.0f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.ALUMINIUM_SHOVEL));
            e.register(new SwordItem(ItemsTiers.ALUMINIUM, 3, -2.4f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.ALUMINIUM_SWORD));

            e.register(new AxeItem(ItemsTiers.TIN, 6.5f, -3.15f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.TIN_AXE));
            e.register(new HoeItem(ItemsTiers.TIN, -1.5f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.TIN_HOE));
            e.register(new PickaxeItem(ItemsTiers.TIN, 1, -2.8f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.TIN_PICKAXE));
            e.register(new ShovelItem(ItemsTiers.TIN, 1.5f, -3.0f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.TIN_SHOVEL));
            e.register(new SwordItem(ItemsTiers.TIN, 3, -2.4f, new Item.Properties().group(Arsenal.setup.janoeoToolGroup)).setRegistryName(Registries.TIN_SWORD));
        }
    }
}
