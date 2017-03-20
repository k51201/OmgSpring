package com.yet.spring.core.loggers;

/**
 * Created by vampa on 21.03.2017.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
