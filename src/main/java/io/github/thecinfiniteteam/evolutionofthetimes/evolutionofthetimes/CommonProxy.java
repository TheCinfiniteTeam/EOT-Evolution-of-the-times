package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockRegistry;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.command.CommandRegistry;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT_CreativeTabs;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.gui.GUIHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.potion.PotionRegistry;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound.Sound;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound.SoundRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public static final String MOD_ID = "evolutionofthetimes";
    public static final String MOD_NAME = "EvolutionofTheTimes";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        new BlockHandler(); new BlockRegistry();
        new Sound(); new SoundRegistry();
        new PotionRegistry();
        new EOT_CreativeTabs();
        new CommandRegistry();
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

    /**
     * Forge will automatically look up and bind blocks to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
      /*
          public static final MySpecialBlock mySpecialBlock = null; // placeholder for special block below
      */
    }

    /**
     * Forge will automatically look up and bind items to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {
      /*
          public static final ItemBlock mySpecialBlock = null; // itemblock for the block above
          public static final MySpecialItem mySpecialItem = null; // placeholder for special item below
      */
    }

    /**
     * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
     */
    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        /**
         * Listen for the register event for creating custom items
         */
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
           /*
             event.getRegistry().register(new ItemBlock(Blocks.myBlock).setRegistryName(MOD_ID, "myBlock"));
             event.getRegistry().register(new MySpecialItem().setRegistryName(MOD_ID, "mySpecialItem"));
            */
        }

        /**
         * Listen for the register event for creating custom blocks
         */
        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
           /*
             event.getRegistry().register(new MySpecialBlock().setRegistryName(MOD_ID, "mySpecialBlock"));
            */
        }
    }
    /* EXAMPLE ITEM AND BLOCK - you probably want these in separate files
    public static class MySpecialItem extends Item {

    }

    public static class MySpecialBlock extends Block {

    }
    */
    public void registerItemRenderer(Item item, int meta, String id){
    }
    /*
    @Mod.InstanceFactory
    public static EvolutionofTheTimes getInstance()
    {
        return INSTANCE;
    }
    */
    public void serverStarting(FMLServerStartingEvent event) {

    }

}
