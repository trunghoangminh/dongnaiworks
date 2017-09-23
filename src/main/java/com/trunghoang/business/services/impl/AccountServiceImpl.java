package com.trunghoang.business.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trunghoang.business.repositories.AccountRepository;
import com.trunghoang.business.services.AccountService;
import com.trunghoang.core.domains.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Iterable<Account> getAll() {
		return accountRepository.findAll();
	}
}
