package com.cg.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dto.Employee;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=
				new ClassPathXmlApplicationContext("spring.xml");
		Employee e=(Employee) app.getBean("emp");
		
		int id;
		String name;
		double sal;
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		name=sc.next();
		sal=sc.nextDouble();
		
		e.setEmpId(id);
		e.setEmpName(name);
		e.setSal(sal);
		
		e.getData();
	}

}
