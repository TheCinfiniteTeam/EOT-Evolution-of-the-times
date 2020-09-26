package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.capability;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.EvolutionofTheTimes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CapabilityPlayerState implements IPlayerState, ICapabilitySerializable<NBTTagCompound> {
    public static final ResourceLocation KEY = new ResourceLocation(EvolutionofTheTimes.MOD_ID, "player_state");

    private float tech;

    @Override
    public float getTech() {
        return this.tech;
    }

    @Override
    public void setTech(float value) {
        this.tech = Math.min((Math.max(value, 0)), 1);
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setFloat("tech", this.tech);
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        this.tech = nbt.getFloat("tech");
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CapabilityHandler.capPlayerState;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return capability == CapabilityHandler.capPlayerState ? (T) this : null;
    }
}
