package com.trunghoang.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trunghoang.business.services.TestService;

@Controller
@RequestMapping("/")
public class TestController {

	private Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TestService testService;

	@RequestMapping("/demo")
	public String demo() {

		logger.info(testService.getAll().toString());
		return "abc";
	}
}
