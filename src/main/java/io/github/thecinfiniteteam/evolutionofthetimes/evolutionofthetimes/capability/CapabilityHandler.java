package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.capability;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class CapabilityHandler {
    @CapabilityInject(IPlayerState.class)
    public static Capability<IPlayerState> capPlayerState;
    public static void setupCapabilities() {
        CapabilityManager.INSTANCE.register(IPlayerState.class, new StoragePlayerState(), CapabilityPlayerState::new);
    }
}
