package com.trunghoang.business.services;

import com.trunghoang.core.domains.Account;

public interface AccountService {

	/**
	 * Get all account info
	 * 
	 * @return
	 */
	public Iterable<Account> getAll();
}
