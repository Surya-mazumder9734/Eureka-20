package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaProjectGitApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(EurekaProjectGitApplication.class, args);
	}

}
