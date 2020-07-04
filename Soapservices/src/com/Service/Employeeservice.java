package com.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ServiceImpl.EmployeeserviceImpl;
import com.model.Employee;

public class Employeeservice implements EmployeeserviceImpl {
	
	private static Map<Integer,Employee> emp=new HashMap<Integer,Employee>();

	@Override
	public boolean addEmployee(Employee e) {
		if (emp.get(e.getEmpId()) != null)
			return false;

		emp.put(e.getEmpId(), e);

		return true;
	}

	@Override
	public boolean deleteEmployee(int EmpId) {
		if(emp.get(EmpId) == null) return false;
		emp.remove(EmpId);	
		return true;
	}

	@Override
	public Employee getEmployee(int EmpId) {
		return emp.get(EmpId);
	}

	@Override
	public Employee[] getAllEmployees() {
		Set<Integer> details=emp.keySet();
		Employee[] e=new Employee[details.size()];
		int i=0;
		for(Integer EmpId:details) {
			e[i]=emp.get(EmpId);
			i++;
		}
			return e;
		}
			
	
	}


