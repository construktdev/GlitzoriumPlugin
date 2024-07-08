package de.conghg.glitzorium.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class gamemodeEvent implements Listener {
    @EventHandler
    public static void gmEvent(PlayerGameModeChangeEvent event){
        event.getPlayer().sendMessage(ChatColor.AQUA + "Du bist nun im Gamemode " + event.getNewGameMode().toString().toLowerCase());
    }
}
