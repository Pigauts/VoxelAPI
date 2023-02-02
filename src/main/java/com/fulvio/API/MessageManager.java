package com.fulvio.API;

import java.io.File;

public interface MessageManager {

    String getMessage(String messageId);

    void load(Config config);

    void load(File file);

}
