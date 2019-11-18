package com.spring.demo.exception;

/**
 * Created by ashwin on 2019-10-30.
 */
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Integer id){
        super("User not found");
    }

}
