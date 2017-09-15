package com.trunghoang.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trunghoang.business.services.NavigatorService;
import com.trunghoang.business.services.TestService;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private TestService testService;

	@Autowired
	private NavigatorService navigatorService;

	/**
	 * This method to handle "/" URL
	 * 
	 * @param model
	 * @return index page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage(Model model) {

		// Put list navigator
		model.addAttribute("navigators", navigatorService.getAll());
		if (logger.isInfoEnabled()) {
			logger.info("Index page");
		}
		return "index";
	}

	/**
	 * Forward "/index" URL to "/"
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String forwardIndexPage(Model model) {
		return "forward:/";
	}
}
