package fr.alasdiablo.janoeo.arsenal;

import fr.alasdiablo.janoeo.arsenal.util.Registries;
import fr.alasdiablo.janoeo.arsenal.util.ModSetup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Main class of the mod
 */
@Mod(Registries.MOD_ID)
public class Arsenal {

    public static ModSetup setup = new ModSetup();

    public Arsenal() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
    }
}
