package com.dxc.cook;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CookApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookApplication.class, args);
	}

}
