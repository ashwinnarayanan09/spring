package com.spring.demo.controller;

import com.spring.demo.component.DemoComponent;
import com.spring.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {


    DemoService demoService;

    @Autowired
    DemoComponent demoComponent;

    @Autowired
    public DemoController1(DemoService demoService){

       this.demoService = demoService;
    }




}
