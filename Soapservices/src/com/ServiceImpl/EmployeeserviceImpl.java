package com.ServiceImpl;

import com.model.Employee;

public interface EmployeeserviceImpl {
	public boolean addEmployee(Employee e);
	public boolean deleteEmployee( int id);
	
	public  Employee getEmployee(int id);
	public Employee[] getAllEmployees();

	

}
