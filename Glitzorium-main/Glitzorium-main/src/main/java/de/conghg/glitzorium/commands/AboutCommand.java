package de.conghg.glitzorium.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class about implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Glitzorium Plugin");
        commandSender.sendMessage(ChatColor.GREEN + "Plugin Version: 1.2.4 (Release: 1.2)");
        commandSender.sendMessage(ChatColor.GOLD + "Release: 21.2.2024");
        commandSender.sendMessage(ChatColor.GOLD + "Developer: ConStrukt");
        commandSender.sendMessage(ChatColor.AQUA + "Discord Server: " + ChatColor.WHITE + "https://discord.gg/ZRVZGnQ4Py");
        commandSender.sendMessage(ChatColor.GOLD + "Server-Host's: ConStrukt, Killerphanta und Lennox_0101");
        return true;
    }
}
