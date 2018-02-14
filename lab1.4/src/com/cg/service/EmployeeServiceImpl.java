package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.EmployeeDao;
import com.cg.dto.Employee;

@Component("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		empDao.getData();
		
	}

	

	

	
}
