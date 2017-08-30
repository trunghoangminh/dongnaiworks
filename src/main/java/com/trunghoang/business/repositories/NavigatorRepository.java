package com.trunghoang.business.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trunghoang.core.domains.Navigator;

/**
 * 
 * This class contain methods query database
 *
 */
@Transactional
@Repository
public interface NavigatorRepository extends CrudRepository<Navigator, Integer> {

}
