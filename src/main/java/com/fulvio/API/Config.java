package com.fulvio.API;

import com.fulvio.number.Amount;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Config extends Configuration {

    Config getConfig(String path);
    String getColorString(String path);

    String getEnumString(String path);

    List<String> getColorList(String path);

    Amount getAmount(String path);

    Amount getAmount(String path, int def);

    Material getMaterial(String path);
    Material getMaterial(String path, Material def);

    public ItemStack getItem(String path);

}
