package com.infy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.infy.repository.CustomerRepository;
import com.infy.service.CustomerServiceImpl;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.infy.service","com.infy.repository"})
@PropertySource("classpath:dev.properties")
public class SpringConfiguration {

//	@Bean // Constructor Injection
//	public CustomerServiceImpl customerService() {
//
//		return new CustomerServiceImpl(customerRepository(), 20);
//	}
//
//	@Bean // Constructor Injection
//	public CustomerRepository customerRepository() {
//
//		return new CustomerRepository();
//	}
}
