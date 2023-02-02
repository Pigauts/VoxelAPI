package com.fulvio.menu;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;

public interface OpenMenu {

    Inventory getInventory();

    void update();

    void click(ClickType click, int slot);

}
