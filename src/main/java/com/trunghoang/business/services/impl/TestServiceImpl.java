package com.trunghoang.business.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trunghoang.business.repositories.TestRepository;
import com.trunghoang.business.services.TestService;
import com.trunghoang.core.domains.Test;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestRepository testRepository;

	@Override
	public Iterable<Test> getAll() {
		return testRepository.findAll();
	}
}
