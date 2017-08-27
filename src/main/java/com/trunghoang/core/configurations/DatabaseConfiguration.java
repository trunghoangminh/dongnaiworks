package com.trunghoang.core.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * All of configuration of DB *
 * <p>
 * Help Spring create bean in base package repositories
 * </p>
 */
@Configuration
@EnableJpaRepositories(basePackages = { "com.trunghoang.business.repositories" })
public class DatabaseConfiguration {

}
