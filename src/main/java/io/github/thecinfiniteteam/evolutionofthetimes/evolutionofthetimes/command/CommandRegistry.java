package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.command;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.creativetabs.EOT;
import net.minecraft.command.ICommand;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid= EvolutionofTheTimes.MOD_ID)
public class CommandRegistry {
    @Mod.EventHandler
    @SubscribeEvent
    public void CommandRegistry(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandEOT());
    }
}
