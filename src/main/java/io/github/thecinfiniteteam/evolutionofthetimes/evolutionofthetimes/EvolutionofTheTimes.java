package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.network.PacketTech;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Logger;


@Mod(
        modid = EvolutionofTheTimes.MOD_ID,
        name = EvolutionofTheTimes.MOD_NAME,
        version = EvolutionofTheTimes.VERSION,
        acceptedMinecraftVersions = "1.12.2",
        updateJSON = "https://thecinfiniteteam.gtihub.io/src/mod/eot/update.json/",
        guiFactory = "io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.config.configGuiHub",
        dependencies = "required-after:patchouli;"//required-client:optifine;"
)
public class EvolutionofTheTimes {

    public static final String MOD_ID = "evolutionofthetimes";
    public static final String MOD_NAME = "EvolutionofTheTimes";
    public static final String VERSION = "1.0.0";
    private static Logger logger;
    private SimpleNetworkWrapper network;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static EvolutionofTheTimes INSTANCE;

    @SidedProxy(clientSide = "io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.ClientProxy", serverSide = "io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.CommonProxy")
    public static CommonProxy proxy;
    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preinit(event);
        network = NetworkRegistry.INSTANCE.newSimpleChannel(MOD_ID);
        network.registerMessage(new PacketTech.Handler(), PacketTech.class, 1, Side.CLIENT);
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postinit(event);
    }

    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
    public static CommonProxy getProxy() {
        return proxy;
    }
    public static Logger getLogger() {
        return logger;
    }
    /*
    @Mod.InstanceFactory
    public static EvolutionofTheTimes getInstance()
    {
        return INSTANCE;
    }
    */
    public static SimpleNetworkWrapper getNetwork() {
        return INSTANCE.network;
    }
}
