package com.fulvio.item;

import com.fulvio.API.Config;
import com.fulvio.API.ItemManager;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ItemManagerImpl implements ItemManager {

    private final Map<String, ItemStack> items = new HashMap<>();

    @Override
    public ItemStack getItem(String name) {
        return items.get(name);
    }

    @Override
    public ItemStack getItem(String name, int amount) {
        final ItemStack item = getItem(name);
        item.setAmount(amount);
        return item;
    }

    @Override
    public Collection<ItemStack> getAllItems() {
        return items.values();
    }

    public void load(Config config) {

    }

    public void load(File file) {

    }
}
