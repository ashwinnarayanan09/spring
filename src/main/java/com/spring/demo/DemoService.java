package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void show() throws Exception{
        System.out.println("DemoService show:");
        throw new Exception("Hello World");
    }

    public void hello() throws Exception{
        System.out.println("DemoService hello:");
       // throw new Exception();
    }

}
