package ru.vampa.spring.core.loggers;

import ru.vampa.spring.core.beans.Event;

import java.util.Collection;

/**
 * Created by vampa on 21.03.2017.
 */
public class CombinedEventLogger implements EventLogger {
    Collection<EventLogger> loggers;

    public CombinedEventLogger(Collection<EventLogger> loggers) {
        this.loggers = loggers;
    }

    public void logEvent(Event event) {
        for (EventLogger logger : loggers) {
            logger.logEvent(event);
        }
    }
}
