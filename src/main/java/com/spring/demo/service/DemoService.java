package com.spring.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    public void show() throws Exception{
        System.out.println("DemoService show:");
        throw new Exception("Hello World");
    }

    @Async
    public void hello() throws Exception{
        System.out.println("DemoService hello:");
        logger.info("hello");
       // throw new Exception();
    }

}
