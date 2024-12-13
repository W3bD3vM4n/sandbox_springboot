package com.basics.sandbox_springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxSpringbootApplication {

	private static Logger logger = LoggerFactory.getLogger(SandboxSpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SandboxSpringbootApplication.class, args);

		logger.debug("Mi mensaje debug");
	}

}
