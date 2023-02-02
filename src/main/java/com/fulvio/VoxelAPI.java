package com.fulvio;

import com.fulvio.API.VoxelManager;
import com.fulvio.API.VoxelPlugin;
import org.bukkit.inventory.ItemStack;

public class VoxelAPI {

    private static VoxelPlugin plugin;

    private final static VoxelManager voxelHandler = new VoxelManagerImpl();

    public VoxelAPI(VoxelPlugin plugin) {
        VoxelAPI.plugin = plugin;
    }

    public static VoxelPlugin getPlugin() {
        return plugin;
    }

    public static VoxelManager getVoxelManager() { return voxelHandler; }

    public static ItemStack getCustomItem(String name) {
        if (plugin.getItems() == null) return null;
        return plugin.getItems().getItem(name);
    }

}
