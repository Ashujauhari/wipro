package com.jts.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayConfigApplication.class, args);
	}

}
