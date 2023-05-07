package com.example.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
       @Id
       private int employeeId;
       private String employeeName;
       private String employeeEmail;
       private String employeeMobile;
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
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public Employee(int employeeId, String employeeName, String employeeEmail, String employeeMobile) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeMobile = employeeMobile;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return String.format("Employee [employeeId=%s, employeeName=%s, employeeEmail=%s, employeeMobile=%s]",
				employeeId, employeeName, employeeEmail, employeeMobile);
	}
       
}
