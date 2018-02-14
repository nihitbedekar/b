package com.cg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dto.Employee;

@Component("empDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	Employee emp;
	
	@Override
	public void getData() {
		
		// TODO Auto-generated method stub
	
		System.out.println("id is "+emp.empId);
		System.out.println("name is "+emp.empName);
		System.out.println("sal is "+emp.sal);
		
		
	}

}
