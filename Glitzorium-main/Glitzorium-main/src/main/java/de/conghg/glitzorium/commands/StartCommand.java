package de.conghg.glitzorium.commands;
import de.conghg.glitzorium.Glitzorium;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class start implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.hasPermission("op")) {
            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                ((Player) commandSender).sendTitle(ChatColor.GREEN + " SMP wird gestartet...", ChatColor.RED + "10");
                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "9"));
                    }
                }, 20);

                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "8"));
                    }

                }, 20 * 2);

                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "7"));

                    }

                }, 20 * 3);

                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "6"));

                    }

                }, 20 * 4);

                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "5"));

                    }

                }, 20 * 5);

                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "4"));

                    }

                }, 20 * 6);


                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "3"));

                    }

                }, 20 * 7);


                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "2"));

                    }

                }, 20 * 8);
                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "SMP wird gestartet...", ChatColor.RED + "1"));

                    }

                }, 20 * 9);
                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendTitle(ChatColor.GREEN + "Los geht's!", ChatColor.AQUA + "Viel Spaß!"));
                        Bukkit.getOnlinePlayers().forEach(player -> player.sendMessage(ChatColor.GREEN + "Es geht los! Viel Spaß"));
                        commandSender.sendMessage(ChatColor.WHITE + "Setze alle Spieler in Gamemode Survival...");
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "minecraft:gamemode survival @a");
                        commandSender.sendMessage(ChatColor.WHITE + "Erfolgreich, Vergrößere Worldborder...");
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "minecraft:worldborder set 50 10");
                        commandSender.sendMessage(ChatColor.WHITE + "Erfolgreich, es kann nun gespielt werden!");
                    }

                }, 20 * 10);

                Bukkit.getScheduler().runTaskLater(Glitzorium.plugin, new Runnable() {
                    @Override
                    public void run() {
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "minecraft:worldborder set 30000000 10");
                    }

                }, 20 * 20);

                return true;
            } else {
                commandSender.sendMessage(ChatColor.RED + "Dieser Command kann nur von Spielern ausgeführt werden oder du hast unzureichende Rechte");
                return true;
            }
        }
        commandSender.sendMessage(ChatColor.RED + "Error! Dieser Command kann nur von Spielern ausgeführt werden");
        return true;
    }
}
