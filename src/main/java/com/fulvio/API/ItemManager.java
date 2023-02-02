package com.fulvio.API;

import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.Collection;

public interface ItemManager {

    ItemStack getItem(String name);

    ItemStack getItem(String name, int amount);

    Collection<ItemStack> getAllItems();

}
