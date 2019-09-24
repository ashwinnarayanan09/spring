package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoComponent {

    String name;
    Integer age;

    public DemoComponent(){

        this.name = "Ashwin";
        this.age = 34;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
