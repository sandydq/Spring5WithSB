package com.infy.EmployeeManagementV2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	List<EmployeeDTO> employee = null;

	@PostConstruct
	public void initializer() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(101);
		employeeDTO.setEmpName("Jack");
		employeeDTO.setDepartment("ETA");
		
		EmployeeDTO employeeDTO2 = new EmployeeDTO();
		employeeDTO2.setEmpId(102);
		employeeDTO2.setEmpName("Sandy");
		employeeDTO2.setDepartment("ECSADMUS");
		
		employee = new ArrayList<>();
		employee.add(employeeDTO);
		employee.add(employeeDTO2);
	}
	
	@Override
	public List<EmployeeDTO> fetchCustomer() {
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public void insertEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
		employee.add(emp);
	}

	@Override
	public void removeEmployee(int empId) {
		// TODO Auto-generated method stub
		EmployeeDTO employeeDTO = null;
		for (EmployeeDTO i : employee) {
			if (i.getEmpId() == empId) {
				employeeDTO = i;
			}
		}
		if (employeeDTO != null) {
			employee.remove(employeeDTO);
		}
		
	}

}
