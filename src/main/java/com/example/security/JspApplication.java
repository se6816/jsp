package com.example.security;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.security.model.Pet;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class JspApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspApplication.class, args);
	}
	@Bean
    @Primary
	@ConfigurationProperties("spring.datasource")
    public DataSourceProperties dataSourceProperties() {
	    return new DataSourceProperties();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.hikari")
	public HikariDataSource dataSource(DataSourceProperties properties) {
	    return properties.initializeDataSourceBuilder().
	    		type(HikariDataSource.class).
	    		build();
	}
	@Bean
	@Primary
	public Pet pet1() {
	    return new Pet("dog");
	}
	@Bean
	public Pet pet2() {
	    return new Pet("horse");
	}
	@Bean
	public Pet pet3() {
	    return new Pet("tiger");
	}

}
