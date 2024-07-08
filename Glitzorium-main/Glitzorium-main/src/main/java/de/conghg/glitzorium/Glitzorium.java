package de.conghg.glitzorium;

import de.conghg.glitzorium.commands.*;
import de.conghg.glitzorium.events.*;
import utils.logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import utils.Lag;

public final class Glitzorium extends JavaPlugin {

    public static Glitzorium plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info("Lade Befehle und Events...");
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Lag(), 100L, 1L);
        getServer().getPluginManager().registerEvents(new welcomeEvents(), this);
        getServer().getPluginManager().registerEvents(new deathEvent(), this);
        getServer().getPluginManager().registerEvents(new gamemodeEvent(), this);
        getServer().getPluginManager().registerEvents(new kickEvent(), this);
        getServer().getPluginManager().registerEvents(new despawnEvent(), this);
        getServer().getPluginManager().registerEvents(new logger(),this);
        getCommand("tps").setExecutor(new tps());
        getCommand("trollList").setExecutor(new trollCommandsList());
        getCommand("about").setExecutor(new about());
        getCommand("sword").setExecutor(new adminSwordCreator());
        getCommand("start").setExecutor(new start());
        getCommand("hilfe").setExecutor(new help());
        getCommand("bastighg").setExecutor(new nick());
        getLogger().info("Erfolgreich, Plugin startet nun...");

    }



    @Override
    public void onDisable() {
        getLogger().info("Plugin speichert & stoppt...");
    }
}
