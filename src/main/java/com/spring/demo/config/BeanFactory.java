package com.spring.demo.config;

import com.spring.demo.logging.CustomLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Created by ashwin on 2019-10-28.
 */

@Configuration
public class BeanFactory {

    @Bean
    @Lazy
    public ApplicationContextProvider applicationContextProvider() {
        return new ApplicationContextProvider();
    }

    @Bean
    public CustomLogger getCustomLogger(){
        return new CustomLogger();
    }
}
