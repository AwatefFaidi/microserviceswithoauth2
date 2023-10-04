package com.example.ehealthcentralconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//This Annotation converts the application into server
@EnableConfigServer
@SpringBootApplication
public class EhealthCentralConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhealthCentralConfigurationApplication.class, args);
	}

}
