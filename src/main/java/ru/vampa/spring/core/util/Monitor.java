package ru.vampa.spring.core.util;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by vampa on 21.03.2017.
 */
public class Monitor implements ApplicationListener<ApplicationEvent> {

    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent.getClass().getSimpleName() + " > " + applicationEvent.getSource().toString());
    }
}
