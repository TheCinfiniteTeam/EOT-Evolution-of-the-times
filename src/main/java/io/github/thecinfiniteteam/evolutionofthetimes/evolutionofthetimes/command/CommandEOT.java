package io.github.thecinfiniteteam.evolutionofthetimes.evolutionofthetimes.command;

import net.minecraft.client.resources.I18n;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

public class CommandEOT extends CommandBase {
    @Override
    public String getName() {
        return "eot";
    }
    @Override
    public String getUsage(ICommandSender sender) {
        return "commands.eot.usage";
    }
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        sender.sendMessage(new TextComponentString("Hello, world"));
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 3;
    }
}
