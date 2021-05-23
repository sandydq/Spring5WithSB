package com.infy.EmployeeManagement;

import org.springframework.stereotype.Component;

@Component(value ="employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void insert(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		System.out.println("inserted");
	}

	@Override
	public void delete(int empId) {
		// TODO Auto-generated method stub
		System.out.println("deleted");
	}
	
}
