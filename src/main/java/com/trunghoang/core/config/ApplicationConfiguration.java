package com.trunghoang.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * This is class application config
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.trunghoang" })
public class ApplicationConfiguration {
	private static Logger logger = LoggerFactory
			.getLogger(ApplicationConfiguration.class);

}
