package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.nbt;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.util.ResourceLocation;

public class readNBT {
    public static ResourceLocation readNBT(String pathIn) {
        ResourceLocation nbtLocation;
        nbtLocation = new ResourceLocation(EvolutionofTheTimes.MOD_ID,pathIn);
        return nbtLocation;
    }
}
