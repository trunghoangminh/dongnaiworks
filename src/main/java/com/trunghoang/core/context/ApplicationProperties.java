package com.trunghoang.core.context;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * This class contain all value of dongnaiworks.properties file
 *
 */
@Component
public class ApplicationProperties {

	private Logger logger = LoggerFactory
			.getLogger(ApplicationProperties.class);
	private PropertiesConfiguration configuration;

	public ApplicationProperties() {

	}

	/**
	 * Init file properties config
	 * 
	 * @param filename
	 */
	public void init(String filename) {
		try {
			configuration = new PropertiesConfiguration(this.getClass()
					.getResource("/" + filename));
			if (logger.isInfoEnabled()) {
				logger.info("Init config profile successful!");
			}
		} catch (ConfigurationException e) {
			if (logger.isErrorEnabled()) {
				logger.error("Init properties config file", e);
			}
		}
	}

	public PropertiesConfiguration getConfiguration() {
		return configuration;
	}
}
