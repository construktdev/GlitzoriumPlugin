package de.conghg.glitzorium.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class kickEvent implements Listener {
    @EventHandler
    public static void kickEvent(PlayerKickEvent event){
        event.getPlayer().sendMessage(ChatColor.RED + "Du hast einen Spieler erfolgreich gekickt!");
    }
}
//not final version
