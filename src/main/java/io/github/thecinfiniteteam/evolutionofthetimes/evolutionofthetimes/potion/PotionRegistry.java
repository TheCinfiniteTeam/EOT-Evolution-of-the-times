package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.potion;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PotionRegistry {
    @SubscribeEvent
    public static void onPotionRegistration(RegistryEvent.Register<Potion> event) {
        event.getRegistry().registerAll(new Fly().setRegistryName(EvolutionofTheTimes.MOD_ID, "flying_potion"));
    }
}
