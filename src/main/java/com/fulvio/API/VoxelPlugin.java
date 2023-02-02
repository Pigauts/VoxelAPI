package com.fulvio.API;

import org.bukkit.plugin.Plugin;

public interface VoxelPlugin extends Plugin {

    default MessageManager getMessages() {
        return null;
    }

    default ItemManager getItems() {
        return null;
    }

}
