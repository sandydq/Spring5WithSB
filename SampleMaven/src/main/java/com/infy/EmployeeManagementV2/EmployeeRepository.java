package com.infy.EmployeeManagementV2;

import java.util.List;

public interface EmployeeRepository {
	public void insertEmployee(EmployeeDTO emp);
	public void removeEmployee(int empId);
	public List<EmployeeDTO> fetchCustomer();
	
}
