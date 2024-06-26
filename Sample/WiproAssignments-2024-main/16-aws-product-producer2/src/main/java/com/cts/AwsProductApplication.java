package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
public class AwsProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsProductApplication.class, args);
	}

}
