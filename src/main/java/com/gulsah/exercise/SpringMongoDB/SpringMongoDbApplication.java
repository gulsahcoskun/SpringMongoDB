package com.gulsah.exercise.SpringMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.gulsah.exercise.SpringMongoDB.repository")
@SpringBootApplication
public class SpringMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbApplication.class, args);
	}

	public void run() {
	}

}

