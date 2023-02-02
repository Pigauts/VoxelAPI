package com.fulvio.API;

import com.fulvio.Placeholder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.UUID;

public interface PluginUser {

    UUID getUniqueId();

    String getName();

    default Player getPlayer() {
        return Bukkit.getPlayer(getUniqueId());
    }

    default Placeholder[] getPlaceholders() {
        return new Placeholder[0];
    }

    default void sendMessage(String message) {
        for (Placeholder placeholder : getPlaceholders()) {
            if (placeholder == null) continue;
            placeholder.set(message);
        }
        getPlayer().sendMessage(message);
    }

    default void openInventory(Inventory inventory) {
        getPlayer().openInventory(inventory);
    }

}
