package com.trunghoang.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class NotFoundController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(NotFoundController.class);
	public static final String ERROR_404 = "404";

	/**
	 * 
	 * @return page not found if route isn't handled
	 */
	@RequestMapping("/*")
	public String handleNotFoundPage() {
		if (logger.isInfoEnabled()) {
			logger.info("Page not found!");
		}
		return ERROR_404;
	}
}
