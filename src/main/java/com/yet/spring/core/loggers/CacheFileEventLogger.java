package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vampa on 21.03.2017.
 */
public class CacheFileEventLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName) {
        super(fileName);
    }

    public CacheFileEventLogger(String fileName, int cacheSize) {
        this(fileName);
        this.cacheSize = cacheSize;
        cache = new ArrayList<Event>(cacheSize);
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy() {
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }

    private void writeEventsFromCache() {
        for (Event event : cache) {
            super.logEvent(event);
        }
    }
}
