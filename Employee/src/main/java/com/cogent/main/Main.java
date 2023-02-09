package com.cogent.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cogent.employee.Employee;
import com.cogent.employee.Employer;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employer employer = (Employer)context.getBean("employer");
		Employee employee = employer.getEmployee();
		System.out.println("****************Employee details are*****************");
		System.out.println("Employee Id : "+employee.getEmployeeId());
		System.out.println("Employee Name : "+employee.getEmployeeName());
		System.out.println("Employee Salary : "+employee.getEmployeeSalary());
	}
}
