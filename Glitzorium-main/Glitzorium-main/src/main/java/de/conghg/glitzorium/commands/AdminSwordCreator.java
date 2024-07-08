package de.conghg.glitzorium.commands;

import de.conghg.glitzorium.items.adminSword;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class adminSwordCreator implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
        if (sender instanceof Player){
            if (sender.hasPermission("op")) {
                Player player = (Player) sender;
                player.getInventory().addItem(adminSword.get());
                sender.sendMessage(ChatColor.GOLD + "Dir wurde das OP Admin Sword in das Inventar gelegt!");
                return true;
            }
            sender.sendMessage(ChatColor.RED + "Oh Nein! Du hast keine Berechtigung dieses Overpowerte Schwert zu bekommen :(");
            return true;
        }
        sender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein, um diesen Command zu nutzen!");
        return true;
    }


}
