package com.tonitingaurav.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigurationServerStartup {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServerStartup.class, args);
	}
}
