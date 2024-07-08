package utils;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class logger implements Listener {

    @EventHandler
    public static void logger(PlayerEvent event) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("player_logs.txt"));
        writer.write("Name: " + event.getEventName() + "\nPlayer: " + event.getPlayer());
        writer.close();
    }

}
