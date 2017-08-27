package com.trunghoang.business.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.trunghoang.core.domains.Test;

@Transactional
public interface TestRepository extends CrudRepository<Test, String> {
	@Override
	public Iterable<Test> findAll();
}
