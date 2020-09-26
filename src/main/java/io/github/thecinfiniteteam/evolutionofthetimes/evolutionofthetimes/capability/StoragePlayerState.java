package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class StoragePlayerState implements Capability.IStorage<IPlayerState> {
    @Override
    public NBTBase writeNBT(Capability<IPlayerState> capability, IPlayerState instance, EnumFacing side) {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setFloat("tech", instance.getTech());
        return nbt;
    }

    @Override
    public void readNBT(Capability<IPlayerState> capability, IPlayerState instance, EnumFacing side, NBTBase nbt) {
        NBTTagCompound tag = (NBTTagCompound) nbt;
        instance.setTech(tag.getFloat("tech"));
    }
}
