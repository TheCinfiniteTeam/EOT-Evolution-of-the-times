package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
//import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockRegistry;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.gui.GUIHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
//import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.potion.PotionRegistry;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound.Sound;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
    public static final String MOD_ID = "evolutionofthetimes";
    public static final String MOD_NAME = "EvolutionofTheTimes";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        new BlockHandler();// new BlockRegistry();
        new ItemHandler();
        new Sound();// new SoundRegistry();
        //new PotionRegistry();
        new EOT_CreativeTabs();
        //new CommandRegistry();
        new RegistryHandler();
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(EvolutionofTheTimes.INSTANCE, new GUIHandler());
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    public void registerItemRenderer(Item item, int meta, String id){
    }

}
