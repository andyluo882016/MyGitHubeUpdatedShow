package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGitHubeChangeUpdatedAppApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootGitHubeChangeUpdatedAppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitHubeChangeUpdatedAppApplication.class, args);
		Date mydate =new Date();
		String day=mydate.toLocaleString();
		logger.info("The server is up at port 8890: {} ",day);
	}

}
