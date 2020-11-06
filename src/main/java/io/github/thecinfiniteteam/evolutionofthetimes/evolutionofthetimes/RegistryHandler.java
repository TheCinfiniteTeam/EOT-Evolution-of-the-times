package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockTerminal;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid=EvolutionofTheTimes.MOD_ID)
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        /*for (int i = 0;i > BlockHandler.blocks.size()+1;i++){
            event.getRegistry().register(BlockHandler.blocks.get(i));
        }
        */
        event.getRegistry().registerAll(BlockHandler.blocks.toArray(new Block[0])); //    "normal": { "model": "evolutionofthetimes:terminal" },
        GameRegistry.registerTileEntity(BlockTerminal.TerminalEntity.class, new ResourceLocation(EvolutionofTheTimes.MOD_ID,"terminal"));
    }
    public static final SoundEvent MACHINE_PLACEMENT_SOUND = new SoundEvent(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_placement_sound"));

    @SubscribeEvent
    public static void onSoundEvenrRegistration(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().register(MACHINE_PLACEMENT_SOUND.setRegistryName(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_placement_sound")));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ItemHandler.items){
            if(item instanceof ItemHandler.IHasModel){
                ((ItemHandler.IHasModel)item).registerModel();
            }
        }
        for(Block block : BlockHandler.blocks){
            if(block instanceof ItemHandler.IHasModel){
                ((ItemHandler.IHasModel)block).registerModel();
            }
        }
    }
}
