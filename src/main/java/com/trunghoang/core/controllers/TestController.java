package com.trunghoang.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trunghoang.business.services.TestService;

@Controller
public class TestController {

	private Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		logger.info(testService.getAll().toString());
		return "index";
	}
}
