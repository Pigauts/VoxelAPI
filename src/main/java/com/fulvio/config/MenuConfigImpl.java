package com.fulvio.config;

import com.fulvio.API.MenuConfig;
import com.fulvio.API.VoxelManager;
import com.fulvio.Util;
import com.fulvio.VoxelAPI;
import com.fulvio.menu.ActionFactory;
import com.fulvio.menu.actions.MenuAction;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.*;

public class MenuConfigImpl extends ConfigImpl implements MenuConfig {

    public MenuConfigImpl(File file, ConfigurationSection section) {
        super(file, section);
    }

    public List<String> getArrangement() {
        List<String> arrangement = new ArrayList<>();

        for (String row : config.getStringList("menu")) {
            for (String slot : row.split(" ")) {
                if (arrangement.size() > 53) break;
                arrangement.add(slot);
            }
        }

        while (arrangement.size() == 0 || arrangement.size() % 9 != 0)
            arrangement.add("0");

        return arrangement;
    }

    public Map<String, ItemStack> getMappedItems() {

        Map<String, ItemStack> mappedItems = new HashMap<>();

        for (String key : getConfigurationSection("items").getKeys(false)) {
            mappedItems.put(key, getCustomItem("items." + key));
        }

        mappedItems.put("0", null);

        return mappedItems;
    }

    public ItemStack[] getContents() {

        Map<String, ItemStack> mappedItems = getMappedItems();
        List<String> arrangement = getArrangement();

        ItemStack[] contents = new ItemStack[arrangement.size()];

        for (int i = 0; i < arrangement.size(); i++)
            contents[i] = mappedItems.get(arrangement.get(i));

        return contents;
    }

    public Set<MenuAction> getActions() {

        final ActionFactory factory = VoxelAPI.getVoxelManager().getActionFactory();

        Set<MenuAction> actions = new HashSet<>();

        for (String id : getConfigurationSection("buttons").getKeys(false)) {
            MenuAction action = factory.create(getString("buttons." + id + ".type"), getMenuConfig("buttons." + id));

            if (action == null) continue;

            actions.add(action);
        }

        return actions;
    }

    public List<Integer> getSlotsAtID(String id) {
        List<Integer> slots = new ArrayList<>();

        List<String> arrangement = getArrangement();

        for (int i = 0; i < arrangement.size(); i++) {
            if (!id.equalsIgnoreCase(arrangement.get(i))) continue;
            slots.add(i);
        }

        return slots;
    }

    public List<ClickType> getClickTypes(String path) {
        List<ClickType> clicks = new ArrayList<>();

        for (String click : getEnumList(path)) {
            if (!Util.isValidEnum(ClickType.class, click)) continue;
            clicks.add(ClickType.valueOf(click));
        }

        return clicks;
    }

}
