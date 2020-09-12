package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.block;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = EvolutionofTheTimes.MOD_ID)
public class BlockRegistry {
    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        /*for (int i = 0;i > BlockHandler.blocks.size()+1;i++){
            event.getRegistry().register(BlockHandler.blocks.get(i));
        }
        */
        event.getRegistry().registerAll(BlockHandler.blocks.toArray(new Block[0])); //    "normal": { "model": "evolutionofthetimes:terminal" },
        GameRegistry.registerTileEntity(BlockTerminal.TerminalEntity.class, new ResourceLocation(EvolutionofTheTimes.MOD_ID,"terminal"));

        event.getRegistry().registerAll(BlockHandler.blocks.toArray(new Block[1]));
        event.getRegistry().registerAll(BlockHandler.blocks.toArray(new Block[2]));
    }
}
