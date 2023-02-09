package com.cogent.employee;

public class Employee {
	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeId, String employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
 
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
