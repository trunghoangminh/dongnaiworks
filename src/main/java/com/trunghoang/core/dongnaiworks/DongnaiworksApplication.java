package com.trunghoang.core.dongnaiworks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.trunghoang.core.config.ApplicationConfiguration;

/**
 * 
 * This class is used to start DongNaiWork web application.
 *
 */
@SpringBootApplication
@Import({ ApplicationConfiguration.class })
public class DongnaiworksApplication {

	private static Logger log = LoggerFactory
			.getLogger(DongnaiworksApplication.class);

	/**
	 * 
	 * Start web
	 */
	public static void main(String[] args) {
		log.info("<!-- Start application --!>");
		SpringApplication.run(DongnaiworksApplication.class, args);
		log.info("<!-- Execute application sucessful --!>");
	}
}
