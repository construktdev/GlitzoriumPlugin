package de.conghg.glitzorium.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class help implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) return false;
        else{
            commandSender.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Glitzorium Plugins Commands:");
            commandSender.sendMessage(ChatColor.GOLD + "[ADMIN] /start -> Startet den SMP");
            commandSender.sendMessage(ChatColor.GOLD + "[ADMIN] /sword -> Legt dir das Admin-Schwert in das Inventar");
            commandSender.sendMessage(ChatColor.GOLD + "/glitzorium:tps -> Zeigt dir die TPS des Servers");
            commandSender.sendMessage(ChatColor.GOLD + "[ADMIN] /trolllist -> [BETA] Eine Liste mit Trollcommands");
            commandSender.sendMessage(ChatColor.GOLD + "/about -> Zeigt dir Infos über Plugin und Server");
            return true;
        }
    }
}
