package ru.vampa.spring.core.loggers;

import ru.vampa.spring.core.beans.Event;

/**
 * Created by vampa on 21.03.2017.
 */
public interface EventLogger {
    void logEvent(Event event);
}
