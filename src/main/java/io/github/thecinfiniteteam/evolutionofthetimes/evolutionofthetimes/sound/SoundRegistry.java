package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SoundRegistry {
    @SubscribeEvent
    public static void onSoundEvenrRegistration(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().register(Sound.MACHINE_PLACEMENT_SOUND.setRegistryName(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_placement_sound")));
        event.getRegistry().register(Sound.MACHINE_BREAK_SOUND.setRegistryName(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_break_sound")));
        event.getRegistry().register(Sound.MACHINE_FALL_SOUND.setRegistryName(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_fall_sound")));
        event.getRegistry().register(Sound.MACHINE_HIT_SOUND.setRegistryName(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_hit_sound")));
    }
}
