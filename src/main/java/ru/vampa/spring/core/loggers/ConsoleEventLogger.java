package ru.vampa.spring.core.loggers;

import ru.vampa.spring.core.beans.Event;

/**
 * Created by vampa on 21.03.2017.
 */
public class ConsoleEventLogger extends AbstractLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
