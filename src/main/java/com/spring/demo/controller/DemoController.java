package com.spring.demo.controller;

import com.spring.demo.component.DemoComponent;
import com.spring.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @Autowired
    DemoComponent demoComponent;


    public DemoController(){

    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public void hello() throws Exception{

        System.out.println("hello:"+demoComponent.getName());
        demoService.show();
    }



}
