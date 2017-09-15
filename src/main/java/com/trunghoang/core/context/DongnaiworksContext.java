package com.trunghoang.core.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.trunghoang.core.utils.AppConstants;

/**
 * This is application context
 * 
 *
 */
@Component
public class DongnaiworksContext {

	private Logger logger = LoggerFactory.getLogger(DongnaiworksContext.class);

	private ApplicationProperties applicationProperties;

	public ApplicationProperties getApplicationProperties() {
		return applicationProperties;
	}

	public void setApplicationProperties(
			ApplicationProperties applicationProperties) {
		this.applicationProperties = applicationProperties;
	}

	public DongnaiworksContext(ApplicationProperties applicationProperties) {
		init();
	}

	/**
	 * Initialize all data context of application successful
	 */
	public void init() {
		initializeApplicationProperties();

		if (logger.isInfoEnabled()) {
			logger.info("Init Dong Nai works context successful");
		}
	}

	/**
	 * Initialize properties file
	 */
	public void initializeApplicationProperties() {
		applicationProperties = new ApplicationProperties();
		applicationProperties
				.init(AppConstants.CONFIG_APPLICATION_PROPERTIES_FILENAME);
	}

}
