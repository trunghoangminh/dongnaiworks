package com.trunghoang.business.services;

import com.trunghoang.core.domains.Navigator;

/**
 * 
 * Interface navigator service. NavigatorServiceImpl must implement this class
 *
 */
public interface NavigatorService {
	/**
	 * Get all item of navigator table
	 * 
	 * @return list of navigator
	 */
	public Iterable<Navigator> getAll();
}
