package com.trunghoang.business.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trunghoang.core.domains.Account;

@Transactional
@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

}
