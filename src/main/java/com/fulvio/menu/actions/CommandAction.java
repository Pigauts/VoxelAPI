package com.fulvio.menu.actions;

import com.fulvio.API.MenuConfig;
import com.fulvio.menu.OpenMenu;

public class CommandAction extends MenuAction {

    private final String command;

    public CommandAction(MenuConfig config) {
        super(config);
        this.command = config.getString("command");
    }

    @Override
    public void run(OpenMenu openMenu) {
        openMenu.getUser().performCommand(command);
    }

}
