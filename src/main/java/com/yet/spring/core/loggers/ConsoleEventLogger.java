package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;

/**
 * Created by vampa on 21.03.2017.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
