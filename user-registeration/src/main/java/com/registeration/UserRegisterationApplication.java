package com.registeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserRegisterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegisterationApplication.class, args);
	}

}
