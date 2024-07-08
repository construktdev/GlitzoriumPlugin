package de.conghg.glitzorium.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import utils.Lag;

import java.lang.reflect.InvocationTargetException;

public class welcomeEvents implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        int ping = 0;
        try {
            Object entityPlayer = event.getPlayer().getClass().getMethod("getHandle").invoke(event.getPlayer());
            ping = (int) entityPlayer.getClass().getField("ping").get(entityPlayer);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | NoSuchFieldException e) {
            e.printStackTrace();
            System.out.println("Fehler beim bekommen vom Ping des Spielers " + event.getPlayer());
        }
        if (event.getPlayer().hasPermission("op")){
            event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " hat den Glitzorium SMP betreten!");
            event.getPlayer().sendMessage(ChatColor.BOLD + "" + ChatColor.AQUA + "Glitzorium SMP");
            event.getPlayer().sendMessage(ChatColor.GREEN + "Willkommen " + event.getPlayer().getName() + "\n" + ChatColor.GOLD + "Plugin Status: 0 \nNeue Nachrichten: 0 \nNeue Reports: 0");
            event.getPlayer().sendMessage(ChatColor.AQUA + "Server Stats: \n" + ChatColor.GOLD + "TPS: " + Lag.getTPS());
            event.getPlayer().sendMessage(ChatColor.GRAY + "Glitzorium Plugin by ConGHG");
            event.getPlayer().sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------");
        }
        else {
            event.setJoinMessage(ChatColor.YELLOW + "" + event.getPlayer().getName() + " hat den Glitzorium SMP betreten!");
            event.getPlayer().sendMessage(ChatColor.GREEN + "Herzlich Willkommen " + event.getPlayer().getName() + ", auf dem Glitzorium SMP \n" + ChatColor.GOLD + " Neue Nachrichten: 0");
            event.getPlayer().sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------");
        }
    }
}
