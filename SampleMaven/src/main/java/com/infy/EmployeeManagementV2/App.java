package com.infy.EmployeeManagementV2;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeServiceImpl empService = context.getBean("employeeService2",EmployeeServiceImpl.class);
		
		empService.delete(101);
		List<EmployeeDTO> empList =  empService.getAllCustomer();
		for (EmployeeDTO employeeDTO : empList) {
			System.out.println("Employee id : "+employeeDTO.getEmpId());
			System.out.println("Employee name : "+employeeDTO.getEmpName());
			System.out.println("Employee department : "+employeeDTO.getDepartment());
		}
		context.close();
	}
	
}
