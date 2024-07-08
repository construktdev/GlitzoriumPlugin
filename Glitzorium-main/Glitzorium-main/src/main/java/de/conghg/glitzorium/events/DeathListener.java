package de.conghg.glitzorium.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathEvent implements Listener {
    @EventHandler
    public static void deathEvent(PlayerDeathEvent event){
        String player = String.valueOf(event.getEntity());

        System.out.println(player + " died");
        String orgDeathMSG = event.getDeathMessage();
        System.out.println(ChatColor.AQUA + "" + event.getEntity().getName() + " ist gestorben und hat " + event.getDroppedExp() + " EXP gedroppt! \n " + ChatColor.WHITE + orgDeathMSG);

    }

}
