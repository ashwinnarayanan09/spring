package com.spring.demo.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.demo.model.Employee;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class JsonDemo {

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setName("Ashwin");
        employee.setDept("Finance General");
        employee.setAddress(null);
        employee.setSalary(new AtomicReference<>());

        ObjectMapper om = new ObjectMapper();
        String jsonString = om.writeValueAsString(employee);
        System.out.println(jsonString);
        System.out.println(employee.toString());
    }
}
