package com.validus.hiring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages={"com.validus.hiring.repository"})
public class JpaConfiguration {

}
