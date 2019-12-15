package com.arisan.online.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableDiscoveryClient
public class ServereurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServereurekaApplication.class, args);
	}

}
