package com.cg.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.service.EmployeeService;

@Component("emp")
public class Employee {
	
	@Autowired
	EmployeeService empService;
	public int empId;
	public String empName;
	public double sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void getData()
	{
		empService.getData();
	}
	
}
