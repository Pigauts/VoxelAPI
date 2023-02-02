package com.fulvio.API;

import com.fulvio.menu.actions.MenuAction;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MenuConfig extends Config {

    List<String> getArrangement();

    Map<String, ItemStack> getMappedItems();

    ItemStack[] getContents();

    Set<MenuAction> getActions();

    List<Integer> getSlotsAtID(String id);

    List<ClickType> getClickTypes(String path);

}
