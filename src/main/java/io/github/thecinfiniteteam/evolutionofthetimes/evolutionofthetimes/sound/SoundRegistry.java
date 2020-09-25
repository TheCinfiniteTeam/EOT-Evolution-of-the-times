package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SoundRegistry {
    public static final SoundEvent MACHINE_PLACEMENT_SOUND = new SoundEvent(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_placement_sound"));

    @SubscribeEvent
    public static void onSoundEvenrRegistration(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().register(MACHINE_PLACEMENT_SOUND.setRegistryName(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_placement_sound")));
    }
}
