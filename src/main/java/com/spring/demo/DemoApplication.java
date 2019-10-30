package com.spring.demo;

import com.spring.demo.service.DemoService;
import com.spring.demo.service.UserService;
import com.spring.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Bean creation completed");
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				//System.out.println(beanName);
			}

			DemoBean demoBean = (DemoBean) ctx.getBean("demoBean");
			System.out.println("hello:"+demoBean.getName());

			DemoService demoService = (DemoService) ctx.getBean("demoService");
			//demoService.show();
			demoService.hello();
			DemoService demoService2 = new DemoService();
			//demoService2.show();
		};
	}*/

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx,RestTemplate restTemplate) {
		return args -> {
			UserService userService = (UserService) ctx.getBean(UserService.class);
			User user = new User(1,"Ashwin","Narayanan");
			userService.createUser(user);

			User user1 = restTemplate.getForObject("http://localhost:8080/users", User.class);
			logger.info(user1.toString());
		};
	}


}
