package com.spring.demo.controller;

import com.spring.demo.model.User;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashwin on 2019-10-28.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<User> findAll() {
        //return userService.findAll();

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Ashwin","Narayanan"));

        return users;
    }

}
