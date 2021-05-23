package com.infy.EmployeeManagementV2;

import java.util.List;

import org.springframework.stereotype.Component;

@Component(value ="employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeDAO;// Make necesserychanges
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeDAO) {
		super();
		System.out.println("Inside Parametrised constructor");
		this.employeeDAO = employeeDAO;
	}
	
	public EmployeeServiceImpl() {
		System.out.println("Inside default constructor");
	}
	
	public void setEmployeeDAO(EmployeeRepository employeeDAO) {
		this.employeeDAO = employeeDAO;
	}


	public void insert(EmployeeDTO emp) {
		employeeDAO.insertEmployee(emp);
	}
	public void delete(int empId) {
		employeeDAO.removeEmployee(empId);
	}
	public List<EmployeeDTO> getAllCustomer() {
		
		return employeeDAO.fetchCustomer();
	}
}
