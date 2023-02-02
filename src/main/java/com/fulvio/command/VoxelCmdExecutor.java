package com.fulvio.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface VoxelCmdExecutor extends CommandExecutor {

    @Override
    default boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            onConsoleCommand(args);
            return true;
        }

        onPlayerCommand((Player) sender, args);
        return true;
    }

    void onPlayerCommand(Player player, String[] args);

    void onConsoleCommand(String[] args);

}
