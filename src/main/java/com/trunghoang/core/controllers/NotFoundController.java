package com.trunghoang.core.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trunghoang.core.utils.AppPage;
import com.trunghoang.core.utils.AppRouter;

@Controller
@RequestMapping("/")
public class NotFoundController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(NotFoundController.class);

	/**
	 * 
	 * @return page not found if route isn't handled
	 */
	@RequestMapping(value = AppRouter.ROUTE_URL_OTHERS, method = RequestMethod.GET)
	public String handleNotFoundPage(Model model) {
		model.addAttribute("slash", AppRouter.ROUTE_URL_SLASH);
		if (logger.isInfoEnabled()) {
			logger.info("Page not found!");
		}
		return AppPage.PAGE_NOT_FOUND;
	}
}
