package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.network;

import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.capability.CapabilityHandler;
import io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.capability.IPlayerState;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class PacketTech implements IMessage {
    public NBTTagCompound compound;

    @Override
    public void fromBytes(ByteBuf buf) {
        compound = ByteBufUtils.readTag(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeTag(buf, compound);
    }
    public static class Handler implements IMessageHandler<PacketTech, IMessage> {
        @Override
        public IMessage onMessage(PacketTech message, MessageContext ctx) {
            if(ctx.side == Side.CLIENT) {
                final NBTBase nbt = message.compound.getTag("tech");
                Minecraft.getMinecraft().addScheduledTask(new Runnable() {
                    @Override
                    public void run() {
                        EntityPlayer player = Minecraft.getMinecraft().player;
                        if (player.hasCapability(CapabilityHandler.capPlayerState, null)) {
                            IPlayerState playerState = player.getCapability(CapabilityHandler.capPlayerState, null);
                            Capability.IStorage<IPlayerState> storage = CapabilityHandler.capPlayerState.getStorage();
                            storage.readNBT(CapabilityHandler.capPlayerState, playerState, null, nbt);
                        }
                    }
                });
            }
            return null;
        }
    }
}