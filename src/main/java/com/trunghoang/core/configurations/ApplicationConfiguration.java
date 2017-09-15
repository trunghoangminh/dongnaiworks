package com.trunghoang.core.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 
 * This is class application configuration
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.trunghoang.business.repositories",
		"com.trunghoang.business.repositories.impl",
		"com.trunghoang.business.services",
		"com.trunghoang.business.services.impl",
		"com.trunghoang.core.controllers", "com.trunghoang.core.context" })
@Import({ DatabaseConfiguration.class, EntityConfiguration.class })
public class ApplicationConfiguration {
	private static Logger logger = LoggerFactory
			.getLogger(ApplicationConfiguration.class);

}
