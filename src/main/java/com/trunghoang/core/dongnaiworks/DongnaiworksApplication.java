package com.trunghoang.core.dongnaiworks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.trunghoang.core.configurations.ApplicationConfiguration;

/**
 * 
 * This class is used to start DongNaiWork web application.
 *
 */
@SpringBootApplication
@Import({ ApplicationConfiguration.class })
public class DongnaiworksApplication extends SpringBootServletInitializer {

	private static Logger log = LoggerFactory
			.getLogger(DongnaiworksApplication.class);

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(DongnaiworksApplication.class);
	}

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
