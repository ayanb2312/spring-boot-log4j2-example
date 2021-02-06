package com.log4j2.example.springbootlog4j2example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootLog4j2ExampleApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(SpringBootLog4j2ExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4j2ExampleApplication.class, args);
		
		LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
	}
	
	@RequestMapping("/")
	public String home() {
	    return "Hello Docker World";
	}

}
