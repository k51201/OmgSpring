package ru.vampa.spring.core.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by vampa on 21.03.2017.
 */
public class AwareBean implements ApplicationContextAware, BeanNameAware, ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;
    private String name;
    private ApplicationContext ctx;

    public void init() {
        System.out.println(this.getClass().getSimpleName() + " > My name is '" + name + "'");

        if (ctx != null)
            System.out.println(this.getClass().getSimpleName() + " > My context is " + ctx.getClass().toString());
        else
            System.out.println(this.getClass().getSimpleName() + " > Context is not set");

        if (eventPublisher != null)
            System.out.println(this.getClass().getSimpleName() + " > My EventPublisher is " + eventPublisher.getClass().toString());
        else
            System.out.println(this.getClass().getSimpleName() + " > EventPublisher is not set");
    }

    public void setBeanName(String name) {
        this.name = name;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
