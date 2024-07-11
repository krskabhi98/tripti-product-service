package com.tripti.ecommerce.tripti_product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TriptiProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriptiProductServiceApplication.class, args);
	}

}
