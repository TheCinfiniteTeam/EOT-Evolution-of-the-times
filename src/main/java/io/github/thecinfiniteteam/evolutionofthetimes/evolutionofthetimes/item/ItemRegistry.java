package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.item;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=EvolutionofTheTimes.MOD_ID)
public class ItemRegistry {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[0]));
        event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[1]));
        event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[2]));
        event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[3]));
        event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[4]));
        event.getRegistry().registerAll(ItemHandler.items.toArray(new Item[5]));
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
