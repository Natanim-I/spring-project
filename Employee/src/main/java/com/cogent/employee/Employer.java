package com.cogent.employee;

import org.springframework.beans.factory.annotation.Autowired;

public class Employer {
	//bean property annotaion
	@Autowired
	Employee emp;
	
	/***
	*for constructor based annotation
	*@Autowired
	*public Employer(Employee emp) {
	*	super();
	*	this.emp = emp;
	*}
	*/

	public Employee getEmployee() {
		return emp;
	}
	
	/***
	 * for setter method annotation
	 * public void setEmployee(Employee emp){
	 *    this.emp = emp;
	 * }
	 */
	
	/***
	 * for custom method annotaion
	 * public void setCustomEmployee(Employee emp){
	 *     this.emp = emp;
	 * }
	 */
}
