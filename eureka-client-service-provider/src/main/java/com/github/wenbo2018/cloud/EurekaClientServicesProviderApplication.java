package com.github.wenbo2018.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientServicesProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientServicesProviderApplication.class, args);
	}
}
