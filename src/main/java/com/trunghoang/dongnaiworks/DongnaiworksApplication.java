package com.trunghoang.dongnaiworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * This class is used to start DongNaiWork web application.
 *
 */
@SpringBootApplication
@ComponentScan(value = "com.trunghoang")
public class DongnaiworksApplication {
	/**
	 * 
	 * Start web
	 */
	public static void main(String[] args) {
		SpringApplication.run(DongnaiworksApplication.class, args);
	}
}
