package com.infy.EmployeeManagementV2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//	@Bean
//	public EmployeeServiceImpl employeeService() {
//		return new EmployeeServiceImpl(employeeRepository());
//	} --> for constructor injection
	
	@Bean
	public EmployeeServiceImpl employeeService2() {
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		employeeServiceImpl.setEmployeeDAO(employeeRepository());
		return employeeServiceImpl;
	}
	
	@Bean
	public EmployeeRepository employeeRepository() {
		return new EmployeeRepositoryImpl();
	}
}
