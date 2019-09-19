package com.yueqian.boot_demo.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class SpringConfig {

	@Bean(destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.datasource.dbcp")
	public DataSource ds() {
		BasicDataSource ds = new BasicDataSource();
		return ds;
	}
}
