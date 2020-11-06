package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.block.SoundType;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

//import static io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.sound.SoundRegistry.MACHINE_PLACEMENT_SOUND;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.RegistryHandler.*;

import static io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.RegistryHandler.MACHINE_PLACEMENT_SOUND;

public class Sound {
    //public static final SoundEvent MACHINE_PLACEMENT_SOUND = new SoundEvent(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_placement_sound"));
    public static final SoundEvent MACHINE_BREAK_SOUND = new SoundEvent(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_break_sound"));
    public static final SoundEvent MACHINE_FALL_SOUND = new SoundEvent(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_fall_sound"));
    public static final SoundEvent MACHINE_HIT_SOUND = new SoundEvent(new ResourceLocation(EvolutionofTheTimes.MOD_ID, "machine_hit_sound"));


    public static final SoundType machine_sound = new SoundType(1.0f,1.8f,MACHINE_BREAK_SOUND, SoundEvents.BLOCK_STONE_STEP,MACHINE_PLACEMENT_SOUND,MACHINE_HIT_SOUND,MACHINE_FALL_SOUND);
}
