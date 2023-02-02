package com.fulvio;

import com.fulvio.API.MenuConfig;
import com.fulvio.API.VoxelManager;
import com.fulvio.menu.ActionFactory;
import com.fulvio.menu.actions.MenuAction;

public class VoxelManagerImpl implements VoxelManager {

    private ActionFactory actionFactory = new ActionFactory() { public MenuAction create(String id, MenuConfig config) { return ActionFactory.super.create(id, config); } };

    @Override
    public ActionFactory getActionFactory() {
        return actionFactory;
    }

    public void setActionFactory(ActionFactory factory) {
        this.actionFactory = factory;
    }


}
