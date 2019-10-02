package com.spring.demo;

import com.spring.demo.service.DemoService;
import com.spring.model.DemoBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Bean creation completed");
	}

	@Bean
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
	}
}
