package com.spring.demo.config;

import com.spring.demo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ashwin on 2019-10-28.
 */

@Configuration
public class ServiceConfig {

    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
