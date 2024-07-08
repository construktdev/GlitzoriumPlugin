package de.conghg.glitzorium.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class trollCommandsList implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
        if (sender instanceof ConsoleCommandSender){
            sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Dieser Befehl kann nur von Spielern ausgeführt werden!");
        }

        if (sender.hasPermission("op")) {
            sender.sendMessage(ChatColor.RED + "Fehler... Bitte an ConGHG wenden");
            return true;
        }
        sender.sendMessage(ChatColor.RED + "Unzureichende Rechte...");
        return true;
    }
}
//Not final version
