package com.trunghoang.business.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trunghoang.business.repositories.NavigatorRepository;
import com.trunghoang.business.services.NavigatorService;
import com.trunghoang.core.domains.Navigator;

/**
 * 
 * This class is service navigator
 *
 */
@Service
public class NavigatorServiceImpl implements NavigatorService {

	@Autowired
	private NavigatorRepository navigatorRepository;

	@Override
	public Iterable<Navigator> getAll() {
		return navigatorRepository.findAll();
	}

}
