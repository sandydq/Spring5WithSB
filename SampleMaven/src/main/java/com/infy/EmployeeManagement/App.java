package com.infy.EmployeeManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeService employeeService = context.getBean("employeeService",EmployeeService.class);
		EmployeeDTO emp1 = new EmployeeDTO(1001,"Sandy","ECSADMUS");
		
		employeeService.insert(emp1);
	}

}
