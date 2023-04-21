package io.github.closeddev.eplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TDCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            if (args.length > 0) {
                if (args[0] == "night") {
                    p.getWorld().setTime(8000);
                } else if (args[0] == "midnight") {
                    p.getWorld().setTime(10000);
                } else if (args[0] == "day") {
                    p.getWorld().setTime(1000);
                } else {
                    p.getWorld().setTime(1000);
                }
            } else {
                p.getWorld().setTime(1000);
            }
        }
        return true;
    }
}
