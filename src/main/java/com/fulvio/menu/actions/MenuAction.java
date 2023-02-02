package com.fulvio.menu.actions;

import com.fulvio.API.MenuConfig;
import com.fulvio.menu.OpenMenu;
import org.bukkit.event.inventory.ClickType;

import java.util.List;

public abstract class MenuAction {

    private final List<ClickType> clicks;

    private final List<Integer> slots;

    protected MenuAction(MenuConfig config) {
        this.clicks = config.getClickTypes("clicks");
        this.slots = config.getSlotsAtID(config.getCurrentPath());
    }

    public boolean check(ClickType clickType, int slot) {
        return clicks.contains(clickType) && slots.contains(slot);
    }

    public abstract void run(OpenMenu openMenu);

}
