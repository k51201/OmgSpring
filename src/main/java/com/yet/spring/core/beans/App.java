package com.yet.spring.core.beans;

import com.yet.spring.core.loggers.EventLogger;

/**
 * Created by vampa on 20.03.2017.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
}
