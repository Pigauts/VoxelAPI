package com.fulvio.message;

import com.fulvio.API.Config;
import com.fulvio.API.MessageManager;
import com.fulvio.Util;
import com.fulvio.config.ConfigImpl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MessageManagerImpl implements MessageManager {

    private final Map<String, String> messages = new HashMap<>();

    @Override
    public String getMessage(String id) {
        return messages.get(id);
    }

    @Override
    public void load(Config config) {
        for (String key : config.getKeys(false))
            messages.put(key, config.getColorString(key));
    }

    @Override
    public void load(File file) {
        load(new ConfigImpl(file));
    }

}
