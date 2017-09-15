package com.trunghoang.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.trunghoang.core.context.DongnaiworksContext;

@Controller
public class BaseController {

	@Autowired
	private DongnaiworksContext dongnaiworksContext;

	public DongnaiworksContext getDongnaiworksContext() {
		return dongnaiworksContext;
	}
}
