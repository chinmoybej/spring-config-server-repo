package com.micro.service.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// to config server
@EnableConfigServer
@SpringBootApplication
public class MicroSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroSpringCloudConfigServerApplication.class, args);
	}

}
