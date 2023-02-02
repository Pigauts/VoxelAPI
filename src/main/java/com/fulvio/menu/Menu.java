package com.fulvio.menu;

import com.fulvio.API.MenuConfig;
import com.fulvio.menu.actions.MenuAction;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

public class Menu {

    private final String name;

    private final int size;

    private final ItemStack[] contents;

    private final Set<MenuAction> actions;

    public Menu(String name, int size, ItemStack[] contents, Set<MenuAction> actions) {
        this.name = name;
        this.size = size;
        this.contents = contents;
        this.actions = actions;
    }

    public Menu(MenuConfig config) {
        this.name = config.getColorString("name");
        this.contents = config.getContents();
        this.size = contents.length;
        this.actions = config.getActions();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public ItemStack[] getContents() {
        return contents;
    }

    public Set<MenuAction> getActions() {
        return actions;
    }
}
