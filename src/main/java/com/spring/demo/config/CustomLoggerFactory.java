package com.spring.demo.config;

import com.spring.demo.logging.CustomLogger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ashwin on 2019-10-28.
 */

@Configuration
public class CustomLoggerFactory implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public static CustomLogger getCustomLogger(){
        return applicationContext.getBean(CustomLogger.class);
    }
}
