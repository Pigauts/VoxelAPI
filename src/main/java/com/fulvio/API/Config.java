package com.fulvio.API;

import com.fulvio.number.Amount;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Config extends Configuration {

    void create();

    void save();

    boolean exists();

    boolean isEmpty();

    Config getConfig(String path);

    MenuConfig getMenuConfig(String path);
    String getColorString(String path);

    String getEnumString(String path);

    List<String> getEnumList(String path);

    List<String> getColorList(String path);

    Amount getAmount(String path);

    Amount getAmount(String path, int def);

    Material getMaterial(String path);
    Material getMaterial(String path, Material def);

    ItemStack getItem(String path);

    ItemStack getCustomItem(String path);

}
