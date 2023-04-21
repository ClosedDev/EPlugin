package io.github.closeddev.eplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
public final class EPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "[ EPlugin ] Enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "[ EPlugin ] Disabled.");
    }
}
