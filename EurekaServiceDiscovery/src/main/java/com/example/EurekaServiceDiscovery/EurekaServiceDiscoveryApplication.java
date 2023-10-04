package com.example.EurekaServiceDiscovery;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;



@EnableEurekaServer
@SpringBootApplication

public class EurekaServiceDiscoveryApplication {
	
	private static final Logger log = LoggerFactory.getLogger(EurekaServiceDiscoveryApplication.class);
	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(EurekaServiceDiscoveryApplication.class);
		Environment env = app.run(args).getEnvironment();
		String protocol = "http";
		if (env.getProperty("server.ssl.key-store") != null) {
			protocol = "https";
		}

		log.info(
				"\n----------------------------------------------------------\n\t"
						+ "Application '{}' is running! Access URLs:\n\t" + "Local: \t\t{}://localhost:{}{}\n\t"
						+ "External: \t{}://{}:{}{}\n----------------------------------------------------------",
				"eureka", protocol, env.getProperty("server.port"),
				env.getProperty("server.servlet.context-path"), protocol, InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"), env.getProperty("server.servlet.context-path"),
				env.getActiveProfiles());
		
	}
	
}
