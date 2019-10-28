package com.spring.demo.service;

import com.spring.demo.component.DemoComponent;
import com.spring.demo.config.ApplicationContextProvider;
import com.spring.demo.config.CustomLoggerFactory;
import com.spring.demo.logging.CustomLogger;
import com.spring.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ashwin on 2019-10-28.
 */

@Service
public class UserService {

    private CustomLogger customLogger = CustomLoggerFactory.getCustomLogger();

    public void createUser(User user){

        customLogger.info("hello world 2");
    }
}
