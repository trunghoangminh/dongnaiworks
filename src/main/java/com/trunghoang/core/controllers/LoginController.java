package com.trunghoang.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trunghoang.business.services.NavigatorService;
import com.trunghoang.core.utils.AppPage;
import com.trunghoang.core.utils.AppRouter;

/**
 * 
 * Handle login/register
 *
 */
@Controller
@RequestMapping("/")
public class LoginController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private NavigatorService navigatorService;

	@RequestMapping(value = AppRouter.ROUTE_URL_LOGIN, method = RequestMethod.GET)
	public String getLoginPage(Model model) {

		// Put list navigator
		model.addAttribute("navigators", navigatorService.getAll());

		// Some constant login page
		model.addAttribute("slash", AppRouter.ROUTE_URL_SLASH);
		model.addAttribute("resourcePage", AppPage.PAGE_URL_RESOURCE_LOGIN);
		model.addAttribute("resourceStatic",
				AppPage.PAGE_URL_RESOURCE_LOGIN_STATIC);
		model.addAttribute("login", AppRouter.ROUTE_URL_LOGIN);
		model.addAttribute("register", AppRouter.ROUTE_URL_REGISTER);
		if (logger.isInfoEnabled()) {
			logger.info("Login page");
		}
		return AppPage.PAGE_LOGIN;
	}
}
