package com.fulvio.menu;

import com.fulvio.API.PluginUser;
import com.fulvio.menu.actions.MenuAction;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;

public interface OpenMenu {

    PluginUser getUser();

    Menu getMenu();

    Inventory getInventory();

    void update();

    default void click(ClickType click, int slot) {
        for (MenuAction action : getMenu().getActions()) {
            if (!action.check(click, slot)) continue;
            action.run(this);
        }
    }

}
