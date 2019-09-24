package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    DemoBean demoBean;

    public void show(){
        System.out.println("DemoService print:"+demoBean.getName());
    }

}
