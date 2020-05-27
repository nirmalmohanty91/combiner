package com.nirmal.combiner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CombinerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CombinerApplication.class, args);
	}

}
