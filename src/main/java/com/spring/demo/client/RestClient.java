package com.spring.demo.client;

/**
 * Created by ashwin on 2019-10-30.
 */
import com.spring.demo.model.User;
import org.springframework.web.client.RestTemplate;

public class RestClient {

    static final String URL_USERS = "http://localhost:8080/users";
    static final String URL_USER = "http://localhost:8080/user/1";

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        // Send request with GET method and default Headers.
        User user = restTemplate.getForObject(URL_USER, User.class);
        System.out.println(user);
    }

}
