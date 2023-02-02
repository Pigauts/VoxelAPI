package com.fulvio.menu;

import com.fulvio.API.MenuConfig;
import com.fulvio.menu.actions.CommandAction;
import com.fulvio.menu.actions.MenuAction;

public interface ActionFactory {

    default MenuAction create(String id, MenuConfig config) {

        if ("COMMAND".equalsIgnoreCase(id)) {
            return new CommandAction(config);
        }

        return null;
    }

}
