package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;

/**
 * Created by vampa on 21.03.2017.
 */
public interface EventLogger {
    void logEvent(Event event);
}
