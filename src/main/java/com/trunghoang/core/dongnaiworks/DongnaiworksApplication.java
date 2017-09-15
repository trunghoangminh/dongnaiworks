package com.trunghoang.core.dongnaiworks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.trunghoang.core.configurations.ApplicationConfiguration;
import com.trunghoang.core.context.DongnaiworksContext;

/**
 * 
 * This class is used to start DongNaiWork web application.
 *
 */
@SpringBootApplication
@Import({ ApplicationConfiguration.class })
public class DongnaiworksApplication extends SpringBootServletInitializer
		implements CommandLineRunner {

	private static Logger logger = LoggerFactory
			.getLogger(DongnaiworksApplication.class);

	@Autowired
	private ApplicationContext appContext;

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(DongnaiworksApplication.class);

	}

	/**
	 * Initialize dongnaiwork context
	 */
	@Override
	public void run(String... args) throws Exception {
		DongnaiworksContext dnwContext = appContext
				.getBean(DongnaiworksContext.class);
		dnwContext.init();
		if (logger.isInfoEnabled()) {
			logger.info("Dong Nai Works context init sucessful");
		}

	}

	/**
	 * 
	 * Start web
	 */
	public static void main(String[] args) {
		if (logger.isInfoEnabled()) {
			logger.info("<!-- Start application --!>");
		}

		SpringApplication.run(DongnaiworksApplication.class, args);

		if (logger.isInfoEnabled()) {
			logger.info("<!-- Execute application sucessful --!>");
		}
	}
}
