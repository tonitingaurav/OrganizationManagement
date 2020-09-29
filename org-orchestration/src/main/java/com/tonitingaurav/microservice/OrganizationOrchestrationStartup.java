package com.tonitingaurav.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableEncryptableProperties
@EnableSwagger2
@EnableFeignClients("com.tonitingaurav.microservice")
@SpringBootApplication
public class OrganizationOrchestrationStartup {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationOrchestrationStartup.class, args);
	}
}
