package de.conghg.glitzorium.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemDespawnEvent;

public class despawnEvent implements Listener {

    @EventHandler
    public static void despawnEvent(ItemDespawnEvent event){
        if (event.getEntity().hasPermission("op")) {
            event.getEntity().sendMessage(ChatColor.RED + "Deine Items sind despawnt");
            System.out.println("Items despawned at " + event.getLocation());
        } else {
            System.out.println("Items despawned at " + event.getLocation());
        }

    }
}
