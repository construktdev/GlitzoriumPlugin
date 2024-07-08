package de.conghg.glitzorium.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;



public class nick implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player && commandSender.hasPermission("op")) {
            Player player = (Player) commandSender;
            player.setDisplayName("BastiGHG");
            player.setPlayerListName("BastiGHG");
            player.setCustomNameVisible(true);
            commandSender.sendMessage(ChatColor.GREEN + "Dein Nickname ist nun BastiGHG");
            return true;
        }
        commandSender.sendMessage(ChatColor.RED + "Du hast unzureichende Rechte oder bist kein Spieler");
        return true;
    }
}
