package com.spring.demo.controller;

import com.spring.demo.model.User;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<List<User>> findAll() {
        //return userService.findAll();

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Ashwin","Narayanan"));

        return new ResponseEntity(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/1", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<User> findOne() {
        //return userService.findAll();
        User user = new User(1,"Ashwin","Narayanan");
        return new ResponseEntity(user, HttpStatus.OK);
    }


}
