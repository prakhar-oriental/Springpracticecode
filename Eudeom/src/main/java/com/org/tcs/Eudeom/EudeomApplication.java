package com.org.tcs.Eudeom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EudeomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EudeomApplication.class, args);
	}

}
