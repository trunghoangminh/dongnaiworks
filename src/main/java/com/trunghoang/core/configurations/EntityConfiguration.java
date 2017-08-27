package com.trunghoang.core.configurations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * All of configuration of Entity
 * <p>
 * Help Spring create bean in package domains
 * </p>
 *
 */
@Configuration
@EntityScan(basePackages = { "com.trunghoang.core.domains" })
public class EntityConfiguration {

}
