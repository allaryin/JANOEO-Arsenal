package fr.alasdiablo.janoeo.arsenal.utils;

import fr.alasdiablo.janoeo.arsenal.event.IInitEvent;
import fr.alasdiablo.janoeo.arsenal.event.WoolArmorEvent;
import fr.alasdiablo.janoeo.arsenal.init.WoolsArmors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.List;

public class ModSetup {

    public ItemGroup janoeoArmorGroup = new ItemGroup("janoeo.armor.group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(WoolsArmors.BLACK_WOOL_CHESTPLATE);
        }
    };

    public void init () {
        List<IInitEvent> events = Arrays.asList(
                new WoolArmorEvent()
        );
        events.forEach(IInitEvent::init);
    }
}
