package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {


    DemoService demoService;



    @Autowired
    DemoComponent demoComponent;

    @Autowired
    public DemoController2(DemoService demoService){

        this.demoService = demoService;
    }


}
