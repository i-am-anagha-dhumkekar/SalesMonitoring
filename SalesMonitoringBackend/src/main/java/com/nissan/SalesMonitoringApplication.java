package com.nissan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesMonitoringApplication.class, args);
		System.out.println("Server Running");
	}

}
