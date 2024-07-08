package de.conghg.glitzorium.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import utils.Lag;

public class tps implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage(ChatColor.GOLD + "TPS: " + ChatColor.AQUA + Lag.getTPS());
        return true;
    }
}
