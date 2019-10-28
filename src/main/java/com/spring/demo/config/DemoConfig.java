package com.spring.demo.config;


import com.spring.demo.model.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public DemoBean demoBean(){

        DemoBean demoBean = new DemoBean();
        demoBean.setName("demo bean");
        return demoBean;
    }
}
