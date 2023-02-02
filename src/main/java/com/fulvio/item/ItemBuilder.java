package com.fulvio.item;

import com.fulvio.API.Config;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBuilder {

    private Material type = Material.DIRT;
    private int amount = 1;
    private String name = null;
    private List<String> lore = null;
    private boolean enchanted = false;
    private int modelData = -1;

    public ItemBuilder() {}

    public ItemBuilder(Config config) {
        this.type = config.getMaterial("type", Material.DIRT);
        this.amount = config.getInt("amount", 1);
        this.name = config.getColorString("name");
        this.lore = config.getColorList("lore");
        this.enchanted = config.getBoolean("enchanted", false);
        this.modelData = config.getInt("model-data", -1);
    }

    public ItemStack build() {
        ItemStack item = new ItemStack(type, amount);

        ItemMeta meta = item.getItemMeta();

        if (name != null) meta.setDisplayName(name);
        if (lore != null) meta.setLore(lore);
        if (modelData != -1) meta.setCustomModelData(modelData);
        if (enchanted) {
            meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }

        item.setItemMeta(meta);
        return item;
    }

    public ItemBuilder setType(Material type) {
        this.type = type;
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder setLore(List<String> lore) {
        this.lore = lore;
        return this;
    }

    public ItemBuilder setEnchanted(boolean enchanted) {
        this.enchanted = enchanted;
        return this;
    }

    public ItemBuilder setModelData(int modelData) {
        this.modelData = modelData;
        return this;
    }
}
